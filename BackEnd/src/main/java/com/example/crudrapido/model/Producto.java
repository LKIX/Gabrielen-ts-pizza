package com.example.crudrapido.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.List;

@Data
@Entity(name="producto")
@Table(name="tbl_producto")
@Inheritance(strategy = InheritanceType.JOINED)
public class Producto {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Integer id;
    private String nombre;
    private float precio;
    private float precioGrande;
    private float precioIndividual;
    private List<Integer> listaIngredientes;

  public Producto(Integer id, String nombre, float precio, float precioGrande, List<Integer> listaIngredientes, float precioIndividual) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.precioGrande = precioGrande;
    this.listaIngredientes = listaIngredientes;
    this.precioIndividual = precioIndividual;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  public List<Integer> getListaIngredientes() {
    return listaIngredientes;
  }

  public void setListaIngredientes(List<Integer> listaIngredientes) {
    this.listaIngredientes = listaIngredientes;
  }

  public Producto() {
    }


}
