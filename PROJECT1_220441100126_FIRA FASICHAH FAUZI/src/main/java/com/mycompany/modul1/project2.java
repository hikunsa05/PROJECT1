/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.modul1;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.event.ActionListener;
/**
 *
 * @author ASUS
 */
public class project2 extends javax.swing.JFrame {
    
    Timer timer;
    
    int angka;
    /**
     * Creates new form project2
     */
    public project2() {
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

        ehitung = new javax.swing.JLabel();
        eangka = new javax.swing.JTextField();
        btnmulai = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ehitung.setFont(new java.awt.Font("Bahnschrift", 0, 55)); // NOI18N
        ehitung.setForeground(new java.awt.Color(153, 71, 32));
        ehitung.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ehitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 110, 90));

        eangka.setFont(new java.awt.Font("Bookman Old Style", 0, 36)); // NOI18N
        eangka.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        eangka.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eangkaKeyReleased(evt);
            }
        });
        getContentPane().add(eangka, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 170, 70));

        btnmulai.setBackground(new java.awt.Color(232, 176, 176));
        btnmulai.setText("MULAI");
        btnmulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmulaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnmulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 70, 30));

        btnStop.setBackground(new java.awt.Color(232, 176, 176));
        btnStop.setText("STOP");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        getContentPane().add(btnStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\tp.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 554));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnmulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmulaiActionPerformed
        // TODO add your handling code here:
        timer = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(angka > 0){
                    angka--;
                    ehitung.setText(Integer.toString(angka)); // Update label ehitung
                } else {
                    timer.stop(); // Hentikan timer ketika angka mencapai 0
                    JOptionPane.showMessageDialog(null, "Countdown Selesai!!");
                }
            }
        });
        timer.start();
    }//GEN-LAST:event_btnmulaiActionPerformed

    private void eangkaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eangkaKeyReleased
        // TODO add your handling code here:
        ehitung.setText(""+eangka.getText());
        angka = Integer.parseInt(eangka.getText());
    }//GEN-LAST:event_eangkaKeyReleased

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        // TODO add your handling code here:
        timer.stop();
    }//GEN-LAST:event_btnStopActionPerformed

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
            java.util.logging.Logger.getLogger(project2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(project2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(project2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(project2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new project2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStop;
    private javax.swing.JButton btnmulai;
    private javax.swing.JTextField eangka;
    private javax.swing.JLabel ehitung;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
