/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg7;

/**
 *
 * @author Viktorija
 */
public class Day7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       examples();
    }
    
    public static void examples (){
    
     //exeptions
     
     int [] arr = new int [5];
     
     try {
     for (int i = 0; i < 8; i++){
     arr[i] = i + 1;
         System.out.println(arr[i]);
     }
     
     } catch(Exception ex){
         System.out.println(ex.toString()); // "Nokeram"
     }
    }
    
}
