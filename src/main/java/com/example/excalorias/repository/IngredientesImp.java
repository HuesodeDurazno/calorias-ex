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
@Getter
public class IngredientesImp implements Ingredientes {

    private static List<Ingrediente> ingredientes;

    public IngredientesImp(){
        readIngredientes("src/main/resources/food.json");
    }

    @Override
    public void readIngredientes(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Ingrediente> ingredientes = null;
        try {
            ingredientes = objectMapper.readValue(new File(filePath), new TypeReference<List<Ingrediente>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.ingredientes = ingredientes;
    }

}
