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
            if(checkCode== i.getAlfaCode()){
               return i;
            }
        }
        return  null;
    }
    // maggior numero di persone interessate

    public Immobile maggiorInteresse(){
        Immobile appoggio= null;
        int max=0;
        for(Immobile i : immobili){
            if(i.getInterestedPeople()>= max){
                max=i.getInterestedPeople();
                appoggio=i;
            }
        }
        return appoggio;
    }
}
