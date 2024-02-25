/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prolab;

import java.util.ArrayList;

public class Route {

    private String baslangic;
    private String bitis;
    private int toplamyol;
    private String yolturu;

    public int getToplamyol() {
        return toplamyol;
    }

    public void setToplamyol(int toplamyol) {
        this.toplamyol = toplamyol;
    }

    public String getYolturu() {
        return yolturu;
    }

    public void setYolturu(String yolturu) {
        this.yolturu = yolturu;
    }

    private ArrayList<String> yoldakisehirler = new ArrayList<>();
    private ArrayList<Integer> mesafeler = new ArrayList<>();
    
    
    public Route(String baslangic, String bitis, int sefersayisi, String yolturu) {
        
         
        
        this.yolturu = yolturu;
        this.baslangic = baslangic;
        this.bitis = bitis;

        
    }

    
    
    public ArrayList<String> getYoldakisehirler() {
        return yoldakisehirler;
    }

    public ArrayList<Integer> getMesafeler() {
        return mesafeler;
    }

    public void sehirleribelirle() {

        if(yolturu.equals("dy")) {

            if (bitis.equals("ankara")) {

                yoldakisehirler.add("istanbul");
                mesafeler.add(75);
                yoldakisehirler.add("kocaeli");
                mesafeler.add(150);
                yoldakisehirler.add("bilecik");
                mesafeler.add(75);
                yoldakisehirler.add("eskisehir");
                mesafeler.add(150);
                yoldakisehirler.add("ankara");
                mesafeler.add(150);
                yoldakisehirler.add("eskisehir");
                mesafeler.add(75);
                yoldakisehirler.add("bilecik");
                mesafeler.add(150);
                yoldakisehirler.add("kocaeli");
                mesafeler.add(75);
                yoldakisehirler.add("istanbul");
            
            } else {

                yoldakisehirler.add("istanbul");
                mesafeler.add(75);
                yoldakisehirler.add("kocaeli");
                mesafeler.add(150);
                yoldakisehirler.add("bilecik");
                mesafeler.add(75);
                yoldakisehirler.add("eskisehir");
                mesafeler.add(225);
                yoldakisehirler.add("konya");
                mesafeler.add(225);
                yoldakisehirler.add("eskisehir");
                mesafeler.add(75);
                yoldakisehirler.add("bilecik");
                mesafeler.add(150);
                yoldakisehirler.add("kocaeli");
                mesafeler.add(75);
                yoldakisehirler.add("istanbul");

            }

        } else if (yolturu.equals("ky")) {

            if (bitis.equals("ankara")) {

                yoldakisehirler.add("istanbul");
                mesafeler.add(100);
                yoldakisehirler.add("kocaeli");
                mesafeler.add(400);
                yoldakisehirler.add("ankara");
                mesafeler.add(400);
                yoldakisehirler.add("kocaeli");
                mesafeler.add(100);
                yoldakisehirler.add("istanbul");

            } else {

                yoldakisehirler.add("istanbul");
                mesafeler.add(100);
                yoldakisehirler.add("kocaeli");
                mesafeler.add(200);
                yoldakisehirler.add("eskisehir");
                mesafeler.add(300);
                yoldakisehirler.add("konya");
                mesafeler.add(300);
                yoldakisehirler.add("eskisehir");
                mesafeler.add(200);
                yoldakisehirler.add("kocaeli");
                mesafeler.add(100);
                yoldakisehirler.add("istanbul");

            }

        } else {

            if (bitis.equals("ankara")) {
                yoldakisehirler.add("istanbul");
                mesafeler.add(250);
                yoldakisehirler.add("ankara");
                mesafeler.add(250);
                yoldakisehirler.add("istanbul");
            } else {

                yoldakisehirler.add("istanbul");
                mesafeler.add(300);
                yoldakisehirler.add("konya");
                mesafeler.add(300);
                yoldakisehirler.add("istanbul");
            }

        }

    }

    public String getBaslangic() {
        return baslangic;
    }

    public void setBaslangic(String baslangic) {
        this.baslangic = baslangic;
    }

    public String getBitis() {
        return bitis;
    }

    public void setBitis(String bitis) {
        this.bitis = bitis;
    }
    
    public void toplamyolhesapla(){
        
        this.toplamyol = 0;
        for(Integer A:mesafeler){
            this.toplamyol += A;
        }
    }
    

}
