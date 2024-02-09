package com.example.excalorias.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calorias {

    //private CaloriasImp caloriasService = new CaloriasImp();

    @GetMapping("/getCalories")
    public void getCalories(){

    }

    @GetMapping("/getListCalories")
    public void getListCalories(){

    }
}
