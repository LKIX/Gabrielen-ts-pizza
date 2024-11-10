package com.example.crudrapido.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity(name="ingrediente")
@Table(name="tbl_ingrediente")
@Inheritance(strategy = InheritanceType.JOINED)

public class Ingrediente {
    
    @Id
    @GeneratedValue
    private String id;
    private String nombre;
    private float cantidad;
    private float cantidadPizzaGrande;
    private float cantidadPizzaMediana;
    private float cantidadPizzaIndividual;

    public Ingrediente(String id, String nombre, float cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public float getCantidadPizzaGrande() {
        return cantidadPizzaGrande;
    }

    public void setCantidadPizzaGrande(float cantidadPizzaGrande) {
        this.cantidadPizzaGrande = cantidadPizzaGrande;
    }

    public float getCantidadPizzaMediana() {
        return cantidadPizzaMediana;
    }

    public void setCantidadPizzaMediana(float cantidadPizzaMediana) {
        this.cantidadPizzaMediana = cantidadPizzaMediana;
    }

    
    public float getCantidadPizzaIndividual() {
        return cantidadPizzaIndividual;
    }

    public void setCantidadPizzaIndividual(float cantidadPizzaIndividual) {
        this.cantidadPizzaIndividual = cantidadPizzaIndividual;
    }

}
