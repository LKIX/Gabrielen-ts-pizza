package com.example.crudrapido.services;

import com.example.crudrapido.Repository.IngredienteRepositorio;
import com.example.crudrapido.model.Ingrediente;

import java.util.List;

public class IngrdienteService {

  private IngredienteRepositorio repositorio;

  public boolean verificarExistencia(Ingrediente ingrediente) {
    List<Ingrediente> revisar = repositorio.findAll();
    for (Ingrediente i : revisar) {
      if (i.getNombre().equals(ingrediente.getNombre())) {
        return false;
      }
    }
    return true;
  }
}
