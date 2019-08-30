/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Viktorija
 */
public class MatematiskasDarbibas {

    public static double cipars() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ievadi skaitli: ");
        double skaitlis;
        if (sc.hasNextDouble()) {
            skaitlis = sc.nextDouble();
        } else {
            System.out.println("Tas nav skaitlis. Megini velreiz!");
            sc.next();
            skaitlis = cipars();
        }
        return skaitlis;

    }

    public static char matematiskaDarbiba() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ievadi darbibu. Izvelies: + , - , * , /: ");
        char darbiba;
        if (sc.hasNext()) {
            darbiba = sc.next().charAt(0);
        } else {
            System.out.println("Nepareiza darbiba! Megini velreiz");
            sc.next();
            darbiba = matematiskaDarbiba();
        }
        return darbiba;
    }

    public static double kalkulacijas(double skaitlisViens, double skaitlisDivi,
            char darbiba) {
        double rezultats;
        switch (darbiba) {
            case '+':
                rezultats = skaitlisViens + skaitlisDivi;
                break;
            case '-':
                if(skaitlisViens > skaitlisDivi){
                rezultats = skaitlisViens - skaitlisDivi;
                }
                else {
                rezultats = skaitlisDivi - skaitlisViens;
                }
                break;
            case '*':
                rezultats = skaitlisViens * skaitlisDivi;
                break;
            case '/':
                if(skaitlisViens > skaitlisDivi){
                rezultats = skaitlisViens / skaitlisDivi;
                }
                else {
                rezultats = skaitlisDivi / skaitlisViens;
                }
                break;
            default:
                System.out.println("Nepareiza darbia! Megini velreiz");
                rezultats = kalkulacijas(skaitlisViens, skaitlisDivi, 
                        matematiskaDarbiba());
        }
        return rezultats;
    }

}
