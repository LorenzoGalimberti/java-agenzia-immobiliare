package org.java.lessons.test;

public class Villa extends Abitazione{
    //attributi

    private int gardenSurface;
    // costruttore


    public Villa(String alfaCode, String adress, String cap, String city, int interestedPeople, int surface, int vainNumber, int bathroomNumber, int gardenSurface) {
        super(alfaCode, adress, cap, city, interestedPeople, surface, vainNumber, bathroomNumber);
        this.gardenSurface = gardenSurface;
    }

    // g & s



    // metodi
    // overload
    public void reimpostaSuperfici(int surface, int superficieGiardino) {
        this.gardenSurface = superficieGiardino;
        setSurface(surface+superficieGiardino);

    }
}
