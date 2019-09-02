/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg5;

import java.util.ArrayList;

/**
 *
 * @author Viktorija
 */
public class ListExample {
    
    public static void sampleList(){
    ArrayList<Integer> sample = new ArrayList<Integer>();
    sample.add(4);
    sample.add(1);
        sample.add(6);
    for (int i=0; i<sample.size(); i++) {
    
        System.out.println(sample.get(i));}
    }
    
}
