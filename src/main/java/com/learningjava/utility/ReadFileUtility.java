package com.learningjava.utility;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.function.Consumer;
import java.util.function.Function;

//Developer: Eric Kwan

public class ReadFileUtility {

    public static void process(final String fileName) {
        process(fileName, System.out::println, 1);
    }

    public static void process(final String fileName, Consumer<String> consumer) {
        process(fileName, consumer, 1);
    }

    public static void process(final String fileName, Consumer<String> consumer, int skip) {
        process(fileName, consumer,skip, e -> e);
    }

    public static <T> void process(final String fileName, Consumer<T> consumer, int skip,
            Function<String, T> function) {
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
                T t = function.apply(data);
                consumer.accept(t);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}