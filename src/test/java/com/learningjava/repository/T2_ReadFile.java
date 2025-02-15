package com.learningjava.repository;

import org.junit.jupiter.api.Test;
import com.learningjava.sandbox.ReadFile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

//Developer: Eric Kwan

public class T2_ReadFile {

    @Test
    void t1() {
        System.out.println("Developer: Eric, Kwan " + new Date());
        String fileName = "user-data.csv";
        ReadFile.process(fileName);
    }
    
    @Test
    void t2() {
        String fileName = "user-data.csv";
        List<String> list = new ArrayList<>();
        ReadFile.process(fileName, list::add);

        int expected = 28;
        int actual = list.size();

        assertEquals(expected, actual);
    }
    
    @Test
    void t3() {
        String fileName = "user-data.csv";
        List<String> list = new ArrayList<>();
        ReadFile.process(fileName, list::add, 1);

        int expected = 28;
        int actual = list.size();

        assertEquals(expected, actual);
    }

}
