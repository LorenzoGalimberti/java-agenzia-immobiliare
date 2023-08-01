package org.java.lessons.test;
/*
* Gli immobili sono caratterizzati da:
un codice alfanumerico,
indirizzo,
cap,
città
una superficie espressa in mq attraverso un numero intero.
Definire all’interno della classe Immobile un attributo per memorizzare il numero
* di persone interessate all’acquisto e aggiungere un metodo per incrementare questo numero.
*
* Definire nella classe Immobile il metodo reimpostaSuperfici che prende in input la nuova superficie.
Implementare nella classe Villa l’overload di questo metodo. In questo caso prenderà i parametri superficie
*  e superficieGiardino.*/
public class Immobile {
    //attributi
    private  String alfaCode;
    private  String adress;
    private String cap;
    private  String city ;
    private int interestedPeople;
    private int surface;
    // costruttori

    public Immobile(String alfaCode, String adress, String cap, String city, int surface) throws  ArithmeticException{
        // validazioni
        if(surface<0){
            throw new ArithmeticException("metratura inferiore a 0");
        }
        // componenti
        this.alfaCode = alfaCode;
        this.adress = adress;
        this.cap = cap;
        this.city = city;
        this.interestedPeople = 0;
        this.surface = surface;
    }



    // g & s

    public String getAlfaCode() {
        return alfaCode;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int getInterestedPeople() {
        return interestedPeople;
    }

    // set surface


    // metodi

    // tostring

    @Override
    public String toString() {
        return "Immobile{" +
                "alfaCode='" + alfaCode + '\'' +
                ", adress='" + adress + '\'' +
                ", cap='" + cap + '\'' +
                ", city='" + city + '\'' +
                ", interestedPeople=" + interestedPeople +
                '}';
    }

    // reimposta superfici 1
    public void reimpostaSuperfici(int surface) throws  ArithmeticException{
        // validazioni
        if(surface<0){
            throw new ArithmeticException("metratura inferiore a 0");
        }else{
            this.surface= surface;
        }

    }

    // aumenta like di 1
    public  void miPiaceImmobile(){
        this.interestedPeople++;
    }

}
