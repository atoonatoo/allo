package com.toy.allo.user.domain;

import lombok.Getter;

@Getter
public enum Gender {

    MEAL("M", "남성"),
    FEMALE("F", "여성");

    private final String code;
    private final String description;

    Gender(String code, String description) {
        this.code = code;
        this.description = description;
    }
}