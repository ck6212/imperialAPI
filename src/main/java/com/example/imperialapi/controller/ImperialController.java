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
        return inch * 2.54;
    }
}
