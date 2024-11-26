package com.toy.allo.user.domain;

import lombok.Getter;

@Getter
public enum Grade {

    BRONZE("ROLE_BRONZE"),
    SILVER("ROLE_SILVER"),
    GOLD("ROLE_GOLD"),
    ADMIN("ROLE_ADMIN");

    private final String gradeName;

    Grade(String gradeName) {
        this.gradeName = gradeName;
    }
}
