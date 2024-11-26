package com.toy.allo.user.dto.response;

import lombok.Data;

@Data
public class UserResponse {

    // 사용자 정보 조회
    @Data
    public static class getUserInfo {
        String email;
        String nickname;
        String gender;
        String address;
        String city;
        String phoneNumber;
    }
}