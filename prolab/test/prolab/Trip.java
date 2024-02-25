/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prolab;

public class Trip {
    private String arac;
    private String guzergah;
    private String time;
    private double fiyat;

    public Trip(String arac, String guzergah, String time, double fiyat) {
        this.arac = arac;
        this.guzergah = guzergah;
        this.time = time;
        this.fiyat = fiyat;
    }

    public String getArac() {
        return arac;
    }

    public void setArac(String arac) {
        this.arac = arac;
    }

    public String getGuzergah() {
        return guzergah;
    }

    public void setGuzergah(String guzergah) {
        this.guzergah = guzergah;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    
    
            
            
}
