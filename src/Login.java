/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaba
 */

import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Login extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    /**
     * Creates new form Login
     */
    public Login() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login_Password = new javax.swing.JPasswordField();
        login_Username = new javax.swing.JTextField();
        login_ComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon_Collection/user.png"))); // NOI18N
        jLabel1.setText("Login as");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 102, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon_Collection/profile.png"))); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon_Collection/lock.png"))); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        login_Password.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jPanel1.add(login_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 180, -1));

        login_Username.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        login_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_UsernameActionPerformed(evt);
            }
        });
        jPanel1.add(login_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 180, -1));

        login_ComboBox.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        login_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Student" }));
        login_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_ComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(login_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 130, 28));

        jButton1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon_Collection/add-documents.png"))); // NOI18N
        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 200, -1));

        login.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon_Collection/login.png"))); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 120, -1));

        jButton2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon_Collection/exit.png"))); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 425, -1, 31));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon_Collection/Student.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        Create_Account cA = new Create_Account();
        cA.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void login_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_UsernameActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        String tmp = (String)login_ComboBox.getSelectedItem();

        String amd = "Admin";
        if (tmp.equals(amd)){

            String sql = "select * from Admin_Account where Username=? and Password=?";
            try{
                pst = conn.prepareStatement(sql);
                pst.setString(1,login_Username.getText());
                pst.setString(2,login_Password.getText());

                rs = pst.executeQuery();

                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Success...!!");
                    rs.close();
                    pst.close();

                    Admin_Menu adm = new Admin_Menu();
                    adm.setVisible(true);
                    close();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Username or Password is Not Correct");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error");
            }
            finally{
                try{
                    rs.close();
                    pst.close();
                    //conn.close();
                }catch(Exception e){

                }
            }

        }

        else{

            String sql = "select * from Student_Information where Username=? and Password=?";
            try{
                pst = conn.prepareStatement(sql);

                String username = (String)login_Username.getText();
                String password = (String)login_Password.getText();

                pst.setString(1,login_Username.getText());
                pst.setString(2,login_Password.getText());

                //                pst.setString(1,login_Username.getText());
                //                pst.setString(2,login_Password.getText());

                rs = pst.executeQuery();

                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Success...!!");
                    rs.close();
                    pst.close();

                    Student_Information stu = new Student_Information(username,password);
                    stu.setVisible(true);
                    close();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Username or Password is Not Correct");
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error");
            }
            finally{
                try{
                    rs.close();
                    pst.close();
                    //conn.close();
                }catch(Exception e){

                }
            }

        }
    }//GEN-LAST:event_loginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        close();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void login_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_ComboBoxActionPerformed
    
     
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JComboBox<String> login_ComboBox;
    private javax.swing.JPasswordField login_Password;
    private javax.swing.JTextField login_Username;
    // End of variables declaration//GEN-END:variables
}
