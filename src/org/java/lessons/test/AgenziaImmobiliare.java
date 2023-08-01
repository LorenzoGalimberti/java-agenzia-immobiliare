package org.java.lessons.test;

import java.util.ArrayList;
import java.util.List;

/*Definire una classe AgenziaImmobiliare che contiene una lista di immobili e presenta
un metodo per aggiungere un immobile
un metodo per la ricerca di un immobile a partire dal codice alfanumerico
un metodo per restituire l’immobile che ha avuto il maggior numero di persone interessate
*/
public class AgenziaImmobiliare {
    //  attributi
    private List<Immobile> immobili;
    // costruttori
    public AgenziaImmobiliare() {

        immobili=new ArrayList<>();
    }
    // g e s

    public List<Immobile> getImmobili() {
        return immobili;
    }

    // metodi
    // stampa immobili
    public void stampaImmobili(){
        for(Immobile i : immobili){
            System.out.println(i.toString());

        }
    }

    // aggiungere immobile
    public void aggiungiImmobile(Immobile immobile) {
        immobili.add(immobile);
    }
    // ricerca di immmobile da codice alfanumerico
    public Immobile ricercaAlfanumerico(String checkCode){
        for(Immobile i : immobili){
            if(checkCode.equals(i.getAlfaCode())){
               return i;
            }
        }
        return  null;
    }
    // maggior numero di persone interessate

    public  List<Immobile> maggiorInteresse() {
        List<Immobile> maxInteresse = new ArrayList<>();
        int max = 0;

        for (Immobile i : immobili) {
            int interessati = i.getInterestedPeople();
            if (interessati > max) {
                max = interessati;
                maxInteresse.clear(); // Rimuoviamo gli elementi precedenti dalla lista
                maxInteresse.add(i);  // Aggiungiamo l'attuale oggetto con il massimo interesse
            } else if (interessati == max) {
                maxInteresse.add(i); // Aggiungiamo l'attuale oggetto alla lista in caso di like uguali
            }
        }

        return maxInteresse;
    }
}
