/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.covid.forms;

import com.covid.classes.DBClass;
import com.covid.classes.Messages;
import com.covid.classes.sendMail1;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aditya
 */
public class StateSupply extends javax.swing.JFrame {

    DBClass db = new DBClass();

    /**
     * Creates new form StateSupply
     */
    public StateSupply() {
        initComponents();
        db.fillTable(jTable1, "select * from addDist_tbl");
        db.fillCombo(District, "select dname from addDist_tbl");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Vaccinname = new javax.swing.JComboBox<>();
        District = new javax.swing.JComboBox<>();
        Stock = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select District");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Vaccine");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Send Stock");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        Vaccinname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Vaccinname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Covaxin", "Covishield" }));
        kGradientPanel1.add(Vaccinname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 178, -1));

        District.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        District.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        kGradientPanel1.add(District, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 178, -1));

        Stock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kGradientPanel1.add(Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 178, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 51, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 316, 200));

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 0, 102));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 153, 153));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Supply for District");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        kGradientPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String dist = (String) District.getSelectedItem();
        String vaccine = (String) Vaccinname.getSelectedItem();
        String stock = Stock.getText();
        int st = Integer.parseInt(stock);
        if (stock.isEmpty()) {
            Messages.showWarning("Please enter valid stock", "Enter stock");
        } else if (vaccine.equals("Covaxin")) {
            ResultSet rs = db.getData("select * from statestock_tbl where vaccine_name='Covaxin'");
            try {
                if (rs.next()) {
                    int cv = rs.getInt(3);
                    if (st > cv) {
                        Messages.showError("Insufficient stock", dist);
                    } else if (cv < 150) {
                        Messages.showWarning("Stock is low", "Low stock");
                        String email = "adityadeshmukh7350@gmail.com";
                        String msg = "Hello";
                        sendMail1.sendMail(email, msg);
                    } else {
                        ResultSet rs2 = db.getData("select * from adddist_tbl where dname = '" + dist + "'");
                        if (rs2.next()) {
                            int rem = cv - st;
                            int oldst = rs2.getInt(5);
                            int newst = oldst + st;
                            db.execute("update adddist_tbl set Covaxin='" + newst + "' where dname='" + dist + "'");
                            db.execute("update statestock_tbl set stock ='" + rem + "' where vaccine_name='Covaxin'");
                        }

                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(StateSupply.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(StateSupply.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            ResultSet rs = db.getData("select * from statestock_tbl where vaccine_name='Covishield'");
            try {
                if (rs.next()) {
                    int cv = rs.getInt(3);
                    if (st > cv) {
                        Messages.showError("Insufficient stock", dist);
                    } else if (cv < 150) {
                        Messages.showWarning("Stock is low", "Low stock");
                        String email = "adityadeshmukh7350@gmail.com";
                        String msg = "Hello";
                        sendMail1.sendMail(email, msg);
                    } else {
                        ResultSet rs2 = db.getData("select * from adddist_tbl where dname = '" + dist + "'");
                        if (rs2.next()) {
                            int cov = rs.getInt(3);
                            int rem = cov - st;
                            int oldst = rs2.getInt(6);
                            int newst = oldst + st;
                            db.execute("update statestock_tbl set stock ='" + rem + "' where vaccine_name='Covishield'");
                            db.execute("update adddist_tbl set Covishield='" + newst + "' where Dname='" + dist + "'");
//                        int rem = cv-st;
//                        db.execute("update adddist_tbl set Covaxin='"+st+"' where dname='"+dist+"'");
//                        db.execute("update statestock_tbl set stock ='" + rem + "' where vaccine_name='Covaxin'");
                        }
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(StateSupply.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(StateSupply.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        db.fillTable(jTable1, "select * from adddist_tbl");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StateSupply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StateSupply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StateSupply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StateSupply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StateSupply().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> District;
    private javax.swing.JTextField Stock;
    private javax.swing.JComboBox<String> Vaccinname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables
}
