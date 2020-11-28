/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaba
 */
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
import java.sql.ResultSet;

public class Create_Account extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    
    /**
     * Creates new form Create_Account
     */
    public Create_Account() {
        initComponents();
        conn = javaconnect.ConnecrDb();
    }
    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent (this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
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
        jLabel2 = new javax.swing.JLabel();
        stu_Dept = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        stu_ID = new javax.swing.JTextField();
        stu_Gender = new javax.swing.JComboBox<>();
        stu_Religion = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        stu_Close = new javax.swing.JButton();
        stu_Name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        stu_Guardian = new javax.swing.JTextField();
        stu_Mother = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        stu_Username = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        stu_Guardian_phone = new javax.swing.JTextField();
        stu_Password = new javax.swing.JTextField();
        stu_Email = new javax.swing.JTextField();
        stu_Address = new javax.swing.JTextField();
        stu_Clear = new javax.swing.JButton();
        stu_Location = new javax.swing.JTextField();
        stu_Phone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        stu_Create = new javax.swing.JButton();
        stu_DOB = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        stu_Father = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 131, 94, 20));

        stu_Dept.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        stu_Dept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "CIVIL", "EEE", "TEXTILE" }));
        jPanel1.add(stu_Dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 100, -1));

        jLabel17.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Guardian Name");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 162, -1, 20));

        jLabel19.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Permanent Address");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 298, -1, 20));

        stu_ID.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.add(stu_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 209, -1));

        stu_Gender.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        stu_Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jPanel1.add(stu_Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 100, -1));

        stu_Religion.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        stu_Religion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Hinduism", "Buddhists", "Christians", "Others" }));
        jPanel1.add(stu_Religion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 100, -1));

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 317, 94, 20));

        stu_Close.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        stu_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon_Collection/cancel (2).png"))); // NOI18N
        stu_Close.setText("Close");
        stu_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu_CloseActionPerformed(evt);
            }
        });
        jPanel1.add(stu_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 482, -1, 33));

        stu_Name.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.add(stu_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 209, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date of Birth");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 193, 94, 20));

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 100, -1, 20));

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Religion");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 286, 94, 20));

        stu_Guardian.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.add(stu_Guardian, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 162, 208, -1));

        stu_Mother.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.add(stu_Mother, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 131, 208, -1));

        jLabel16.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Mother's name");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 131, 110, 20));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 413, 140, 24));

        jLabel12.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 255, 94, 20));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Father's name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, 20));

        stu_Username.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jPanel1.add(stu_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 372, 187, -1));

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Phone Number");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 224, 100, 20));

        jLabel20.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Present Address");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 238, 120, 20));

        jLabel7.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 48)); // NOI18N
        jLabel7.setText("Student Create Account");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 11, -1, -1));

        jLabel18.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Guardian Phone No.");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 193, 140, 20));

        stu_Guardian_phone.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.add(stu_Guardian_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 193, 208, -1));

        stu_Password.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jPanel1.add(stu_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 414, 187, -1));

        stu_Email.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.add(stu_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 209, -1));

        stu_Address.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.add(stu_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 283, 208, 51));

        stu_Clear.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        stu_Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon_Collection/two-circling-arrows.png"))); // NOI18N
        stu_Clear.setText("Clear All");
        stu_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu_ClearActionPerformed(evt);
            }
        });
        jPanel1.add(stu_Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 482, 179, 33));

        stu_Location.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.add(stu_Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 224, 208, 48));

        stu_Phone.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.add(stu_Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 209, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Department");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 162, 94, 20));

        stu_Create.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        stu_Create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon_Collection/user_Big.png"))); // NOI18N
        stu_Create.setText("Create");
        stu_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu_CreateActionPerformed(evt);
            }
        });
        jPanel1.add(stu_Create, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 482, -1, 33));

        stu_DOB.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.add(stu_DOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 140, 30));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 371, 140, 24));

        stu_Father.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.add(stu_Father, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 100, 208, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon_Collection/OAYT5G0~1.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 560));

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

    private void stu_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu_CreateActionPerformed
        // TODO add your handling code here:
        int decision = JOptionPane.showConfirmDialog(null, "Press Yes to confirm Creation", "Create", JOptionPane.YES_NO_OPTION);
        
        if(decision==0){
            try{
                String sql = "Insert into Student_Information (Name,ID_No,Dept,Father_Name,Mother_Name,Present_Address,Permanent_Address,Date_of_Birth,Religion,Gender,Phone_No,Email,Guardians_Name,Guardians_Cell_No,Username,Password) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                pst = conn.prepareStatement(sql);
                pst.setString(1, stu_Name.getText());
                pst.setString(2, stu_ID.getText());
                pst.setString(3,(String)stu_Dept.getSelectedItem());
                pst.setString(4,stu_Father.getText());
                pst.setString(5,stu_Mother.getText());
                pst.setString(6,stu_Location.getText());
                pst.setString(7,stu_Address.getText());
                pst.setString(8,((JTextField)stu_DOB.getDateEditor().getUiComponent()).getText());
                pst.setString(9,(String)stu_Religion.getSelectedItem());
                pst.setString(10,(String)stu_Gender.getSelectedItem());
                pst.setString(11,stu_Phone.getText());
                pst.setString(12,stu_Email.getText());
                pst.setString(13,stu_Guardian.getText());
                pst.setString(14,stu_Guardian_phone.getText());
                pst.setString(15,stu_Username.getText());
                pst.setString(16,stu_Password.getText());
                  
                pst.execute();

                JOptionPane.showMessageDialog(null, "Account Created");
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_stu_CreateActionPerformed

    private void stu_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu_ClearActionPerformed
        // TODO add your handling code here:
                stu_Name.setText("");
                stu_ID.setText("");
                stu_Father.setText("");
                stu_Mother.setText("");
                stu_Location.setText("");
                stu_Address.setText("");
                stu_Phone.setText("");
                stu_Email.setText("");
                stu_Guardian.setText("");
                stu_Guardian_phone.setText("");
                stu_Username.setText("");
                stu_Password.setText("");
        
    }//GEN-LAST:event_stu_ClearActionPerformed

    private void stu_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu_CloseActionPerformed
        // TODO add your handling code here:
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_stu_CloseActionPerformed

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
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField stu_Address;
    private javax.swing.JButton stu_Clear;
    private javax.swing.JButton stu_Close;
    private javax.swing.JButton stu_Create;
    private com.toedter.calendar.JDateChooser stu_DOB;
    private javax.swing.JComboBox<String> stu_Dept;
    private javax.swing.JTextField stu_Email;
    private javax.swing.JTextField stu_Father;
    private javax.swing.JComboBox<String> stu_Gender;
    private javax.swing.JTextField stu_Guardian;
    private javax.swing.JTextField stu_Guardian_phone;
    private javax.swing.JTextField stu_ID;
    private javax.swing.JTextField stu_Location;
    private javax.swing.JTextField stu_Mother;
    private javax.swing.JTextField stu_Name;
    private javax.swing.JTextField stu_Password;
    private javax.swing.JTextField stu_Phone;
    private javax.swing.JComboBox<String> stu_Religion;
    private javax.swing.JTextField stu_Username;
    // End of variables declaration//GEN-END:variables
}