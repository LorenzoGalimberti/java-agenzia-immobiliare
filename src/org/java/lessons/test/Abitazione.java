package org.java.lessons.test;
/*abitazioni è riportato il numero di vani e il numero di bagni*/
public class Abitazione extends  Immobile {
    // attributi
    private int vainNumber;
    private int bathroomNumber;

    // costruttore

    public Abitazione(String alfaCode, String adress, String cap, String city, int surface, int vainNumber, int bathroomNumber) {
        super(alfaCode, adress, cap, city, surface);
        this.vainNumber = vainNumber;
        this.bathroomNumber = bathroomNumber;
    }


    // getter & setter
    // metodi
    // tostring


    @Override
    public String toString() {
        return super.toString()+"Abitazione{" +
                "vainNumber=" + vainNumber +
                ", bathroomNumber=" + bathroomNumber +
                '}';
    }
}
