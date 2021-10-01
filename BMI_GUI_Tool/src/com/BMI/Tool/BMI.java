/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BMI.Tool;

import java.text.DecimalFormat;

/**
 *
 * @author moutasim
 */
public class BMI extends javax.swing.JFrame {

    /**
     * Creates new form BMI
     */
    public BMI() {
        initComponents();
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
        heightLbl = new javax.swing.JLabel();
        feetTextField = new javax.swing.JTextField();
        inchesTextField = new javax.swing.JTextField();
        feetLbl = new javax.swing.JLabel();
        inchesLbl = new javax.swing.JLabel();
        weightLbl = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        bmiLbl = new javax.swing.JLabel();
        bmiTotalTextField = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        commentsLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BMI Calculation Tool");

        jPanel1.setBackground(new java.awt.Color(115, 218, 160));

        heightLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        heightLbl.setForeground(new java.awt.Color(1, 1, 1));
        heightLbl.setText("Your Height");

        feetTextField.setBackground(new java.awt.Color(254, 254, 254));
        feetTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        feetTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feetTextFieldActionPerformed(evt);
            }
        });

        inchesTextField.setBackground(new java.awt.Color(254, 254, 254));
        inchesTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        feetLbl.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        feetLbl.setForeground(new java.awt.Color(1, 1, 1));
        feetLbl.setText("Feet");

        inchesLbl.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        inchesLbl.setForeground(new java.awt.Color(1, 1, 1));
        inchesLbl.setText("inches");

        weightLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        weightLbl.setForeground(new java.awt.Color(1, 1, 1));
        weightLbl.setText("Your Weight");

        weightTextField.setBackground(new java.awt.Color(254, 254, 254));
        weightTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCalculate.setBackground(new java.awt.Color(17, 77, 239));
        btnCalculate.setFont(new java.awt.Font("Noto Sans Medium", 1, 14)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(1, 1, 1));
        btnCalculate.setText("Calculate your BMI");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        bmiLbl.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        bmiLbl.setForeground(new java.awt.Color(1, 1, 1));
        bmiLbl.setText("Your BMI");

        bmiTotalTextField.setBackground(new java.awt.Color(254, 254, 254));
        bmiTotalTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bmiTotalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmiTotalTextFieldActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(211, 86, 253));
        btnClear.setFont(new java.awt.Font("Noto Sans Medium", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(1, 1, 1));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(254, 5, 30));
        btnExit.setFont(new java.awt.Font("Noto Sans Medium", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(1, 1, 1));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        commentsLbl.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(feetLbl)
                                    .addComponent(btnClear))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(153, 153, 153)
                                        .addComponent(inchesLbl))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heightLbl)
                            .addComponent(weightLbl)
                            .addComponent(bmiLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(feetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(inchesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(bmiTotalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(commentsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inchesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(heightLbl)
                        .addComponent(feetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feetLbl)
                    .addComponent(inchesLbl))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightLbl)
                    .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bmiLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bmiTotalTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(commentsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addGap(24, 24, 24))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void feetTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feetTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feetTextFieldActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        double feet, inches, kilogram;
        double height, bmi;
        
        try {
            feet = Double.parseDouble(feetTextField.getText());
            inches = Double.parseDouble(inchesTextField.getText());
            kilogram = Double.parseDouble(weightTextField.getText());
            
            height = (feet * 12) + inches;
            height = (height * 2.5) / 100;
            bmi = kilogram / (height * height);
            bmiTotalTextField.setText(new DecimalFormat ("##.##").format(bmi));
            
            
            
            if (bmi < 18.5) {
                commentsLbl.setText("You are underweight");
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                commentsLbl.setText("Your weight is normal");
            } else if (bmi > 24.9 && bmi <= 29.9) {
                commentsLbl.setText("You are Overweight");
            } else {
                commentsLbl.setText("You are obese");
            }

        } catch (NumberFormatException ex) {
            commentsLbl.setText("Whoops, Only numeric characters are valid");
        }
        
        
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void bmiTotalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmiTotalTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bmiTotalTextFieldActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        feetTextField.setText("");
        inchesTextField.setText("");
        weightTextField.setText("");
        bmiTotalTextField.setText("");
        commentsLbl.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bmiLbl;
    private javax.swing.JTextField bmiTotalTextField;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel commentsLbl;
    private javax.swing.JLabel feetLbl;
    private javax.swing.JTextField feetTextField;
    private javax.swing.JLabel heightLbl;
    private javax.swing.JLabel inchesLbl;
    private javax.swing.JTextField inchesTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel weightLbl;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
}