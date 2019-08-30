/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg4_classes2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Viktorija
 */
public class ArrayTasks {

    public static void switchPlaces() {
        int a = 5;
        int b = 4;

        int c = a;
        a = b;
        b = c;

        //a = a + b;
        //b = a - b;
        // a = a - b;
        System.out.println(a + " " + b);

    }

    public static void sortArrey() {
        int[] arr = {7, 6, 3, 2, 9, 13};
        //izvadit  esoso masivu 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //sakartot masivu augosa seciba
        for (int i = 0; i < arr.length-1; i++){
        for ( int j = 0; j < arr.length-1-i; j++){
        }
        }
    }

    public static void sumOfElements() {
        //uztaisit masivu ar 5 (int) elementiem
        int[] arr = new int[5];
        // elementu ievada cilveks
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Ievadi skaitli: ");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        // izvadit masivu
        // for (int i = 0; i < arr.length; i++) {
        //System.out.print( arr [i] + "");

        System.out.println(Arrays.toString(arr));

        // izvadam elementu summu
        System.out.println("Summa ir " + sum);
    }

}
