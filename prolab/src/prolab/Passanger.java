package prolab;

public class Passanger extends Person{
    private String tc;
    private String dogumtarihi;
    
    
    
    
    public Passanger(String name, String surname,String TC,String dogumtarihi) {
        super(name, surname);
        this.dogumtarihi = dogumtarihi;

        this.tc = TC;
    }

    public String getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }

    
    @Override
    void yazdir() {
        System.out.println(this.getName() + " " +this.getSurname());
        
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }
 
    
}
