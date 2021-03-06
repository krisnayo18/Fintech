/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fintech_client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Era
 */
public class FormRegistrasi extends javax.swing.JFrame {
    String chatClient,chatServer;
    private Socket clientSocket;
    DataOutputStream sendToServer;
    BufferedReader chatFromServer;
    fintech_client akun;
    
    /**
     * Creates new form UIRegister
     */
    public FormRegistrasi() {
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

        panelLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        panelLogin = new javax.swing.JPanel();
        labelToLogin = new javax.swing.JLabel();
        btnLogin = new javax.swing.JPanel();
        jLabelRegister = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        jLabelLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        panelLogo.setBackground(new java.awt.Color(102, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fintech_client/money_bag_filled_100px.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Arual", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("REGISTER");

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));

        jSeparator4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addGroup(panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLogoLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLogoLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLogoLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel6))
                            .addComponent(jLabel1)))
                    .addGroup(panelLogoLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel5)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        getContentPane().add(panelLogo);
        panelLogo.setBounds(0, 0, 400, 480);

        panelLogin.setBackground(new java.awt.Color(102, 102, 102));
        panelLogin.setMinimumSize(new java.awt.Dimension(510, 480));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelToLogin.setFont(new java.awt.Font("Roboto Thin", 0, 15)); // NOI18N
        labelToLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelToLogin.setText("Sudah Punya Akun?");
        labelToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelToLoginMouseClicked(evt);
            }
        });
        panelLogin.add(labelToLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 140, 30));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        jLabelRegister.setFont(new java.awt.Font("Roboto Thin", 0, 15)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(102, 102, 102));
        jLabelRegister.setText("REGISTER");
        jLabelRegister.setToolTipText("");
        jLabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLoginLayout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabelRegister)
                .addGap(101, 101, 101))
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 280, -1));
        panelLogin.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 360, 20));

        jLabel2.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NEW PASSWORD");
        panelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jTextFieldUsername.setBackground(new java.awt.Color(102, 102, 102));
        jTextFieldUsername.setFont(new java.awt.Font("Roboto Thin", 0, 15)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUsername.setText("Masukan Nama Disini");
        jTextFieldUsername.setBorder(null);
        panelLogin.add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 280, 20));
        panelLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 360, 20));

        jLabel4.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NEW USERNAME");
        panelLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtPass.setBackground(new java.awt.Color(102, 102, 102));
        txtPass.setFont(new java.awt.Font("Roboto Thin", 0, 15)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setText("Masukan Pass Disini");
        txtPass.setBorder(null);
        panelLogin.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 280, 20));

        jLabelLogout.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        jLabelLogout.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogout.setText("X");
        jLabelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogoutMouseClicked(evt);
            }
        });
        panelLogin.add(jLabelLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 30, 30));

        getContentPane().add(panelLogin);
        panelLogin.setBounds(398, 0, 500, 480);

        setSize(new java.awt.Dimension(898, 479));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
     public void setacc(fintech_client pakun)
    {
        akun = pakun;
    }
    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO add your handling code here:
        try 
        {   
            chatClient = "REGISTRASI-" + jTextFieldUsername.getText() + "-" + txtPass.getText();
            akun.sendToServer.writeBytes(chatClient + "\n"); // kirim ke server
            chatServer = akun.chatFromServer.readLine();//terima data dari server
            
            if(chatServer.equals("SUKSES")) // pengecekan apabila registrasi benar
            {
                JOptionPane.showMessageDialog(null, "Registrasi berhasil, Silahkan login kembali " +
                        jTextFieldUsername.getText()); 
                //pindah ke form menu 
                FormMenu r = new FormMenu();
                r.setVisible(true);
                r.setacc(akun);
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Registrasi anda tidak berhasil " + jTextFieldUsername.getText() + " Sudah terdaftar");
            }
        }
       
         catch(IOException ex)
         {
             Logger.getLogger(FormRegistrasi.class.getName()).log(Level.SEVERE, null, ex);
         }     
    }//GEN-LAST:event_btnLoginMouseClicked

    private void labelToLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelToLoginMouseClicked
        // TODO add your handling code here:
        FormLogin r = new FormLogin();
        r.setVisible(true);
        r.setacc(akun);
        this.setVisible(false);
    }//GEN-LAST:event_labelToLoginMouseClicked

    private void jLabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabelRegisterMouseClicked

    private void jLabelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoutMouseClicked
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jLabelLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(FormRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegistrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegistrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelLogout;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JLabel labelToLogin;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JTextField txtPass;
    // End of variables declaration//GEN-END:variables
}
