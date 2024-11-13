package com.example.crudrapido.Controlador;

import com.example.crudrapido.Repository.PedidoRepositorio;
import com.example.crudrapido.Repository.ProductoRepositorio;
import com.example.crudrapido.model.Pedido;
import com.example.crudrapido.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class PedidoControlador {
  @Autowired
  private PedidoRepositorio repositorio;

  @GetMapping("/pedidos")
  public List<Pedido> listarProducto(){
    return repositorio.findAll();
  }

  @PostMapping("/pedidos")
  public Pedido crearPedido(@RequestBody Pedido pedido){
    return repositorio.save(pedido);
  }

  @PostMapping("/pedidos/{id}")
  public void eliminarPedido(@PathVariable Integer id){
    repositorio.deleteById(id);
  }
}
