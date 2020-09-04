/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academy_football_systeme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author fcss
 */
public class Add_Player extends javax.swing.JFrame {

    /**
     * Creates new form Add_Player
     */
    

    


   public Add_Player() {
        initComponents();
        this.setLocationRelativeTo(null);// center form in the screen
        ImageIcon ic= new ImageIcon("C:\\Users\\fcss\\Desktop\\projet_gui\\Academy_Football_Systeme\\src\\academy_football_systeme\\soccer_ball_26px.png");
     this.setIconImage(ic.getImage());
      this.setTitle("Add Player");
      
       LocalDate now = java.time.LocalDate.now();
       String ss=now.toString();
       DR_P.setText(ss);
  
    }
   
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        C_B = new javax.swing.JButton();
        AP_B = new javax.swing.JButton();
        FN_P = new javax.swing.JTextField();
        DB_P = new javax.swing.JTextField();
        S_M_P = new javax.swing.JRadioButton();
        S_F_P = new javax.swing.JRadioButton();
        AD_P = new javax.swing.JTextField();
        DR_P = new javax.swing.JTextField();
        BT_P = new javax.swing.JComboBox<>();
        PO_P = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DES_P = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        PH_P = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Player");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Name:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date Of Birthday:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Blood Type:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Position:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sex :");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Adresse :");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date Of Registration :");

        C_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academy_football_systeme/icons8_delete_16.png"))); // NOI18N
        C_B.setText("Cancel");
        C_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_BActionPerformed(evt);
            }
        });

        AP_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academy_football_systeme/icons8_plus_16.png"))); // NOI18N
        AP_B.setText("Add Player");
        AP_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AP_BActionPerformed(evt);
            }
        });

        FN_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FN_PActionPerformed(evt);
            }
        });

        buttonGroup1.add(S_M_P);
        S_M_P.setForeground(new java.awt.Color(255, 255, 255));
        S_M_P.setText("Male");
        S_M_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_M_PActionPerformed(evt);
            }
        });

        buttonGroup1.add(S_F_P);
        S_F_P.setForeground(new java.awt.Color(255, 255, 255));
        S_F_P.setText("Female");

        AD_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AD_PActionPerformed(evt);
            }
        });

        BT_P.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-","AB+","AB-","O+","O-"}));
        BT_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_PActionPerformed(evt);
            }
        });

        PO_P.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "goalkeeper", "defender", "Midfielder", "Attacker" }));
        PO_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PO_PActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Desciption :");

        DES_P.setColumns(20);
        DES_P.setRows(5);
        jScrollPane1.setViewportView(DES_P);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone:");

        PH_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PH_PActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("(YYYY-MM-DD)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(C_B)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AP_B)
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(DR_P, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(S_M_P)
                                                .addGap(37, 37, 37)
                                                .addComponent(S_F_P))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(FN_P, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(DB_P, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                                        .addComponent(PH_P)
                                                        .addComponent(AD_P, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(BT_P, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3))
                                            .addComponent(PO_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(119, 119, 119))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FN_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(DB_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(PH_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(AD_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(BT_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PO_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(S_M_P)
                    .addComponent(S_F_P))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(DR_P, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_B)
                    .addComponent(AP_B))
                .addContainerGap())
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



    
    
    
    
    
    
    
    public void ADD_PLAYER() 
    {
        if(FN_P.getText().equals("") || DB_P.getText().toString().equals("") || PH_P.getText().toString().equals("") || AD_P.getText().toString().equals("") || DR_P.getText().toString().equals("") || DES_P.getText().toString().equals(""))
        {
         JOptionPane.showMessageDialog(null,"Please fill all feilds"); 
               
        }
        else{
        Connection con = null;
String url ="jdbc:sqlserver://localhost:1433;databaseName=academy_football_systeme;integratedSecurity=true;";
       try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(Add_Player.class.getName()).log(Level.SEVERE, null, ex);
       }
       try {
           con =DriverManager.getConnection(url);
           
           
           String fname=FN_P.getText().toString();
           String datebirth=DB_P.getText().toString();
           String phone=PH_P.getText().toString();
           String adresse=AD_P.getText().toString();
           String bloodtype=BT_P.getSelectedItem().toString();
           String pos=PO_P.getSelectedItem().toString();
           String sex=null;
           if(S_M_P.isSelected()){sex="Male";}
           if(S_F_P.isSelected()){sex="Female";}
           String Dateofreg=DR_P.getText().toString();
           String Descrip=DES_P.getText().toString();
           
          
           
           String query = "insert into Player (NAME,DATE_OF_BIRTHDAY,PHONE_NUMBER,ADRESSE,BLOOD_TYPE,POSITION,SEX ,DATE_OF_REGESTRATION,DESCRIPTIONS ) values(  '"+fname+"','"+ datebirth+"','"+phone+"','"+adresse+"','"+bloodtype+"','"+pos+"','"+sex+"','"+Dateofreg+"','"+Descrip+"')";

            Statement st = con.createStatement();
            st.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null,"the player :"+fname+"is added to systeme data base"); 
          
           

           } catch (SQLException ex) {
           Logger.getLogger(Add_Player.class.getName()).log(Level.SEVERE, null, ex);
       }
  
    }
    
    }
    
    
    
    
    private void FN_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FN_PActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FN_PActionPerformed

    private void AD_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AD_PActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AD_PActionPerformed

    private void BT_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_PActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_PActionPerformed

    private void PO_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PO_PActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PO_PActionPerformed

    private void AP_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AP_BActionPerformed
        // TODO add your handling code here:
        
        
        
        ADD_PLAYER();
        
    }//GEN-LAST:event_AP_BActionPerformed

    private void C_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_BActionPerformed
        // TODO add your handling code here:
        Player_Mengament SM=new Player_Mengament();
        SM.setVisible(true);
         SM.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_C_BActionPerformed

    private void S_M_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_M_PActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_S_M_PActionPerformed

    private void PH_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PH_PActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PH_PActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Player.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Player().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AD_P;
    private javax.swing.JButton AP_B;
    private javax.swing.JComboBox<String> BT_P;
    private javax.swing.JButton C_B;
    private javax.swing.JTextField DB_P;
    private javax.swing.JTextArea DES_P;
    private javax.swing.JTextField DR_P;
    private javax.swing.JTextField FN_P;
    private javax.swing.JTextField PH_P;
    private javax.swing.JComboBox<String> PO_P;
    private javax.swing.JRadioButton S_F_P;
    private javax.swing.JRadioButton S_M_P;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}