package Bus_Book;

import javax.swing.JOptionPane;

/**
 *
 * @author VIRAJ
 */
public class publicbus extends javax.swing.JFrame {

    /**
     * Creates new form publicbus
     */
    public publicbus() {
        initComponents();
    }

    public publicbus(String Name1,String Phone1) {
        initComponents();
        Name_Lab_Sec_1.setText(Name1);
        Phone_Lab_Sec_1.setText(Phone1);
        Name_Lab_Sec_1.setVisible(false);
        Phone_Lab_Sec_1.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date_Choose_Pub = new com.toedter.calendar.JDateChooser();
        From_Combo_Pub = new javax.swing.JComboBox<>();
        To_Combo_Pub = new javax.swing.JComboBox<>();
        Search_Button_Pub = new javax.swing.JButton();
        Back_to_Select = new javax.swing.JButton();
        Cancel_Button_Pub = new javax.swing.JButton();
        From_Lab_Pub = new javax.swing.JLabel();
        To_Lab_Pub = new javax.swing.JLabel();
        Date_Lab_Pub = new javax.swing.JLabel();
        Seat_Slider_Pub = new javax.swing.JSlider();
        Non_AC_Pub = new javax.swing.JRadioButton();
        AC_Button_Pub = new javax.swing.JRadioButton();
        Num_Display_Lab = new javax.swing.JLabel();
        Num_Lab_Pub = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Name_Lab_Sec_1 = new javax.swing.JLabel();
        Phone_Lab_Sec_1 = new javax.swing.JLabel();
        Extra_Lab_Sec_1 = new javax.swing.JLabel();
        Public_BG_Lab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(date_Choose_Pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 260, 50));

        From_Combo_Pub.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        From_Combo_Pub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Morewadi Chowk", "Limb Phata", "Vasai parnaka", "borivali bustop", "Sion Bustop" }));
        From_Combo_Pub.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        From_Combo_Pub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                From_Combo_PubActionPerformed(evt);
            }
        });
        getContentPane().add(From_Combo_Pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 260, 40));

        To_Combo_Pub.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        To_Combo_Pub.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Dadar", "Satara", "Pune", "Worli", "Bhayander" }));
        To_Combo_Pub.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(To_Combo_Pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 260, 42));

        Search_Button_Pub.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Search_Button_Pub.setForeground(new java.awt.Color(255, 255, 255));
        Search_Button_Pub.setText("SEARCH BUS");
        Search_Button_Pub.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Search_Button_Pub.setContentAreaFilled(false);
        Search_Button_Pub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_Button_PubActionPerformed(evt);
            }
        });
        getContentPane().add(Search_Button_Pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 261, 61));

        Back_to_Select.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Back_to_Select.setForeground(new java.awt.Color(255, 255, 255));
        Back_to_Select.setText("BACK");
        Back_to_Select.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Back_to_Select.setContentAreaFilled(false);
        Back_to_Select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_to_SelectActionPerformed(evt);
            }
        });
        getContentPane().add(Back_to_Select, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 140, 52));

        Cancel_Button_Pub.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Cancel_Button_Pub.setForeground(new java.awt.Color(255, 255, 255));
        Cancel_Button_Pub.setText("CANCEL");
        Cancel_Button_Pub.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cancel_Button_Pub.setContentAreaFilled(false);
        Cancel_Button_Pub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancel_Button_PubActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel_Button_Pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 140, 61));

        From_Lab_Pub.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        From_Lab_Pub.setForeground(new java.awt.Color(255, 255, 255));
        From_Lab_Pub.setText("FROM");
        getContentPane().add(From_Lab_Pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 98, 101, 42));

        To_Lab_Pub.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        To_Lab_Pub.setForeground(new java.awt.Color(255, 255, 255));
        To_Lab_Pub.setText("TO");
        getContentPane().add(To_Lab_Pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 175, 101, 42));

        Date_Lab_Pub.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Date_Lab_Pub.setForeground(new java.awt.Color(255, 255, 255));
        Date_Lab_Pub.setText("DATE");
        getContentPane().add(Date_Lab_Pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 250, 101, 44));

        Seat_Slider_Pub.setBackground(new java.awt.Color(255, 255, 255));
        Seat_Slider_Pub.setForeground(new java.awt.Color(204, 204, 204));
        Seat_Slider_Pub.setMajorTickSpacing(1);
        Seat_Slider_Pub.setMaximum(10);
        Seat_Slider_Pub.setMinimum(1);
        Seat_Slider_Pub.setMinorTickSpacing(1);
        Seat_Slider_Pub.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Seat_Slider_PubStateChanged(evt);
            }
        });
        getContentPane().add(Seat_Slider_Pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 260, 43));

        Non_AC_Pub.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Non_AC_Pub.setText("NON-AC");
        Non_AC_Pub.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        Non_AC_Pub.setBorderPainted(true);
        Non_AC_Pub.setContentAreaFilled(false);
        Non_AC_Pub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Non_AC_PubActionPerformed(evt);
            }
        });
        getContentPane().add(Non_AC_Pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 160, 40));

        AC_Button_Pub.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        AC_Button_Pub.setText("AC");
        AC_Button_Pub.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204))));
        AC_Button_Pub.setBorderPainted(true);
        AC_Button_Pub.setContentAreaFilled(false);
        AC_Button_Pub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AC_Button_PubActionPerformed(evt);
            }
        });
        getContentPane().add(AC_Button_Pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 100, 40));

        Num_Display_Lab.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        Num_Display_Lab.setForeground(new java.awt.Color(255, 255, 255));
        Num_Display_Lab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Num_Display_Lab.setText("0");
        getContentPane().add(Num_Display_Lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 40, 40));

        Num_Lab_Pub.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        Num_Lab_Pub.setForeground(new java.awt.Color(255, 255, 255));
        Num_Lab_Pub.setText("Number of Seats");
        getContentPane().add(Num_Lab_Pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 43));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 80, 50));
        getContentPane().add(Name_Lab_Sec_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, 80, 50));
        getContentPane().add(Phone_Lab_Sec_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 80, 50));
        getContentPane().add(Extra_Lab_Sec_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 80, 50));

        Public_BG_Lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG_Pictures/b7.gif"))); // NOI18N
        Public_BG_Lab.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(Public_BG_Lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void From_Combo_PubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_From_Combo_PubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_From_Combo_PubActionPerformed

    private void Seat_Slider_PubStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Seat_Slider_PubStateChanged
        // TODO add your handling code here:
        Num_Display_Lab.setText(Integer.toString(Seat_Slider_Pub.getValue()));
    }//GEN-LAST:event_Seat_Slider_PubStateChanged

    private void Back_to_SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_to_SelectActionPerformed
        // TODO add your handling code here:
        dispose();
        String Name1=Name_Lab_Sec_1.getText();
        String Phone1=Phone_Lab_Sec_1.getText();
        new Detail_1(Name1,Phone1).setVisible(true);
        Bookings_2 n=new Bookings_2();
        n.setVisible(true);
    }//GEN-LAST:event_Back_to_SelectActionPerformed

    private void Cancel_Button_PubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_Button_PubActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_Cancel_Button_PubActionPerformed

    private void Search_Button_PubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_Button_PubActionPerformed
        // TODO add your handling code here:
        String date, Fr, Too;
        Fr = (String)From_Combo_Pub.getSelectedItem();
        Too = (String)To_Combo_Pub.getSelectedItem();

        if(Fr == "Select" || Too == "Select"){
            JOptionPane.showMessageDialog(null,"!! Select Trip !!");
        }
        else {
        dispose();
        String Name1=Name_Lab_Sec_1.getText();
        String Phone1=Phone_Lab_Sec_1.getText();
        String from = "";
        from=From_Combo_Pub.getSelectedItem().toString();
        String arrival = "";
        arrival = To_Combo_Pub.getSelectedItem().toString();
        
        String Date1 = date_Choose_Pub.getDateFormatString();
        String Seat1 = Num_Display_Lab.getText();
        
        String Condn1 = "";
        if(AC_Button_Pub.isSelected())
        {
            Condn1=AC_Button_Pub.getText();
        }
        if(Non_AC_Pub.isSelected())
        {
            Condn1=Non_AC_Pub.getText();
        }
        
    new publicbusbook(Name1,Phone1,from,arrival,Date1,Seat1,Condn1).setVisible(true);    
        }
        
    }//GEN-LAST:event_Search_Button_PubActionPerformed

    private void AC_Button_PubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AC_Button_PubActionPerformed
        // TODO add your handling code here:
        if(AC_Button_Pub.isSelected()){
            Non_AC_Pub.setSelected(false);
        }
    }//GEN-LAST:event_AC_Button_PubActionPerformed

    private void Non_AC_PubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Non_AC_PubActionPerformed
        // TODO add your handling code here:
        if(Non_AC_Pub.isSelected()){
            AC_Button_Pub.setSelected(false);
        }
    }//GEN-LAST:event_Non_AC_PubActionPerformed

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
            java.util.logging.Logger.getLogger(publicbus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(publicbus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(publicbus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(publicbus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new publicbus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AC_Button_Pub;
    private javax.swing.JButton Back_to_Select;
    private javax.swing.JButton Cancel_Button_Pub;
    private javax.swing.JLabel Date_Lab_Pub;
    private javax.swing.JLabel Extra_Lab_Sec_1;
    private javax.swing.JComboBox<String> From_Combo_Pub;
    private javax.swing.JLabel From_Lab_Pub;
    private javax.swing.JLabel Name_Lab_Sec_1;
    private javax.swing.JRadioButton Non_AC_Pub;
    private javax.swing.JLabel Num_Display_Lab;
    private javax.swing.JLabel Num_Lab_Pub;
    private javax.swing.JLabel Phone_Lab_Sec_1;
    private javax.swing.JLabel Public_BG_Lab;
    private javax.swing.JButton Search_Button_Pub;
    private javax.swing.JSlider Seat_Slider_Pub;
    private javax.swing.JComboBox<String> To_Combo_Pub;
    private javax.swing.JLabel To_Lab_Pub;
    private com.toedter.calendar.JDateChooser date_Choose_Pub;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
