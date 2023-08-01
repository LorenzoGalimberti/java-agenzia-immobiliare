package org.java.lessons.test;

public class Villa extends Immobile{
    //attributi
    private int vainNumber;
    private int bathroomNumber;
    private int gardenSurface;
    // costruttore

    public Villa(String alfaCode, String adress, String cap, String city, int vainNumber, int bathroomNumber, int gardenSurface) {
        super(alfaCode, adress, cap, city);
        this.vainNumber = vainNumber;
        this.bathroomNumber = bathroomNumber;
        this.gardenSurface = gardenSurface;
    }

    // g & s
    // metodi
    // overload
    public void reimpostaSuperfici(int surface, int superficieGiardino) {
        setSurface(surface);
        this.gardenSurface = superficieGiardino;
    }
}
