package com.jfs.SpringSecurityApp.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
//    @GetMapping("/start-quiz")
//    public String m1() {
//        return "Start-quiz";
//    }
//    @GetMapping("/login")
//    public String m2() {
//        return "login";
//    }

    @GetMapping("/contact-us")
    public String contactUs() {
        return "9999999888";
    }
    @GetMapping("/updates")
    public String updates() {
        return "Car loan interest drop upto 2%";
    }
    @GetMapping("/check")
    @PreAuthorize("hasRole('USER') or hasRole ('ADMIN')") // role based access control
    public String checkBalance() {
        return "10000000000";
    }
    @GetMapping("/transfer")
    public String transfer() {
        return "Transfer done....";
    }
}
