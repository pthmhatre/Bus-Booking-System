/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bus_Book;

import java.util.regex.*;
import javax.swing.JPasswordField;


import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author viraj
 */
public class Log_In extends javax.swing.JFrame {

    /**
     * Creates new form Log_In
     */
    public Log_In() {
        initComponents();
    }
    
    Connection connection=null;
    
    
//   public Log_In(String Name,String Phone) {
//        initComponents();
//        name_con.setText(Name);
//        phone_con.setText(Phone);
//        name_con.setVisible(false);
//        phone_con.setVisible(false);
//    }
    /*
    public Log_In(String Phone_1) {
        initComponents();
        phone_con.setText(Phone_1);
        phone_con.setVisible(false);
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogIN_Panel_BG = new javax.swing.JPanel();
        LogIN_Panel_1 = new javax.swing.JPanel();
        Name_Lab_LOG = new javax.swing.JLabel();
        N_Field_2 = new javax.swing.JTextField();
        Pass_Lab_LOG = new javax.swing.JLabel();
        Login_button = new javax.swing.JButton();
        Canel_LOGIN = new javax.swing.JButton();
        Pass_Field_2 = new javax.swing.JPasswordField();
        Back_From_LOGIN = new javax.swing.JButton();
        LOGIN_Lab = new javax.swing.JLabel();
        Name_Warn = new javax.swing.JLabel();
        Pass_Warn_1 = new javax.swing.JLabel();
        name_con = new javax.swing.JLabel();
        phone_con = new javax.swing.JLabel();
        Show_Pass_Check_1 = new javax.swing.JCheckBox();
        LogIN_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LogIN_Panel_BG.setBackground(new java.awt.Color(51, 51, 51));
        LogIN_Panel_BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogIN_Panel_1.setBackground(new java.awt.Color(255, 255, 255));
        LogIN_Panel_1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        LogIN_Panel_1.setForeground(new java.awt.Color(255, 255, 255));
        LogIN_Panel_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Name_Lab_LOG.setBackground(new java.awt.Color(255, 255, 255));
        Name_Lab_LOG.setFont(new java.awt.Font("Segoe Script", 3, 24)); // NOI18N
        Name_Lab_LOG.setText("Name :");
        LogIN_Panel_1.add(Name_Lab_LOG, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 150, 50));

        N_Field_2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        N_Field_2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        N_Field_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                N_Field_2KeyReleased(evt);
            }
        });
        LogIN_Panel_1.add(N_Field_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 250, 55));

        Pass_Lab_LOG.setBackground(new java.awt.Color(255, 255, 255));
        Pass_Lab_LOG.setFont(new java.awt.Font("Segoe Script", 3, 24)); // NOI18N
        Pass_Lab_LOG.setText("Password :");
        LogIN_Panel_1.add(Pass_Lab_LOG, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 150, 50));

        Login_button.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        Login_button.setText("LogIn");
        Login_button.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        Login_button.setContentAreaFilled(false);
        Login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_buttonActionPerformed(evt);
            }
        });
        LogIN_Panel_1.add(Login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 120, 70));

        Canel_LOGIN.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        Canel_LOGIN.setText("Cancel");
        Canel_LOGIN.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        Canel_LOGIN.setContentAreaFilled(false);
        Canel_LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Canel_LOGINActionPerformed(evt);
            }
        });
        LogIN_Panel_1.add(Canel_LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 120, 70));

        Pass_Field_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Pass_Field_2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        Pass_Field_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Pass_Field_2KeyReleased(evt);
            }
        });
        LogIN_Panel_1.add(Pass_Field_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 250, 55));

        Back_From_LOGIN.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        Back_From_LOGIN.setText("Back");
        Back_From_LOGIN.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        Back_From_LOGIN.setContentAreaFilled(false);
        Back_From_LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_From_LOGINActionPerformed(evt);
            }
        });
        LogIN_Panel_1.add(Back_From_LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 120, 70));

        LOGIN_Lab.setFont(new java.awt.Font("Sitka Text", 3, 48)); // NOI18N
        LOGIN_Lab.setForeground(new java.awt.Color(51, 51, 51));
        LOGIN_Lab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGIN_Lab.setText(".. LogIn ..");
        LogIN_Panel_1.add(LOGIN_Lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 700, 92));

        Name_Warn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Name_Warn.setForeground(new java.awt.Color(255, 0, 51));
        LogIN_Panel_1.add(Name_Warn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 170, 55));

        Pass_Warn_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Pass_Warn_1.setForeground(new java.awt.Color(255, 0, 51));
        LogIN_Panel_1.add(Pass_Warn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 170, 55));
        LogIN_Panel_1.add(name_con, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 190, 70, 50));
        LogIN_Panel_1.add(phone_con, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 330, 80, 60));

        Show_Pass_Check_1.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        Show_Pass_Check_1.setText("Show Password");
        Show_Pass_Check_1.setContentAreaFilled(false);
        Show_Pass_Check_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_Pass_Check_1ActionPerformed(evt);
            }
        });
        LogIN_Panel_1.add(Show_Pass_Check_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 384, 180, 35));

        LogIN_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_Pictures/b5.gif"))); // NOI18N
        LogIN_Panel_1.add(LogIN_BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, -4, 690, 560));

        LogIN_Panel_BG.add(LogIN_Panel_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 680, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogIN_Panel_BG, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogIN_Panel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_buttonActionPerformed
        // TODO add your handling code here:
        
        
        if(N_Field_2.getText().trim().isEmpty() && Pass_Field_2.getText().trim().isEmpty()){
            Name_Warn.setText("!! Enter Name !!");
            Pass_Warn_1.setText("!! Enter Password !!");
        }
        else if(N_Field_2.getText().trim().isEmpty()){
            Name_Warn.setText("!! Enter Name !!");
        }
        else if(Pass_Field_2.getText().trim().isEmpty()){
            Pass_Warn_1.setText("!! Enter Password !!");
        }
        else{
            String username=N_Field_2.getText();
            String password=Pass_Field_2.getText();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bus_booking_system","root","");
            String url="select Name_Reg , Phone_Reg , Name_Reg ,Password_Reg from registration_form where Name_Reg ='"+username+"' and Password_Reg ='"+password+"'";
            Statement st=con.createStatement();
            ResultSet set= st.executeQuery(url);
            if(set.next()){
                dispose();
                
                Bookings_2 B2=new Bookings_2();
                B2.name_con_1.setText(set.getString("Name_Reg"));
                B2.phone_con_1.setText(set.getString("Phone_Reg"));
                B2.setVisible(true);
                B2.name_con_1.setVisible(false);
                B2.phone_con_1.setVisible(false);
                
                /*String Name=name_con.getText();
                String Phone=phone_con.getText();
                new Bookings_2(Name,Phone).setVisible(true);*/
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Name or Password !");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
       
    }//GEN-LAST:event_Login_buttonActionPerformed

    private void Canel_LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Canel_LOGINActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_Canel_LOGINActionPerformed

    private void Back_From_LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_From_LOGINActionPerformed
        // TODO add your handling code here:
        dispose();
        Welcom_Form e=new Welcom_Form();
        e.setVisible(true);
    }//GEN-LAST:event_Back_From_LOGINActionPerformed

    private void N_Field_2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_N_Field_2KeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z0-9]{0,30}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(N_Field_2.getText());
        if(!match.matches()){
            Name_Warn.setText("!! Invalid Name !!");
        }
        else
        {
            Name_Warn.setText(null);
        }
    }//GEN-LAST:event_N_Field_2KeyReleased

    private void Pass_Field_2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pass_Field_2KeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z]{5,10}[0-9]{2,7}[@#$&*_!%^]{1,5}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match;
        match = patt.matcher(Pass_Field_2.getText());
        if(!match.matches()){
            Pass_Warn_1.setText("!! Invalid Password !!");
        }
        else
        {
            Pass_Warn_1.setText(null);
        }
    }//GEN-LAST:event_Pass_Field_2KeyReleased

    private void Show_Pass_Check_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_Pass_Check_1ActionPerformed
        // TODO add your handling code here:
        if (Show_Pass_Check_1.isSelected()){
            Pass_Field_2.setEchoChar((char)0);
        }
        else {
            Pass_Field_2.setEchoChar('*');
        }
    }//GEN-LAST:event_Show_Pass_Check_1ActionPerformed

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
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_In.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_In().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_From_LOGIN;
    private javax.swing.JButton Canel_LOGIN;
    private javax.swing.JLabel LOGIN_Lab;
    private javax.swing.JLabel LogIN_BG;
    private javax.swing.JPanel LogIN_Panel_1;
    private javax.swing.JPanel LogIN_Panel_BG;
    private javax.swing.JButton Login_button;
    private javax.swing.JTextField N_Field_2;
    private javax.swing.JLabel Name_Lab_LOG;
    private javax.swing.JLabel Name_Warn;
    private javax.swing.JPasswordField Pass_Field_2;
    private javax.swing.JLabel Pass_Lab_LOG;
    private javax.swing.JLabel Pass_Warn_1;
    private javax.swing.JCheckBox Show_Pass_Check_1;
    private javax.swing.JLabel name_con;
    private javax.swing.JLabel phone_con;
    // End of variables declaration//GEN-END:variables
}
