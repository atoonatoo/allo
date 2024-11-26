package com.toy.allo.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/users/")
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
public class UserController {
}