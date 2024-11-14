package com.example.crudrapido.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudrapido.Repository.ProductoRepositorio;
import com.example.crudrapido.Repository.VentaRepositorio;
import com.example.crudrapido.model.Pedido;
import com.example.crudrapido.model.Producto;
import com.example.crudrapido.model.Venta;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")

public class VentaControlador {

    @Autowired
    private VentaRepositorio repositorio;
    @Autowired
    private ProductoRepositorio productoRepositorio;

    @GetMapping("/ventas")
    public List<Venta> ListarVentas(){
        return repositorio.findAll();
    }

    public void guardarVenta(Pedido pedido){
        Float pago=(float) 0;
        List<Producto> lista=productoRepositorio.findAll();  
        for(Producto producto : lista){
            if(producto.getNombre().equals(pedido.getPedido1())||producto.getNombre().equals(pedido.getPedido2())||producto.getNombre().equals(pedido.getPedido3())||producto.getNombre().equals(pedido.getPedido4())||producto.getNombre().equals(pedido.getPedido5())||producto.getNombre().equals(pedido.getPedido6())||producto.getNombre().equals(pedido.getPedido7())||producto.getNombre().equals(pedido.getPedido8())||producto.getNombre().equals(pedido.getPedido9())||producto.getNombre().equals(pedido.getPedido10())){
            pago+=producto.getPrecio();
            System.out.println(pago);
            }
        }
        Venta venta= new Venta(pago,pedido.getCedulaCliente(),pedido.getNombreCliente(),pedido.getPedido1(),pedido.getPedido2(),pedido.getPedido3(),pedido.getPedido4(),pedido.getPedido5(),pedido.getPedido6(),pedido.getPedido7(),pedido.getPedido8(),pedido.getPedido9(),pedido.getPedido10());
        repositorio.save(venta);
    }

    @PostMapping("/ventas/{id}")
    public void eliminarVenta(@PathVariable Integer id){
        repositorio.deleteById(id);
    }
}
