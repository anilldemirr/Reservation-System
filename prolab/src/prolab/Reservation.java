/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prolab;

import java.util.ArrayList;

/**
 *
 * @author emrea
 */
public class Reservation {
      
      public Customer customersecili = null;
     
      private Trip trip;
      private int koltuksayisi;
      private String bas;
      private String son;
     
      
       public Reservation(Trip trip,int koltuksayisi,String sehir1,String sehir2){
           this.trip = trip;
           this.koltuksayisi = koltuksayisi;
           this.bas = sehir1;
           this.son = sehir2;
           
       }
       
       public Reservation(){
           
       }
       

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public int getKoltuksayisi() {
        return koltuksayisi;
    }

    public void setKoltuksayisi(int koltuksayisi) {
        this.koltuksayisi = koltuksayisi;
    }

    public String getBas() {
        return bas;
    }

    public void setBas(String bas) {
        this.bas = bas;
    }

    public String getSon() {
        return son;
    }

    public void setSon(String son) {
        this.son = son;
    }

    public Customer getCustomersecili() {
        return customersecili;
    }

    public void setCustomersecili(Customer customersecili) {
        this.customersecili = customersecili;
    }
    

 
public static void rezervasyonyap(Trip trip,int koltuksayisi,String sehir1,String sehir2) {
        
                    
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
