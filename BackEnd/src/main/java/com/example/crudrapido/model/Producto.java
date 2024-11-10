package com.example.crudrapido.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity(name="producto")
@Table(name="tbl_producto")
@Inheritance(strategy = InheritanceType.JOINED)
public class Producto {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;
    private String nombre;
    private float precio;

    public Producto(String nombre, String id, float precio) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }
}