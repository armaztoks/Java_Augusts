/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg2;

import java.util.Scanner;

/**
 *
 * @author Viktorija
 */
public class Day2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      pakape();
    }

    public static void stars() {
        String output = "";
        for (int i = 0; i < 4; i++) {
            output = output + "*";
            System.out.println(output);
        }
    }

    public static void sumOfNumbers() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Ievadi skaitli: ");
            int input = sc.nextInt();
            sum = sum + input;
        }
        System.out.println("Ciparu summa ir: " + sum);
    }

    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ievadi skaitli: ");
        int number = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Faktarials ir: " + fact);
        
       
        }

  
    public static void largestNumber() {
        Scanner sc = new Scanner(System.in);
        int newInput = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.print("Ievadi skaitli: ");
            int input = sc.nextInt();
            if (input > newInput) {
                newInput = input;
            }
        }
        System.out.println("Lielakais skaitlis ir: " + newInput);
    }

     public static void pakape1 () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ievadi skaitli: ");
            int skaitlis = sc.nextInt();
        System.out.print("Ievadi pakapi: ");
            int pakape = sc.nextInt();
           System.out.println("Rezultats: " + (int)Math.pow(skaitlis, pakape));
        }
     
     public static void pakape() {
            Scanner sc = new Scanner(System.in);
        System.out.print("Ievadi skaitli: ");
            double skaitlis = sc.nextDouble();
        System.out.print("Ievadi pakapi: ");
            double pakape = sc.nextDouble();
            double result = 1 ;
            
            if ( pakape >= 0){
            for (double i = 1; i <= pakape; i++ ) {
            result = result * skaitlis;
            }
           System.out.println("Rezultats: " + result);
            }
           
            if ( pakape < 0){
            for (double i = 1; i <= pakape; i++ ) {
            result = 1 / (result * skaitlis);
            }
           System.out.println("Rezultats: " + result);
         }

          
    }
}
         

    

