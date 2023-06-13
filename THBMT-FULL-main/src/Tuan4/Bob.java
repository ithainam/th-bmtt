/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan4;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;

/**
 *
 * @author MSI-PC
 */
public class Bob extends javax.swing.JFrame {

    /**
     * Creates new form Bob
     */
    KeyAgreement bobKeyAgree;
    PublicKey alicePubKey;
    SecretKey bobDesKey;
    Cipher bobCipher;
    public Bob() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtkhoaa = new javax.swing.JTextField();
        txtkhoab = new javax.swing.JTextField();
        txtmahoakab = new javax.swing.JTextField();
        txtkhoachung = new javax.swing.JTextField();
        btnmahoagiaima = new javax.swing.JButton();
        btnkhoaB = new javax.swing.JButton();
        btnkhoaA = new javax.swing.JButton();
        btnkhoaAB = new javax.swing.JButton();
        btnmahoakab = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Bob");

        jLabel2.setText("Khóa BOB:");

        jLabel3.setText("Khóa Alice:");

        jLabel4.setText("Khóa KAB:");

        jLabel5.setText("Mã hóa KAB:");

        txtkhoaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkhoaaActionPerformed(evt);
            }
        });

        txtkhoab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkhoabActionPerformed(evt);
            }
        });

        txtmahoakab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmahoakabActionPerformed(evt);
            }
        });

        txtkhoachung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkhoachungActionPerformed(evt);
            }
        });

        btnmahoagiaima.setText("Mã hóa/Giải mã");
        btnmahoagiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmahoagiaimaActionPerformed(evt);
            }
        });

        btnkhoaB.setText("Tạo khóa B");
        btnkhoaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhoaBActionPerformed(evt);
            }
        });

        btnkhoaA.setText("Hiễn thị KA");
        btnkhoaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhoaAActionPerformed(evt);
            }
        });

        btnkhoaAB.setText("Khóa Chung");
        btnkhoaAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhoaABActionPerformed(evt);
            }
        });

        btnmahoakab.setText("Mã hóa KAB");
        btnmahoakab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmahoakabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtkhoab, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnkhoaB))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnmahoagiaima)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtkhoachung, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtmahoakab, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(38, 38, 38)
                                            .addComponent(btnmahoakab))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(44, 44, 44)
                                            .addComponent(btnkhoaAB)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtkhoaa, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnkhoaA)))))
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtkhoab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkhoaB))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtkhoaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnkhoaA))
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtkhoachung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkhoaAB))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmahoakab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnmahoakab))
                .addGap(33, 33, 33)
                .addComponent(btnmahoagiaima)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkhoaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkhoaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkhoaaActionPerformed

    private void txtkhoabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkhoabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkhoabActionPerformed

    private void txtmahoakabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmahoakabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmahoakabActionPerformed

    private void txtkhoachungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkhoachungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkhoachungActionPerformed

    private void btnkhoaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhoaAActionPerformed
        // TODO add your handling code here:
        try{
            FileInputStream fis = new FileInputStream("D:/A.pub");
            byte[] akeyP = new byte[fis.available()];
            fis.read(akeyP);
            fis.close();
            txtkhoaa.setText(akeyP.toString());
        }catch(Exception ex){}
    }//GEN-LAST:event_btnkhoaAActionPerformed

    private void btnkhoaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhoaBActionPerformed
        // TODO add your handling code here:
        try{
            boolean read = false;
            while(!read){
                try{
                    FileInputStream fis = new FileInputStream("D:/A.pub");
                    fis.close();
                    read = true;
                }catch(Exception ex){}
            }
            FileInputStream fis = new FileInputStream("D:/A.pub");
            byte[] alicePubKeyEnc = new byte[fis.available()];
            fis.read(alicePubKeyEnc);
            fis.close();
            KeyFactory bobKeyFac =KeyFactory.getInstance("DH");
            X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(alicePubKeyEnc);
            alicePubKey = bobKeyFac.generatePublic(x509KeySpec);
            DHParameterSpec dhParamSpec = ((DHPublicKey) alicePubKey).getParams();
            System.out.println("Generate DH keypair ...");
            KeyPairGenerator bobKpairGen = KeyPairGenerator.getInstance("DH");
            bobKpairGen.initialize(dhParamSpec);
            KeyPair bobKpair = bobKpairGen.generateKeyPair();
            System.out.println("Initializing KeyAgreement engine ...");
            bobKeyAgree = KeyAgreement.getInstance("DH");
            bobKeyAgree.init(bobKpair.getPrivate());
            byte[] bobPubKeyEnc = bobKpair.getPublic().getEncoded();
            FileOutputStream fos = new FileOutputStream("D:/B.pub");
            fos.write(bobPubKeyEnc);
            fos.close();
            txtkhoab.setText(bobPubKeyEnc.toString());
        }catch(Exception ex){}
    }//GEN-LAST:event_btnkhoaBActionPerformed

    private void btnkhoaABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhoaABActionPerformed
        // TODO add your handling code here:
        try{
            bobKeyAgree.doPhase(alicePubKey, true);
            byte[] bobSharedSecret = bobKeyAgree.generateSecret();
            System.out.println("Khoa chung :Shared secret (DEBUG ONLY): "+CryptoUtil.toHexString(bobSharedSecret));
            txtkhoachung.setText(CryptoUtil.toHexString(bobSharedSecret));
        }catch(Exception ex){}
    }//GEN-LAST:event_btnkhoaABActionPerformed

    private void btnmahoakabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmahoakabActionPerformed
        // TODO add your handling code here:
        try{
            bobKeyAgree.doPhase(alicePubKey, true);
            bobDesKey = bobKeyAgree.generateSecret("DES");
            txtmahoakab.setText(bobDesKey.toString());
            
            BufferedWriter bw = null;
            String fileName = "D:\\KhoaB.txt";
            
            bw= new BufferedWriter(new FileWriter(fileName));
            bw.write(bobDesKey.toString());
            bw.close();
        }catch(Exception ex){}
    }//GEN-LAST:event_btnmahoakabActionPerformed

    private void btnmahoagiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmahoagiaimaActionPerformed
        // TODO add your handling code here:
        DESCS des = new DESCS();
        des.setVisible(true);
    }//GEN-LAST:event_btnmahoagiaimaActionPerformed

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
            java.util.logging.Logger.getLogger(Bob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bob.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bob().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnkhoaA;
    private javax.swing.JButton btnkhoaAB;
    private javax.swing.JButton btnkhoaB;
    private javax.swing.JButton btnmahoagiaima;
    private javax.swing.JButton btnmahoakab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtkhoaa;
    private javax.swing.JTextField txtkhoab;
    private javax.swing.JTextField txtkhoachung;
    private javax.swing.JTextField txtmahoakab;
    // End of variables declaration//GEN-END:variables
}
