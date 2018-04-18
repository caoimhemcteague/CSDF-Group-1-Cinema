/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemasystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 *
 * @author christophermclaughlin
 */
public class TicketBooking extends javax.swing.JFrame{
	
		private final static String USER_NAME = "root";
		private final static String PASSWORD = "password";
	    static Connection conn;
	    static Statement st;
	    static ResultSet rs;
	    
	    static double adultPrice1 = 0;
        static double childPrice1 = 0;
        static double student_OAP_Price1= 0;

		static String adultPrice = "";
		static String childPrice = "";
		static String student_OAP_Price = "";
        
        static double AdultQ;
        static double ChildQ;
        static double student_OAP_Q;
        static double Price;
        
        int seats = 0;
        int ScreeningNum = 0;
        int theatreNum = 0;
        
        String filmName="", filmDate="", filmTime="";
        

    
    StartFrame frame = new StartFrame();
    /**
     * Creates new form TicketBooking
     */
    public TicketBooking() {
    	getPrices();
    	initComponents();  
    }
    		
    public String getPrice(){
        
        return String.valueOf(this.Price);
    }
    
    public static int getAdultQ(){
    	int a = (int)AdultQ;
        return a;
    }
    public static int getChildQ(){
        int c = (int)ChildQ;
        return c;
    }
    public static int getStudent_OAP_Q(){
        int s = (int) student_OAP_Q;
    	return s;
    }
    
       
        
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        filmNameLabel = new javax.swing.JLabel();
        closeJButton = new javax.swing.JButton();
        acceptJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        adultBox = new javax.swing.JComboBox<>();
        childBox = new javax.swing.JComboBox<>();
        student_OAP_Box = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        filmDateLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        filmTimeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        filmNameLabel.setText(frame.getFilm());
        filmNameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 39));

        
        

        closeJButton.setText("Close");
        closeJButton.setBackground(Color.RED);
        closeJButton.setFont(new Font("sansserif", Font.BOLD, 16));
        closeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        acceptJButton.setText("Accept");
        acceptJButton.setBackground(Color.GREEN);
        acceptJButton.setFont(new Font("sansserif", Font.BOLD, 16));
        acceptJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        
        jLabel3.setFont(new Font("Lucida Grande", Font.PLAIN, 39)); // NOI18N
        jLabel3.setForeground(Color.PINK);
        jLabel3.setText("Ticket Booking");

        jLabel4.setText("Theatre Adult Ticket �" + adultPrice + " Amount");
        jLabel4.setFont(new Font("Lucida Grande", Font.PLAIN, 39));
        jLabel4.setForeground(Color.YELLOW);

        jLabel5.setText("Theatre Child Tickets �" + childPrice + " Amount");
        jLabel5.setFont(new Font("Lucida Grande", Font.PLAIN, 39));
        jLabel5.setForeground(Color.YELLOW);

        jLabel6.setText("Theatre Student/OAP Tickets �" + student_OAP_Price + " Amount");
        jLabel6.setFont(new Font("Lucida Grande", Font.PLAIN, 39));
        jLabel6.setForeground(Color.YELLOW);

        jLabel7.setText("Please Select Quantity of Tickets:");
        jLabel7.setFont(new Font("Lucida Grande", Font.PLAIN, 39));
        jLabel7.setForeground(Color.YELLOW);

        adultBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        adultBox.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        adultBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        childBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        childBox.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        childBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        student_OAP_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        student_OAP_Box.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        student_OAP_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jLabel8.setText("You Are Viewing:");
        jLabel8.setFont(new Font("Lucida Grande", Font.PLAIN, 39));

        jLabel9.setText("Date:");
        jLabel9.setFont(new Font("Lucida Grande", Font.PLAIN, 39));

        filmDateLabel.setText(frame.getDate());
        filmDateLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 39));

        
        jLabel11.setText("Time:");
        jLabel11.setFont(new Font("Lucida Grande", Font.PLAIN, 39));

        filmTimeLabel.setText(frame.getTime());
        filmTimeLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 39));
        
        filmName=filmNameLabel.getText();
        filmDate=filmDateLabel.getText();
        filmTime=filmTimeLabel.getText();
        checkNumOfTickets();
        
        if(seats < 10)
        {
        	jLabel7.setText("Alert - There is only "+seats+" seats remaining:");
            jLabel7.setFont(new Font("Lucida Grande", Font.PLAIN, 39));
            jLabel7.setForeground(Color.YELLOW);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(147)
        					.addComponent(jLabel1))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(20)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel9)
        						.addComponent(jLabel8)
        						.addComponent(jLabel11))
        					.addGap(26)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(filmDateLabel)
        						.addComponent(filmNameLabel)
        						.addComponent(filmTimeLabel)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(12)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(10)
        							.addComponent(acceptJButton, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 705, Short.MAX_VALUE)
        							.addComponent(closeJButton, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(adultBox, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(jLabel4))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(childBox, 0, 70, Short.MAX_VALUE)
        								.addComponent(student_OAP_Box, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        							.addGap(12)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel6)
        								.addComponent(jLabel5)))
        						.addComponent(jLabel7))))
        			.addContainerGap())
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(321)
        			.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(436))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel3)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(filmNameLabel)
        				.addComponent(jLabel8))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(filmDateLabel)
        				.addComponent(jLabel9))
        			.addGap(11)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(filmTimeLabel)
        				.addComponent(jLabel11))
        			.addGap(24)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel7)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(adultBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(childBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel5))
        			.addGap(15)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(student_OAP_Box, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel6))
        			.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(closeJButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        				.addComponent(acceptJButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);
        getContentPane().setBackground(Color.GRAY);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         JComponent comp = (JComponent) evt.getSource();
         Window win = SwingUtilities.getWindowAncestor(comp);
         win.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {    
    	if(AdultQ ==0 && ChildQ ==0 && student_OAP_Q == 0)
    	{
    		JOptionPane.showMessageDialog(null,  "Please select a minimum of 1 ticket");

    	}
    	else if(seats == 0)
    	{
    		JOptionPane.showMessageDialog(null,  "This Film is SOLD OUT");

    	}
    	else if((AdultQ + ChildQ +student_OAP_Q) > seats) {
    		
    		JOptionPane.showMessageDialog(null,  "This screening is almost sold out\nThere is only "+seats+ "seats remaining");
    	}
    	else {
	        Price = ((AdultQ * adultPrice1) + (ChildQ * childPrice1) + (student_OAP_Q * student_OAP_Price1));
	        Payment pay = new Payment();
	        pay.setVisible(true);
	        JComponent comp = (JComponent) evt.getSource();
	        Window win = SwingUtilities.getWindowAncestor(comp);
	        win.dispose();
    	}
        // TODO add your handling code here:
    }   
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String tmp = null;
        tmp = childBox.getSelectedItem().toString();
        ChildQ = Double.parseDouble(tmp);
    } 
    
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String tmp = null;
        tmp = student_OAP_Box.getSelectedItem().toString();
        student_OAP_Q = Double.parseDouble(tmp);
    }   
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String tmp = null;
        tmp = adultBox.getSelectedItem().toString();
        AdultQ = Double.parseDouble(tmp);
        
    }  
    
    public void getScreeningDetails() {
    	try {
   			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
    		st = conn.createStatement();
   			String s = "Select Screening_Num from cinema.screening where Date = '"+filmDate+"' And Time = "+filmTime+" And FilmName = '"+filmName+"';";
   			String a = "Select    TheatreNum from cinema.screening where Date = '"+filmDate+"' And Time = "+filmTime+" And FilmName = '"+filmName+"';";
   			rs = st.executeQuery(s);
   			while(rs.next()) {
   					ScreeningNum= rs.getInt(1);		
   				}
   			
   			rs=st.executeQuery(a);
   			while(rs.next()) {
   					theatreNum=rs.getInt(1);
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
    	
    	
    }
    
    public void checkNumOfTickets() {
    	getScreeningDetails();
    	int capacity = 0;
    	int purchasedTickets = 0;
    	
    	try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
			st = conn.createStatement();
			String cap = "Select Capacity From theatre where Theatre_Num = "+theatreNum+";";
			String totalTicketsPurchased =  "Select Sum(Number_of_Tickets) from booking where Screening_Number = "+ScreeningNum+";";
			
			rs = st.executeQuery(cap);
			if(rs.next())
			capacity = rs.getInt(1);
			
			rs = st.executeQuery(totalTicketsPurchased);
			if(rs.next()) {
			purchasedTickets = rs.getInt(1);

			}
	   		
			seats = capacity - purchasedTickets;
		}
		catch (Exception b) {
		JOptionPane.showMessageDialog(null,  b.getMessage() );
		}finally {
			try {
				st.close();
				rs.close();
				conn.close();
				
			}catch(Exception b) {
	    		JOptionPane.showMessageDialog(null,  "Error Close");

			}
		}
    }
    
    
    public static void getPrices() {
    	try {
   			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
    	//	Connector.createConnection();
    		st = conn.createStatement();
   			String s = "Select Cost from cinema.type where name = 'Adult'";
   			rs = st.executeQuery(s);
   			while(rs.next()) {
   					adultPrice1= rs.getDouble(1);
   					adultPrice=String.valueOf(adultPrice1);
   					NumberFormat formatter = new DecimalFormat("#0.00");
   					adultPrice = formatter.format(adultPrice1);
   					
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
    	   
    	   try {
    	   			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
    	    		//Connector.createConnection();
    	    		st = conn.createStatement();
    	   			String s = "Select Cost from cinema.type where name = 'Child'";
    	   			rs = st.executeQuery(s);
    	   			while(rs.next()) {
    	   				childPrice1= rs.getDouble(1);
    	   				childPrice=String.valueOf(childPrice1);
    	   				NumberFormat formatter = new DecimalFormat("#0.00");
       					childPrice = formatter.format(childPrice1);
	
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
    	   
    	   try {
    	   			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
    	    		//Connector.createConnection();
    	    		st = conn.createStatement();
    	   			String s = "Select Cost from cinema.type where name = 'Student/OAP'";
    	   			rs = st.executeQuery(s);
    	   			while(rs.next()) {
    	   					student_OAP_Price1 = rs.getDouble(1);
    	   					student_OAP_Price=String.valueOf(student_OAP_Price1);
    	   					NumberFormat formatter = new DecimalFormat("#0.00");
    	   					student_OAP_Price = formatter.format(student_OAP_Price1);

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
    	   getPrices();
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             	TicketBooking frame = new TicketBooking();
                
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                
                frame.setVisible(true);    
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeJButton;
    private javax.swing.JButton acceptJButton;
    private javax.swing.JComboBox<String> adultBox;
    private javax.swing.JComboBox<String> childBox;
    private javax.swing.JComboBox<String> student_OAP_Box;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel filmDateLabel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel filmTimeLabel;
    private javax.swing.JLabel filmNameLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables




}



