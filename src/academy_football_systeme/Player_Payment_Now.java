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
import java.time.LocalDate;
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
public class Player_Payment_Now extends javax.swing.JFrame {
ArrayList arr;
    ArrayList arr2;
    DefaultComboBoxModel M1;
    DefaultComboBoxModel M2;
    
    DefaultTableModel dm;
    /**
     * Creates new form Player_Payment_Now
     */
    public Player_Payment_Now() {
       
        try {
            initComponents();
            this.setTitle("Player Pyment Now");
            
            LocalDate now = java.time.LocalDate.now();
       String ss=now.toString();
       date_payment.setText(ss);
            
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
                           
                           for(int i=0;i<M2.getSize();i++)
                           {
                               System.out.println(M2.getElementAt(i));
                           }
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        age_cato = new javax.swing.JComboBox<>();
        player_id = new javax.swing.JComboBox<>();
        date_payment = new javax.swing.JTextField();
        payed_now = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        player_name = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        req_table = new javax.swing.JTable();
        zz2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Player Payment Now :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Age Categorie :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Player Id :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date of Payment :");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Payed Now :");

        age_cato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        age_cato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age_catoActionPerformed(evt);
            }
        });

        player_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        player_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player_idActionPerformed(evt);
            }
        });

        date_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_paymentActionPerformed(evt);
            }
        });

        payed_now.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payed_nowActionPerformed(evt);
            }
        });

        jButton1.setText("Pay ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Player Name :");

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        req_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Require Amount", "Date from", "Date to"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(req_table);

        zz2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        zz2.setForeground(new java.awt.Color(255, 255, 255));
        zz2.setText("Requirment Amounts for the player :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(zz2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(zz2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(payed_now, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player_id, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(player_name, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(age_cato, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton1)))
                .addContainerGap(670, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(age_cato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(player_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(player_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(payed_now, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void payed_now(){
        
        if(payed_now.getText().toString().equals(""))
        {
                JOptionPane.showMessageDialog(null,"Please enter a paying amount now feild !!");  
        
        }
        else{
    try {
        Connection con = null;
        String url ="jdbc:sqlserver://localhost:1433;databaseName=academy_football_systeme;integratedSecurity=true;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        con =DriverManager.getConnection(url);
        if(con!=null)
        {
            float money_inn=0;
            String playeridd=player_id.getSelectedItem().toString();
            int playerid=Integer.parseInt(playeridd);
            
            String dateofpayment=date_payment.getText().toString();
            String payednow=payed_now.getText().toString();
            int payed=Integer.parseInt(payednow);
            
            int id=1;
            String  queryy="insert into Player_Payment_Payed (PLAYER_ID,DATE_PAYED,WHAT_PAYED) values("+playerid+",'"+dateofpayment+"',"+payed+")";
             Statement st = con.createStatement();
            st.executeUpdate(queryy);
            String playername=player_name.getText().toString();
            JOptionPane.showMessageDialog(null,"the player :"+playername+" has payed :"+payed);  
        
             
             String quryyy="SELECT MONEY_IN FROM Academy_Balance ";
              
              ResultSet rs=st.executeQuery(quryyy);
              while(rs.next())
              {
                   money_inn=rs.getFloat(1);
              }
             float updated_value=money_inn+payed; 
             
             String querey="UPDATE Academy_Balance set MONEY_IN="+updated_value+" WHERE ID="+id;
                 Statement st5 = con.createStatement();
                 st5.executeUpdate(querey);
             
        }   
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Player_Payment_Now.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Player_Payment_Now.class.getName()).log(Level.SEVERE, null, ex);
    }
        jPanel2.setVisible(false);     
        
        
    }
    }
    
    
    
    
    private void date_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_paymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_paymentActionPerformed

    private void payed_nowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payed_nowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payed_nowActionPerformed

    private void age_catoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age_catoActionPerformed
        // TODO add your handling code here:
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
        // TODO add your handling code here:
        
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
                         
                         
                  String query2="SELECT REQUIRE_AMOUNT,DATE_FROM,DATE_TO FROM  Player_Payment_Requirment WHERE PLAYER_ID="+id_playerr; 
                   ResultSet rs2=st.executeQuery(query2);
                   dm=(DefaultTableModel) req_table.getModel();
                   dm.setRowCount(0);
                    String nameplayer=player_name.getText().toString();
                      
                   while(rs2.next())
                   {
                       jPanel2.setVisible(true);
                       zz2.setText("Requirment Amounts for the player :"+nameplayer);
                       
                       
                       dm.addRow(new Object[]{nameplayer,rs2.getObject(1),rs2.getString(2),rs2.getString(3)});
                       
                   }
                         
                         
             }
             
         } catch (SQLException ex) {
             Logger.getLogger(Player_Payment_Require.class.getName()).log(Level.SEVERE, null, ex);
         }
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Player_Payment_Require.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        
    }//GEN-LAST:event_player_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        payed_now();
        
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
            java.util.logging.Logger.getLogger(Player_Payment_Now.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Player_Payment_Now.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Player_Payment_Now.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Player_Payment_Now.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Player_Payment_Now().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> age_cato;
    private javax.swing.JTextField date_payment;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField payed_now;
    private javax.swing.JComboBox<String> player_id;
    private javax.swing.JTextField player_name;
    private javax.swing.JTable req_table;
    private javax.swing.JLabel zz2;
    // End of variables declaration//GEN-END:variables
}
