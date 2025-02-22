package com.learningjava.dto;

public record User(String userId, String password, String fullName) {
    public static User populate(String row){
        String columns[] = row.split(",");
        return new User(columns[0], columns[1], columns[2]);
    }
}
