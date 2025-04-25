// Source code is decompiled from a .class file using FernFlower decompiler.
package com.example.Makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotels {
    public hotels() {
    }

    @GetMapping({"/hotels"})
    public String getData() {
        return "Please book your Hotel at 10% discount";
    }
}




