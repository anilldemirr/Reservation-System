
package prolab;

import java.util.ArrayList;


public class Company extends User implements IProfitable,Iloginable{
    
    
    private ArrayList<Trip> seferler  = new ArrayList<>(); 
    private ArrayList<Vehicle> araclar = new ArrayList<>();
    
    private static int hizmetbedeli = main1.admin.getHizmetbedeli();

    public ArrayList<Vehicle> getAraclar() {
        return araclar;
    }

    public void setAraclar(ArrayList<Vehicle> araclar) {
        this.araclar = araclar;
    }

    public static int getHizmetbedeli() {
        return hizmetbedeli;
    }

    public static void setHizmetbedeli(int hizmetbedeli) {
        Company.hizmetbedeli = hizmetbedeli;
    }
    
    
    private Vehicle tasit;
    public Company(String kullaniciadi, String sifre) {
        super(kullaniciadi, sifre);
        
    }
   
    public void aracekle(Vehicle arac){
        
        araclar.add(arac);
        
    } 
    
    
    public ArrayList<Trip> getSeferler() {
        return seferler;
    }

    public void setSeferler(ArrayList<Trip> seferler) {
        this.seferler = seferler;
    }

    public Vehicle getTasit() {
        return tasit;
    }

    public void setTasit(Vehicle tasit) {
        this.tasit = tasit;
    }

    @Override
    public void gunlukkarhesabiyap() {
        
           
        Company gecerli = main1.secili;
        ArrayList<Vehicle> araclar = gecerli.getAraclar();
        
        int toplamsayi = 0;
        
        
        for (Vehicle vehicle : araclar) {
            
            ArrayList<Trip> seferler = vehicle.getSeferler();
            
            for(Trip trip: seferler){
                
                if (trip.getTime() == main1.karicingun) {
                    
                    toplamsayi -= vehicle.personeltoplamucret();
                    toplamsayi -= vehicle.yakithesapla(main1.karicingun);
                    toplamsayi -= main1.admin.getHizmetbedeli();
                    
                    toplamsayi += trip.getFiyat();
                    break;
                    
                }
                
                
            }
        
         

    }
        
    }

    @Override
    public boolean sifreuyumlumu(String isim,String pass) {
        
        if(this.getKullaniciadi().equals(isim) && this.getSifre().equals(pass)){
            return true;
            
            
        }else{
            return false;
        }
       
    }



    
    

    
}
