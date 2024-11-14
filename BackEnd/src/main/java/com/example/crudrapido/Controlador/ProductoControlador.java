package com.example.crudrapido.Controlador;

import java.util.List;

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
import com.example.crudrapido.model.Producto;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoControlador {
  @Autowired
  private ProductoRepositorio repositorio;
  @Autowired
  private IngredienteRepositorio ingredienteRepositorio;

  @GetMapping("/productos")
  public List<Producto> listarProducto(){
    return repositorio.findAll();
  }

@PostMapping("/productos")
  public Producto crearProducto(@RequestBody Producto producto){
    //List<Ingrediente> ingredientes = ingredienteRepositorio.findAll();
    //for(Ingrediente ingrediente : ingredientes){
      if(ingredienteRepositorio.existsById(producto.getIngrediente1())&&ingredienteRepositorio.existsById(producto.getIngrediente2())&&ingredienteRepositorio.existsById(producto.getIngrediente3())&&ingredienteRepositorio.existsById(producto.getIngrediente4())&&ingredienteRepositorio.existsById(producto.getIngrediente5())){
        System.out.println("encontre ingrediente");
      }else{
        System.out.println("no encontre ingrediente");
        return null;
      }
    //}
    return repositorio.save(producto);
  }


  @PostMapping("/productos/{id}")
  public void eliminarProducto(@PathVariable Integer id){
      System.out.println("LLEGUE");
      repositorio.deleteById(id);
    }
}
