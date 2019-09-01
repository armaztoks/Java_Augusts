/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import static calculator.MatematiskasDarbibas.cipars;
import static calculator.MatematiskasDarbibas.kalkulacijas;
import static calculator.MatematiskasDarbibas.matematiskaDarbiba;
import java.util.Scanner;

/**
 *
 * @author Viktorija
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    String ans;
    do {
    Scanner sc = new Scanner (System.in);
    double skaitlisViens = cipars();
    double skaitlisDivi = cipars();
    char darbiba = matematiskaDarbiba();
    double rezultats = kalkulacijas(skaitlisViens,skaitlisDivi,darbiba);
    System.out.println("Rezultats: " + rezultats);
    System.out.println();
    
    System.out.print("Vai velies turpinat? ja/ne: ");
    ans = sc.nextLine();
    System.out.println();
    }
    while (ans.equalsIgnoreCase("ja"));
}
    
}