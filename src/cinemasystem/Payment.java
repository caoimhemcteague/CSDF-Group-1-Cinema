package cinemasystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.LocalDate;
import java.util.Calendar;
import java.text.DecimalFormat; 


import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import CinemaClasses.Booking;
import CinemaClasses.JTextFieldLimit;
import CinemaClasses.Screening;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christophermclaughlin
 */
public class Payment extends javax.swing.JFrame {

    TicketBooking Booking = new TicketBooking();
    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cardTF = new javax.swing.JTextField(19);
        jLabel6 = new javax.swing.JLabel();
        dateTF = new javax.swing.JTextField();
        securityCodeTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cardHolderNameTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        payBT = new javax.swing.JToggleButton();
        cancelBT = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("Lucida Grande", Font.PLAIN, 39)); // NOI18N 
        jLabel1.setText("Payment");

        jLabel3.setText("Credit/Debit Card Details");
        jLabel3.setFont(new Font("Lucida Grande", Font.PLAIN, 39));
        
        DecimalFormat df = new DecimalFormat("####0.00");
        
        jLabel4.setText("Your Order Total Is "+"�"+ df.format(TicketBooking.Price));
        jLabel4.setFont(new Font("Lucida Grande", Font.PLAIN, 39));

        jLabel5.setText("Card Number:");
        jLabel5.setFont(new Font("Lucida Grande", Font.PLAIN, 39));
        
        cardTF.setDocument(new JTextFieldLimit(19));
        cardTF.setForeground(new java.awt.Color(204, 204, 204));
        cardTF.setFont(new java.awt.Font("Lucida Grande", 0, 36));
        cardTF.setText("   Card Number");

        jLabel6.setText("Expiry:");
        jLabel6.setFont(new Font("Lucida Grande", Font.PLAIN, 39));

        dateTF.setDocument(new JTextFieldLimit(5));
        dateTF.setForeground(new java.awt.Color(204, 204, 204));
        dateTF.setFont(new java.awt.Font("Lucida Grande", 0, 36));
        dateTF.setText("MM/YY");

        securityCodeTF.setDocument(new JTextFieldLimit(3));
        securityCodeTF.setForeground(new java.awt.Color(204, 204, 204));
        securityCodeTF.setFont(new java.awt.Font("Lucida Grande", 0, 36));
        securityCodeTF.setText("CSC");
        

        jLabel7.setText("Security Code:");
        jLabel7.setFont(new Font("Lucida Grande", Font.PLAIN, 39));

        cardHolderNameTF.setForeground(new java.awt.Color(204, 204, 204));
        cardHolderNameTF.setFont(new java.awt.Font("Lucida Grande", 0, 36));
        cardHolderNameTF.setText("  Cardholer Name");

        jLabel8.setText("Cardholder Name");
        jLabel8.setFont(new Font("Lucida Grande", Font.PLAIN, 39));

        payBT.setText("Pay Now");
        payBT.setBackground(Color.GREEN);
        payBT.setFont(new Font("sansserif", Font.BOLD, 16));
        payBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBTActionPerformed(evt);
            }
        });

        cancelBT.setText("Cancel");
        cancelBT.setBackground(Color.RED);
        cancelBT.setFont(new Font("sansserif", Font.BOLD, 16));
        cancelBT.setMaximumSize(new java.awt.Dimension(97, 29));
        cancelBT.setMinimumSize(new java.awt.Dimension(97, 29));
        cancelBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        
        cardTF.addFocusListener(new FocusListener() {
        	public void focusGained(FocusEvent e) {
        		cardTFfocusGained(e);
        
        	}

			@Override
			public void focusLost(FocusEvent e) {
				cardTFfocusLost(e);
				
			}
        });
        
        dateTF.addFocusListener(new FocusListener() {
        	public void focusGained(FocusEvent e) {
        		dateTFfocusGained(e);
        
        	}

			@Override
			public void focusLost(FocusEvent e) {
				dateTFfocusLost(e);
				
			}
        });
        
        securityCodeTF.addFocusListener(new FocusListener() {
        	public void focusGained(FocusEvent e) {
        		securityCodeTFfocusGained(e);
        
        	}

			@Override
			public void focusLost(FocusEvent e) {
				securityCodeTFfocusLost(e);
				
			}
        });
        
        cardHolderNameTF.addFocusListener(new FocusListener() {
        	public void focusGained(FocusEvent e) {
        		cardHolderNameTFfocusGained(e);
        
        	}

			@Override
			public void focusLost(FocusEvent e) {
				cardHolderNameTFfocusLost(e);
				
			}
        });
        
        cardTF.addKeyListener(new KeyListener() {
        	public void keyTyped(KeyEvent e) {
        		cardTFkeyTyped(e);
        	}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        
        dateTF.addKeyListener(new KeyListener() {
        	public void keyTyped(KeyEvent e) {
        		dateTFkeyTyped(e);
        	}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        
        securityCodeTF.addKeyListener(new KeyListener() {
        	public void keyTyped(KeyEvent e) {
        		securityCodeTFkeyTyped(e);
        	}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        
        cardHolderNameTF.addKeyListener(new KeyListener() {
        	public void keyTyped(KeyEvent e) {
        		cardHolderNameTFkeyTyped(e);
        	}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(17)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(cancelBT, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 827, Short.MAX_VALUE)
        					.addComponent(payBT, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
        					.addGap(241))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
        					.addGap(233))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
        					.addGap(285))
        				.addComponent(cardHolderNameTF, GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
        				.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(dateTF, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(securityCodeTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        						.addComponent(cardTF, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 800, GroupLayout.PREFERRED_SIZE))
        					.addGap(274)))
        			.addGap(25))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(584)
        			.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jLabel1)
        			.addGap(22)
        			.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(cardTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        				.addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(dateTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(securityCodeTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel8)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(cardHolderNameTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(payBT, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        				.addComponent(cancelBT, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void payBTActionPerformed(java.awt.event.ActionEvent evt) {
    	String card, expiry, code, name, monthString = "00", yearString = "00";
    	char monthChar1 = '0', monthChar2 = '0', yearChar1 = '0', yearChar2 = '0';
    	card = cardTF.getText();
    	expiry = dateTF.getText();
    	code = securityCodeTF.getText();
    	name = cardHolderNameTF.getText();
    	int month = 00, year = 00;
    	try {
			monthChar1 = expiry.charAt(0);
			monthChar2 = expiry.charAt(1);
			yearChar1 = expiry.charAt(3);
			yearChar2 = expiry.charAt(4);
		   	monthString = ""+monthChar1+""+monthChar2;
			yearString = ""+yearChar1+""+yearChar2;
		    month = Integer.parseInt(monthString);
			year = Integer.parseInt(yearString);
    	}
    	catch(Exception e) {
    		
    	}
    	int currentYear= Calendar.getInstance().get(Calendar.YEAR);  
    	int currentMonth= Calendar.getInstance().get(Calendar.MONTH) + 1;  //month is displayed by their index so must add 1 to get correct month

    	if(card.length() < 19) {
			JOptionPane.showMessageDialog(null,  "Please enter a vaild Card Number");
    	}
    	else if(expiry.length() < 5 || !(expiry.charAt(2) == '/') || month > 12 || month <1 || year > 27 || year < (currentYear -2000)) {
    			JOptionPane.showMessageDialog(null,  "Please enter a vaild Expiry date\nin the following format -- MM/YY");
    		
    	}
    	else if(month < currentMonth && year <= (currentYear - 2000)) {
			JOptionPane.showMessageDialog(null,  "This card has expired");
		}
    	else if(code.length() < 3 || code.equals("CSC")) {
    		JOptionPane.showMessageDialog(null,  "Please enter a vaild CSC");

    	}
    	else if(name.equals("") || name.equals("  Cardholer Name")) {
    		JOptionPane.showMessageDialog(null,  "Name must not be left blank");
    	}
    	else{
    	String film, date, time;
    	film = StartFrame.getFilm();
    	date = StartFrame.getDate();
    	time = StartFrame.getTime();

    	Screening blankScreening = new Screening();
    	int screeningNumber = blankScreening.returnScreeningNum(film, time, date);

    	int adult, child, student_OAP;
    	adult = TicketBooking.getAdultQ();
    	child = TicketBooking.getChildQ();
    	student_OAP = TicketBooking.getStudent_OAP_Q();

    	Booking newBooking = new Booking(adult, child, student_OAP, screeningNumber);
    	newBooking.addBookingToDB();
    	int bookingNum = newBooking.returnBookingNum();
    	
		JOptionPane.showMessageDialog(null,  "Booking successful\nYour booking number is - " + bookingNum);

		JComponent comp = (JComponent) evt.getSource();
        Window win = SwingUtilities.getWindowAncestor(comp);
        win.dispose();
    	
    	
    		
    	}

     }
    
    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
         JComponent comp = (JComponent) evt.getSource();
         Window win = SwingUtilities.getWindowAncestor(comp);
         win.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed
    
    private void cardTFfocusGained(FocusEvent e) {
    	if(cardTF.getText().equals("   Card Number")) {
    			cardTF.setText("");
    	}
    	
    }
    
    private void cardTFfocusLost(FocusEvent e) {
    	if(cardTF.getText().equals("")) {
    	cardTF.setText("   Card Number");
    	}
    	
    }
    
    private void dateTFfocusGained(FocusEvent e) {
    	if(dateTF.getText().equals("MM/YY")) {
    			dateTF.setText("");
    	}
    	
    }
    
    private void dateTFfocusLost(FocusEvent e) {
    	if(dateTF.getText().equals("")) {
    	dateTF.setText("MM/YY");
    	}
    	
    }
    
    private void securityCodeTFfocusGained(FocusEvent e) {
    	if(securityCodeTF.getText().equals("CSC")) {
    			securityCodeTF.setText("");
    	}
    	
    }
    
    private void securityCodeTFfocusLost(FocusEvent e) {
    	if(securityCodeTF.getText().equals("")) {
    		securityCodeTF.setText("CSC");
    	}
    	
    }
    
    private void cardHolderNameTFfocusGained(FocusEvent e) {
    	if(cardHolderNameTF.getText().equals("  Cardholer Name")) {
    		cardHolderNameTF.setText("");
    	}
    	
    }
    
    private void cardHolderNameTFfocusLost(FocusEvent e) {
    	if(cardHolderNameTF.getText().equals("")) {
    		cardHolderNameTF.setText("  Cardholer Name");
    	}
    	
    }
    
    
    
    private void cardTFkeyTyped(KeyEvent e) {
    	char c = e.getKeyChar();
    	if(!(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
    		e.consume();
    	}
    	
    }
    
    private void dateTFkeyTyped(KeyEvent e) {
    	char c = e.getKeyChar();
    	if(c == '/')
    	{
    		//Do nothing
    	}
    	else if(!(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
    		e.consume();
    	}
    	
    }
    
    private void securityCodeTFkeyTyped(KeyEvent e) {
    	char c = e.getKeyChar();
    	if(!(Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
    		e.consume();
    	}
    	
    }
    
    
    private void cardHolderNameTFkeyTyped(KeyEvent e) {
    	char c = e.getKeyChar();
    	if((Character.isDigit(c)) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE) {
    		e.consume();
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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             	Payment frame = new Payment();
                
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                
                frame.setVisible(true); 
            	
            	
         
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField cardTF;
    private javax.swing.JTextField dateTF;
    private javax.swing.JTextField securityCodeTF;
    private javax.swing.JTextField cardHolderNameTF;
    private javax.swing.JToggleButton payBT;
    private javax.swing.JToggleButton cancelBT;
    // End of variables declaration//GEN-END:variables
}
