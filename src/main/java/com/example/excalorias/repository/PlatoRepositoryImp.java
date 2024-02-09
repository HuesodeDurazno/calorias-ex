package com.example.excalorias.repository;

import com.example.excalorias.model.Ingrediente;
import com.example.excalorias.model.Plato;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class PlatoRepositoryImp implements PlatoRepository {
    private final Ingredientes ingredientesRepositoryImp;
    @Override
    public List<Plato> readPlatos(){
        List<Ingrediente> ingredientes = ingredientesRepositoryImp.readIngredientes();
        return new ArrayList<>(List.of(
                new Plato("Polenta con salsa", List.of(ingredientes.get(238), ingredientes.get(303)))
        ));
    }
}
