package org.java.lessons.test;
/*Per i box è riportato il numero di posti auto*/
public class Box extends Immobile {
    // attributi
    private  int carSpots;

    // costruttore

    public Box(String alfaCode, String adress, String cap, String city, int carSpots) {
        super(alfaCode, adress, cap, city);
        this.carSpots = carSpots;
    }

    // g & s
    // metodi
    // tostring

    @Override
    public String toString() {
        return "Box{" +
                "carSpots=" + carSpots +
                '}';
    }
}
