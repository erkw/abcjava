package com.learningjava.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.function.Predicate;
import com.learningjava.repository.ABCRepository.*;

public class T1_ABCRepository {

    @Test
    @DisplayName("Count all letters")
    void t1() {
        var repository = new ABCRepository();
        int expected = 26;
        int actual = repository.findAll().size();

        repository.findAll().forEach(System.out::println);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Count only the vowels")
    void t2() {
        var repository = new ABCRepository();
        int expected = 5;

        var list = repository.find(ABCFunctions.isVowel);

        for (ABC abc : list) {
            System.out.println(abc);
        }

        int actual = list.size();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Count only the consonants")
    void t3() {
        var repository = new ABCRepository();
        int expected = 21;

        var list = repository.find(ABCFunctions.isConsonant);

        for (ABC abc : list) {
            System.out.println(abc);
        }

        int actual = list.size();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Display the numbers that are divisible by 3")
    void t4() {
        var repository = new ABCRepository();
        int expected = 8;

        var list = repository.find(ABCFunctions.isDivisibleBy3);

        for (ABC abc : list) {
            System.out.println(abc);
        }

        int actual = list.size();

        assertEquals(expected, actual);
    }
}
