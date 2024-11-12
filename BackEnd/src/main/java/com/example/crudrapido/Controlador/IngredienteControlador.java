package com.example.crudrapido.Controlador;
import java.util.List;

import com.example.crudrapido.Repository.IngredienteRepositorio;
import com.example.crudrapido.model.Ingrediente;
import com.example.crudrapido.model.IngredienteGramos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/ingredientes")
    public Ingrediente guardarIngrediente(@RequestBody Ingrediente ingrediente){
            List<Ingrediente> revisar=repositorio.findAll();
            boolean revisarB=true;
            for(Ingrediente i:revisar){
                if (i.getNombre().equals(ingrediente.getNombre())) {
                    revisarB = false;
                    break;
                }
            }
            if(revisarB){

                return repositorio.save(ingrediente);
            }
            else
            {return null;}
    }
}
