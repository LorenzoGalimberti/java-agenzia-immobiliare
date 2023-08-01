package org.java.lessons.test;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        AgenziaImmobiliare agenzia = new AgenziaImmobiliare();
        boolean flag=false;
        while(!flag){
            System.out.print("vuoi inserire un immobile (Y)  ? :");
            String answer = scan.nextLine();
            if(answer.equalsIgnoreCase("Y")){
                System.out.print(" INSERISCI IMMOBLILE !!");
                System.out.print("Quale tipo di immobile vuoi inserire (1-box) (2-abitazione) (3-villa");
                String tipoRisposta= scan.nextLine();
                System.out.print(" inserisci il codice alfanumerico");
                String alfanumerico= scan.nextLine();
                System.out.print(" inserisci l'indirizzo");
                String indirizzo= scan.nextLine();
                System.out.print(" inserisci il cap");
                String cap= scan.nextLine();
                System.out.print(" inserisci la città");
                String city= scan.nextLine();

                System.out.print(" inserisci la superficie in metri quadri : ");
                int superficie= scan.nextInt();
                scan.nextLine();

                switch (tipoRisposta){
                    case "1":
                        System.out.print("inserisci il numero di posti auto : ");
                        int postiAuto= scan.nextInt();
                        scan.nextLine();
                        // costruisci
                        Immobile box = new Box(alfanumerico,indirizzo,cap,city,superficie,postiAuto);
                        // aggiungi all agenzia
                        agenzia.aggiungiImmobile(box);


                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    default:
                        System.out.println("comando non valido");
                }

            }else {
                flag=true;
            }
        }
        // menu interattivo
        System.out.println(" BENVENUTO NEL MENU ");
        System.out.println("cosa vuoi fare ?");
        System.out.println("1. ricerca immobile per codice alfanumerico");

        System.out.println("2. stampa l'immobile più 'ricercato'");
        System.out.println("3. esci'");
        boolean esci = false;
        while (!esci){
            System.out.print("inserisci l' opzione :");
            String rispostaMenu= scan.nextLine();
            switch (rispostaMenu){
                case"1":
                    System.out.print("inserisci il codice alfanumerico da cercare : ");
                    String alfaSearch= scan.nextLine();
                    System.out.println(agenzia.ricercaAlfanumerico(alfaSearch).toString());
                    System.out.print("vuoi mettere mi piace (Y)?");
                    String miPiace= scan.nextLine();
                    if(miPiace.equalsIgnoreCase("Y")){
                        agenzia.ricercaAlfanumerico(alfaSearch).miPiaceImmobile();
                    }

                    break;

                case "2":
                    System.out.println("l'immobile più ricercato è : "+ agenzia.maggiorInteresse());
                    break;
                case "3":
                    System.out.println("BYE BYE");
                    esci=true;
                    break;
                default:
                    break;
            }
        }







    }
}
