package com.example.excalorias.service;

import com.example.excalorias.model.Plato;
import com.example.excalorias.repository.Ingredientes;
import com.example.excalorias.repository.PlatoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CaloriasServiceImp implements CaloriasService {
    private final PlatoRepository platoRepository;
    @Override
    public int caloriasPorPlato(String nombre){
        int suma=0;
         platoRepository.readPlatos().stream()
                .filter(plato -> plato.getName().equalsIgnoreCase(nombre))
                 .reduce(plato -> {
                    plato.getIngredientes().stream().reduce(ingrediente -> {
                        suma += ingrediente.getCalories();
                    });
                });

    }
    public void ingredientesYCalorias();

    @Override
    public int maxCalorias(String nombre){
        Optional<Plato> platoObj = platoRepository.readPlatos().stream().
                filter(plato -> plato.getName().equalsIgnoreCase(nombre)).findFirst();

        return platoObj.get().getIngredientes().stream().max();

    };

}
