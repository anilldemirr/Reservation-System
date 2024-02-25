package prolab;

import java.time.LocalDate;
import java.util.ArrayList;


public class Customer {
    
    
    private String name;
    private String surname;
    private String date;
    private String TC;
    
    
    
    private ArrayList<Passanger> yolcular = new ArrayList<>();

    public void passengerekle(Passanger a){
        yolcular.add(a);
        
        
        
    }
    
    public void passengerekle(String name, String surname,String TC,String dogumtarihi){
        yolcular.add(new Passanger(name,surname,TC,dogumtarihi));
        
    }
    
    public void yolcuekle(String name, String surname,String TC,String dogumtarihi){
        
        
        yolcular.add(new Passanger(name, surname, TC, dogumtarihi));
        
        
    }
    
    
    public void yolcuekle(Passanger e){
        
        yolcular.add(e);
        
        
    }
    
    
    public ArrayList<Passanger> getYolcular() {
        return yolcular;
    }

    public void setYolcular(ArrayList<Passanger> yolcular) {
        this.yolcular = yolcular;
    }
    
    
    
    
    public Customer(String name, String surname, String tarih, String TC) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.TC = TC;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }
    
    
    
    
}
