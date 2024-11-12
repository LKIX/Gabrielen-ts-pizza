package com.example.crudrapido.Controlador;

import com.example.crudrapido.Repository.ProductoRepositorio;
import com.example.crudrapido.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoControlador {
  @Autowired
  private ProductoRepositorio repositorio;

  @GetMapping("/")
  public List<Producto> listarProducto(){
    return repositorio.findAll();
  }

  @PostMapping("/")
  public Producto crearProducto(@RequestBody Producto producto){
    return repositorio.save(producto);
  }
}
