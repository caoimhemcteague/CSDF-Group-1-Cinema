/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cinemasystem;
import java.sql.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author christophermclaughlin
 */
public class StartFrame extends javax.swing.JFrame {

	private final String USER_NAME = "root";
	private final String PASSWORD = "password";
    Connection conn;
    Statement st;
    ResultSet rs;
    static String film;
    static String time;
    static String date;
   
	
    /**
     * Creates new form StartFrame
     */
    public StartFrame() {
        initComponents();
        
    		
    	}
    
    public String getFilm(){
        return StartFrame.film ;
    }
    public String getTime(){
        return StartFrame.time;
    }
    public String getDate(){
        return StartFrame.date;
    }
    
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        makeBookingJB = new javax.swing.JButton();
        viewScheduleJB = new javax.swing.JButton();
        viewTrailersJB = new javax.swing.JButton();
        viewInfoJB = new javax.swing.JButton();
       // cancelButton = new javax.swing.JButton();
        adminLogin = new javax.swing.JButton();
        filmNameBox = new javax.swing.JComboBox<>();
        dateBox = new javax.swing.JComboBox<>();
        timeBox = new JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setForeground(new java.awt.Color(153, 255, 255));

        //jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        //jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        title.setFont(new Font("sansserif", Font.BOLD, 20));
        title.setForeground(Color.PINK);
        title.setText("Cinema System");

        makeBookingJB.setText("Make Booking");
        makeBookingJB.setBackground(Color.CYAN);
        makeBookingJB.setFont(new Font("sansserif", Font.BOLD, 16));
        makeBookingJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        viewScheduleJB.setText("View Schedule");
        viewScheduleJB.setBackground(Color.CYAN);
        viewScheduleJB.setFont(new Font("sansserif", Font.BOLD, 16));
        viewScheduleJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
  
        viewTrailersJB.setText("View Trailers");
        viewTrailersJB.setBackground(Color.CYAN);
        viewTrailersJB.setFont(new Font("sansserif", Font.BOLD, 16));
        viewTrailersJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        viewInfoJB.setText("View Info");
        viewInfoJB.setBackground(Color.CYAN);
        viewInfoJB.setFont(new Font("sansserif", Font.BOLD, 16));
        viewInfoJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

      //  cancelButton.setText("Cancel Ticket");
      //  cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
       //     public void mouseClicked(java.awt.event.MouseEvent evt) {
        //        jButton5MouseClicked(evt);
        //    }
       // });
        
        
        filmNameBox.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		filmNameBoxActionPerformed(e);
        
        	}
        });
        
        dateBox.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dateBoxActionPerformed(e);
        	}
        });

        adminLogin.setText("Admin Login");
        adminLogin.setBackground(Color.CYAN);
        adminLogin.setFont(new Font("sansserif", Font.BOLD, 16));
        adminLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
       
        

        filmNameBox.setModel(new DefaultComboBoxModel<>(new String[] {"Select Film"}));

        try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
			st = conn.createStatement();
			String s = "Select Name from film";
			rs = st.executeQuery(s);
			while(rs.next()) {
				filmNameBox.addItem(rs.getString(1));
			}
		}
		catch (Exception b) {
		JOptionPane.showMessageDialog(null,  "Error");
		}finally {
			try {
				st.close();
				rs.close();
				conn.close();
				
			}catch(Exception b) {
	    		JOptionPane.showMessageDialog(null,  "Error Close");

			}
		}

        dateBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Date"}));

        timeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time"}));


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        getContentPane().setBackground(Color.GRAY);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filmNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateBox, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(adminLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                               // .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewScheduleJB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewInfoJB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(viewTrailersJB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(makeBookingJB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makeBookingJB)
                    .addComponent(filmNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(viewScheduleJB)
                .addGap(18, 18, 18)
                .addComponent(viewTrailersJB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewInfoJB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              //  .addComponent(cancelButton)
                .addGap(18, 18, 18)
                .addComponent(adminLogin)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    	    film = filmNameBox.getSelectedItem().toString();
    	    date = dateBox.getSelectedItem().toString(); 
    	    time = timeBox.getSelectedItem().toString();
    	    if(time.equals("Select Time"))
    	    {
    			JOptionPane.showMessageDialog(null,  "Please select a vaild Film, Date & Time to make a booking");

    	    }
    	    else {
    	    	TicketBooking Ticket = new TicketBooking();
    	    	Ticket.setVisible(true);// TODO add your handling code here:
    	    }
    }

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

       ViewSchedule Schedule = new ViewSchedule();
       Schedule.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       ViewTrailers Trailer = new ViewTrailers();
       Trailer.setVisible(true);// TODO add your handling code here:  // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        ViewInfo Info = new ViewInfo();
       Info.setVisible(true);// TODO add your handling code here:  // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

 //   private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
 //       CancelTicket Cancel = new CancelTicket();
 //      Cancel.setVisible(true);  // TODO add your handling code here:
 //   }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        AdminLogIn Admin = new AdminLogIn();
        Admin.setVisible(true);
    //GEN-LAST:event_jButton6MouseClicked
    }  

    private void filmNameBoxActionPerformed(ActionEvent e) {
    	 //Fill the JComboBox1 with Film Names
        
        
    	String value=(String)filmNameBox.getSelectedItem();
    	if(value.equals("Select Film")) {
    		dateBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Date"}));
    		timeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time"}));
    	}
    	else {
    		dateBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Date"}));
    		timeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time"}));
    	//Fill the JComboBox2 with Film Dates    
        try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", USER_NAME, PASSWORD);
			st = conn.createStatement();
			String s = "Select Distinct Date from screening where FilmName = '" + value + "'";
			rs = st.executeQuery(s);
			while(rs.next()) {
				dateBox.addItem(rs.getString(1));
			}
		}
		catch (Exception a) {
		JOptionPane.showMessageDialog(null,  "Error");
		}finally {
			try {
				st.close();
				rs.close();
				conn.close();
				
			}catch(Exception a) {
	    		JOptionPane.showMessageDialog(null,  "Error Close");

			}
		}
    	}
    }
    
    private void dateBoxActionPerformed(ActionEvent e) {
    
    	String value=(String)dateBox.getSelectedItem();
    	if(value.equals("Select Date")) {
    		 timeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time"}));
    	}
    	else {    		
    		timeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time"}));
        	//Fill the JComboBox3 with Film Times    
            try {
    			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", USER_NAME, PASSWORD);
    			st = conn.createStatement();
    			String s = "Select Time from screening where FilmName = '" + (String)filmNameBox.getSelectedItem() + 
    						"' AND Date = '" + value + "'";
    			rs = st.executeQuery(s);
    			while(rs.next()) {
    				double timeDouble = rs.getDouble("Time");
    				//System.out.print("????????????" + timeDouble);
    				String timeString = String.valueOf(timeDouble);
    				timeBox.addItem(timeString);
    			}
    		}
    		catch (Exception a) {
    			System.out.println("\n" + a);
    			JOptionPane.showMessageDialog(null,  "Error here");
    			System.out.println("\n" + a);
    		}finally {
    			try {
    				st.close();
    				rs.close();
    				conn.close();
    				
    			}catch(Exception a) {
    	    		JOptionPane.showMessageDialog(null,  "Error Close");

    			}
    		}
    	}
    
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton makeBookingJB;
    private javax.swing.JButton viewScheduleJB;
    private javax.swing.JButton viewTrailersJB;
    private javax.swing.JButton viewInfoJB;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton adminLogin;
    private javax.swing.JComboBox<String> filmNameBox;
    private javax.swing.JComboBox<String> dateBox;
    private javax.swing.JComboBox<String> timeBox;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
