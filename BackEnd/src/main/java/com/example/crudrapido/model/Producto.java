package com.example.crudrapido.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity(name="producto")
@Table(name="tbl_producto")
@Inheritance(strategy = InheritanceType.JOINED)
public class Producto {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    //@Column(name = "id")
    private Integer id;
    //@Column(name = "nombre")
    private String nombre;
    //@Column(name = "precio")
    private float precio;

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}