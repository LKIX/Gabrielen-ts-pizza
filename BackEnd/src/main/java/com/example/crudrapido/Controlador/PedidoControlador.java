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

/*@PostMapping("/pedidos")
  public Producto crearPedido(@RequestBody Pedido pedido){
    List<Producto> productos = productoRepositorio.findAll();
    for(Producto producto : productos){
      if(producto.getNombre().equals(pedido.getPedido1())||producto.getNombre().equals(pedido.getPedido2())||producto.getNombre().equals(pedido.getPedido3())||producto.getNombre().equals(pedido.getPedido4())||producto.getNombre().equals(pedido.getPedido5())||producto.getNombre().equals(pedido.getPedido6())||producto.getNombre().equals(pedido.getPedido7())||producto.getNombre().equals(pedido.getPedido8())||producto.getNombre().equals(pedido.getPedido9())||producto.getNombre().equals(pedido.getPedido10())){
        System.out.println("encontre producto");
      }
      else{
        System.out.println("no encontre producto");
        return null;
      }
    }
    return repositorio.save(producto);
  }*/
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
