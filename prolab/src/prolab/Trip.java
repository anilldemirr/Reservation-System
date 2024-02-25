package prolab;

import java.util.ArrayList;
import java.util.Random;

public class Trip {
    
    public static Random random1 = new Random();
    private Vehicle arac;
    private Route guzergah;
    private int time;

    private int guzergahnum;
    private int yolcusayisi = 0;
    private int boskoltuksayisi = 0;
    
    private int fiyat = 0; 
    
    

    
    
    public ArrayList<String> sehirler = null;
    
    private int[][] yolcular;

    public int getBoskoltuksayisi() {
        return boskoltuksayisi;
    }

    public void setBoskoltuksayisi(int boskoltuksayisi) {
        this.boskoltuksayisi = boskoltuksayisi;
    }

    public int getYolcusayisi() {
        return yolcusayisi;
    }

    public void setYolcusayisi(int yolcusayisi) {
        
        
        sehirler = this.guzergah.getYoldakisehirler();
        
        this.yolcusayisi = yolcusayisi;
        yolcular = new int[yolcusayisi][sehirler.size()];
        
        
        Random random = new Random();
        int randomNumber = random.nextInt(yolcusayisi);
        this.boskoltuksayisi = this.yolcusayisi - randomNumber;
        
                
        for(int i = 0; i < yolcusayisi;i++ ){
            
            for(int j = 0; j < sehirler.size();j++){
                
                yolcular[i][j] = 0;
                
            }
            
            
        }
        
        
        for(int i = yolcusayisi - boskoltuksayisi; i < yolcusayisi;i++ ){
            
            for(int j = 0; j < sehirler.size();j++){
                
                yolcular[i][j] = 1;
                
            }
            
            
        }
        
        for(int i = yolcusayisi - boskoltuksayisi; i < yolcusayisi;i++ ){
            
            
            yolcular[i][random.nextInt(sehirler.size())] = 0; 
            
             
            
        }
        
        
        System.out.println(this.getBoskoltuksayisi() +" AAAAAA");
        System.out.println(this.getYolcusayisi() + " AAAAAAA");
        
        int yyu = this.getYolcusayisi() - this.getBoskoltuksayisi();
        
        
        this.fiyat = yyu * 450;

        
        
        
                
        
        
        
    }

    public int[][] getYolcular() {
        return yolcular;
    }

    public void setYolcular(int[][] yolcular) {
        this.yolcular = yolcular;
    }
    
    
    
    
    public int getGuzergahnum() {
        return guzergahnum;
    }

    public void setGuzergahnum(int guzergahnum) {
        this.guzergahnum = guzergahnum;
    }
    
    public Trip(int guzergah1, int time) { // 1 2 3 4 5 6 7  olacak zaman...

        guzergahnum = guzergah1;
        this.time = time;
        

        
        if (guzergah1 == 1) {
            
            guzergah = main1.yollar.get(0);
            
        }else if (guzergah1 == 2) {
            
                        guzergah = main1.yollar.get(1);

        }else if(guzergah1 == 3){
            
                        guzergah = main1.yollar.get(2);

        } else if(guzergah1 == 4){
            
                        guzergah = main1.yollar.get(3);

        }else if(guzergah1 == 5){
                        guzergah = main1.yollar.get(4);

        }else{
            
                        guzergah = main1.yollar.get(5);

        }
            
           

        
        
    }
    
        public int fiyatbelirle(String baslangic,String bitis){
        
        
        
        if (arac instanceof Bus) {
            
if (baslangic.equals("istanbul") && bitis.equals("kocaeli")) {
                this.fiyat += 50;
                return 50;
             
            }else if(bitis.equals("istanbul") && baslangic.equals("kocaeli")){
                this.fiyat += 50;
                return 50;
            }else if (baslangic.equals("istanbul") && bitis.equals("ankara")){
                this.fiyat += 300;
                return 300;
            }else if (bitis.equals("istanbul") && baslangic.equals("ankara")){
                 this.fiyat += 300;
                return 300;
            }else if (baslangic.equals("istanbul") && bitis.equals("eskisehir")){
                 this.fiyat += 150;
                return 150;
            }else if (bitis.equals("istanbul") && baslangic.equals("eskisehir")){
                 this.fiyat += 150;
                return 150;
            }else if (baslangic.equals("istanbul") && bitis.equals("konya")){
                this.fiyat += 300;
                return 300;
            }else if (bitis.equals("istanbul") && baslangic.equals("konya")){
                this.fiyat += 300;
                return 300;
            }
            
            else if (baslangic.equals("kocaeli") && bitis.equals("ankara")){
                this.fiyat += 400;
                return 400;
            }else if (bitis.equals("kocaeli") && baslangic.equals("ankara")){
                this.fiyat += 400;
                return 400;
            }else if (baslangic.equals("kocaeli") && bitis.equals("eskisehir")){
                this.fiyat += 100;
                return 100;
            }else if (bitis.equals("kocaeli") && baslangic.equals("eskisehir")){
                                this.fiyat += 100;

                return 100;
            }else if (baslangic.equals("kocaeli") && bitis.equals("konya")){
                                this.fiyat +=250;

                return 250;
            }else if (bitis.equals("kocaeli") && baslangic.equals("konya")){
                                this.fiyat += 250;

                return 250;
            }
            
            else if (baslangic.equals("eskisehir") && bitis.equals("konya")){
                this.fiyat += 150;
                return 150;
            }else if (bitis.equals("eskisehir") && baslangic.equals("konya")){
                this.fiyat += 150;
                return 150;
            }

            
            
            
            
            
            
            
        }else if(arac instanceof Train){
            
             if (baslangic.equals("istanbul") && bitis.equals("kocaeli")){
                            this.fiyat += 50;
                 return 50;
            }else if (bitis.equals("istanbul") && baslangic.equals("kocaeli")){
                                            this.fiyat += 50;

                return 50;
            }else if (baslangic.equals("istanbul") && bitis.equals("bilecik")){
                                this.fiyat += 150;
                return 150;
            }else if (bitis.equals("istanbul") && baslangic.equals("bilecik")){
                                this.fiyat += 150;
                return 150;
            }else if (baslangic.equals("istanbul") && bitis.equals("ankara")){
                                this.fiyat += 250;
                return 250;
            }else if (bitis.equals("istanbul") && baslangic.equals("ankara")){
                                this.fiyat += 250;
                return 250;
            }else if (baslangic.equals("istanbul") && bitis.equals("eskisehir")){
                                this.fiyat += 200;
                return 200;
            }else if (bitis.equals("istanbul") && baslangic.equals("eskisehir")){
                                this.fiyat += 200;
                return 200;
            }else if (baslangic.equals("istanbul") && bitis.equals("konya")){
                this.fiyat += 300;
                return 300;
            }else if (bitis.equals("istanbul") && baslangic.equals("konya")){
                this.fiyat += 300;
                return 300;
            }
            
            else if (baslangic.equals("kocaeli") && bitis.equals("bilecik")){
                this.fiyat += 50;
                return 50;
            }else if (bitis.equals("kocaeli") && baslangic.equals("bilecik")){
                                this.fiyat += 50;

                return 50;
            }else if (baslangic.equals("kocaeli") && bitis.equals("ankara")){
                                this.fiyat += 200;

                return 200;
            }else if (bitis.equals("kocaeli") && baslangic.equals("ankara")){
                                this.fiyat += 200;

                return 200;
            }else if (baslangic.equals("kocaeli") && bitis.equals("eskisehir")){
                                this.fiyat += 100;

                return 100;
            }else if (bitis.equals("kocaeli") && baslangic.equals("eskisehir")){
                                this.fiyat += 100;

                return 100;
            }else if (baslangic.equals("kocaeli") && bitis.equals("konya")){
                                this.fiyat += 250;

                return 250;
            }else if (bitis.equals("kocaeli") && baslangic.equals("konya")){
                                this.fiyat += 250;

                return 250;
            }
            
            else if (baslangic.equals("bilecik") && bitis.equals("ankara")){
                this.fiyat += 150;
                return 150;
            }else if (bitis.equals("bilecik") && baslangic.equals("ankara")){
                this.fiyat += 150;
                return 150;
            }else if (baslangic.equals("bilecik") && bitis.equals("eskisehir")){
                this.fiyat += 50;
                return 50;
            }else if (bitis.equals("bilecik") && baslangic.equals("eskisehir")){
                this.fiyat += 50;
                return 50;
            }else if (baslangic.equals("bilecik") && bitis.equals("konya")){
                this.fiyat += 200;
                return 200;
            }else if (bitis.equals("bilecik") && baslangic.equals("konya")){
                this.fiyat += 200;
                return 200;
            }
            
            else if (baslangic.equals("ankara") && bitis.equals("eskisehir")){
                this.fiyat += 100;
                return 100;
            }else if (bitis.equals("ankara") && baslangic.equals("eskisehir")){
                this.fiyat += 100;
                return 100;
            }
            
            else if (baslangic.equals("eskisehir") && bitis.equals("konya")){
                this.fiyat += 150;
                return 150;
            }else if (bitis.equals("eskisehir") && baslangic.equals("konya")){
                this.fiyat += 150;
                return 150;
            }

            
            
            
            
        }else{
            
            if(baslangic.equals("istanbul") && bitis.equals("konya")){
                this.fiyat +=  1200;
                return 1200;
            }else if(bitis.equals("istanbul") && baslangic.equals("konya")){
                                this.fiyat += 1200;
  
                return 1200;
            }else if(baslangic.equals("istanbul") && bitis.equals("ankara")){
                                this.fiyat += 1000;

                return 1000;
            }else if(bitis.equals("istanbul") && baslangic.equals("ankara")){
                                this.fiyat += 1000;

                return 1000;
                
            }
            
            
        }
        
        
        
        
        return 5;
        
        
        
    }
    
    
    

    public Vehicle getArac() {
        return arac;
    }

    public void setArac(Vehicle arac) {
        this.arac = arac;
    }  

    public Route getGuzergah() {
        return guzergah;
    }

    public void setGuzergah(Route guzergah) {
        this.guzergah = guzergah;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }


    
    
            
            
}
