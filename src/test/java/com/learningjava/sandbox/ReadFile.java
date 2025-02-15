package com.learningjava.sandbox;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.function.Consumer;

//Developer: Eric Kwan

public class ReadFile {

    public static void process(final String fileName){
        process(fileName, System.out::println, 1);
    }

    public static void process(final String fileName, Consumer<String> consumer){
        process(fileName, consumer, 1);
    }

    public static void process(final String fileName, Consumer<String> consumer, int skip) {
        try {
            File myObj = new File(fileName); // hard-coded user-data file
            Scanner myReader = new Scanner(myObj);
            int rowCount = 0;
            while (myReader.hasNextLine()) {
                if (rowCount < skip) {
                    myReader.nextLine();
                    rowCount++;
                    continue;
                }
                String data = myReader.nextLine();
                System.out.println(data);
                consumer.accept(data);
            }
            myReader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}