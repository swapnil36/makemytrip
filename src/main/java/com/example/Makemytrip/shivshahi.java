package com.example.Makemytrip;

import org.springframework.web.bind.annotation.GetMapping;

public class shivshahi {
    public shivshahi() {
    }

    @GetMapping({"/shivshahi"})
    public String getData() {
        return "Please book your Shivshahi Bus at 10% discount";
    }
}
