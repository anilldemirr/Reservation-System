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
public class Transport implements IRevervable{
    
    private Company[] sirketler;
    private Route rota;

    public Transport(){
        
    }
    public Transport(Company[] sirketler, Route rota) {
        this.sirketler = sirketler;
        this.rota = rota;
    }

    public Company[] getSirketler() {
        return sirketler;
    }

    public void setSirketler(Company[] sirketler) {
        this.sirketler = sirketler;
    }

    public Route getRota() {
        return rota;
    }

    public void setRota(Route rota) {
        this.rota = rota;
    }




    @Override
    public void rezervasyonyap(Trip trip,int koltuksayisi,String sehir1,String sehir2) {
        
                    int[][] aa = trip.getYolcular();
                    ArrayList<String> sehirler = trip.getGuzergah().getYoldakisehirler();
                    int basindex = 0;
                    int sonindex = 0;
                    int yolcusayisi = trip.getYolcusayisi();
                    int boskoltuksayisi = trip.getBoskoltuksayisi();
                    
                    System.out.println("JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ");
                    System.out.println(koltuksayisi);
                    System.out.println("JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ");
                    
                    System.out.println(trip.getBoskoltuksayisi()+"\n");
                    
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
                    
                    System.out.println("BAS İNDEX: " +basindex);
                    System.out.println("SON İNDEX: "+sonindex);
                    
                       
                        int doldurma = 0;
                        int temenni = 1;
                        for(int bb = 0; bb < trip.getYolcusayisi(); bb++){

                            int izin11 = 1; 
                            
                            for(int yy = basindex; yy < sonindex; yy++){
                                
                                if(aa[bb][yy] == 1){
                                    
                                    izin11 = 0;
                                    break;
                                }
                                
                        }
                            
                        if(izin11 == 1){
                            
                        for(int yy = basindex; yy < sonindex; yy++){
                                aa[bb][yy] = 1;

                               
                                                            
                        }
                        doldurma++;
                        if(doldurma == koltuksayisi){
                                   temenni = 0;
                                   break;
                                   
                               }          
                            
                            
                        }
                        
                        if(temenni == 0){
                            break;
                        }
                            
                            
                    }
                        
                        
                        System.out.println("YYYYYYYYYYYYYYYYYYYYYYYYYYYyy");
                        System.out.println(doldurma);
                        System.out.println("YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY");
                    
        System.out.println("---------------OK----------------");            
        for(int i = 0; i < trip.getYolcusayisi();i++){
            
            for (int t = 0; t < sehirler.size(); t++) {
                System.out.print( aa[i][t]+" "); 
            }
            System.out.println("");
                      
        }            
        System.out.println("----------------OK---------------");            
            
                    
                        
         
        
    }


    
    
}
