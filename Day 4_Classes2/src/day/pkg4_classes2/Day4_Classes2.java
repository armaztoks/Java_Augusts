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
        //Daudzsturi dst = new Daudzsturi(2,4,5,4);
        dst.setMaluSkaits(4);
        dst.setMalas(2, 4, 2, 5);
        System.out.println("Perimetrs ir: " + dst.getPerimetrs());

        ArrayTasks.switchPlaces();
        ArrayTasks.sumOfElements();
        ArrayTasks.sortArrey();
    }

}
