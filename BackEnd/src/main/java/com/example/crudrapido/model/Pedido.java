package com.example.crudrapido.model;

public class Pedido {
    private ListaProductos listaProductos;

    public Pedido() {
        this.listaProductos = new ListaProductos();
    }
    public void agregarProducto(Producto producto){
        this.listaProductos.listaProductosAdd(producto);
    }
}