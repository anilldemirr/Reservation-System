/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prolab;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author emrea
 */
public class adminPanel extends javax.swing.JFrame {
    public static int deger1 = 0;



    /**
     * Creates new form adminPanel
     */
    public adminPanel() {
        
        initComponents();
    }

    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        firmakaydiyap = new javax.swing.JButton();
        firmagoruntule = new javax.swing.JButton();
        hizmetbedelibelirle = new javax.swing.JButton();
        firmakaydisil = new javax.swing.JButton();
        anasayfayadon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(380, 200, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        firmakaydiyap.setBackground(new java.awt.Color(51, 0, 51));
        firmakaydiyap.setForeground(new java.awt.Color(255, 255, 51));
        firmakaydiyap.setText("YENİ FİRMA KAYDI YAP");
        firmakaydiyap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmakaydiyapActionPerformed(evt);
            }
        });

        firmagoruntule.setBackground(new java.awt.Color(51, 0, 51));
        firmagoruntule.setForeground(new java.awt.Color(255, 255, 51));
        firmagoruntule.setText("FİRMALARI GÖRÜNTÜLE");
        firmagoruntule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmagoruntuleActionPerformed(evt);
            }
        });

        hizmetbedelibelirle.setBackground(new java.awt.Color(51, 0, 51));
        hizmetbedelibelirle.setForeground(new java.awt.Color(255, 255, 51));
        hizmetbedelibelirle.setText("HİZMET BEDELİ BELİRLE");
        hizmetbedelibelirle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hizmetbedelibelirleActionPerformed(evt);
            }
        });

        firmakaydisil.setBackground(new java.awt.Color(51, 0, 51));
        firmakaydisil.setForeground(new java.awt.Color(255, 255, 51));
        firmakaydisil.setText("FİRMA KAYDI SİL");
        firmakaydisil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmakaydisilActionPerformed(evt);
            }
        });

        anasayfayadon.setBackground(new java.awt.Color(102, 255, 204));
        anasayfayadon.setForeground(new java.awt.Color(204, 0, 0));
        anasayfayadon.setText("ANA SAYFAYA DÖN");
        anasayfayadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anasayfayadonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(firmagoruntule, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addComponent(firmakaydisil, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addComponent(hizmetbedelibelirle, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addComponent(firmakaydiyap, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addComponent(anasayfayadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(firmagoruntule)
                .addGap(18, 18, 18)
                .addComponent(firmakaydiyap)
                .addGap(18, 18, 18)
                .addComponent(firmakaydisil)
                .addGap(18, 18, 18)
                .addComponent(hizmetbedelibelirle)
                .addGap(50, 50, 50)
                .addComponent(anasayfayadon, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
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

    private void firmagoruntuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmagoruntuleActionPerformed
    firmagoruntulemePanel firmapan = new firmagoruntulemePanel();
        firmapan.setVisible(true);
        this.setVisible(false);
        
        /*
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(adminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            int deger = firmapan.deger;
            if (deger == 1) {
                break;
            }
        }
        firmapan.setVisible(false);
        setVisible(false);
        */
        
    }//GEN-LAST:event_firmagoruntuleActionPerformed

    private void anasayfayadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anasayfayadonActionPerformed
        setVisible(false);
        
    }//GEN-LAST:event_anasayfayadonActionPerformed

    private void firmakaydiyapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmakaydiyapActionPerformed
            firmaeklemePanel firmaekle = new firmaeklemePanel();  
        firmaekle.setVisible(true);

    }//GEN-LAST:event_firmakaydiyapActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing


        
    }//GEN-LAST:event_formWindowClosing

    private void firmakaydisilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmakaydisilActionPerformed
        
        firmasilmePanel a = new firmasilmePanel();
        setVisible(false);
        a.setVisible(true);
         
    }//GEN-LAST:event_firmakaydisilActionPerformed

    private void hizmetbedelibelirleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hizmetbedelibelirleActionPerformed
                    
                String input = JOptionPane.showInputDialog("Lütfen bir değer girin:");
                Integer deger = Integer.valueOf(input);
                main1.admin.setHizmetbedeli(deger);
                JOptionPane.showMessageDialog(null, "HİZMET BEDELİ: "+String.valueOf(main1.admin.getHizmetbedeli()), "HİZMET BEDELİ", JOptionPane.INFORMATION_MESSAGE);
                
    }//GEN-LAST:event_hizmetbedelibelirleActionPerformed

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
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anasayfayadon;
    private javax.swing.JButton firmagoruntule;
    private javax.swing.JButton firmakaydisil;
    private javax.swing.JButton firmakaydiyap;
    private javax.swing.JButton hizmetbedelibelirle;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
