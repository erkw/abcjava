package com.learningjava.repository;

import com.learningjava.dto.TopStock;
import com.learningjava.utility.ReadFileUtility;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class T3_ReadFile {
    @Test
    void t1() {
        System.out.println("Developer: Eric, Kwan " + new Date());
        String fileName = "Top Rated Stocks 2025-02-01.csv";
        ReadFileUtility.process(fileName);
    }

    @Test
    void t2() {
        String fileName = "Top Rated Stocks 2025-02-01.csv";
        List<TopStock> list = new ArrayList<>();
        ReadFileUtility.process(fileName, list::add, 1, TopStock::populate);
        String expected = "WLKP";
        String actual = TopStockFunction.getMax.apply(list);
        assertEquals(expected, actual);

        list.forEach(System.out::println);
    }
}
