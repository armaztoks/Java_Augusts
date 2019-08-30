/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg4_classes2;

/**
 *
 * @author Viktorija
 */
public class Day4_Classes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Daudzsturi dst = new Daudzsturi();
        dst.setMaluSkaits(0);
        dst.setManas(2, 4, 2, 5);
        System.out.println("Perimetrs ir: " + dst.getPerimetrs());
    }
} 