package com.learningjava.repository;

import org.junit.jupiter.api.Test;

import com.learningjava.dto.User;
import com.learningjava.utility.ReadFileUtility;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

//Developer: Eric Kwan

public class T2_ReadFile {

    @Test
    void t1() {
        System.out.println("Developer: Eric, Kwan " + new Date());
        String fileName = "user-data.csv";
        ReadFileUtility.process(fileName);
    }
    
    @Test
    void t2() {
        String fileName = "user-data.csv";
        List<String> list = new ArrayList<>();
        ReadFileUtility.process(fileName, list::add);

        int expected = 28;
        int actual = list.size();

        assertEquals(expected, actual);
    }
    
    @Test
    void t3() {
        String fileName = "user-data.csv";
        List<String> list = new ArrayList<>();
        ReadFileUtility.process(fileName, list::add, 1);

        int expected = 28;
        int actual = list.size();

        assertEquals(expected, actual);
    }
    
    @Test
    void t4() {
        String fileName = "user-data.csv";
        List<User> list = new ArrayList<>();
        ReadFileUtility.process(fileName, list::add, 1, User::populate);

        int expected = 28;
        int actual = list.size();

        assertEquals(expected, actual);

        list.stream().filter(e -> e.fullName().contains("e")).forEach(System.out::println);
    }

}
