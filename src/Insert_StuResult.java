import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.text.DecimalFormat;
import javax.swing.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaba
 */
public class Insert_StuResult extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;    
    
    /**
     * Creates new form Insert_StuResult
     */
    public Insert_StuResult() {
        initComponents();
        conn = javaconnect.ConnecrDb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        insert_Name = new javax.swing.JTextField();
        insert_ID = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        insert_Law = new javax.swing.JComboBox<>();
        insert_Numerical = new javax.swing.JComboBox<>();
        insert_NumericalLab = new javax.swing.JComboBox<>();
        insert_Linear = new javax.swing.JComboBox<>();
        insert_Java = new javax.swing.JComboBox<>();
        insert_JavaLab = new javax.swing.JComboBox<>();
        insert_Algorithm = new javax.swing.JComboBox<>();
        insert_AlgorithmLab = new javax.swing.JComboBox<>();
        insert_Architecture = new javax.swing.JComboBox<>();
        insert_ArchitectureLab = new javax.swing.JComboBox<>();
        insert_Software = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        insert_CGPA = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        jLabel15.setText("jLabel15");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 48)); // NOI18N
        jLabel16.setText("Insert Result");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 11, -1, -1));

        insert_Name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(insert_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 87, 193, -1));

        insert_ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(insert_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 116, 193, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Name");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 90, 83, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Student ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 119, 83, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("software development project(ll)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 157, -1, -1));

        insert_Law.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D", "F" }));
        jPanel1.add(insert_Law, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 155, 50, -1));

        insert_Numerical.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D", "F" }));
        jPanel1.add(insert_Numerical, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 186, 50, -1));

        insert_NumericalLab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D", "F" }));
        jPanel1.add(insert_NumericalLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 217, 50, -1));

        insert_Linear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D", "F" }));
        jPanel1.add(insert_Linear, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 248, 50, -1));

        insert_Java.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D", "F" }));
        jPanel1.add(insert_Java, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 279, 50, -1));

        insert_JavaLab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D", "F" }));
        jPanel1.add(insert_JavaLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 310, 50, -1));

        insert_Algorithm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D", "F" }));
        jPanel1.add(insert_Algorithm, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 341, 50, -1));

        insert_AlgorithmLab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D", "F" }));
        jPanel1.add(insert_AlgorithmLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 372, 50, -1));

        insert_Architecture.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D", "F" }));
        jPanel1.add(insert_Architecture, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 403, 50, -1));

        insert_ArchitectureLab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D", "F" }));
        jPanel1.add(insert_ArchitectureLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 434, 50, -1));

        insert_Software.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D", "F" }));
        jPanel1.add(insert_Software, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 465, 50, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Software Development project(ll)");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 467, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("DEPT sessional");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 436, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("DEPT");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 405, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Algorithm sessional");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 374, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Algorithm");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 343, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Object Oriented programming (ii) sessional");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 312, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Object Oriented programming (ii)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 281, 327, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("matrh(lv)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Numerical Methods sessional");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 219, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Numerical Methods");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 188, -1, -1));

        jButton1.setText("Insert Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 567, -1, 33));

        insert_CGPA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(insert_CGPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 514, 104, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("CGPA:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 517, 69, -1));

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 567, 73, 33));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon_Collection/363 - Copy (3).jpg"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(-19, -1, 550, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent (this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    public double ResultCalculation(String insertData){
        
        if(insertData=="A+"){
            return 4.00;
        }
        else if(insertData=="A"){
            return 3.75;
        }
        else if(insertData=="A-"){
            return 3.50;
        }
        else if(insertData=="B+"){
            return 3.25;
        }
        else if(insertData=="B"){
            return 3.00;
        }
        else if(insertData=="B-"){
            return 2.75;
        }
        else if(insertData=="C+"){
            return 2.50;
        }
        else if(insertData=="C"){
            return 2.25;
        }
        else if(insertData=="D"){
            return 2.00;
        }
        else{
            return 0.00;
        }
    } 
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        double Summation = 0;
        String calculation;
        
        int decision = JOptionPane.showConfirmDialog(null, "Press Yes to confirm Insertion of Data", "Insert Data", JOptionPane.YES_NO_OPTION);
        
        if(decision==0){
            try{
                String sql = "Insert into Student_Result (Student_ID,Student_Name,LAW2211,MATH2231,MATH2232,MATH2241,CSE2211,CSE2212,CSE2221,CSE2222,CSE2231,CSE2232,CSE2242,CGPA) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                pst = conn.prepareStatement(sql);
                
                pst.setString(1, insert_ID.getText());
                pst.setString(2, insert_Name.getText());
                
                pst.setString(3,(String)insert_Law.getSelectedItem());
                calculation = (String)insert_Law.getSelectedItem();
                Summation = Summation + (2 * ResultCalculation(calculation));        
                        
                pst.setString(4,(String)insert_Numerical.getSelectedItem());
                calculation = (String)insert_Numerical.getSelectedItem();
                Summation = Summation + (2 * ResultCalculation(calculation)); 
                
                pst.setString(5,(String)insert_NumericalLab.getSelectedItem());
                calculation = (String)insert_NumericalLab.getSelectedItem();
                Summation = Summation + (1 * ResultCalculation(calculation)); 
                
                pst.setString(6,(String)insert_Linear.getSelectedItem());
                calculation = (String)insert_Linear.getSelectedItem();
                Summation = Summation + (3 * ResultCalculation(calculation));
                
                pst.setString(7,(String)insert_Java.getSelectedItem());
                calculation = (String)insert_Java.getSelectedItem();
                Summation = Summation + (3 * ResultCalculation(calculation));
                
                pst.setString(8,(String)insert_JavaLab.getSelectedItem());
                calculation = (String)insert_JavaLab.getSelectedItem();
                Summation = Summation + (1 * ResultCalculation(calculation));
                
                pst.setString(9,(String)insert_Algorithm.getSelectedItem());
                calculation = (String)insert_Algorithm.getSelectedItem();
                Summation = Summation + (3 * ResultCalculation(calculation));
                
                pst.setString(10,(String)insert_AlgorithmLab.getSelectedItem());
                calculation = (String)insert_AlgorithmLab.getSelectedItem();
                Summation = Summation + (1 * ResultCalculation(calculation));
                
                pst.setString(11,(String)insert_Architecture.getSelectedItem());
                calculation = (String)insert_Architecture.getSelectedItem();
                Summation = Summation + (3 * ResultCalculation(calculation));
                
                pst.setString(12,(String)insert_ArchitectureLab.getSelectedItem());
                calculation = (String)insert_ArchitectureLab.getSelectedItem();
                Summation = Summation + (1 * ResultCalculation(calculation));
                
                pst.setString(13,(String)insert_Software.getSelectedItem());
                calculation = (String)insert_Software.getSelectedItem();
                Summation = Summation + (1 * ResultCalculation(calculation));
                
                
                // Result Calculation //
                Summation = (Summation/21);
                
                Summation = Double.parseDouble(new DecimalFormat("##.##").format(Summation));
                
                calculation = Double.toString(Summation);
                
                /// Result Showing //
                pst.setString(14,calculation);
                
                pst.execute();

                insert_CGPA.setText(calculation);
    
                JOptionPane.showMessageDialog(null, "Data Inserted");
                
            }catch(Exception e){
                
                JOptionPane.showMessageDialog(null, e);
                
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Admin_Menu am = new Admin_Menu();
        am.setVisible(true);
        this.dispose();
        
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
            java.util.logging.Logger.getLogger(Insert_StuResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert_StuResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert_StuResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert_StuResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_StuResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> insert_Algorithm;
    private javax.swing.JComboBox<String> insert_AlgorithmLab;
    private javax.swing.JComboBox<String> insert_Architecture;
    private javax.swing.JComboBox<String> insert_ArchitectureLab;
    private javax.swing.JTextField insert_CGPA;
    private javax.swing.JTextField insert_ID;
    private javax.swing.JComboBox<String> insert_Java;
    private javax.swing.JComboBox<String> insert_JavaLab;
    private javax.swing.JComboBox<String> insert_Law;
    private javax.swing.JComboBox<String> insert_Linear;
    private javax.swing.JTextField insert_Name;
    private javax.swing.JComboBox<String> insert_Numerical;
    private javax.swing.JComboBox<String> insert_NumericalLab;
    private javax.swing.JComboBox<String> insert_Software;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
