package com.toy.allo.user.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = true)
    private String phoneNumber;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private String grade;
}