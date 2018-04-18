package cinemasystem;

import java.awt.Window;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import CinemaClasses.Film;
import CinemaClasses.JTextFieldLimit;
import CinemaClasses.Screening;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christophermclaughlin
 */
public class Screenings extends javax.swing.JFrame {
      
    DateFormat df = DateFormat.getDateInstance();
    private final String USER_NAME = "root";
	private final String PASSWORD = "password";
    Connection conn;
    Statement st;
    ResultSet rs;
    
    
  
    /**
     * Creates new form Screenings
     */
    public Screenings() {
    	getContentPane().setBackground(new Color(0, 204, 204));
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
        jLabel1.setForeground(Color.RED);
        jLabel1.setBackground(Color.RED);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setForeground(Color.RED);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setForeground(Color.RED);
        jLabel3.setBackground(Color.RED);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setForeground(Color.RED);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setForeground(Color.RED);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setForeground(Color.RED);
        theatreComboBox = new javax.swing.JComboBox<>();
        filmComboBox = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        saveButton = new javax.swing.JButton();
        saveButton.setBackground(new Color(102, 204, 0));
        cancelButton = new javax.swing.JButton();
        cancelButton.setBackground(new Color(204, 51, 51));
        screeningNumTf = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new Font("American Typewriter", Font.BOLD, 50)); // NOI18N
        jLabel1.setText("Screening");

        jLabel2.setFont(new Font("Lucida Grande", Font.BOLD, 32)); // NOI18N
        jLabel2.setText("Screening Number:");

        jLabel3.setFont(new Font("Lucida Grande", Font.BOLD, 32)); // NOI18N
        jLabel3.setText("Theatre Number:");

        jLabel4.setFont(new Font("Lucida Grande", Font.BOLD, 32)); // NOI18N
        jLabel4.setText("Date:");

        jLabel5.setFont(new Font("Lucida Grande", Font.BOLD, 32)); // NOI18N
        jLabel5.setText("Time:");

        jLabel6.setFont(new Font("Lucida Grande", Font.BOLD, 32)); // NOI18N
        jLabel6.setText("Film Name:");
        jLabel6.setToolTipText("");

        theatreComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 32)); // NOI18N
        theatreComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Theatre" }));
        try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
			st = conn.createStatement();
			String s = "Select Theatre_Num from theatre";
			rs = st.executeQuery(s);
			while(rs.next()) {
				theatreComboBox.addItem(rs.getString(1));
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

        filmComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 32)); // NOI18N
        filmComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Film" }));
        try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
			st = conn.createStatement();
			String s = "Select Name from film";
			rs = st.executeQuery(s);
			while(rs.next()) {
				filmComboBox.addItem(rs.getString(1));
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

        jDateChooser1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        saveButton.setFont(new java.awt.Font("Lucida Grande", 0, 32)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Lucida Grande", 0, 32)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        screeningNumTf.setFont(new java.awt.Font("Lucida Grande", 0, 32)); // NOI18N
        screeningNumTf.setForeground(new java.awt.Color(204, 204, 204));
        screeningNumTf.setDocument(new JTextFieldLimit(6));
        screeningNumTf.setText("Number");

        jTextField2.setFont(new java.awt.Font("Lucida Grande", 0, 32)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setText("TIME");
        
        JLabel lblNewLabel = new JLabel("Screen Days");
        lblNewLabel.setForeground(Color.RED);
        lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 32));
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
        comboBox.setFont(new Font("Lucida Grande", Font.PLAIN, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(150)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 581, Short.MAX_VALUE)
        							.addComponent(saveButton, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel2)
        								.addComponent(jLabel3)
        								.addComponent(jLabel6)
        								.addComponent(jLabel4)
        								.addComponent(jLabel5)
        								.addComponent(lblNewLabel))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        								.addGroup(layout.createParallelGroup(Alignment.LEADING)
        									.addComponent(filmComboBox, 0, 584, Short.MAX_VALUE)
        									.addComponent(jDateChooser1, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
        									.addComponent(jTextField2)
        									.addComponent(theatreComboBox, 0, 584, Short.MAX_VALUE)
        									.addComponent(screeningNumTf, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE))))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(489)
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)))
        			.addGap(221))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(30)
        			.addComponent(jLabel1)
        			.addGap(51)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(screeningNumTf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(theatreComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jDateChooser1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addGap(30, 30, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel5)
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(filmComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(32)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel)
        				.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(74)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(cancelButton)
        				.addComponent(saveButton))
        			.addGap(33))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 //       String Date = df.format(jDateChooser1.getDate()) ;
 //       System.out.println(Date);
        int screeningNum = Integer.parseInt(screeningNumTf.getText());
        Boolean check = isNumberFree(screeningNum);
      //  String filmName=(String)filmComboBox.getSelectedItem();
        //String theatreSelected=(String)theatreComboBox.getSelectedItem();
        System.out.println(check);
        if(check == false) {
			JOptionPane.showMessageDialog(null,  "This Screening Number is already in use");
        	
        }
        
        
        
    	/*if(filmName.equals("Select Film")||theatreSelected.equals("Select Theatre")) 
    	{
    		 filmComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Film"}));
    		 theatreComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Theatre"}));
    	}
    	else {
        Film film = new Film();
        Screening screening = new Screening();
    	}*/
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JComponent comp = (JComponent) evt.getSource();
         Window win = SwingUtilities.getWindowAncestor(comp);
         win.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public Boolean isNumberFree(int num) {
    	int databaseNum = 0;
    	try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
			st = conn.createStatement();
			String s = "Select Screening_Num from screening;";
			rs = st.executeQuery(s);
			while(rs.next()) {
				databaseNum = rs.getInt(1);
				if(num == databaseNum)
				{
					return false;
				}
			}
			return true;
		}
		catch (Exception b) {
		JOptionPane.showMessageDialog(null,  "Error");
		return false;
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Screenings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screenings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screenings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screenings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Screenings frame = new Screenings();
                
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                
                frame.setVisible(true);  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton saveButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> theatreComboBox;
    private javax.swing.JComboBox<String> filmComboBox;
    public static com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField screeningNumTf;
    private javax.swing.JTextField jTextField2;
}
