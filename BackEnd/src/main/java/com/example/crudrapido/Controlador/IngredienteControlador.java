package com.example.crudrapido.Controlador;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudrapido.Repository.IngredienteRepositorio;
import com.example.crudrapido.Repository.ProductoRepositorio;
import com.example.crudrapido.model.Ingrediente;
import com.example.crudrapido.model.Producto;


@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class IngredienteControlador {

    @Autowired
    private IngredienteRepositorio repositorio;
    @Autowired
    private ProductoRepositorio productoRepositorio;

    @GetMapping("/ingredientes")
    public List<Ingrediente> ListarIngredientes(){
        return repositorio.findAll();
    }

    @GetMapping("/ingredientes/{id}")
    public Optional<Ingrediente> buscarIngrediente(@PathVariable Integer id){
      return repositorio.findById(id);
    }

    @PostMapping("/ingredientes") public Ingrediente guardarIngrediente(@RequestBody Ingrediente ingrediente){
            List<Ingrediente> revisar=repositorio.findAll();
            boolean revisarB=true;
            for(Ingrediente i:revisar){
              Ingrediente ingrediente1;
              ingrediente1=repositorio.getById(1);
              ingrediente1.setCantidad(99);
              repositorio.save(ingrediente1);
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

@PostMapping("/ingredientes/{id}") public boolean eliminarIngrediente(@PathVariable Integer id){

      if(id==1){
        return false;
       }
      List<Producto> x =productoRepositorio.findAll();

      for (Producto p : x) {

        if(p.getIngrediente1().equals(id)||p.getIngrediente2().equals(id)||p.getIngrediente3().equals(id)||p.getIngrediente4().equals(id)||p.getIngrediente5().equals(id)){
        System.out.println("llegué al if xd");
          return false;
        }
        }

          System.out.println("llegué al principio del else");
          repositorio.deleteById(id);
          System.out.println("llegué al final else");

          return true;

    }
    @PostMapping("/ingredientes1") public boolean editarIngrediente(@PathVariable Ingrediente ingrediente){
      repositorio.save(ingrediente);
      return true;
      }
}




