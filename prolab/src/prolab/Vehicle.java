

package prolab;

import java.util.ArrayList;


public abstract class Vehicle implements IProfitable{
    
    public ArrayList<Personel> calisanlar = new ArrayList<>();
    public ArrayList<Trip> seferler = new ArrayList<>();
    
    
    
    public int personeltoplamucret(){
        int toplam = 0;
        for(Personel a:calisanlar){
            
            toplam += a.getPara();
            
        }
        
        return toplam;
        
    }
    
    public void calisanekle(Personel a){
        calisanlar.add(a);
    }
    
    public void calisanekle(String name,String surname,int maas){
        
        calisanlar.add(new Personel(name, surname, maas));
    }
    
    
    private String yakitturu;

    public String getYakitturu() {
        return yakitturu;
    }

    public void setYakitturu(String yakitturu) {
        this.yakitturu = yakitturu;
    }

    public int getSefergunu() {
        return sefergunu;
    }

    public void setSefergunu(int sefergunu) {
        this.sefergunu = sefergunu;
    }
    
    
    public ArrayList<Trip> getSeferler() {
        return seferler;
    }

    public void setSeferler(ArrayList<Trip> seferler) {
        this.seferler = seferler;
    }
    
    private int id;
    private int yakitfiyati;
    private int yolcusayisi;
    private int sefer;
    private int sefergunu;
    private int dolukoltuksayisi = 0;
    private int boskoltuksayisi = 0;

    public int getSefer() {
        return sefer;
    }

    public void setSefer(int sefer) {
        this.sefer = sefer;
    }

    public int getDolukoltuksayisi() {
        return dolukoltuksayisi;
    }

    public void setDolukoltuksayisi(int dolukoltuksayisi) {
        this.dolukoltuksayisi = dolukoltuksayisi;
    }

    public int getBoskoltuksayisi() {
        return boskoltuksayisi;
    }

    public void setBoskoltuksayisi(int boskoltuksayisi) {
        this.boskoltuksayisi = boskoltuksayisi;
    }
    
    
    
    public Vehicle(int id,int yakitfiyati,int yolcusayisi) {
        this.id = id;
        this.yakitfiyati = yakitfiyati;
        this.yolcusayisi = yolcusayisi;
    }
    
    
    public void sefercikar(int sefergunu){
        
        for (int i = 0; i < seferler.size(); i++) {
            if (seferler.get(i).getTime() == sefergunu)  {
                seferler.remove(i);
                return;
            }
            
        }
        
        
    }
    
    public void seferekle(int sefer1,int sefergunu1){
        
        Trip trip = new Trip(sefer1, sefergunu1);
        trip.setArac(this);
        trip.setYolcusayisi(this.getYolcusayisi());
        
        
        
        seferler.add(trip);
        
        
        
    }

    public ArrayList<Personel> getCalisanlar() {
        return calisanlar;
    }

    public void setCalisanlar(ArrayList<Personel> calisanlar) {
        this.calisanlar = calisanlar;
    }
    
    


        int yakithesapla1(int gun) {
        
        ArrayList<Trip> seferler = this.getSeferler();
        Trip secili11 = null;
        
        for(Trip trip:seferler){
            
            if (trip.getTime() == gun) {
                secili11 = trip;
                break;
            }
            
            
        }
        
        Route toplammesafe = secili11.getGuzergah();
        int toplammesafe1 = toplammesafe.getToplamyol();
        
        int yakitfiyati = this.getYakitfiyati();
        
        return toplammesafe1 * yakitfiyati;
        
        
        

    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYakitfiyati() {
        return yakitfiyati;
    }

    public void setYakitfiyati(int yakitfiyati) {
        this.yakitfiyati = yakitfiyati;
    }


    public int getYolcusayisi() {
        return yolcusayisi;
    }

    public void setYolcusayisi(int yolcusayisi) {
        this.yolcusayisi = yolcusayisi;
    }
    
    


    abstract int yakithesapla(int gun);

    
    
    
    
    
    
    
}
