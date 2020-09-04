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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author fcss
 */
public class Update_Event extends javax.swing.JFrame {
 DefaultComboBoxModel M1;
    DefaultComboBoxModel M2;
    
    ArrayList arr;
    ArrayList arr2;
    /**
     * Creates new form Update_Event
     */
    public Update_Event() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);// center form in the screen
            ImageIcon ic= new ImageIcon("C:\\Users\\fcss\\Desktop\\projet_gui\\Academy_Football_Systeme\\src\\academy_football_systeme\\soccer_ball_26px.png");
            this.setIconImage(ic.getImage());
            this.setTitle("Update Event");
            
            Connection con = null; 
            String url ="jdbc:sqlserver://localhost:1433;databaseName=academy_football_systeme;integratedSecurity=true;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con =DriverManager.getConnection(url);
            
            if(con!=null)
                {
                    arr=new ArrayList();
                    arr2=new ArrayList();
                    String queryy="SELECT COACH_ID FROM Coach";
                     Statement st = con.createStatement();
                     ResultSet rs = st.executeQuery(queryy);
                            while(rs.next())
                            {arr.add(rs.getInt(1));}
                              M1=new javax.swing.DefaultComboBoxModel<>(arr.toArray());
                        
                         coach_idd.setModel(M1);
                         
                         String query2="Select YEAR(DATE_OF_BIRTHDAY)FROM Player";
                         ResultSet rs2=st.executeQuery(query2);
                         while(rs2.next())
                         {
                             
                             if(!arr2.contains(rs2.getInt(1)))
                             {arr2.add(rs2.getInt(1));}
                         }
                                M2=new javax.swing.DefaultComboBoxModel<>(arr2.toArray());
                           age_catogoo.setModel(M2);            
                }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Update_Event.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Update_Event.class.getName()).log(Level.SEVERE, null, ex);
        }
   
   
    }
    
    public Update_Event( int event_id,String event_name,String event_staduim,int coach_id,int age_catego,String event_time)
    {
     initComponents();
        this.setLocationRelativeTo(null);
         String ss=Integer.toString(event_id);
         
         //JOptionPane.showMessageDialog(null," "+ss);
         eventid.setText(ss);
         eventname.setText(event_name);
         staduim.setText(event_staduim);
         event_date.setText(event_time);
         coach_idd.setSelectedItem(coach_id);
         age_catogoo.setSelectedItem(age_catego);
        try { 
         Connection con = null;
         String url ="jdbc:sqlserver://localhost:1433;databaseName=academy_football_systeme;integratedSecurity=true;";
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         con =DriverManager.getConnection(url);
         if(con!=null)
                {
                    arr=new ArrayList();
                    arr2=new ArrayList();
                    String queryy="SELECT COACH_ID FROM Coach";
                     Statement st = con.createStatement();
                     ResultSet rs = st.executeQuery(queryy);
                            while(rs.next())
                            {arr.add(rs.getInt(1));}
                              M1=new javax.swing.DefaultComboBoxModel<>(arr.toArray());
                        
                         coach_idd.setModel(M1);
                 
                         String query2="Select YEAR(DATE_OF_BIRTHDAY)FROM Player";
                         ResultSet rs2=st.executeQuery(query2);
                         while(rs2.next())
                         {
                             
                             if(!arr2.contains(rs2.getInt(1)))
                             {arr2.add(rs2.getInt(1));}
                         }
                                M2=new javax.swing.DefaultComboBoxModel<>(arr2.toArray());
                           age_catogoo.setModel(M2);
                         
                }
         
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Update_Event.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SQLException ex) {
         Logger.getLogger(Update_Event.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel6 = new javax.swing.JLabel();
        staduim = new javax.swing.JTextField();
        event_date = new javax.swing.JTextField();
        coach_idd = new javax.swing.JComboBox<>();
        age_catogoo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        eventname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        eventid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Event");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Event Name :");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Event Date");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Staduim :");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Coach id :");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Age Categorie:");

        coach_idd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "from data base" }));

        age_catogoo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2007", "2008", "2009", "2010","2011","2012","2013" }));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academy_football_systeme/icons8_delete_16.png"))); // NOI18N
        jButton1.setText("Delete Event ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/academy_football_systeme/icons8_plus_16.png"))); // NOI18N
        jButton2.setText("Update Event");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(44, 62, 80));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Event ID:");

        eventid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        eventid.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jButton2))
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eventid)
                                    .addComponent(eventname, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(event_date, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(coach_idd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(staduim, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(age_catogoo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1)))
                .addGap(78, 78, 78)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(eventid))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(eventname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(staduim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(event_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(coach_idd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(age_catogoo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
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
     try {
         // TODO add your handling code here:
         
         Connection con = null;
         String url ="jdbc:sqlserver://localhost:1433;databaseName=academy_football_systeme;integratedSecurity=true;";
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         con =DriverManager.getConnection(url);
         if(con!=null)
         {
             String iddd=eventid.getText().toString();
             int id_event=Integer.parseInt(iddd);
             
             String qurey="DELETE FROM Event WHERE EVENT_ID="+id_event;
             
             Statement st = con.createStatement();
//ResultSet rs = st.executeQuery(query);
st.executeUpdate(qurey);
JOptionPane.showMessageDialog(null,"the event  with id "+id_event+" is deleted !!");  

             
         }
         
     } catch (SQLException ex) {
         Logger.getLogger(Update_Event.class.getName()).log(Level.SEVERE, null, ex);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Update_Event.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     try {
         // TODO add your handling code here:
         
         Connection con = null;
         String url ="jdbc:sqlserver://localhost:1433;databaseName=academy_football_systeme;integratedSecurity=true;";
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         con =DriverManager.getConnection(url);
         
         if(con!=null)
         {
             String idd=eventid.getText();
        int id_event=Integer.parseInt(idd);
        
        String event_name=eventname.getText().toString();
        String Staduim=staduim.getText().toString();
        String eventdate=event_date.getText().toString();
             String coachidd=coach_idd.getSelectedItem().toString();
             int coach_id=Integer.parseInt(coachidd);
        
        String age_categooo=age_catogoo.getSelectedItem().toString();
        int age_categorie=Integer.parseInt(age_categooo);
        
        
  // String query2="update Player set NAME='"+fname+"',DATE_OF_BIRTHDAY='"+dateofbirth+"',PHONE_NUMBER='"+phonenb+"',ADRESSE='"+adress+"',BLOOD_TYPE='"+bloodtype+"',POSITION='"+pos+"',SEX='"+sex+"',DATE_OF_REGESTRATION='"+dateofreg+"',DESCRIPTIONS='"+desc+"' where PLAYER_ID="+idplayer; 
  
String queryy="UPDATE Event set EVENT_NAME='"+event_name+"',STADIUM='"+Staduim+"',COACH_ID="+coach_id+",AGE_CATEGORIE="+age_categorie+",EVENT_DATETIME='"+eventdate+"' WHERE  EVENT_ID="+id_event;
Statement st = con.createStatement();
//ResultSet rs = st.executeQuery(query);
st.executeUpdate(queryy);
JOptionPane.showMessageDialog(null,"the event with id"+id_event+"has ben=en updated!");  

        
             
         }
         
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Update_Event.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SQLException ex) {
         Logger.getLogger(Update_Event.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Update_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Event().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> age_catogoo;
    private javax.swing.JComboBox<String> coach_idd;
    private javax.swing.JTextField event_date;
    private javax.swing.JLabel eventid;
    private javax.swing.JTextField eventname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField staduim;
    // End of variables declaration//GEN-END:variables
}
