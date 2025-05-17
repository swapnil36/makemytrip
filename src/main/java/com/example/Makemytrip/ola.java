package com.example.Makemytrip;

import org.springframework.web.bind.annotation.GetMapping;

public class ola {
    public ola() {
    }

    @GetMapping({"/ola"})
    public String getData() {
        return "Please book your OLA TAXI AT at 50% discount";
    }
}

