package com.example.crudrapido.model;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("perreito/kene/delicioso")
public class IngredienteControlador {

    @Autowired
    private IngredienteRepositorio repositorio;

    @GetMapping("/ingredientes")
    public List<Ingrediente> ListarIngredientes(){
        return repositorio.findAll();
    }
    
}
