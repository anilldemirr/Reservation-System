
package prolab;

import java.util.ArrayList;


public class Train extends Vehicle{

    public Train(int id, int yakitfiyati, int yolcusayisi) {
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
