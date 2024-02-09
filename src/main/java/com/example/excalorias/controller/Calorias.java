package com.example.excalorias.controller;

import com.example.excalorias.service.CaloriasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Struct;
import java.util.Arrays;

@RestController
public class Calorias {

    private final CaloriasService caloriasService;

    public Calorias(CaloriasService caloriasService){
        this.caloriasService = caloriasService;
    }

    @GetMapping("/getCalorie/{plato}")
    public void getCalories(@PathVariable String plato){

    }

    @GetMapping("/getListCalories")
    public void getListCalories(@RequestParam("platos") List<String> platos){

    }
}
