package com.example.crudrapido.model;

import java.util.LinkedList;

public class ListaProductos {
    private LinkedList<Producto> listaProductos;

    public ListaProductos() {
        this.listaProductos = new LinkedList<Producto>();
    }

    public LinkedList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(LinkedList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    public void listaProductosAdd(Producto producto){
        this.listaProductos.add(producto);
    }
}
