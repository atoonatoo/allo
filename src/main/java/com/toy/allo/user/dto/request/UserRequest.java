package com.toy.allo.user.dto.request;

import lombok.Data;

@Data
public class UserRequest {

    // 회원 가입
    @Data
    public static class Join {
        private String email;
        private String password;
        private String passwordCheck;
        private String nickname;
        private String phoneNumber;
        private String city;
        private String address;
        private String gender;
    }

    // 로그인
    @Data
    public static class Login {
        private String username;
        private String password;
    }
}