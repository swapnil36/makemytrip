package com.example.Makemytrip;

import org.springframework.web.bind.annotation.GetMapping;

public class uber {
    public uber() {
    }

    @GetMapping({"/uber"})
    public String getData() {
        return "Please book your UBER TAXI AT at 50% discount";
    }
}
