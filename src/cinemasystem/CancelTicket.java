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
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

/**
 *
 * @author christophermclaughlin
 */
public class CancelTicket extends javax.swing.JFrame {

    /**
     * Creates new form CancelTicket
     */
    public CancelTicket() {
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

        closeJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setHorizontalAlignment(SwingConstants.CENTER);
        jTextField1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        cancelJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        closeJButton.setText("Close");
        closeJButton.setBackground(new Color(204, 51, 51));
        closeJButton.setFont(new Font("SansSerif", Font.BOLD, 30));
        closeJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        closeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Cancel Ticket");
        jLabel1.setFont(new Font("American Typewriter", Font.BOLD, 50));
        jLabel1.setForeground(new Color(51, 204, 204));

        jTextField1.setText("   Please Enter Ticket ID");

        cancelJButton.setText("Cancel Ticket");
        cancelJButton.setBackground(new Color(102, 204, 0));
        cancelJButton.setFont(new Font("SansSerif", Font.BOLD, 30));
        
        lblNewLabel = new JLabel("");
        Image imgLogo = new ImageIcon(this.getClass().getResource("/logo.jpg")).getImage();
        lblNewLabel.setIcon(new ImageIcon(imgLogo));
        Border line = BorderFactory.createLineBorder(Color.black, 5);
        lblNewLabel.setBorder(line);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(199)
        			.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 541, GroupLayout.PREFERRED_SIZE)
        			.addGap(50)
        			.addComponent(cancelJButton, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(720, Short.MAX_VALUE))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addGap(1121)
        			.addComponent(closeJButton, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
        			.addGap(547))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(537)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(914, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(487)
        			.addComponent(lblNewLabel)
        			.addContainerGap(875, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(22)
        			.addComponent(lblNewLabel)
        			.addGap(18)
        			.addComponent(jLabel1)
        			.addGap(47)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        				.addComponent(cancelJButton))
        			.addGap(240)
        			.addComponent(closeJButton, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(197, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);
        getContentPane().setBackground(new Color(153, 0, 0));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        JComponent comp = (JComponent) evt.getSource();
         Window win = SwingUtilities.getWindowAncestor(comp);
         win.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JComponent comp = (JComponent) evt.getSource();
         Window win = SwingUtilities.getWindowAncestor(comp);
         win.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CancelTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                CancelTicket frame = new CancelTicket();
                
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                
                frame.setVisible(true);    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeJButton;
    private javax.swing.JButton cancelJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private JLabel lblNewLabel;
    // End of variables declaration//GEN-END:variables
}
