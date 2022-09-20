/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.*;
import java.util.*;

/**
 *
 * @author 4800590195
 */
public class TestFiles {

    public static void main(String[] args) {
        File textFile = new File("info.txt");
        FileReader in;
        BufferedReader readFile;
        String lineOfText;
        try {
            in = new FileReader(textFile);
            readFile = new BufferedReader(in);
            while ((lineOfText = readFile.readLine()) != null) {
                System.out.println(lineOfText);
            }
            readFile.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.out.println("Exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading file."); 
   System.out.println("Exception: " + e.getMessage());
        }
    }
}
