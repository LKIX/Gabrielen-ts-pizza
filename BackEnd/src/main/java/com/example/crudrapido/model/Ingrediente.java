package com.example.crudrapido.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity(name="ingrediente")
@Table(name="tbl_ingrediente")
@Inheritance(strategy = InheritanceType.JOINED)
public class Ingrediente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private float cantidad;
    private float cantidadPizzaGrande;
    private float cantidadPizzaMediana;
    private float cantidadPizzaIndividual;

    public Ingrediente( String nombre, float cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Ingrediente() {

    }

    public String getNombre() {
        return nombre;
    }

    public float getCantidad() {
        return cantidad;
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
