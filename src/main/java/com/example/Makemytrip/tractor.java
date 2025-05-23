package com.example.Makemytrip;

import org.springframework.web.bind.annotation.GetMapping;

public class tractor {
    public tractor() {
    }

    @GetMapping({"/tractor"})
    public String getData() {
        return "Please book your TRACTOR at 10% discount";
    }
}
