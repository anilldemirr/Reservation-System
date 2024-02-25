
package prolab;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class form1 extends javax.swing.JFrame {
    
      
    
    
    firmaeklemePanel d = new firmaeklemePanel();
    
    
    ArrayList<Company> firmalar = d.firmalar;
    
    
    
    public form1() {
         
        initComponents();
        setTitle("ANA PANEL");
        adminpasswordtext.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                // Şifre alanındaki değişiklikleri kontrol et
                String password = new String(adminpasswordtext.getPassword());
                if (password.isEmpty()) {
                    adminpaneliTEXT.setText("ADMİN PANELİ"); // Şifre alanı boşsa label'ı temizle
                } else {
                    adminpaneliTEXT.setText("ŞİFRE GİRİLİYOR..."); // Şifre giriliyorsa label'a mesajı yaz
                }
            }
        }); 
        
            firmagirispass.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                // Şifre alanındaki değişiklikleri kontrol et
                String password = new String(firmagirispass.getPassword());
                if (password.isEmpty()) {
                    firmatextgiris.setText("FİRMA PANELİ"); // Şifre alanı boşsa label'ı temizle
                } else {
                    firmatextgiris.setText("ŞİFRE GİRİLİYOR..."); // Şifre giriliyorsa label'a mesajı yaz
                }
            }
        }); 
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        adminpaneliTEXT = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adminkullaniciaditext = new javax.swing.JTextField();
        adminpasswordtext = new javax.swing.JPasswordField();
        admingirisbuton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        kullanicipanelbuton = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        firmatextgiris = new javax.swing.JLabel();
        jlabel323 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        firmagirispass = new javax.swing.JPasswordField();
        firmagiristext = new javax.swing.JTextField();
        firmagirisbuton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROLAB");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(380, 100, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        adminpaneliTEXT.setForeground(new java.awt.Color(255, 255, 102));
        adminpaneliTEXT.setText("ADMİN PANELİ");

        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setText("ADMİN KULLANICI ADI");

        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("ADMİN ŞİFRE");

        adminkullaniciaditext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminkullaniciaditextActionPerformed(evt);
            }
        });

        admingirisbuton.setText("GİRİŞ YAP");
        admingirisbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admingirisbutonActionPerformed(evt);
            }
        });
        admingirisbuton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                admingirisbutonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminpaneliTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(admingirisbuton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(51, 51, 51))
                                .addComponent(adminpasswordtext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(adminkullaniciaditext, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(304, 304, 304))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminpaneliTEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminkullaniciaditext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(adminpasswordtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admingirisbuton)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 0, 0));
        jPanel2.setToolTipText("");

        kullanicipanelbuton.setBackground(new java.awt.Color(51, 102, 0));
        kullanicipanelbuton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        kullanicipanelbuton.setForeground(new java.awt.Color(255, 255, 51));
        kullanicipanelbuton.setText("BİLET ARA");
        kullanicipanelbuton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        kullanicipanelbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullanicipanelbutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(kullanicipanelbuton, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(kullanicipanelbuton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        firmatextgiris.setForeground(new java.awt.Color(255, 255, 102));
        firmatextgiris.setText("FİRMA PANELİ");

        jlabel323.setForeground(new java.awt.Color(102, 255, 255));
        jlabel323.setText("FİRMA SİFRE");

        jLabel121.setForeground(new java.awt.Color(153, 255, 255));
        jLabel121.setText("FİRMA ADI");

        firmagirispass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmagirispassActionPerformed(evt);
            }
        });

        firmagiristext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmagiristextActionPerformed(evt);
            }
        });

        firmagirisbuton.setText("GİRİŞ YAP");
        firmagirisbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmagirisbutonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab/foto4.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(firmatextgiris, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlabel323, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel121))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firmagirispass, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firmagirisbuton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firmagiristext, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(firmatextgiris)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel121))
                            .addComponent(firmagiristext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlabel323)
                            .addComponent(firmagirispass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firmagirisbuton)
                        .addGap(0, 78, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminkullaniciaditextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminkullaniciaditextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminkullaniciaditextActionPerformed

    private void admingirisbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admingirisbutonActionPerformed
        main1.secili = null;
        main1.secilisefer = null;
        
        String name = adminkullaniciaditext.getText();
        String passw = new String(adminpasswordtext.getPassword());
        
        if (main1.admin.getKullaniciadi().equals(name) && main1.admin.getSifre().equals(passw)) { // String değerlerin eşliğini .equals ile kontrol ederiz...
            adminpaneliTEXT.setText("BAŞARILI GİRİŞ");
            adminpasswordtext.setText("");
            adminkullaniciaditext.setText("");
            
                adminPanel a = new adminPanel();

            a.setVisible(true);

            
            
        }else{
            adminpaneliTEXT.setText("HATALI GİRİŞ");
            adminpasswordtext.setText("");
            adminkullaniciaditext.setText("");
        }
        

        
    }//GEN-LAST:event_admingirisbutonActionPerformed

    private void kullanicipanelbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullanicipanelbutonActionPerformed
        kullaniciPanel c = new kullaniciPanel();
        c.setVisible(true);
    }//GEN-LAST:event_kullanicipanelbutonActionPerformed

    private void firmagiristextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmagiristextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firmagiristextActionPerformed

    private void firmagirisbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmagirisbutonActionPerformed
        
        main1.secilisefer = null;  
        
        String name = firmagiristext.getText();
        String passw = new String(firmagirispass.getPassword());


        Company comp = null;
        
        
        for(Company A:main1.sirketler){
            if (A.getKullaniciadi().equals(name) && A.getSifre().equals(passw)) {
                comp = A;
                break;
            }
            
            
        }
        if (comp == null) {
            firmagiristext.setText("");
            firmagirispass.setText("");
            firmatextgiris.setText("BOYLE BİR FİRMA YOK");
            return;
        }else{
            firmatextgiris.setText("FİRMA PANELİ");
            firmagiristext.setText("");
            firmagirispass.setText("");
        
        main1.secili = comp;
        firmaPanel panel1 = new firmaPanel();

        panel1.setVisible(true);

        
        }
        
        

        
        
        
        
    }//GEN-LAST:event_firmagirisbutonActionPerformed

    private void firmagirispassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmagirispassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firmagirispassActionPerformed

    private void admingirisbutonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_admingirisbutonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_admingirisbutonKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form1().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admingirisbuton;
    private javax.swing.JTextField adminkullaniciaditext;
    private javax.swing.JLabel adminpaneliTEXT;
    private javax.swing.JPasswordField adminpasswordtext;
    private javax.swing.JButton firmagirisbuton;
    private javax.swing.JPasswordField firmagirispass;
    private javax.swing.JTextField firmagiristext;
    private javax.swing.JLabel firmatextgiris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlabel323;
    private javax.swing.JToggleButton kullanicipanelbuton;
    // End of variables declaration//GEN-END:variables
}
