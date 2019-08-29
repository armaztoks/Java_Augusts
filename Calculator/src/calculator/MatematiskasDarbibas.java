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
    

    public static int cipars() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ievadi skaitli: ");
        int skaitlis;
        if (sc.hasNextInt()) {
        skaitlis = sc.nextInt();
        } else {
        System.out.println("Tas nav skaitlis. Megini velreiz!");
        sc.next();
        skaitlis = cipars();
        }
       return skaitlis;
    
    }
}
