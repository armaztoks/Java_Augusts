/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Viktorija
 */
public class Uzdevums {

    public static void task() {
        Scanner sc = new Scanner(System.in);
        String choice;
        ArrayList<String> listOfStrings = new ArrayList<String>();

        do {
            System.out.println("Ievadiet vertibu!");
            String input = sc.next();
            listOfStrings.add(input);

            System.out.println("Tavas vertibas saraksta ir: " + listOfStrings);

            System.out.println("Ja velies turpinat, ievadi jebkadu tekstu. Ja ne - raksti exit");
            choice = sc.next();

        } while (!choice.equalsIgnoreCase("exit"));

        do {
            System.out.println("Vai velies izdzest elementu? ja/ne");
            choice = sc.next();
         if (choice.equalsIgnoreCase("ja")) {
            System.out.println("Ievadi saraksta elementu, kuru gribi izdzest!"
                    + " Tavs elementu saraksts ir " + listOfStrings);
            int input = sc.nextInt();
            if (input >= 0 && input < listOfStrings.size()) {
            listOfStrings.remove(input);
            System.out.println("Tavas vertibas saraksta ir: " + listOfStrings);
            }
            else {
            System.out.println("Tads elements neeksiste!" );
            }
         }
        } while (!choice.equalsIgnoreCase("ne"));

    }

}
