/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg7;

import java.util.Scanner;

/**
 *
 * @author Viktorija
 */
public class Day7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //examples();
        uzdevums();
    }

    public static void examples() {

        //exeptions
        int[] arr = new int[5];

        try { //ar try nebus kludas, jo masiva izmers ir mazaks par i
            for (int i = 0; i < 8; i++) {
                arr[i] = i + 1;
                System.out.println(arr[i]);
            }

        } catch (Exception ex) {
            System.out.println(ex.toString()); // "Nokeram"
        }
    }

    public static void uzdevums() {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.print("Ievadi masiva garumu: ");
        choice = sc.nextInt();
        int[] arr = new int[choice];

        try {
            for (int i = 0; i < 10000; i++) {
                arr[i] = i + 1;
                System.out.println(arr[i]);
            }

        } catch (Exception ex) {
            System.out.println("Viss OK");
        }

        System.out.print("Ievadi elementu, kuru velies mainit: ");
        int indexToEdit = sc.nextInt();

        System.out.println("Ievadiet jauno vertibu!");
        int indexNew = sc.nextInt();

        if (indexToEdit >= 0 && indexToEdit < arr.length) {
            arr.set(indexToEdit, indexNew);
            System.out.println("Tavas vertibas saraksta ir: " + arr);
        } else {
            System.out.println("Tads elements neeksiste!");
        }

    }

}
