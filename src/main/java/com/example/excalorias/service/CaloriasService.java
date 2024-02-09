package com.example.excalorias.service;

import com.example.excalorias.model.Plato;

public interface CaloriasService {
    public void caloriasPorPlato();
    public void ingredientesYCalorias();

    public int maxCalorias(String nombre);
}
