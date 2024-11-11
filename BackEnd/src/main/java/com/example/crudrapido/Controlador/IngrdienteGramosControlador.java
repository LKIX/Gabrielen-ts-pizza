package com.example.crudrapido.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudrapido.Repository.IngredienteGramosRepository;
import com.example.crudrapido.model.IngredienteGramos;

@RestController
@RequestMapping("/api/v2/")
@CrossOrigin(origins = "http://localhost:4200")
public class IngrdienteGramosControlador {
    @Autowired
    private IngredienteGramosRepository repositorioIngredientesGramos;
    @GetMapping("/ingredientesGramos")
    public List<IngredienteGramos> ListarIngredientes(){
        return repositorioIngredientesGramos.findAll();
    }
    @GetMapping("/crearGramos")
    public void guardarIngrediente(){
        IngredienteGramos ingredienteGramos = new IngredienteGramos("queso",10);
            repositorioIngredientesGramos.save(ingredienteGramos);
    }
}
