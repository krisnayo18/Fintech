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
public class FormTampilSaham extends javax.swing.JFrame {

    /**
     * Creates new form formUtamaSaham
     */
    String chatClient,chatServer;
    private Socket clientSocket;
    DataOutputStream sendToServer;
    BufferedReader chatFromServer;
    fintech_client akun;
   
   
    public String hasil="";
    public FormTampilSaham() {
        
        initComponents();
        jPanelBaca.setVisible(false);
        jPanelIndo.setVisible(false);
        jPanelInvest.setVisible(true);
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
        jPanelIndo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabelIndoPremiumUsd = new javax.swing.JLabel();
        jLabelIndoPremiumEuro = new javax.swing.JLabel();
        jLabelIndoPremiumPounds = new javax.swing.JLabel();
        jLabelIndoPremiumIhsg = new javax.swing.JLabel();
        jPanelInvest = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelInvesEuro = new javax.swing.JLabel();
        jLabelInvesIhsg = new javax.swing.JLabel();
        jLabelInvesUsd = new javax.swing.JLabel();
        jLabelInvesPounds = new javax.swing.JLabel();
        jPanelBaca = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabelBacaUsd = new javax.swing.JLabel();
        jLabelBacaEuro = new javax.swing.JLabel();
        jLabelBacaPounds = new javax.swing.JLabel();
        jLabelBacaIhsg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelExit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        jPanelIndo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("INDOPREMIUM");

        jLabelIndoPremiumUsd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelIndoPremiumUsd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIndoPremiumUsd.setText("?");

        jLabelIndoPremiumEuro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelIndoPremiumEuro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIndoPremiumEuro.setText("?");

        jLabelIndoPremiumPounds.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelIndoPremiumPounds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIndoPremiumPounds.setText("?");

        jLabelIndoPremiumIhsg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelIndoPremiumIhsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIndoPremiumIhsg.setText("?");

        javax.swing.GroupLayout jPanelIndoLayout = new javax.swing.GroupLayout(jPanelIndo);
        jPanelIndo.setLayout(jPanelIndoLayout);
        jPanelIndoLayout.setHorizontalGroup(
            jPanelIndoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIndoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelIndoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIndoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIndoPremiumEuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelIndoPremiumIhsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelIndoPremiumPounds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelIndoPremiumUsd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelIndoLayout.setVerticalGroup(
            jPanelIndoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIndoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabelIndoPremiumUsd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabelIndoPremiumEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabelIndoPremiumPounds, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabelIndoPremiumIhsg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelIndo);
        jPanelIndo.setBounds(390, 0, 140, 480);

        jPanelInvest.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("INVESTHREE");

        jLabelInvesEuro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelInvesEuro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInvesEuro.setText("?");

        jLabelInvesIhsg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelInvesIhsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInvesIhsg.setText("?");

        jLabelInvesUsd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelInvesUsd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInvesUsd.setText("?");
        jLabelInvesUsd.setToolTipText("");

        jLabelInvesPounds.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelInvesPounds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInvesPounds.setText("?");

        javax.swing.GroupLayout jPanelInvestLayout = new javax.swing.GroupLayout(jPanelInvest);
        jPanelInvest.setLayout(jPanelInvestLayout);
        jPanelInvestLayout.setHorizontalGroup(
            jPanelInvestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInvestLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(31, 31, 31))
            .addGroup(jPanelInvestLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInvestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInvesEuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInvesIhsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInvesPounds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelInvesUsd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelInvestLayout.setVerticalGroup(
            jPanelInvestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInvestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabelInvesUsd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabelInvesEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabelInvesPounds, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabelInvesIhsg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jLabelInvesUsd.getAccessibleContext().setAccessibleName("5");

        jPanel1.add(jPanelInvest);
        jPanelInvest.setBounds(214, 0, 150, 480);

        jPanelBaca.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("BACA, TBK");

        jLabelBacaUsd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelBacaUsd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBacaUsd.setText("?");

        jLabelBacaEuro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelBacaEuro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBacaEuro.setText("?");

        jLabelBacaPounds.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelBacaPounds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBacaPounds.setText("?");

        jLabelBacaIhsg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelBacaIhsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBacaIhsg.setText("?");

        javax.swing.GroupLayout jPanelBacaLayout = new javax.swing.GroupLayout(jPanelBaca);
        jPanelBaca.setLayout(jPanelBacaLayout);
        jPanelBacaLayout.setHorizontalGroup(
            jPanelBacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBacaLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(32, 32, 32))
            .addGroup(jPanelBacaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBacaEuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelBacaIhsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelBacaPounds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelBacaUsd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelBacaLayout.setVerticalGroup(
            jPanelBacaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBacaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabelBacaUsd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabelBacaEuro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabelBacaPounds, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabelBacaIhsg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelBaca);
        jPanelBaca.setBounds(550, 0, 140, 480);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VALAS EURO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 180, 86, 21);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VALAS POUNDS");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 250, 107, 21);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabelExit.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabelExit.setForeground(new java.awt.Color(102, 102, 102));
        jLabelExit.setText("EXIT");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabelExit)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelExit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 420, 190, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("IHSG");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 320, 33, 21);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("VALAS USD");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 110, 77, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setacc(fintech_client pakun)
    {
        akun = pakun;
    }
    public void setPannel(String pIndo, String pInvess, String pBaca)
    {
        if(pIndo.equals("1"))
        {
            jPanelIndo.setVisible(true);
        }
        if(pInvess.equals("1"))
        {
             jPanelInvest.setVisible(true);
        }
        if(pBaca.equals("1"))
        {
             jPanelBaca.setVisible(true);
        }
    }
    public void TampilkanSahamInvess(String pUsd, String pEuro, String pPounds, String pIhsg )
    {
      
      jLabelInvesUsd.setText(pUsd);
      jLabelInvesEuro.setText(pEuro);
      jLabelInvesPounds.setText(pPounds);
      jLabelInvesIhsg.setText(pIhsg);
     System.out.println(pUsd);
    
    }
    public void TampilkanSahamIndo(String pUsd, String pEuro, String pPounds, String pIhsg )
    {
      jLabelIndoPremiumUsd.setText(pUsd);
      jLabelIndoPremiumEuro.setText(pEuro);
      jLabelIndoPremiumPounds.setText(pPounds);
      jLabelIndoPremiumIhsg.setText(pIhsg);

    }
   public void TampilkanSahamBaca(String pUsd, String pEuro, String pPounds, String pIhsg )
    {
      jLabelBacaUsd.setText(pUsd);
      jLabelBacaEuro.setText(pEuro);
      jLabelBacaPounds.setText(pPounds);
      jLabelBacaIhsg.setText(pIhsg);

    }
      
    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        MultiRequestSaham m = new MultiRequestSaham();
        m.Close();
         FormMenu r = new FormMenu();
                r.setVisible(true);
                r.setacc(akun);
                this.setVisible(false);
    }//GEN-LAST:event_jPanel5MouseClicked

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
            java.util.logging.Logger.getLogger(FormTampilSaham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTampilSaham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTampilSaham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTampilSaham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTampilSaham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabelBacaEuro;
    public javax.swing.JLabel jLabelBacaIhsg;
    public javax.swing.JLabel jLabelBacaPounds;
    public javax.swing.JLabel jLabelBacaUsd;
    private javax.swing.JLabel jLabelExit;
    public javax.swing.JLabel jLabelIndoPremiumEuro;
    public javax.swing.JLabel jLabelIndoPremiumIhsg;
    public javax.swing.JLabel jLabelIndoPremiumPounds;
    public javax.swing.JLabel jLabelIndoPremiumUsd;
    public javax.swing.JLabel jLabelInvesEuro;
    public javax.swing.JLabel jLabelInvesIhsg;
    public javax.swing.JLabel jLabelInvesPounds;
    public static javax.swing.JLabel jLabelInvesUsd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanelBaca;
    public javax.swing.JPanel jPanelIndo;
    public javax.swing.JPanel jPanelInvest;
    // End of variables declaration//GEN-END:variables

   
}
