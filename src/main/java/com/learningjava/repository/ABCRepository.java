package com.learningjava.repository;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ABCRepository {
    
    public record ABC(int no, char upperLetter, char lowerLetter) {}

    private static final List<ABC> abcList = Arrays.asList(
        new ABC(1, 'A', 'a'),
        new ABC(2, 'B', 'b'),
        new ABC(3, 'C', 'c'),
        new ABC(4, 'D', 'd'),
        new ABC(5, 'E', 'e'),
        new ABC(6, 'F', 'f'),
        new ABC(7, 'G', 'g'),
        new ABC(8, 'H', 'h'),
        new ABC(9, 'I', 'i'),
        new ABC(10, 'J', 'j'),
        new ABC(11, 'K', 'k'),
        new ABC(12, 'L', 'l'),
        new ABC(13, 'M', 'm'),
        new ABC(14, 'N', 'n'),
        new ABC(15, 'O', 'o'),
        new ABC(16, 'P', 'p'),
        new ABC(17, 'Q', 'q'),
        new ABC(18, 'R', 'r'),
        new ABC(19, 'S', 's'),
        new ABC(20, 'T', 't'),
        new ABC(21, 'U', 'u'),
        new ABC(22, 'V', 'v'),
        new ABC(23, 'W', 'w'),
        new ABC(24, 'X', 'x'),
        new ABC(25, 'Y', 'y'),
        new ABC(26, 'Z', 'z')
    );

    public List<ABC> findAll() {
        return abcList;
    }

    public List<ABC> find(Predicate<ABC> predicate) {
        return abcList.stream().filter(predicate).toList();
    }
}
