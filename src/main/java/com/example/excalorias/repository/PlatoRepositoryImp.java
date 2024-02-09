package com.example.excalorias.repository;

import com.example.excalorias.model.Ingrediente;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class PlatoRepositoryImp implements PlatoRepository {
    private final Ingredientes ingredientesRepositoryImp;
    @Override
    public void readPlatos(){
        List<Ingrediente> ingredientes = ingredientesRepositoryImp.();
    }
}
