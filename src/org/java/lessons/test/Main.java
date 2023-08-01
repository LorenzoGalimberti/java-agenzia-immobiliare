package org.java.lessons.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner
        Scanner scan = new Scanner(System.in);

        // body

        AgenziaImmobiliare agenzia = new AgenziaImmobiliare();
        Box box = new Box("aaa","via gluck","20833","Giussano",0,40,2);
        agenzia.aggiungiImmobile(box);
        Abitazione abitazione= new Abitazione("aaa","via gluck","20833","Giussano",0,100,10,2);
        agenzia.aggiungiImmobile(abitazione);
        Villa villa = new Villa("aab","via gluck 1a","20833","Giussano",0,300,20,4,100);
        agenzia.aggiungiImmobile(villa);

        System.out.println(villa.getInterestedPeople());
        System.out.println(villa.getSurface());
        villa.reimpostaSuperfici(villa.getSurface()*2,100);
        villa.miPiaceImmobile();
        box.miPiaceImmobile();
        System.out.println(villa.getSurface());
        System.out.println(villa.getInterestedPeople());

        agenzia.stampaImmobili();
        System.out.println(agenzia.ricercaAlfanumerico("aaa"));
        System.out.println(agenzia.getImmobili());
        System.out.println(agenzia.maggiorInteresse(agenzia.getImmobili()));

        // close scanner
        scan.close();
    }
}
