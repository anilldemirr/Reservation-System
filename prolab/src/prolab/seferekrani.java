package prolab;


import java.time.Duration;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class seferekrani extends javax.swing.JFrame {

    public int tarih = 0;
    public String baslangic = "";
    public String bitis = "";
    public int yolcusayisi = 0;
    
    public int zartsayisi = 0;

    public int getZartsayisi() {
        return zartsayisi;
    }

    public void setZartsayisi(int zartsayisi) {
        this.zartsayisi = zartsayisi;
    }
    
    
     
    public seferekrani() {
        setTitle("SEFER BULMA EKRANI");
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // eğer çarpıya basarsak uygulama kapanmaz dispose ile o açık olan form kapanır...
        verilerigoruntule();
        
          
    }

    public boolean varmi(ArrayList<String> a, String b){

        for (String string : a) {
            if (string.equals(b)) {
                return true;
            }
            
        }
         return false;
       
        
    }
    
    
    public void verilerigoruntule(){
        
        
        DefaultTableModel model = (DefaultTableModel) tablo1.getModel();
        
        
        int i= 0;
        for (Company sirket:main1.sirketler) {

            ArrayList<Vehicle> araclar = sirket.getAraclar();
            
            for(Vehicle arac:araclar){
                 
                ArrayList<Trip> seferler = arac.getSeferler();
                
                for (Trip trip : seferler) { // seferleri tarama....
                    
                                        
                    int izin = 1;
                    
                    
                    if ( varmi(trip.getGuzergah().getYoldakisehirler(), main1.defbaslangic) && varmi(trip.getGuzergah().getYoldakisehirler(), main1.defbitis) ){
                        
                        if(trip.getTime() == main1.defseciligun){
                                                    
                        int[][] aa = trip.getYolcular();
                    ArrayList<String> sehirler = trip.getGuzergah().getYoldakisehirler();
                    int basindex = 0;
                    int sonindex = 0;
                    
                    for(int y = 0; y < sehirler.size(); y++){
                        
                        if (sehirler.get(y).equals(main1.defbaslangic)) {
                            basindex = y;
                            for(int u = y + 1; u < sehirler.size(); u++){
                                
                                if (sehirler.get(u).equals(main1.defbitis)) {
                                    sonindex = u;
                                    break;
                                }
                                
                                
                            }
                            
                            break;
                            
                            
                        }
                        
                        
                        
                    }
                    
                    int eldeolansayisi = 0;
                    
                    for(int bb = 0; bb < trip.getYolcusayisi(); bb++){
                        int izin11 = 1; 
                        for(int yy = basindex; yy < sonindex; yy++){
                            
                            if (aa[bb][yy] == 1) {
                                
                                izin11 = 0;
                                break;
                            }
                            
                            
                        }
                        if (izin11 == 1) {
                            
                            eldeolansayisi++;
                        }
                        
                        
                        
                    }
                    
                    if(main1.defyolcusayisi > eldeolansayisi){
                        continue;
                        
                        
                    }
                    
                    main1.seciliseferler.add(trip);
                    
                    System.out.println(trip.getTime()+" "+trip.getGuzergahnum()+" "+trip.getArac().getId());
                    String turu = "";
                    
                            if (arac instanceof Bus) {
                                turu = "OTOBUS";
                            }else if(arac instanceof Airplane){
                                
                                turu = "UCAK";
                                
                            }else if(arac instanceof Train){
                                
                                turu = "TREN";
                                
                            }
                    String aracidveturu = arac.getId() + " " + turu;
                    String boskoltuksayisi = String.valueOf(eldeolansayisi);
                    String sirketadi = sirket.getKullaniciadi().toUpperCase() + " FİRMASI";
                    String sefernumarasi = String.valueOf(trip.getGuzergahnum());
                    
                    model.setValueAt(aracidveturu, i, 0);
                    model.setValueAt(sirketadi, i, 1);
                    model.setValueAt(boskoltuksayisi, i, 2);
                    model.setValueAt(sefernumarasi, i, 3);
                    
                    i++;
                    
                            // YAZDIRMA            
        System.out.println("---------------YES----------------");            
        for(int ll = 0; ll < trip.getYolcusayisi();ll++){
            
            for (int kk = 0; kk < trip.getGuzergah().getYoldakisehirler().size(); kk++) {
                System.out.print( trip.getYolcular()[ll][kk]+" "); 
            }
            System.out.println("");
                      
        }            
        System.out.println("----------------YES---------------");     
        
        // YAZDIRMA
                    
                    
                        
                            
                            
                            
                        }
                        

                        
                        
                    }
                    

                    
                    
                            
                    
                    

                    
                    
                    
                      
                    
                    

                    
                    
                    
                    
                } // seferleri tarama...
                
                

            }
            
            

        }
        
        
        
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
        odemeyapbuton = new javax.swing.JButton();
        anasayfayadon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablo1 = new javax.swing.JTable();
        koltukbul = new javax.swing.JButton();
        uyari = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(380, 100, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        odemeyapbuton.setBackground(new java.awt.Color(255, 0, 0));
        odemeyapbuton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        odemeyapbuton.setForeground(new java.awt.Color(0, 0, 204));
        odemeyapbuton.setText("ÖDEME YAP");
        odemeyapbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemeyapbutonActionPerformed(evt);
            }
        });

        anasayfayadon.setBackground(new java.awt.Color(255, 0, 0));
        anasayfayadon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        anasayfayadon.setForeground(new java.awt.Color(0, 0, 204));
        anasayfayadon.setText("ANA SAYFAYA DÖN");
        anasayfayadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anasayfayadonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("SEFER VE FİRMA SEÇİMİ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("KOLTUK SEÇİMİ");

        tablo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ARAÇ ID VE TÜRÜ", "ŞİRKET ADI", "BOŞ KOLTUK SAYISI", "SEFER NUMARASI"
            }
        ));
        jScrollPane4.setViewportView(tablo1);

        koltukbul.setBackground(new java.awt.Color(255, 0, 0));
        koltukbul.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        koltukbul.setForeground(new java.awt.Color(0, 0, 204));
        koltukbul.setText("KOLTUK BUL");
        koltukbul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koltukbulActionPerformed(evt);
            }
        });

        uyari.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        uyari.setForeground(new java.awt.Color(255, 0, 0));

        tablo2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "KOLTUK NUMARASI"
            }
        ));
        jScrollPane1.setViewportView(tablo2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(koltukbul, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(anasayfayadon, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(odemeyapbuton, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(169, 169, 169))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(uyari, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(321, 321, 321))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uyari, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(koltukbul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(odemeyapbuton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anasayfayadon)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void anasayfayadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anasayfayadonActionPerformed
        main1.seciliseferler.clear();
        setVisible(false);
    }//GEN-LAST:event_anasayfayadonActionPerformed

    /*
    Sanma şâhım herkesi sen sâdıkâne yâr olur Herkesi sen dost mu sandın belki ol ağyâr olur...
    */
    
    private void koltukbulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koltukbulActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) tablo2.getModel();
        model.setRowCount(0);
        model.setRowCount(40);
        
        
        int sefernum = tablo1.getSelectedRow();
        System.out.println("AAAAA\n"+sefernum+" AAAA\n");
        
        if (sefernum == -1) {
            uyari.setText("SEÇİLİ SEFER YOK...");
             
            return;
        }else{
            
            uyari.setText("");
            Trip a = main1.seciliseferler.get(tablo1.getSelectedRow());
            main1.secilisefer = a;
            System.out.println(a.getTime()+" "+a.getGuzergahnum()+" "+a.getArac().getId());
            
            // BURADAN....
            
                    
                    int[][] aa = a.getYolcular();
                    ArrayList<String> sehirler = a.getGuzergah().getYoldakisehirler();
                    int basindex = 0;
                    int sonindex = 0;
                    int yolcusayisi = a.getYolcusayisi();
                    int boskoltuksayisi = a.getBoskoltuksayisi();
                    
                    
                    for(int y = 0; y < sehirler.size(); y++){
                        
                        if (sehirler.get(y).equals(main1.defbaslangic)) {
                            basindex = y;
                            for(int u = y + 1; u < sehirler.size(); u++){
                                
                                if (sehirler.get(u).equals(main1.defbitis)) {
                                    sonindex = u;
                                    break;
                                }
                                
                                
                            }
                            
                            break;
                            
                            
                        }
                        
                        
                        
                    }
                    
                    System.out.println("..............................");
                    for(int bb = 0; bb < a.getYolcusayisi(); bb++){
                        for(int yy = 0; yy < sehirler.size() ;yy++){
                            
                            
                            System.out.print(aa[bb][yy]+" ");
                            
                            
                        }
                        System.out.println("");
        
                        
                        
                        
                    }
                    
                    
                    
                                        
                    System.out.println("..............................");
                    
                    
                    int ii = 0;
                    for(int bb = 0; bb < a.getYolcusayisi(); bb++){
                        int izin11 = 1; 
                        for(int yy = basindex; yy < sonindex; yy++){
                            
                            if (aa[bb][yy] == 1) {
                                
                                izin11 = 0;
                                break;
                            }
                            
                            
                        }
                        if (izin11 == 1) {
                           
                         model.setValueAt(String.valueOf(bb+1),ii, 0);
                         ii++;
                        }
                        
                        
                        
                    }
                    
                    
                    
                    
                    
                    
            
            
            
            
            
            
            
                    

               
            // BURAYA...        
                    
                    
        }
        
        
    }//GEN-LAST:event_koltukbulActionPerformed
    
    
    public void islemyap(){

    }
    
    
    private void odemeyapbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemeyapbutonActionPerformed
            
               
        Transport nesne = new Transport();
        nesne.rezervasyonyap(main1.secilisefer, main1.defyolcusayisi, main1.defbaslangic, main1.defbitis);
        
        Reservation rs = new Reservation();
         
         Customer cs = new Customer("emre","anil","12.10.2000","111111111111");
         rs.setCustomersecili(cs);
         main1.rsanil = cs;
        
         int fiyattoplam = 0;
         System.out.println(main1.defyolcusayisi+".....YOLCUSAYİSİ....\n");
         
            for (int i = 0; i < main1.defyolcusayisi; i++) {
            
            main1.eldefiyattoplam += main1.secilisefer.fiyatbelirle(main1.defbaslangic, main1.defbitis);
           /*
            String input = JOptionPane.showInputDialog("YOLCU DEĞERLERİNİ GİRİNİZ(AD SOYAD TC DOĞUM TARİHİ):");
            
            
            String[] degerler = input.split(" ");
            cs.passengerekle(degerler[0], degerler[1], degerler[1], degerler[2]);
            */
            
        }  
        
           odemePanel a = new odemePanel();
           a.setVisible(true);
           
        main1.seciliseferler.clear();
        setVisible(false); 
        
    }//GEN-LAST:event_odemeyapbutonActionPerformed

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
            java.util.logging.Logger.getLogger(seferekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seferekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seferekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seferekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seferekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anasayfayadon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton koltukbul;
    private javax.swing.JButton odemeyapbuton;
    private javax.swing.JTable tablo1;
    private javax.swing.JTable tablo2;
    private javax.swing.JLabel uyari;
    // End of variables declaration//GEN-END:variables
}
