/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academy_football_systeme;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author fcss
 */
public class Player_Mengament extends javax.swing.JFrame {
DefaultTableModel dm;
    public Player_Mengament() {
        initComponents();
        this.setLocationRelativeTo(null);// center form in the screen
        ImageIcon ic= new ImageIcon("C:\\Users\\fcss\\Desktop\\projet_gui\\Academy_Football_Systeme\\src\\academy_football_systeme\\soccer_ball_26px.png");
     this.setIconImage(ic.getImage());
      this.setTitle("Player Mengament");
      agee.setText( "List of all Player" );
      showall();

  
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
        EP_P = new javax.swing.JButton();
        AP_B = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        age_cato = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        P_Jtable = new javax.swing.JTable();
        agee = new javax.swing.JLabel();
        showall = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        search_feild = new javax.swing.JTextField();
        showmale = new javax.swing.JButton();
        showfemale = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(44, 62, 80));
        setForeground(java.awt.Color.red);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Player Mengament");

        EP_P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academy_football_systeme/icons8_exit_16.png"))); // NOI18N
        EP_P.setText("Exit");
        EP_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EP_PActionPerformed(evt);
            }
        });

        AP_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academy_football_systeme/icons8_plus_16.png"))); // NOI18N
        AP_B.setText("Add Player");
        AP_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AP_BActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Age categorie:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academy_football_systeme/icons8_age_16.png"))); // NOI18N
        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        P_Jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Date Of Birthday", "Phone ", "Adress", "Blood Type", "Position", "Sex", "Date Of Regestration ", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        P_Jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_JtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(P_Jtable);

        agee.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        agee.setForeground(new java.awt.Color(255, 255, 255));

        showall.setText("show all");
        showall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showallActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Value to search :");

        search_feild.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_feildKeyReleased(evt);
            }
        });

        showmale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academy_football_systeme/icons8_user_male_16.png"))); // NOI18N
        showmale.setText("Show Male");
        showmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showmaleActionPerformed(evt);
            }
        });

        showfemale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academy_football_systeme/icons8_person_female_16.png"))); // NOI18N
        showfemale.setText("Show Female");
        showfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showfemaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(AP_B)
                                .addGap(660, 660, 660)
                                .addComponent(EP_P))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showmale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(age_cato, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(290, 290, 290)
                                        .addComponent(agee))
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(search_feild, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 289, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(showfemale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(showall)
                                .addGap(31, 31, 31)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(age_cato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_feild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12)
                        .addComponent(agee)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showall)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showmale)
                            .addComponent(showfemale))
                        .addGap(32, 32, 32)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AP_B)
                    .addComponent(EP_P))
                .addGap(16, 16, 16))
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

    
    
    
    
   
    
    
    
    
    
    
    
    
    public void showall()
    {
        Connection con = null;
String url ="jdbc:sqlserver://localhost:1433;databaseName=academy_football_systeme;integratedSecurity=true;";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Player_Mengament.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con =DriverManager.getConnection(url);
            if(con!=null)
                    {
                        
                        String query="select * from Player ";
                         
                         Statement st = con.createStatement();
ResultSet rs = st.executeQuery(query);
                         
        dm = (DefaultTableModel) P_Jtable.getModel();
        dm.setRowCount(0);
        while(rs.next())
        {
        dm.addRow(new Object[]{rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)});
        }
        
        age_cato.setText("");
                }

            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Player_Mengament.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
  public void List_Player()
  {
       Connection con = null;
String url ="jdbc:sqlserver://localhost:1433;databaseName=academy_football_systeme;integratedSecurity=true;";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Player_Mengament.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con =DriverManager.getConnection(url);
            if(con!=null)
                    {
                         int age=Integer.parseInt(age_cato.getText().toString());
                        String query="select * from Player where year(DATE_OF_BIRTHDAY)="+age;
                         agee.setText( "List of Player in categorie:"+age );
                         Statement st = con.createStatement();
                            ResultSet rs = st.executeQuery(query);
                         
        dm = (DefaultTableModel) P_Jtable.getModel();
        dm.setRowCount(0);
        while(rs.next())
        {
        dm.addRow(new Object[]{rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)});
        }
                }
         } catch (SQLException ex) {
            Logger.getLogger(Player_Mengament.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  public void Showmale()
  {
     Connection con = null;
String url ="jdbc:sqlserver://localhost:1433;databaseName=academy_football_systeme;integratedSecurity=true;";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Player_Mengament.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con =DriverManager.getConnection(url);
            if(con!=null)
                    {
                        String query="select * from Player where SEX='Male'";
                         agee.setText( "List of Male Player ");
                         Statement st = con.createStatement();
                            ResultSet rs = st.executeQuery(query);
                         
        dm = (DefaultTableModel) P_Jtable.getModel();
        dm.setRowCount(0);
        while(rs.next())
        {
        dm.addRow(new Object[]{rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)});
        }
                }
         } catch (SQLException ex) {
            Logger.getLogger(Player_Mengament.class.getName()).log(Level.SEVERE, null, ex);
        } 
  }
  
  public void Showfemale()
  {
     Connection con = null;
String url ="jdbc:sqlserver://localhost:1433;databaseName=academy_football_systeme;integratedSecurity=true;";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Player_Mengament.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con =DriverManager.getConnection(url);
            if(con!=null)
                    {
                        String query="select * from Player where SEX='Female'";
                         agee.setText( "List of Female Player ");
                         Statement st = con.createStatement();
                            ResultSet rs = st.executeQuery(query);
                         
        dm = (DefaultTableModel) P_Jtable.getModel();
        dm.setRowCount(0);
        while(rs.next())
        {
        dm.addRow(new Object[]{rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)});
        }
                }
         } catch (SQLException ex) {
            Logger.getLogger(Player_Mengament.class.getName()).log(Level.SEVERE, null, ex);
        } 
  }
  
  
    
   
    private void EP_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EP_PActionPerformed
        // TODO add your handling code here:
        Main_Frame mf=new Main_Frame();
        mf.setVisible(true);
    }//GEN-LAST:event_EP_PActionPerformed

    private void AP_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AP_BActionPerformed
        // TODO add your handling code here:
        Add_Player AP=new Add_Player();
        AP.setVisible(true);
        AP.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_AP_BActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(age_cato.getText().toString().equals(""))
        {
            JOptionPane.showMessageDialog(null,"you must enter an age categorie"); 
          
        }
        else{
        List_Player();
        
        }
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showallActionPerformed
        // TODO add your handling code here:
        
        agee.setText( "List of all Player" );
        showall();
    }//GEN-LAST:event_showallActionPerformed

    private void P_JtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_JtableMouseClicked
        // TODO add your handling code here:
        int what_row=P_Jtable.getSelectedRow();
//        int what_cell=P_Jtable.getSelectedRow()
        int idd=(int) P_Jtable.getValueAt(what_row,0);
        String fname=P_Jtable.getValueAt(what_row, 1).toString();
        String dateofbirth=P_Jtable.getValueAt(what_row, 2).toString();
        String phonenb=P_Jtable.getValueAt(what_row,3).toString();
        String adress=P_Jtable.getValueAt(what_row, 4).toString();
        String bloodtype=P_Jtable.getValueAt(what_row, 5).toString();
        String pos=P_Jtable.getValueAt(what_row, 6).toString();
        String sex=P_Jtable.getValueAt(what_row, 7).toString();
        String dateofreg=P_Jtable.getValueAt(what_row, 8).toString();
        String descri=P_Jtable.getValueAt(what_row, 9).toString();
        
        Update_Player UP=new Update_Player(idd,fname,dateofbirth,phonenb,adress,bloodtype,pos,sex,dateofreg,descri);
        UP.setVisible(true);
        UP.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
       
        
        
        
    }//GEN-LAST:event_P_JtableMouseClicked

    private void showmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showmaleActionPerformed
        // TODO add your handling code here:
        Showmale();
        
        
        
    }//GEN-LAST:event_showmaleActionPerformed

    private void showfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showfemaleActionPerformed
        // TODO add your handling code here:
        Showfemale();
    }//GEN-LAST:event_showfemaleActionPerformed

    private void search_feildKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_feildKeyReleased
        // TODO add your handling code here:
        
            DefaultTableModel table=(DefaultTableModel) P_Jtable.getModel();
           
            
            String searchh =search_feild.getText().toString();
            TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(table);
            
            P_Jtable.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(searchh));
            
            
        
        
    }//GEN-LAST:event_search_feildKeyReleased

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
            java.util.logging.Logger.getLogger(Player_Mengament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Player_Mengament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Player_Mengament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Player_Mengament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Player_Mengament().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AP_B;
    private javax.swing.JButton EP_P;
    private javax.swing.JTable P_Jtable;
    private javax.swing.JTextField age_cato;
    private javax.swing.JLabel agee;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search_feild;
    private javax.swing.JButton showall;
    private javax.swing.JButton showfemale;
    private javax.swing.JButton showmale;
    // End of variables declaration//GEN-END:variables
}
