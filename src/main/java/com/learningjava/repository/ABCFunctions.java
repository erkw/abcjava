package com.learningjava.repository;

import java.util.function.Predicate;

import com.learningjava.repository.ABCRepository.ABC;

public class ABCFunctions {
    
    public static Predicate<ABC> isVowel = e -> 
        e.upperLetter() == 'A' 
        || e.upperLetter() == 'E' 
        || e.upperLetter() == 'I' 
        || e.upperLetter() == 'O' 
        || e.upperLetter() == 'U';

    public static Predicate<ABC> isConsonant = isVowel.negate();

    public static Predicate<ABC> isDivisibleBy3 = e -> e.no() % 3 == 0;
}
