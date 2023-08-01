package org.java.lessons.test;
import  java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MainList {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AgenziaImmobiliare agenzia = new AgenziaImmobiliare();
        try {
            Box box = new Box("aaa","via gluck","20833","Giussano",20,40);
            agenzia.aggiungiImmobile(box);
            Abitazione abitazione= new Abitazione("aaa","via gluck","20833","Giussano",100,10,2);
            agenzia.aggiungiImmobile(abitazione);
            Villa villa = new Villa("aab","via gluck 1a","20833","Giussano",300,20,4,100);
            agenzia.aggiungiImmobile(villa);
            //



            /* TESTS
             System.out.println(agenzia.maggiorInteresse());;
            villa.reimpostaSuperfici(villa.getSurface()*2,100);
            villa.miPiaceImmobile();
            box.miPiaceImmobile();
            System.out.println(villa.getSurface());
            System.out.println(villa.getInterestedPeople());

            agenzia.stampaImmobili();
            System.out.println(agenzia.ricercaAlfanumerico("aaa"));
            System.out.println(agenzia.getImmobili());
            System.out.println(agenzia.maggiorInteresse(agenzia.getImmobili()));
            */
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        scan.close();
    }


}
