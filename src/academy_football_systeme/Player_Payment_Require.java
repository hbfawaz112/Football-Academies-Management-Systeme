/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academy_football_systeme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fcss
 */
public class Player_Payment_Require extends javax.swing.JFrame {
 ArrayList arr;
    ArrayList arr2;
    DefaultComboBoxModel M1;
    DefaultComboBoxModel M2;
    /**
     * Creates new form Player_Payment_Require
     */
    public Player_Payment_Require() {
        try {
            initComponents();
            this.setTitle("Player Pyment Require");
            Connection con = null;
            String url ="jdbc:sqlserver://localhost:1433;databaseName=academy_football_systeme;integratedSecurity=true;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con =DriverManager.getConnection(url);
            
            if(con!=null)
            {
                String query2="Select YEAR(DATE_OF_BIRTHDAY)FROM Player";
                  Statement st = con.createStatement();
                    ResultSet rs2=st.executeQuery(query2);
                            arr2=new ArrayList<>();
                         while(rs2.next())
                         {
                             if(!arr2.contains(rs2.getInt(1)))
                             arr2.add(rs2.getInt(1));
                         }
                                M2=new javax.swing.DefaultComboBoxModel<>(arr2.toArray());
                           age_cato.setModel(M2);      
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Player_Payment_Require.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Player_Payment_Require.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void paye_require()
    {
        if(date_from.getText().toString().equals("") || date_to.getText().equals("") || req_amount.getText().toString().equals(""))
        {
           JOptionPane.showMessageDialog(null,"Please enter ll feilds !!");  
          
        }
     try {
         Connection con = null;
         String url ="jdbc:sqlserver://localhost:1433;databaseName=academy_football_systeme;integratedSecurity=true;";
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         con =DriverManager.getConnection(url);
         
         if(con!=null)
         {
             
           String player_idd=player_id.getSelectedItem().toString();
           int playerid=Integer.parseInt(player_idd);
           String datefrom=date_from.getText().toString();
           String dateto=date_to.getText().toString();
           String reqamountt=req_amount.getText().toString();
             float require_amount=Integer.parseInt(reqamountt);
             
String query="insert into Player_Payment_Requirment (PLAYER_ID,DATE_FROM,DATE_TO,REQUIRE_AMOUNT) values (" + playerid +",'"+datefrom+"','"+dateto+"',"+require_amount+")";            
              Statement st = con.createStatement();
            st.executeUpdate(query);
            String playername=player_name.getText().toString();
            JOptionPane.showMessageDialog(null,"the required_amount :"+require_amount+" is added to Player :"+playername);  
        
         }
         
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Player_Payment_Require.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SQLException ex) {
         Logger.getLogger(Player_Payment_Require.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        age_cato = new javax.swing.JComboBox<>();
        player_id = new javax.swing.JComboBox<>();
        date_from = new javax.swing.JTextField();
        date_to = new javax.swing.JTextField();
        req_amount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        player_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Player Payment Require");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Age Categorie :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Player Id :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date From :");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date To :");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Required Amount :");

        age_cato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        age_cato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age_catoActionPerformed(evt);
            }
        });

        player_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        player_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player_idActionPerformed(evt);
            }
        });

        jButton1.setText("Enter Require Amount");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Player Name :");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(YYYY-MM-DD)");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("(YYYY-MM-DD)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date_to, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                .addComponent(req_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(date_from)
                                    .addComponent(player_name, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player_id, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age_cato, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(age_cato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(player_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(player_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(date_from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(date_to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(req_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        paye_require();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void age_catoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age_catoActionPerformed
     try {
         // TODO add your handling code here:
         
         String age_catego=age_cato.getSelectedItem().toString();
         int age_categorie=Integer.parseInt(age_catego);
         Connection con = null;
         String url ="jdbc:sqlserver://localhost:1433;databaseName=academy_football_systeme;integratedSecurity=true;";
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         try {
             con =DriverManager.getConnection(url);
             
             if(con!=null)
             {
                 String query="select  PLAYER_ID   FROM  Player where YEAR(DATE_OF_BIRTHDAY)="+age_categorie;
                   Statement st = con.createStatement();
                         ResultSet rs=st.executeQuery(query);
                 
                       arr=new ArrayList<>();
                        while(rs.next())
                         {
                             if(!arr.contains(rs.getInt(1)))
                             arr.add(rs.getInt(1));
                         }
                                M1=new javax.swing.DefaultComboBoxModel<>(arr.toArray());
                           player_id.setModel(M1); 
                             
             }
             
         } catch (SQLException ex) {
             Logger.getLogger(Player_Payment_Require.class.getName()).log(Level.SEVERE, null, ex);
         }
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Player_Payment_Require.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        
        
        
    }//GEN-LAST:event_age_catoActionPerformed

    private void player_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player_idActionPerformed
     try {
         // TODO add your handling code here:
         
         String iddd=player_id.getSelectedItem().toString();
         int id_playerr=Integer.parseInt(iddd);
         Connection con = null;
         String url ="jdbc:sqlserver://localhost:1433;databaseName=academy_football_systeme;integratedSecurity=true;";
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         try {
             con =DriverManager.getConnection(url);
             if(con!=null)
             {
                 String query="SELECT NAME FROM Player WHERE PLAYER_ID="+id_playerr;
                  Statement st = con.createStatement();
                         ResultSet rs=st.executeQuery(query);
                         while(rs.next())
                         {
                             player_name.setText(rs.getString(1));
                         }
                         
             }
             
         } catch (SQLException ex) {
             Logger.getLogger(Player_Payment_Require.class.getName()).log(Level.SEVERE, null, ex);
         }
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Player_Payment_Require.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_player_idActionPerformed

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
            java.util.logging.Logger.getLogger(Player_Payment_Require.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Player_Payment_Require.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Player_Payment_Require.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Player_Payment_Require.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Player_Payment_Require().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> age_cato;
    private javax.swing.JTextField date_from;
    private javax.swing.JTextField date_to;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> player_id;
    private javax.swing.JTextField player_name;
    private javax.swing.JTextField req_amount;
    // End of variables declaration//GEN-END:variables
}
