package com.example.crudrapido.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity(name="pizza")
@Table(name="tbl_pizza")
@PrimaryKeyJoinColumn(name="id",referencedColumnName="id")
public class Pizza extends Producto{
    private List<Integer> idPizza;
    private float precioGrande;
    private float precioIndividual;

    public Pizza(String nombre,  float precio, float precioGrande, float precioIndividual) {
        super(nombre,precio);
        this.precioGrande = precioGrande;
        this.precioIndividual = precioIndividual;
        this.idPizza = new ArrayList<>();
    }

    public Pizza() {

    }


    public float getPrecioGrande() {
        return precioGrande;
    }

    public void setPrecioGrande(float precioGrande) {
        this.precioGrande = precioGrande;
    }

    public float getPrecioIndividual() {
        return precioIndividual;
    }

    public void setPrecioIndividual(float precioIndividual) {
        this.precioIndividual = precioIndividual;
    }

    public List<Integer> getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(List<Integer> idPizza) {
        this.idPizza = idPizza;
    }

    public void ingredienteAdd(int id){
        this.idPizza.add(id);
    }
    

}
