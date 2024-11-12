package com.example.crudrapido.Controlador;

import com.example.crudrapido.Repository.IngredienteGramosRepository;
import com.example.crudrapido.model.IngredienteGramos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v2/")
@CrossOrigin(origins = "http://localhost:4200")
public class IngrdienteGramosControlador {
    @Autowired
    private IngredienteGramosRepository repositorioIngredientesGramos;

    @PostMapping ("/Ingredientes")
    public IngredienteGramos guardarIngrediente(@RequestBody IngredienteGramos ingredienteGramos) {
          List<IngredienteGramos> revisar=repositorioIngredientesGramos.findAll();
          for(IngredienteGramos i:revisar){
              if (i.getNombre().equals(ingredienteGramos.getNombre())) {
                  return null;
              }
          }
          return repositorioIngredientesGramos.save(ingredienteGramos);
    }
}
