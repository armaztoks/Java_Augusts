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
        taskException();
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

   //Uztaisit metodi, kur cilveks ievada masiva garumu
    //Ar ciklu aizpildam masivu ar vertibam
    //tad cilveks ievada, kuru elementu mes mainam
    //tad izvadam masivu
    public static void taskException() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet masiva garumu");
        int[] arr;
        int arrLength;

        try {
            arrLength = sc.nextInt();
            arr = new int[arrLength];
        } catch (Exception ex) {
            System.out.println("Nepareiza ievade, masivam pieskirts garums"
                    + "pec noklusejuma- 5");
            arrLength = 5;
            arr = new int[arrLength];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        arrPrint(arr);
        System.out.println("");
        System.out.println("Ievadiet indeksu, kuru gribast izmainit");

        try {
            int index = sc.nextInt();

            System.out.println("Ievadiet vertibu!");

            int value = sc.nextInt();

            arr[index] = value;
        }catch(Exception ex){
            System.out.println("Nepareiza indeksa ievade");
        }

        arrPrint(arr);

    }

    private static void arrPrint(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
