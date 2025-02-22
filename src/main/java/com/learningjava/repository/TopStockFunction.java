package com.learningjava.repository;

import java.util.List;
import java.util.function.Function;
import com.learningjava.dto.TopStock;

public class TopStockFunction {
    //to return largest div yield stock symbol
    public static Function<List<TopStock>, String> getMax = list -> {

        float max = Float.MIN_VALUE;
        String symbol = "N/A";
    
        for (TopStock topStock : list) {
            if (topStock.divYield() > max) {
                max = topStock.divYield();
                symbol = topStock.symbol();
            }
        }
        return symbol;
    };
}    