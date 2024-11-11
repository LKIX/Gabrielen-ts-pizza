package com.example.crudrapido.Controlador;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudrapido.Repository.IngredienteRepositorio;
import com.example.crudrapido.model.Ingrediente;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class IngredienteControlador {

    @Autowired
    private IngredienteRepositorio repositorio;

    @GetMapping("/ingredientes")
    public List<Ingrediente> ListarIngredientes(){
        return repositorio.findAll();
    }
    public String existo(){
        return"Ya existo";
    }
    @PostMapping("/ingredientes")
    public Ingrediente guardarIngrediente(@RequestBody Ingrediente ingrediente){
        Example<Ingrediente> example = Example.of(ingrediente);
        if(repositorio.exists(example)){
            System.out.println("Existe un ingrediente");
            return null;
        }
        else{
        return repositorio.save(ingrediente);
    }
    }
}
