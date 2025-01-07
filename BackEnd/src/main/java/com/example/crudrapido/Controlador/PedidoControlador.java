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

import com.example.crudrapido.Repository.PedidoRepositorio;
import com.example.crudrapido.Repository.ProductoRepositorio;
import com.example.crudrapido.model.Pedido;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class PedidoControlador {
  @Autowired
  private PedidoRepositorio repositorio;
  @Autowired
  private VentaControlador ventaControlador;
  @Autowired
  private ProductoRepositorio productoRepositorio;

  @GetMapping("/pedidos")
  public List<Pedido> listarProducto(){
    return repositorio.findAll();
  }

  @PostMapping("/pedidos")
  public Pedido crearPedido(@RequestBody Pedido pedido){
    if(productoRepositorio.existsById(pedido.getPedido1())&&productoRepositorio.existsById(pedido.getPedido2())&&productoRepositorio.existsById(pedido.getPedido3())&&productoRepositorio.existsById(pedido.getPedido4())&&productoRepositorio.existsById(pedido.getPedido5())&&productoRepositorio.existsById(pedido.getPedido6())&&productoRepositorio.existsById(pedido.getPedido7())&&productoRepositorio.existsById(pedido.getPedido8())&&productoRepositorio.existsById(pedido.getPedido9())&&productoRepositorio.existsById(pedido.getPedido10())){
      return repositorio.save(pedido);
    }
    return null;
  }
  @PostMapping("/pedidos/{id}")
  public void eliminarPedido(@PathVariable Integer id){


    repositorio.deleteById(id);
  }

 @PostMapping("/pedidos/v")
  public void crearVenta(@RequestBody Pedido pedido){
    ventaControlador.guardarVenta(pedido);
    repositorio.deleteById(pedido.getId());
  }
}
