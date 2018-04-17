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
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;

import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;
/**
 *
 * @author christophermclaughlin
 */

//TestpushToGithub
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
    
    public static String getFilm(){
        return StartFrame.film ;
    }
    public static String getTime(){
        return StartFrame.time;
    }
    public static String getDate(){
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
        makeBookingJB = new javax.swing.JButton();
        viewScheduleJB = new javax.swing.JButton();
        viewTrailersJB = new javax.swing.JButton();
        viewInfoJB = new javax.swing.JButton();
       // cancelButton = new javax.swing.JButton();
        adminLogin = new javax.swing.JButton();
        filmNameBox = new javax.swing.JComboBox<>();
        filmNameBox.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
        dateBox = new javax.swing.JComboBox<>();
        dateBox.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
        timeBox = new JComboBox<String>();
        timeBox.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setForeground(new java.awt.Color(153, 255, 255));

        makeBookingJB.setText("Make Booking");
        makeBookingJB.setBackground(Color.CYAN);
        makeBookingJB.setFont(new Font("SansSerif", Font.BOLD, 22));
        makeBookingJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        viewScheduleJB.setText("View Schedule");
        viewScheduleJB.setBackground(Color.CYAN);
        viewScheduleJB.setFont(new Font("SansSerif", Font.BOLD, 22));
        viewScheduleJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
  
        viewTrailersJB.setText("View Trailers");
        viewTrailersJB.setBackground(Color.CYAN);
        viewTrailersJB.setFont(new Font("SansSerif", Font.BOLD, 22));
        viewTrailersJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        viewInfoJB.setText("View Info");
        viewInfoJB.setBackground(Color.CYAN);
        viewInfoJB.setFont(new Font("SansSerif", Font.BOLD, 22));
        viewInfoJB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        
        
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
        adminLogin.setFont(new Font("SansSerif", Font.BOLD, 22));
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
        
        JLabel lblNewLabel = new JLabel("");
        
        lblNewLabel_1 = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("/images.jpg")).getImage();
        lblNewLabel_1.setIcon(new ImageIcon(img));
        
        
        JLabel label = new JLabel("");
        Image imgLogo = new ImageIcon(this.getClass().getResource("/logo.jpg")).getImage();
        label.setIcon(new ImageIcon(imgLogo));
        Border line = BorderFactory.createLineBorder(Color.black, 5);
        label.setBorder(line);

        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(489)
        			.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(447))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(21)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(filmNameBox, 0, 389, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(dateBox, 0, 390, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(timeBox, 0, 394, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(makeBookingJB, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
        					.addGap(47))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(adminLogin, GroupLayout.PREFERRED_SIZE, 515, Short.MAX_VALUE)
        						.addComponent(viewScheduleJB, GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        						.addComponent(viewInfoJB, GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        						.addComponent(viewTrailersJB, GroupLayout.PREFERRED_SIZE, 515, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(90)
        							.addComponent(lblNewLabel)
        							.addGap(275))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(112)
        							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)))))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(21)
        			.addComponent(label)
        			.addGap(46)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(filmNameBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(dateBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(timeBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addComponent(makeBookingJB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(54)
        					.addComponent(lblNewLabel)
        					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
        					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
        					.addGap(23))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addComponent(viewScheduleJB, GroupLayout.PREFERRED_SIZE, 96, Short.MAX_VALUE)
        					.addGap(18)
        					.addComponent(viewTrailersJB, GroupLayout.PREFERRED_SIZE, 96, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(viewInfoJB, GroupLayout.PREFERRED_SIZE, 97, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(adminLogin, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
        					.addGap(66))))
        );
        getContentPane().setLayout(layout);
        getContentPane().setBackground(Color.WHITE);

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
    	    	Ticket.setExtendedState(JFrame.MAXIMIZED_BOTH); 
    	    	Ticket.setVisible(true);// TODO add your handling code here:
    	    }
    }

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

       ViewSchedule Schedule = new ViewSchedule();
       Schedule.setExtendedState(JFrame.MAXIMIZED_BOTH); 
       Schedule.fetch();
       Schedule.setVisible(true);
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       ViewTrailers Trailer = new ViewTrailers();
       Trailer.setExtendedState(JFrame.MAXIMIZED_BOTH); 
       Trailer.setVisible(true);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        ViewInfo Info = new ViewInfo();
        Info.setExtendedState(JFrame.MAXIMIZED_BOTH); 
       Info.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked


    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        AdminLogIn Admin = new AdminLogIn();
        Admin.setExtendedState(JFrame.MAXIMIZED_BOTH); 
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
    				if(timeString.length()<5) {
    					timeString = timeString+ "0";
    				}
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
            	StartFrame frame = new StartFrame();
            
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            
            frame.setVisible(true);
                   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton makeBookingJB;
    private javax.swing.JButton viewScheduleJB;
    private javax.swing.JButton viewTrailersJB;
    private javax.swing.JButton viewInfoJB;
    private javax.swing.JButton adminLogin;
    private javax.swing.JComboBox<String> filmNameBox;
    private javax.swing.JComboBox<String> dateBox;
    private javax.swing.JComboBox<String> timeBox;
    private JLabel lblNewLabel_1;
}
