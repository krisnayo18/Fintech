/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fintech_client;

/**
 *
 * @author Era
 */
public class FormMenu extends javax.swing.JFrame {

    /**
     * Creates new form FormUtama
     */
    public FormMenu() {
        initComponents();
    }
    
    
    public int bacatbk=0;
    public int investhree = 0;
    public int indopremium = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cbBaca = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        cbIndoPremium = new javax.swing.JCheckBox();
        cbInvesthree = new javax.swing.JCheckBox();
        btnSubmit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        cbBaca.setBackground(new java.awt.Color(102, 102, 102));
        cbBaca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbBaca.setForeground(new java.awt.Color(255, 255, 255));
        cbBaca.setText("PT. BACA, Tbk");
        cbBaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBacaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pilih Fintech Yang Anda Amati");

        cbIndoPremium.setBackground(new java.awt.Color(102, 102, 102));
        cbIndoPremium.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbIndoPremium.setForeground(new java.awt.Color(255, 255, 255));
        cbIndoPremium.setText("PT. IndoPremium");
        cbIndoPremium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIndoPremiumActionPerformed(evt);
            }
        });

        cbInvesthree.setBackground(new java.awt.Color(102, 102, 102));
        cbInvesthree.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbInvesthree.setForeground(new java.awt.Color(255, 255, 255));
        cbInvesthree.setText("PT. Investhree");
        cbInvesthree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInvesthreeActionPerformed(evt);
            }
        });

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });

        jLabel2.setText("SUBMIT");

        javax.swing.GroupLayout btnSubmitLayout = new javax.swing.GroupLayout(btnSubmit);
        btnSubmit.setLayout(btnSubmitLayout);
        btnSubmitLayout.setHorizontalGroup(
            btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSubmitLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnSubmitLayout.setVerticalGroup(
            btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSubmitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbInvesthree)
                            .addComponent(cbIndoPremium)
                            .addComponent(cbBaca))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(cbIndoPremium)
                .addGap(18, 18, 18)
                .addComponent(cbInvesthree)
                .addGap(18, 18, 18)
                .addComponent(cbBaca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        // TODO add your handling code here:
        FormTampilSaham f = new FormTampilSaham();
        f.setVisible(true);
         if(cbBaca.isSelected()){
            bacatbk = 1;
        }
        else
        {
            bacatbk = 0;
        }
          if(cbInvesthree.isSelected()){
            investhree = 1;
        }
        else
        {
            investhree = 0;
        }
           if(cbIndoPremium.isSelected()){
            indopremium = 1;
        }
        else
        {
            indopremium = 0;
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnSubmitMouseClicked

    private void cbIndoPremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIndoPremiumActionPerformed
        // TODO add your handling code here:
        if(indopremium == 0){
            indopremium = 1;
        }
        else
        {
            indopremium = 0;
        }
    }//GEN-LAST:event_cbIndoPremiumActionPerformed

    private void cbInvesthreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInvesthreeActionPerformed
        // TODO add your handling code here:
         if(investhree == 0){
            investhree = 1;
        }
        else
        {
            investhree = 0;
        }
    }//GEN-LAST:event_cbInvesthreeActionPerformed

    private void cbBacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBacaActionPerformed
        // TODO add your handling code here:
        if(bacatbk == 0){
            bacatbk = 1;
        }
        else
        {
            bacatbk = 0;
        }
    }//GEN-LAST:event_cbBacaActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbBaca;
    public javax.swing.JCheckBox cbIndoPremium;
    private javax.swing.JCheckBox cbInvesthree;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
