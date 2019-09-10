/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day.pkg9_fileioexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Viktorija
 */
public class Day9_FileIOexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        fileReader();
    }

    public static void fileReader() {

        try (FileReader fr = new FileReader("test.txt");
                BufferedReader br = new BufferedReader(fr)) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);

            }
        } catch (IOException ex) {
            System.out.println("Nevar izveidot failu!");
        }
    }

    public static void fileWrite() {
        //String content = "aaa";
        String[] content = {"aaa", "bbb", "ccc"};
        try (FileWriter writer = new FileWriter("test.txt");
                BufferedWriter bw = new BufferedWriter(writer)) {
            for (int i = 0; i < content.length; i++) {
                bw.write(content[i]);
                bw.newLine();
            }

        } catch (IOException ex) {
            System.out.println("Nevar izveidot failu!");

        }

    }

}
