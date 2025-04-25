// Source code is decompiled from a .class file using FernFlower decompiler.
package com.example.Makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Flights {
    public Flights() {
    }

    @GetMapping({"/Flights"})
    public String getData() {
        return "Please book your flight from Indigo kindly book ticket for New Delhi to anywhere at 10% discount";
    }
}




