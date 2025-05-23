package com.example.Makemytrip;

import org.springframework.web.bind.annotation.GetMapping;

public class MSRTC {
    public MSRTC() {
    }

    @GetMapping({"/MSRTC"})
    public String getData() {
        return "Please book your MSRTC BUS AT at 60% discount";
    }
}
