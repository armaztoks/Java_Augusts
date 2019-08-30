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
public class Daudzsturi {

    private double a, b, c, d;
    private int maluSkaits; // privatais mainigais 

    public Daudzsturi() {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        maluSkaits = 0;
    } //konstruktors

    public void setMaluSkaits(int value) {
        maluSkaits = value;
    } //set metode malu skaitam

    public void setManas(double mala1, double mala2, double mala3, double mala4) {
        a = mala1;
        b = mala2;
        c = mala3;
        d = mala4;
    } // set metode pierkir vertibu malam

    // metode, kas aprekina perimetru un ar return atgriez
    public double getPerimetrs() {
        
        switch (maluSkaits){
            case 3:
                return a + b + c;
            case 4:
        return a + b + c +d;
            default:
                return 0;
        }
    }
}
