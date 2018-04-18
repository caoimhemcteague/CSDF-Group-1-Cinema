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
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.JTableHeader;

import net.proteanit.sql.DbUtils;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;
import javax.swing.JButton;
import java.awt.event.ActionListener;

/**
 *
 * @author christophermclaughlin
 */
public class AdminPage extends javax.swing.JFrame {
	
	private final String USER_NAME = "root";
	private final String PASSWORD = "password";
    Connection conn;
    Statement st;
    ResultSet rs;
    static String filmName;
    /**
     * Creates new form AdminPage
     */
    public AdminPage() {
        initComponents();
        fetch();
    }
    
    //public static String getTitle() {
   // 	return AdminPage.filmName;
   // }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox1.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        removeJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addFilmJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        table.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        closeJButton = new javax.swing.JButton();
        editFilmJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        removeJButton.setText("Remove");
        removeJButton.setBackground(Color.CYAN);
        removeJButton.setFont(new Font("SansSerif", Font.BOLD, 30));
        removeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	removeJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Administrator");
        jLabel1.setFont(new Font("SansSerif", Font.BOLD, 39));
        jLabel1.setForeground(Color.PINK);

        jLabel2.setText("Please select a film to remove ");
        jLabel2.setFont(new Font("SansSerif", Font.BOLD, 30));
        jLabel2.setForeground(Color.YELLOW);

        addFilmJButton.setText("Add New Film");
        addFilmJButton.setBackground(Color.CYAN);
        addFilmJButton.setFont(new Font("SansSerif", Font.BOLD, 30));
        addFilmJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	addFilmJButtonActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        
        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.black);
        header.setForeground(Color.black);
        header.setFont(new Font("Arial", Font.BOLD, 20));
        table.setRowHeight(30);
        table.setRowMargin(5);
        Border line = BorderFactory.createLineBorder(Color.black, 2);
        table.setBorder(line);
        
        jScrollPane1.setViewportView(table);

        closeJButton.setText("Close");
        closeJButton.setBackground(Color.RED);
        closeJButton.setFont(new Font("SansSerif", Font.BOLD, 30));
        closeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        editFilmJButton.setText("Edit Film");
        editFilmJButton.setBackground(Color.CYAN);
        editFilmJButton.setFont(new Font("SansSerif", Font.BOLD, 30));
        editFilmJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtActionPerformed(evt);
            }
        });
        
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] {"Select Film"}));

        try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
			st = conn.createStatement();
			String s = "Select Name from film";
			rs = st.executeQuery(s);
			while(rs.next()) {
				jComboBox1.addItem(rs.getString(1));
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
        
        JButton btnAddScreening = new JButton("Add Screening");
        btnAddScreening.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        	   Screenings screen = new Screenings();
     	       screen.setExtendedState(JFrame.MAXIMIZED_BOTH);         	      
     	       screen.setVisible(true);
        
        	}
        });
        btnAddScreening.setBackground(Color.CYAN);
        btnAddScreening.setFont(new Font("SansSerif", Font.BOLD, 30));
        
        JButton addAdminButton = new JButton("Administrators");
        addAdminButton.setBackground(Color.CYAN);
        addAdminButton.setFont(new Font("SansSerif", Font.BOLD, 30));
        addAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	addAdminButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(83)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel2)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jComboBox1, 0, 596, Short.MAX_VALUE)
        									.addGap(256))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 747, GroupLayout.PREFERRED_SIZE)
        									.addGap(105)))
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(addAdminButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(addFilmJButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(removeJButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
        								.addComponent(editFilmJButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(btnAddScreening, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        							.addGap(44))))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap(1133, Short.MAX_VALUE)
        					.addComponent(closeJButton)))
        			.addGap(32))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(493)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(492, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(15)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel2)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        				.addComponent(removeJButton))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(addFilmJButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(editFilmJButton, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnAddScreening, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(4)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap(63, Short.MAX_VALUE))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addGap(6)
        					.addComponent(addAdminButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
        					.addComponent(closeJButton)
        					.addGap(19))))
        );
        getContentPane().setLayout(layout);
        getContentPane().setBackground(Color.GRAY);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fetch() {
      	 
    	try {
    		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", USER_NAME, PASSWORD);
 			st = conn.createStatement();
 			String s = "Select Name, PG_Rating, Genre, Duration from film;";
 			rs = st.executeQuery(s);
 			
 			table.setModel(DbUtils.resultSetToTableModel(rs));
 			//while(rs.next()) {
 			//	dateBox.addItem(rs.getString(1));
 			//}
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
    	
    	jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] {"Select Film"}));

        try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
			st = conn.createStatement();
			String s = "Select Name from film";
			rs = st.executeQuery(s);
			while(rs.next()) {
				jComboBox1.addItem(rs.getString(1));
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
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         JComponent comp = (JComponent) evt.getSource();
         Window win = SwingUtilities.getWindowAncestor(comp);
         win.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    

    
    private void removeJButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	String filmName = jComboBox1.getSelectedItem().toString();
    	
    	if(filmName.equals("Select Film"))
    	{
    		JOptionPane.showMessageDialog(null,  "Select a film to be removed");
    	}
    	else {
    		int response=JOptionPane.showConfirmDialog(null,  "Are you sure you want to remove "+filmName+"?","Remove Film?", JOptionPane.YES_NO_OPTION);
    		
    		if(response==JOptionPane.YES_OPTION)
    		{
    	
    	try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema", USER_NAME, PASSWORD);
			st = conn.createStatement();
			String s = "Delete from film where Name = '" + filmName+ "'";
			st.executeUpdate(s);
			fetch();
			
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
    else {			
		}
    		
      }
    }
    
    private void addAdminButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	/*EditAdmin editAdmin = new EditAdmin();
    	  editAdmin.setExtendedState(JFrame.MAXIMIZED_BOTH); 
          editAdmin.setVisible(true);
    	 */
    	
    }
    private void addFilmJButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         

        AddFilm film = new AddFilm();
        film.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        film.setVisible(true);
    } 
    
    private void editBtActionPerformed(java.awt.event.ActionEvent evt) {     
    	String filmToBeEdited = jComboBox1.getSelectedItem().toString();
    	
        if(filmToBeEdited.equals("Select Film")) {
        	JOptionPane.showMessageDialog(null,  "Select a Film to edit first");
        }
        else {
        String genre="", actor="", director="", trailer="", synopsis1="", duration="";
        String value = filmToBeEdited;
        
        try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
			st = conn.createStatement();
			String ac = "Select Actor from film Where Name ='"+value+"'";
			String d = "Select Director from film Where Name ='"+value+"'";
			String g = "Select Genre from film Where Name ='"+value+"'";
			String mins = "Select Duration from film Where Name ='"+value+"'";
			String synopsis = "Select synopsis from film Where Name ='"+value+"'";
			String getTrailer = "select trailer from film where Name ='"+value+"'";

			rs = st.executeQuery(d);
			if(rs.next())
			director = rs.getString(1);
			
			rs = st.executeQuery(ac);
			if(rs.next())
			actor = rs.getString(1);
			
			rs = st.executeQuery(g);
			if(rs.next())
			genre = rs.getString(1);
			
			rs = st.executeQuery(mins);
			if(rs.next())
			duration = rs.getString(1);
			
			rs = st.executeQuery(getTrailer);
			if(rs.next())
			trailer = rs.getString(1);
			
			rs = st.executeQuery(synopsis);
			if(rs.next())
			synopsis1 = rs.getString(1);
			
		}
		catch (Exception b) {
		JOptionPane.showMessageDialog(null,  b.getMessage());
		}finally {
			try {
				st.close();
				rs.close();
				conn.close();
				
			}catch(Exception b) {
	    		JOptionPane.showMessageDialog(null,  "Error Close");

			}
		}
        	
        	
    	EditFilm film = new EditFilm();
        EditFilm.TitleTextField1.setText(filmToBeEdited);
        EditFilm.ActorjTextField.setText(actor);
        EditFilm.DirectorjTextField.setText(director);
        EditFilm.DurationjTextField.setText(duration);
        EditFilm.GenrejTextField.setText(genre);
        EditFilm.LinkjTextField.setText(trailer);
        EditFilm.txtSynopsis.setText(synopsis1);

        film.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        film.setVisible(true);// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                AdminPage frame = new AdminPage();
                
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                
                frame.setVisible(true);  
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton removeJButton;
    private javax.swing.JButton addFilmJButton;
    private javax.swing.JButton closeJButton;
    private javax.swing.JButton editFilmJButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
}
