package org.java.lessons.test;

public class Villa extends Abitazione{
    //attributi

    private int gardenSurface;
    // costruttore


    public Villa(String alfaCode, String adress, String cap, String city, int surface, int vainNumber, int bathroomNumber, int gardenSurface) {
        super(alfaCode, adress, cap, city,  surface, vainNumber, bathroomNumber);
        this.gardenSurface = gardenSurface;
    }

    // g & s



    // metodi
    // tostring

    @Override
    public String toString() {
        return super.toString()+"Villa{" +
                "gardenSurface=" + gardenSurface +
                '}';
    }

    // overload
    public void reimpostaSuperfici(int surface, int superficieGiardino) {
        this.gardenSurface = superficieGiardino;
        setSurface(surface+superficieGiardino);

    }
}
