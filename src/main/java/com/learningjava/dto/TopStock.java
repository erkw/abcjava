package com.learningjava.dto;

public record TopStock(int rank, String symbol, String company, float quantRating, float wallStreetRating,
        float marketCap, float divYield) {

    public static TopStock populate(String row) {
        String[] rowSplit = row.split(",");
        return new TopStock(
            Integer.parseInt(rowSplit[0]),
            rowSplit[1],
            rowSplit[2],
            Float.parseFloat(rowSplit[3]),
            Float.parseFloat(rowSplit[4]),
            Float.parseFloat(rowSplit[5]),
            Float.parseFloat(rowSplit[6])
        );
    }
}