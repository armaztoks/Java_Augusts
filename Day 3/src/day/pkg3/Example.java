/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg3;

import java.util.Scanner;

/**
 *
 * @author Viktorija
 */
public class Example {

    int a;

    public Example() {
        a = 0;
    }

    public void setA(int number) {
        a = number;

        if (a >= 5 && a <= 15) {
            System.out.println(a);
        } 
        else {
            System.out.println("99");
        }
    }

    //public void printA() {
       // System.out.println(a);
   // }

    public void whileExample() {
        Scanner sc = new Scanner(System.in);
        String exit = "";
        while (!exit.equals("yes")) {
            System.out.println("Izvade!");
            exit = sc.nextLine();
            exit = exit.toLowerCase();
        }

    }

    public static void zvaigznites() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ievadi zvaigznisu daudzumu skaitli: ");
        int input = sc.nextInt();

        String zvaigzneSimbol = "";

        for (int i = 0; i < input; i++) {
            zvaigzneSimbol = zvaigzneSimbol + "*";
            System.out.println(zvaigzneSimbol);
        }

        for (int i = input; i > 0; i--) {
            zvaigzneSimbol = zvaigzneSimbol.substring(0, i - 1);
            System.out.println(zvaigzneSimbol);

        }
    }

    public static void pyramid() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
