package com.example.Makemytrip;

import org.springframework.web.bind.annotation.GetMapping;

public class testclass {
    public testclass() {
    }

    @GetMapping({"/testclass"})
    public String getData() {
        return "Please book your TRAIN TICKTES at 10% discount";
    }
}