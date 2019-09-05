/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Viktorija
 */
public class tasks {
    
    private ArrayList <String> nameList = new ArrayList <>();
    
    
    public void menu(){
        
        String choice = "";
        Scanner sc = new Scanner(System.in);
        
        while(!choice.equals("exit")){
            System.out.println("1: Izvadit sarakstu");
            System.out.println("2: Pievienot jaunu elementu");
            System.out.println("3: Dzest elementu");
            System.out.println("4: Rediget elementu");
            System.out.println("exit: Iziet");
            
            System.out.println("Ievadiet izvelni- ");
            choice = sc.next();
            
            switch(choice){
                case "1":
                    printList();
                    break;
                case "2":
                    addToList();
                    break;
                case "3":
                    deleteFromList();
                    break;
                case "4":
                    editList();
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Ievade nav pareiza!");
                    break;
            }
            
        }
        
    }
    
    //1) Izvadit sarakstu
    private void printList(){
        
    }
    //2) Pievienot jaunu elementu
    
    private void addToList(){
        
    }
    //3) Dzest elementu
    
    private void deleteFromList(){
        
    }
    //4) Rediget elementu
    
    private void editList(){
        
    }
    //5) Iziet no programmas
    
    //String list
    //Validacija - .isEmpty() metode
    
}
