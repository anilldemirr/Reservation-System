package prolab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

// bir formun kodları okunur ve hemen aşağı satıra geçer ama form açık kalır... burası can alıcı noktadır.. formalar ile işlem yapınca verileri tutabilmemiz için bizim static özellikler ile işlemler yapmamız gerekir...
// mesea Panel a = new Panel(); a.setVisible(true) dedik o zaman ne olur... form açılır ama hemen kod okuma alt satıra geçer bu yüzden form ile işlem yapıncastatic arraylistler ve static değerler ile işlem yapmalıyız... komple sistem dursa bile bizim staticler ile işlem yapmamız gerekir..
// mesela bu mainin en sonunda form.setVisible(true); var bu kod çalışınca panel açıldı ama can alıcı nokta şu= kod okundu panel açıldı ve hemen alt satırdan okumaya devam etti panel açık kaldığı sürece alt satıra geçmemezlik yapmadı...
// bu yüzden form uygulamalarında static çok önemlidir...

// JAVADA formun olayı şu mesela formun adı arabaArama olsun public arabaArama(){  initcompanents(); }   netbeanste componentler o constructor içerisine eklenirler intellijde ise her şey o constrcutor içerisine yazılır...  ikiside aynı olaydır bir farkı yoktur... java ikisinide okur... her şeyin o constructor içerisine yazılması veya bir metot ile yazılması gerekir... kiii o constructor çalışınca her şey ortaya çıksın... form oluşssun...

// mesela contructor çalıştı form açıldı... kodları bitti ve okuma alt satırdan devam etti ne olur ? biz bu bizden ya direkt constructor içerisine yada initcomponents ile actionlistener ekleriz böylece işlem yapınca seçtiğimiz aksiyonlar gerçekleşir constructor oluşup kodları okunup bitmiş olsa bile...
 
import java.util.ArrayList;

public class main1 implements IRevervable{
    
public static int aracid = 1000;
public static int defseciligun = 0;
public static String defbaslangic = "istanbul";
public static String defbitis = "istanbul";
public static int defyolcusayisi = 1;
public static int karicingun = 1;
    public static Company secili = null;
    public static Trip secilisefer = null;
    public static Customer rsanil = null;
    
    public static int cartsayisi = 0;
    public static int eldefiyattoplam = 0;
    public static ArrayList<Integer> secilikoltuklar = new ArrayList<>();
    
    
    public static ArrayList<Company> sirketler = new ArrayList<>();
    
    
    public static ArrayList<Trip> seciliseferler = new ArrayList<>();
    public static Admin admin = new Admin("emreanil", "3436");
    
  

    public static ArrayList<Route> yollar = new ArrayList<>();
    public static ArrayList<Trip> tripler = new ArrayList<>();
    
    public static ArrayList<Bus> otobusler = new ArrayList<>();
    public static ArrayList<Airplane> ucaklar = new ArrayList<>();
    public static ArrayList<Train> trenler = new ArrayList<>();
    

    
    public static void main(String[] args) {
                
        Route route1 = new Route("istanbul", "ankara", 1, "dy");
        Route route2 = new Route("istanbul", "konya", 2, "dy");
        Route route3 = new Route("istanbul", "ankara", 3, "ky");
        Route route4 = new Route("istanbul", "konya", 4, "ky");
        Route route5 = new Route("istanbul", "konya", 5, "hy");
        Route route6 = new Route("istanbul", "ankara", 6, "hy");

        route1.sehirleribelirle();
        route2.sehirleribelirle();
        route3.sehirleribelirle();
        route4.sehirleribelirle();
        route5.sehirleribelirle();
        route6.sehirleribelirle();
        
        
        yollar.add(route1);
        yollar.add(route2);
        yollar.add(route3);
        yollar.add(route4);
        yollar.add(route5);
        yollar.add(route6);


        Company A = new Company("A", "1234");
        
        
        Company B = new Company("B", "1234");

        Company C = new Company("C", "1234");

        Company D = new Company("D", "1234");

        Company F = new Company("F", "1234");
        
    Bus bus1 = new Bus(main1.aracid++,10,20);
    bus1.seferekle(3, 1);
        bus1.seferekle(3, 2);
    bus1.seferekle(3, 3);
    bus1.seferekle(3, 4);
    bus1.seferekle(3, 5);
    bus1.seferekle(3, 6);
    bus1.seferekle(3, 7);
    bus1.setYakitturu("benzin");
    bus1.calisanekle(new Personel("AA","AA",5000));
    bus1.calisanekle(new Personel("BB","BB",5000));
    bus1.calisanekle(new Personel("CC","CC",2000));
    bus1.calisanekle(new Personel("DD","DD",2000));

    
    
    Bus bus2 = new Bus(main1.aracid++,10,15);
        bus2.seferekle(3, 1);
        bus2.seferekle(3, 2);
    bus2.seferekle(3, 3);
    bus2.seferekle(3, 4);
    bus2.seferekle(3, 5);
    bus2.seferekle(3, 6);
    bus2.seferekle(3, 7);
    bus2.setYakitturu("benzin");
    bus2.calisanekle(new Personel("AA","AA",5000));
    bus2.calisanekle(new Personel("BB","BB",5000));
    bus2.calisanekle(new Personel("CC","CC",2000));
    bus2.calisanekle(new Personel("DD","DD",2000));

    
    
    
    Bus bus3 = new Bus(main1.aracid++,5,15);
    bus3.seferekle(3, 1);
        bus3.seferekle(3, 2);
            bus3.seferekle(3, 3);
                bus3.seferekle(3, 4);
                    bus3.seferekle(3, 5);
                        bus3.seferekle(3, 6);
                            bus3.seferekle(3, 7);
    
                                bus3.setYakitturu("mazot");

    bus3.calisanekle(new Personel("AA","AA",3000));
    bus3.calisanekle(new Personel("BB","BB",3000));
    bus3.calisanekle(new Personel("CC","CC",1500));
    bus3.calisanekle(new Personel("DD","DD",1500));                                
                  
                                
                                
                            
    Bus bus4 = new Bus(main1.aracid++,10,20);
    
        bus4.seferekle(4, 1);
            bus4.seferekle(4, 2);
            bus4.seferekle(4, 3);
                    bus4.seferekle(4, 4);
                            bus4.seferekle(4, 5);
                                    bus4.seferekle(4, 6);
                                            bus4.seferekle(4, 7);
            
               bus4.setYakitturu("mazot");
                                 
    bus4.calisanekle(new Personel("AA","AA",3000));
    bus4.calisanekle(new Personel("BB","BB",3000));
    bus4.calisanekle(new Personel("CC","CC",1500));
    bus4.calisanekle(new Personel("DD","DD",1500));                                

    
               
               
               
               
            
    Bus  bus5 = new Bus(main1.aracid++,6,20);
            bus5.seferekle(4, 1);
            bus5.seferekle(4, 2);
            bus5.seferekle(4, 3);
                    bus5.seferekle(4, 4);
                            bus5.seferekle(4, 5);
                                    bus5.seferekle(4, 6);
                                            bus5.seferekle(4, 7);
        bus5.setYakitturu("mazot");

            bus5.calisanekle(new Personel("AA","AA",4000));
    bus5.calisanekle(new Personel("BB","BB",4000));
    bus5.calisanekle(new Personel("CC","CC",2000));
    bus5.calisanekle(new Personel("DD","DD",2000));                                

    
    
        
        
    
    
    Airplane ucak1 = new Airplane(main1.aracid++, 25, 30);
    
    ucak1.seferekle(5,1);
    ucak1.seferekle(5,2);
        ucak1.seferekle(5,3);
            ucak1.seferekle(5,4);
                ucak1.seferekle(5,5);
                    ucak1.seferekle(5,6);
                        ucak1.seferekle(5,7);
    
                        ucak1.setYakitturu("gaz");

                                 ucak1.calisanekle(new Personel("AA","AA",10000));
    ucak1.calisanekle(new Personel("BB","BB",10000));
    ucak1.calisanekle(new Personel("CC","CC",6000));
    ucak1.calisanekle(new Personel("DD","DD",6000));                                
   
    
                        
                        
                        
    Airplane ucak2 = new Airplane(main1.aracid++, 25, 30);
        ucak2.seferekle(5,1);
    ucak2.seferekle(5,2);
        ucak2.seferekle(5,3);
            ucak2.seferekle(5,4);
                ucak2.seferekle(5,5);
                    ucak2.seferekle(5,6);
                        ucak2.seferekle(5,7);
    
                        ucak2.setYakitturu("gaz");
    
                                                         ucak2.calisanekle(new Personel("AA","AA",10000));
    ucak2.calisanekle(new Personel("BB","BB",10000));
    ucak2.calisanekle(new Personel("CC","CC",6000));
    ucak2.calisanekle(new Personel("DD","DD",6000));   
                            
                       
                        
    Train tren1 = new Train(main1.aracid++, 3, 25);
    tren1.seferekle(1,1 );
    tren1.seferekle(1,2 );
        tren1.seferekle(1,3);
            tren1.seferekle(1,4 );    
            tren1.seferekle(1,5 );
                tren1.seferekle(1,6 );
                    tren1.seferekle(1,7 );
    
                    tren1.setYakitturu("elektrik");
                    
                                                             tren1.calisanekle(new Personel("AA","AA",2000));
    tren1.calisanekle(new Personel("BB","BB",2000));
    tren1.calisanekle(new Personel("CC","CC",1000));
    tren1.calisanekle(new Personel("DD","DD",1000));   
                                            
                    
                    
                    
                    
                    
        Train tren2 = new Train(main1.aracid++, 3, 25);
            tren2.seferekle(2,1 );
    tren2.seferekle(2,2 );
        tren2.seferekle(2,3);
            tren2.seferekle(2,4 );    
            tren2.seferekle(2,5 );
                tren2.seferekle(2,6 );
                    tren2.seferekle(2,7 );
                   
                    tren2.setYakitturu("elektrik");
                    
                                                                                 tren2.calisanekle(new Personel("AA","AA",2000));
    tren2.calisanekle(new Personel("BB","BB",2000));
    tren2.calisanekle(new Personel("CC","CC",1000));
    tren2.calisanekle(new Personel("DD","DD",1000));   
                    
                    
                    
     Train tren3 = new Train(main1.aracid++, 3, 25);
     
                tren3.seferekle(2,1 );
    tren3.seferekle(2,2 );
        tren3.seferekle(2,3);
            tren3.seferekle(2,4 );    
            tren3.seferekle(2,5 );
                tren3.seferekle(2,6 );
                    tren3.seferekle(2,7 );
     
                    tren3.setYakitturu("elektrik");
                    
                                                                                 tren3.calisanekle(new Personel("AA","AA",2000));
    tren3.calisanekle(new Personel("BB","BB",2000));
    tren3.calisanekle(new Personel("CC","CC",1000));
    tren3.calisanekle(new Personel("DD","DD",1000));   
                    
     
         Airplane ucak3 = new Airplane(main1.aracid++, 20, 30);
         
         ucak3.seferekle(6,1);
                  ucak3.seferekle(6,2);
                           ucak3.seferekle(6,3);
                                    ucak3.seferekle(6,4);
                                             ucak3.seferekle(6,5);
                                                      ucak3.seferekle(6,6);
                                                               ucak3.seferekle(6,7);
         
                                                               ucak3.setYakitturu("gaz");
         
                                    ucak3.calisanekle(new Personel("AA","AA",7500));
    ucak3.calisanekle(new Personel("BB","BB",7500));
    ucak3.calisanekle(new Personel("CC","CC",4000));
    ucak3.calisanekle(new Personel("DD","DD",4000));   
                                                               
         
    Airplane ucak4 = new Airplane(main1.aracid++, 20, 30);
         ucak4.seferekle(6,1);
                  ucak4.seferekle(6,2);
                           ucak4.seferekle(6,3);
                                    ucak4.seferekle(6,4);
                                             ucak4.seferekle(6,5);
                                                      ucak4.seferekle(6,6);
                                                               ucak4.seferekle(6,7);   
    
                                                               ucak4.setYakitturu("gaz");
                                        ucak4.calisanekle(new Personel("AA","AA",7500));
    ucak4.calisanekle(new Personel("BB","BB",7500));
    ucak4.calisanekle(new Personel("CC","CC",4000));
    ucak4.calisanekle(new Personel("DD","DD",4000));   
                                                               
                                                               
    
    A.aracekle(bus1);
    A.aracekle(bus2);
    B.aracekle(bus3);
    B.aracekle(bus4);
    C.aracekle(bus5);
    
    C.aracekle(ucak1);
    C.aracekle(ucak2);
    D.aracekle(tren1);
    D.aracekle(tren2);
    D.aracekle(tren3);
    F.aracekle(ucak3);
    F.aracekle(ucak4);
       
    
    
    
        sirketler.add(A);
        sirketler.add(B);
        sirketler.add(C);
        sirketler.add(D);
        sirketler.add(F);

        form1 form = new form1();
        form.setVisible(true);
        
        

        
        
 }
    
    
    @Override
    public void rezervasyonyap(Trip trip,int koltuksayisi,String sehir1,String sehir2) {
        
                    int[][] aa = trip.getYolcular();
                    ArrayList<String> sehirler = trip.getGuzergah().getYoldakisehirler();
                    int basindex = 0;
                    int sonindex = 0;
                    int yolcusayisi = trip.getYolcusayisi();
                    int boskoltuksayisi = trip.getBoskoltuksayisi();
                    
                    
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
             
                    
                    
                    for (int i = yolcusayisi - boskoltuksayisi; i < yolcusayisi - boskoltuksayisi + koltuksayisi; i++) {
                        
                        for (int j = basindex; j < sonindex; j++) {
                            
                            aa[i][j] = 1;
                            
                        }
                        
        }
                    
                        
                   
        
    }



    
    
}
