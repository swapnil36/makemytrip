package com.example.Makemytrip;

import org.springframework.web.bind.annotation.GetMapping;

public class taxis {
    public taxis() {
    }

    @GetMapping({"/taxis"})
    public String getData() {
        return "Please book your CAB at 10% discount";
    }
}