package com.example.crudrapido.Controlador;
import java.util.List;

import com.example.crudrapido.Repository.IngredienteRepositorio;
import com.example.crudrapido.model.Ingrediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;


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

    @PostMapping("/ingredientes/{id}")
  public void eliminarIngrediente(@PathVariable Integer id){
      repositorio.deleteById(id);
    }
}
