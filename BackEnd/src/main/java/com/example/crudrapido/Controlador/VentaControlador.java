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
import com.example.crudrapido.model.Ingrediente;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")

public class VentaControlador {

    @Autowired
    private VentaRepositorio repositorio;

    @GetMapping("/ventas")
    public List<Venta> ListarVentas(){
        return repositorio.findAll();
    }

    @PostMapping("/ventas")
    public Venta guardarVenta(@RequestBody Venta venta){
        repositorio.save(venta);
    }

    @PostMapping("/ventas/{id}")
    public void eliminarVenta(@PathVariable Integer id){
        repositorio.deleteById(id);
    }
}
