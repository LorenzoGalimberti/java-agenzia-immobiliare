package org.java.lessons.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner
        Scanner scan = new Scanner(System.in);

        // body
        Box box = new Box("aaa","via gluck","20833","Giussano",0,40,2);
        Abitazione abitazione= new Abitazione("aaa","via gluck","20833","Giussano",0,100,10,2);
        Villa villa = new Villa("aab","via gluck 1a","20833","Giussano",0,300,20,4,100);


        System.out.println(villa.getInterestedPeople());
        System.out.println(villa.getSurface());
        villa.reimpostaSuperfici(villa.getSurface()*2,100);

        System.out.println(villa.getSurface());



        // close scanner
        scan.close();
    }
}
