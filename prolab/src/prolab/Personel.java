/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prolab;

/**
 *
 * @author emrea
 */
public class Personel extends Person{

    private int para;
    
    public Personel(String name, String surname,int para) {
    
        super(name, surname);
        this.para = para;
    
    }

    public int getPara() {
        return para;
    }

    public void setPara(int para) {
        this.para = para;
    }
    
    
    @Override
    void yazdir() {
        
        System.out.println(this.getName() + " " + this.getSurname() + " " + this.getPara());
        
    }


    
}
