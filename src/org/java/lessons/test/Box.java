package org.java.lessons.test;
/*Per i box è riportato il numero di posti auto*/
public class Box extends Immobile {
    // attributi
    private  int carSpots;

    // costruttore

    public Box(String alfaCode, String adress, String cap, String city,  int surface, int carSpots) {
        super(alfaCode, adress, cap, city,  surface);
        this.carSpots = carSpots;
    }


    // g & s
    // metodi
    // tostring


    @Override
    public String toString() {
        return super.toString()+"Box{" +
                "carSpots=" + carSpots +
                '}';
    }
}
