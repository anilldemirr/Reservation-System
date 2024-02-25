/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prolab;

import javax.swing.JFrame;

/**
 *
 * @author emrea
 */
public class firmaPanel extends javax.swing.JFrame {

    
    
    public firmaPanel() {
   
        initComponents();
                firmaadigoster.setText(main1.secili.getKullaniciadi() + " FİRMASI");
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                
                
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        aracekle = new javax.swing.JButton();
        araccikar = new javax.swing.JButton();
        sefercikar = new javax.swing.JButton();
        seferekle = new javax.swing.JButton();
        karhesapla = new javax.swing.JButton();
        anadon = new javax.swing.JButton();
        firmaadigoster = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FİRMA PANELİ");
        setBounds(new java.awt.Rectangle(380, 200, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        aracekle.setBackground(new java.awt.Color(51, 0, 51));
        aracekle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        aracekle.setForeground(new java.awt.Color(255, 255, 0));
        aracekle.setText("ARAÇ EKLE");
        aracekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracekleActionPerformed(evt);
            }
        });

        araccikar.setBackground(new java.awt.Color(51, 0, 51));
        araccikar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        araccikar.setForeground(new java.awt.Color(255, 255, 0));
        araccikar.setText("ARAÇ ÇIKAR");
        araccikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araccikarActionPerformed(evt);
            }
        });

        sefercikar.setBackground(new java.awt.Color(51, 0, 51));
        sefercikar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sefercikar.setForeground(new java.awt.Color(255, 255, 0));
        sefercikar.setText("SEFER ÇIKAR");
        sefercikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sefercikarActionPerformed(evt);
            }
        });

        seferekle.setBackground(new java.awt.Color(51, 0, 51));
        seferekle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        seferekle.setForeground(new java.awt.Color(255, 255, 0));
        seferekle.setText("SEFER EKLE");
        seferekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seferekleActionPerformed(evt);
            }
        });

        karhesapla.setBackground(new java.awt.Color(51, 0, 51));
        karhesapla.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        karhesapla.setForeground(new java.awt.Color(255, 255, 0));
        karhesapla.setText("GÜNLÜK KAR HESABI YAP");
        karhesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karhesaplaActionPerformed(evt);
            }
        });

        anadon.setBackground(new java.awt.Color(204, 0, 0));
        anadon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        anadon.setForeground(new java.awt.Color(0, 255, 255));
        anadon.setText("ANA MENÜYE DÖN");
        anadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadonActionPerformed(evt);
            }
        });

        firmaadigoster.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firmaadigoster.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(karhesapla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seferekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sefercikar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(araccikar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aracekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(anadon, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(firmaadigoster, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(firmaadigoster, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(aracekle)
                .addGap(18, 18, 18)
                .addComponent(araccikar)
                .addGap(18, 18, 18)
                .addComponent(seferekle)
                .addGap(18, 18, 18)
                .addComponent(sefercikar)
                .addGap(18, 18, 18)
                .addComponent(karhesapla)
                .addGap(49, 49, 49)
                .addComponent(anadon, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadonActionPerformed
        setVisible(false);
        
    }//GEN-LAST:event_anadonActionPerformed

    private void aracekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracekleActionPerformed
        
        araceklemePanel aracpanelekle = new araceklemePanel();

        
        aracpanelekle.secili = main1.secili;
        aracpanelekle.setVisible(true);

        
    }//GEN-LAST:event_aracekleActionPerformed

    private void araccikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araccikarActionPerformed
        
        araccikarmaPanel araccikarma = new araccikarmaPanel();
        araccikarma.setVisible(true);
        
       
    }//GEN-LAST:event_araccikarActionPerformed

    private void seferekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seferekleActionPerformed
       sefereklemePanel a = new sefereklemePanel();
       a.setVisible(true);
       
    }//GEN-LAST:event_seferekleActionPerformed

    private void sefercikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sefercikarActionPerformed
       
        sefercikarmaPanel a = new sefercikarmaPanel();
        a.setVisible(true);
        
        
    }//GEN-LAST:event_sefercikarActionPerformed

    private void karhesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karhesaplaActionPerformed
        bedelgosterPanel a =  new bedelgosterPanel();
        a.setVisible(true);
        
    }//GEN-LAST:event_karhesaplaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feearacekleg code (optional) ">
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
            java.util.logging.Logger.getLogger(firmaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(firmaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(firmaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(firmaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new firmaPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadon;
    private javax.swing.JButton araccikar;
    private javax.swing.JButton aracekle;
    private javax.swing.JLabel firmaadigoster;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton karhesapla;
    private javax.swing.JButton sefercikar;
    private javax.swing.JButton seferekle;
    // End of variables declaration//GEN-END:variables
}
