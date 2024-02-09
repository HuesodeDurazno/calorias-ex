package com.example.excalorias.repository;

import com.example.excalorias.model.Ingrediente;
import lombok.Getter;
import org.springframework.stereotype.Repository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;


import java.io.File;
import java.io.IOException;
import java.util.List;


@Repository
public class IngredientesImp implements Ingredientes {


    @Override
    public List<Ingrediente> readIngredientes() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Ingrediente> ingredientes = null;
        try {
            ingredientes = objectMapper.readValue(new File("classpath:food.json"), new TypeReference<List<Ingrediente>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ingredientes;
    }

}
