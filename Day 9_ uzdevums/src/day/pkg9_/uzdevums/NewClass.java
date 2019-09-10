/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg9_.uzdevums;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Viktorija
 */
public class NewClass {

    private ArrayList<String> nameList = new ArrayList<>();

    public void menu() {

        String choice = "";
        Scanner sc = new Scanner(System.in);

        while (!choice.equals("exit")) {
            System.out.println("1: Izvadit sarakstu");
            System.out.println("2: Pievienot jaunu elementu");
            System.out.println("3: Dzest elementu");
            System.out.println("4: Rediget elementu");
            System.out.println("5: Ieladet sarakstu");
            System.out.println("6: Noladet sarakstu");
            System.out.println("exit: Iziet");

            System.out.println("Ievadiet izvelni- ");
            choice = sc.next();

            switch (choice) {
                case "1":
                    printList();
                    break;
                case "2":
                    addToList();
                    saveFile(true);
                    break;
                case "3":
                    deleteFromList();
                    break;
                case "4":
                    editList();
                    break;
                case "5":
                    fileReader();
                    break;
                case "6":
                    saveFile(false);
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
    private void printList() {
        if (nameList.isEmpty()) {
            System.out.println("Saraksts ir tukss!");
        } else {
            for (int i = 0; i < nameList.size(); i++) {
                System.out.println("Indekss: " + i + ", elements: " + nameList.get(i));
            }

            System.out.println();
        }

    }
    //2) Pievienot jaunu elementu

    private void addToList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet elementu, ko velaties pievienot!");
        String element = sc.next();
        nameList.add(element);
    }
    //3) Dzest elementu

    private void deleteFromList() {
        int index = inputListIndex();

        if (index > -1 && index < nameList.size()) {
            nameList.remove(index);
        } else {
            System.out.println("Nepareiza ievade!");
        }
    }
    //4) Rediget elementu

    private void editList() {
        int index = inputListIndex();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadiet jauno vertibu!");
        String changed = sc.next();

        if (index > -1 && index < nameList.size()) {
            nameList.set(index, changed);
        } else {
            System.out.println("Nepareiza ievade!");
        }
    }
    //5) Iziet no programmas

    private int inputListIndex() {
        Scanner sc = new Scanner(System.in);
        int index = -1;
        System.out.println("Ievadiet saraksta elementu- ");
        if (sc.hasNextInt()) {
            index = sc.nextInt();
        }

        return index;
    }

    public void fileReader() {

        try (FileReader fr = new FileReader("C:\\Users\\Viktorija\\Documents\\GitHub\\"
                + "Java_Augusts\\Day 9_FileIOexample\\text.txt");
                BufferedReader br = new BufferedReader(fr)) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
                nameList.add(line);
            }
        } catch (IOException ex) {
            System.out.println("Nevar izveidot failu!");
        }
    }

    public void saveFile(boolean append) {

        try (FileWriter writer = new FileWriter("C:\\Users\\Viktorija\\"
                + "Documents\\GitHub\\Java_Augusts\\Day 9_FileIOexample\\text.txt", append);
                BufferedWriter bw = new BufferedWriter(writer)) {
            for (int i = 0; i < nameList.size(); i++) {
                bw.write(nameList.get(i));
                bw.newLine();
            }
        } catch (IOException ex) {
            System.out.println("Nevar izveidot failu!");
        }

    }
    //String list
    //Validacija - .isEmpty() metode
}
