package com.example.crudrapido.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudrapido.Repository.VentaRepositorio;
import com.example.crudrapido.model.Pedido;
import com.example.crudrapido.model.Venta;

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

    public void guardarVenta(Pedido pedido){
        Venta venta= new Venta(pedido.getCedulaCliente(),pedido.getNombreCliente(),pedido.getPedido1(),pedido.getPedido2(),pedido.getPedido3(),pedido.getPedido4(),pedido.getPedido5(),pedido.getPedido6(),pedido.getPedido7(),pedido.getPedido8(),pedido.getPedido9(),pedido.getPedido10());

        repositorio.save(venta);
    }

    @PostMapping("/ventas/{id}")
    public void eliminarVenta(@PathVariable Integer id){
        repositorio.deleteById(id);
    }
}
