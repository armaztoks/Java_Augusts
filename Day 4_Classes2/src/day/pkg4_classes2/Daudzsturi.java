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
        //Daudzsturi(double mala1, double mala2, double mala3, double mala4)
        a = 0; // a = mala1
        b = 0; // b = mala2
        c = 0; // c = mala3
        d = 0; // d = mala4
        maluSkaits = 0;
    } //konstruktors

    public void setMaluSkaits(int value) {
        maluSkaits = value;
    } //set metode malu skaitam

    public void setMalas(double mala1, double mala2, double mala3,
            double mala4) {
        a = mala1;
        b = mala2;
        c = mala3;
        d = mala4;
    } // set metode pierkir vertibu malam

    public void setMalas(double mala1, double mala2, double mala3) {
        a = mala1;
        b = mala2;
        c = mala3;
    }

    // metode, kas aprekina perimetru un ar return atgriez
    public double getPerimetrs() {

        switch (maluSkaits) {
            case 3:
                return a + b + c;
            case 4:
                return a + b + c + d;
            default:
                return 0;
        }
    }
}
