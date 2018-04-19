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
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import net.proteanit.sql.DbUtils;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author christophermclaughlin
 */
public class ViewInfo extends javax.swing.JFrame {

    /**
     * Creates new form ViewInfo
     */
	private final String USER_NAME = "root";
	private final String PASSWORD = "password";
    Connection conn;
    Statement st;
    ResultSet rs;
        
    public ViewInfo() {
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
    	
    	Image img = new ImageIcon(this.getClass().getResource("/images.jpg")).getImage();
    	posterLabel = new JLabel(new ImageIcon(img));
    	posterLabel.setSize(229, 305);
    	poster2 = new JLabel(new ImageIcon(img));
    	poster2.setSize(392, 534);

    	try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
			st = conn.createStatement();
			String s = "select poster from film LIMIT 1";
			rs = st.executeQuery(s);
			while(rs.next()) {
				byte[] img1 = rs.getBytes(1);
				ImageIcon image = new ImageIcon(img1);
				Image im = image.getImage();
				Image myImg = im.getScaledInstance(posterLabel.getWidth(), posterLabel.getHeight(), Image.SCALE_SMOOTH);
				Image myImg2 = im.getScaledInstance(poster2.getWidth(), poster2.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon newImage = new ImageIcon(myImg);
				ImageIcon newImage2 = new ImageIcon(myImg2);
				posterLabel.setIcon(newImage);
				poster2.setIcon(newImage2);


				
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
    	
        jLabel1 = new javax.swing.JLabel();
        closeJButton = new javax.swing.JButton();
        filmName = new javax.swing.JComboBox<>();
        filmName.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
        JLabel lblDirector = new JLabel("Directed By:");
        lblDirector.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblDirector.setForeground(Color.YELLOW);
        JLabel lblGenre = new JLabel("Genre:");
        lblGenre.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblGenre.setForeground(Color.YELLOW);
        JLabel lblRun = new JLabel("Run Time:");
        lblRun.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblRun.setForeground(Color.YELLOW);
        lblActors = new JLabel("Actors:");
        lblActors.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblActors.setForeground(Color.YELLOW);
        lblDirName = new JLabel("(Director N/A)");
        lblDirName.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblDirName.setForeground(Color.YELLOW);
        sqlGenre = new JLabel("(Genre N/A)");
        sqlGenre.setFont(new Font("SansSerif", Font.BOLD, 20));
        sqlGenre.setForeground(Color.YELLOW);
        
        actorsLabel = new JLabel("(Actors N/A)");
        actorsLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
        actorsLabel.setForeground(Color.YELLOW);
        
        lblRunTime = new JLabel("(Duration N/A)");
        lblRunTime.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblRunTime.setForeground(Color.YELLOW);
        
        lblPgRating = new JLabel();
        lblPgRating.setFont(new Font("SansSerif", Font.BOLD, 30));
        lblPgRating.setForeground(Color.YELLOW);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        setForeground(Color.BLACK);


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("View Film Info");
        jLabel1.setFont(new Font("sansserif", Font.BOLD, 24));
        jLabel1.setForeground(new Color(51, 204, 204));

        closeJButton.setText("Close");
        closeJButton.setBackground(new Color(204, 51, 51));
        closeJButton.setFont(new Font("sansserif", Font.BOLD, 16));
        closeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fetch();
        filmName.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		filmNameActionPerformed(e);
        
        	}
        });

        try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
			st = conn.createStatement();
			String s = "Select Name from film";
			rs = st.executeQuery(s);
			while(rs.next()) {
				filmName.addItem(rs.getString(1));
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
        
        String value=(String)filmName.getSelectedItem();
        synopsisTextArea = new JTextArea();
        synopsisTextArea.setForeground(Color.BLACK);
        synopsisTextArea.setBackground(Color.LIGHT_GRAY);

     		 try {
   			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
   			st = conn.createStatement();
   			String ac = "Select Actor from film Where Name ='"+value+"'";
   			String d = "Select Director from film Where Name ='"+value+"'";
   			String g = "Select Genre from film Where Name ='"+value+"'";
   			String mins = "Select Duration from film Where Name ='"+value+"'";
   			String pgR = "Select PG_Rating from film Where Name ='"+value+"'";
   			String synopsis = "Select synopsis from film Where Name ='"+value+"'";
   			
   			rs = st.executeQuery(d);
   			if(rs.next())
   			lblDirName.setText(rs.getString(1));
   			
   			rs = st.executeQuery(ac);
   			if(rs.next())
   			actorsLabel.setText(rs.getString(1));
   			
   			rs = st.executeQuery(g);
   			if(rs.next())
   			sqlGenre.setText(rs.getString(1));
   			
   			rs = st.executeQuery(pgR);
   			if(rs.next())
   			lblPgRating.setText(rs.getString(1));
   			
   			rs = st.executeQuery(mins);
   			if(rs.next())
   			lblRunTime.setText(rs.getString(1));
   			
   			rs = st.executeQuery(synopsis);
   			if(rs.next())
   			synopsisTextArea.setText(rs.getString(1));
   			
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
        
        viewTrailerBt = new JButton("View Trailer");
        viewTrailerBt.setBackground(new Color(102, 204, 0));
        viewTrailerBt.setFont(new Font("sansserif", Font.BOLD, 16));
        viewTrailerBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTrailerActionPerformed(evt);
            }
        });
        
        scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        
        
        
        
        
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(366)
        			.addComponent(jLabel1)
        			.addContainerGap(3053, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(28)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(viewTrailerBt, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
        						.addComponent(posterLabel, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE))
        					.addGap(62))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(closeJButton, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(filmName, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblRun)
        						.addComponent(lblGenre))
        					.addGap(36)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(sqlGenre)
        						.addComponent(lblRunTime)))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblDirector)
        						.addComponent(lblActors))
        					.addGap(25)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(actorsLabel)
        						.addComponent(lblDirName)))
        				.addComponent(scrollPane, 0, 0, Short.MAX_VALUE))
        			.addGap(46)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(poster2, GroupLayout.PREFERRED_SIZE, 392, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblPgRating, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
        			.addGap(2543))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(14)
        			.addComponent(jLabel1)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(lblPgRating)
        						.addComponent(filmName, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(22)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(lblGenre)
        								.addComponent(sqlGenre))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(lblRun)
        								.addComponent(lblRunTime))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(lblDirector)
        								.addComponent(lblDirName))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(lblActors)
        								.addComponent(actorsLabel))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(poster2, GroupLayout.PREFERRED_SIZE, 534, GroupLayout.PREFERRED_SIZE)))
        					.addGap(138))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(posterLabel, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(viewTrailerBt, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(closeJButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
        					.addGap(103))))
        );
        
        scrollPane.setViewportView(synopsisTextArea);
        synopsisTextArea.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 18));
        synopsisTextArea.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        synopsisTextArea.setLineWrap(true);
        synopsisTextArea.setWrapStyleWord(true);
        getContentPane().setLayout(layout);
        getContentPane().setBackground(new Color(153, 0, 0));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void fetch() {
    	
    //	filmName.setModel(new DefaultComboBoxModel<>(new String[] {"Select Film"}));

        try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
			st = conn.createStatement();
			String s = "Select Name from film";
			rs = st.executeQuery(s);
			while(rs.next()) {
				filmName.addItem(rs.getString(1));
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
    
    private void filmNameActionPerformed(ActionEvent e) {
    
    String value=(String)filmName.getSelectedItem();

  	 if(value.equals("Select Film")) {
  		 //Do Nothing
  	 }
  	 else{
  		 try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema?autoReconnect=true&useSSL=false", USER_NAME, PASSWORD);
			st = conn.createStatement();
			String ac = "Select Actor from film Where Name ='"+value+"'";
			String d = "Select Director from film Where Name ='"+value+"'";
			String g = "Select Genre from film Where Name ='"+value+"'";
			String mins = "Select Duration from film Where Name ='"+value+"'";
			String pgR = "Select PG_Rating from film Where Name ='"+value+"'";
			String synopsis = "Select synopsis from film Where Name ='"+value+"'";
			String poster = "select poster from film where Name ='"+value+"'";

			rs = st.executeQuery(d);
			if(rs.next())
			lblDirName.setText(rs.getString(1));
			
			rs = st.executeQuery(ac);
			if(rs.next())
			actorsLabel.setText(rs.getString(1));
			
			rs = st.executeQuery(g);
			if(rs.next())
			sqlGenre.setText(rs.getString(1));
			
			rs = st.executeQuery(pgR);
			if(rs.next())
			lblPgRating.setText(rs.getString(1));
			
			rs = st.executeQuery(mins);
			if(rs.next())
			lblRunTime.setText(rs.getString(1));
			
			rs = st.executeQuery(synopsis);
			if(rs.next())
			synopsisTextArea.setText(rs.getString(1));
			
			rs=st.executeQuery(poster);
			if(rs.next()) {
				byte[] img = rs.getBytes(1);
				ImageIcon image = new ImageIcon(img);
				Image im = image.getImage();
				Image myImg = im.getScaledInstance(posterLabel.getWidth(), posterLabel.getHeight(), Image.SCALE_SMOOTH);
				Image myImg2 = im.getScaledInstance(poster2.getWidth(), poster2.getHeight(), Image.SCALE_SMOOTH);
				ImageIcon newImage = new ImageIcon(myImg);
				ImageIcon newImage2 = new ImageIcon(myImg2);
				posterLabel.setIcon(newImage);
				poster2.setIcon(newImage2);
				System.out.println(poster2.getWidth() +""+ poster2.getHeight());

			}
			else {
				JOptionPane.showMessageDialog(null,  "No Data");
			}
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
  		 
  	 }
    }
    
    private void viewTrailerActionPerformed(ActionEvent e) {
        
        String value=(String)filmName.getSelectedItem();

       	 if(value.equals("Select Film")) {
       		 //Do Nothing
       	 }
       	 else {
       		 
         playTrailer trailer = new playTrailer(value);	
    	 
         
         Thread t = new Thread(new Runnable() {
        	 public void run() {
        		  trailer.startTrailer();
        		  
        		  
        	 }
         });
         t.start();
          
    	 
       	 }
        }

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
            java.util.logging.Logger.getLogger(ViewInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	ViewInfo frame = new ViewInfo();
                
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                
                frame.setVisible(true);   
            	
            	
        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeJButton;
    private javax.swing.JComboBox<String> filmName;
    private javax.swing.JLabel jLabel1,lblDirName;
    private JLabel sqlGenre;
    private JLabel lblActors;
    private JLabel actorsLabel;
    private JLabel lblRunTime;
    private JLabel lblPgRating;
    private JTextArea synopsisTextArea;
    private JLabel posterLabel;
    private JButton viewTrailerBt;
    private JScrollPane scrollPane;
    private JLabel poster2;
}
