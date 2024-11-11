package com.example.crudrapido.Controlador;
import java.util.List;

import com.example.crudrapido.Repository.IngredienteRepositorio;
import com.example.crudrapido.model.Ingrediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/crear")
    public void guardarIngrediente(){
        Ingrediente ingrediente= new Ingrediente("queso",10);
        Example<Ingrediente> example = Example.of(ingrediente);
        if(repositorio.exists(example)){
            System.out.println("Existe un ingrediente");
        }else{
        repositorio.save(ingrediente);}
    }
}
