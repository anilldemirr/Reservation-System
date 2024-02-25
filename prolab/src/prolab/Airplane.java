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
public class Airplane extends Vehicle{

    public Airplane(int id, int yakitfiyati, int yolcusayisi) {
        super(id, yakitfiyati, yolcusayisi);
    }


    @Override
    int yakithesapla(int gun) {
        
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

    @Override
    public void gunlukkarhesabiyap() {

        
    }





    
    
    
    
}
