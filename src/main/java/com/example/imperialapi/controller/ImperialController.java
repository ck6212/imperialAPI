package com.example.imperialapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class ImperialController {

    @GetMapping("/centimeter")
    Double inchToCentimeter(@RequestParam Double inch) {
        double centimeter = inch * 2.54;
        return Math.round(centimeter * 100.0) / 100.0;
    }

    @GetMapping("/meter")
    Double yardToMeter(@RequestParam Double yard) {
        double meter = yard / 1.094;
        return Math.round(meter * 100.0) / 100.0;
    }
}
