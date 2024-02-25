/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prolab;


public class Admin extends User implements Iloginable{
    
    private int hizmetbedeli = 1000;
    
    public Admin(String kullaniciadi, String sifre) {
        super(kullaniciadi, sifre);
        
    }
    
    public int getHizmetbedeli() {
        return hizmetbedeli;
    }

    public void setHizmetbedeli(int hizmetbedeli) {
        this.hizmetbedeli = hizmetbedeli;
    }

    @Override
    public boolean sifreuyumlumu(String isim,String pass) {
         if (pass.equals(this.getSifre()) && this.getKullaniciadi().equals(isim)) {
             return true;
            
        }
         return false;
    }


    
    
}
