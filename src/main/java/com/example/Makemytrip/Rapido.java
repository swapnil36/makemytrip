package com.example.Makemytrip;

import org.springframework.web.bind.annotation.GetMapping;

public class Rapido {
    public Rapido() {
    }

    @GetMapping({"/Rapido"})
    public String getData() {
        return "Please book your Rapido at 50% discount";
    }
}
