package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Persoon p = new Persoon();

        Persoon p2  = new Persoon();  // Een 2de object van eenzelfde klasse.


        Persoon[] personen = new Persoon[3];  // Een array van een bepaalde klasse. In de array steken verschillende objecten van een klasse.


        System.out.print("Wat is je voornaam? ");

        String voornaam = scanner.nextLine();

        p.setVoornaam(voornaam);

        System.out.print("Wat is je achternaam? ");

        String achternaam = scanner.nextLine();

        p.setAchternaam(achternaam);

        p2.setVoornaam("Marieke");

        p2.setAchternaam("Peeters");

        System.out.printf("De volledige naam is %s\n", p.getVolledigeNaam());

        System.out.printf("De 2de naam is %s", p2.getVolledigeNaam());
    }
}
