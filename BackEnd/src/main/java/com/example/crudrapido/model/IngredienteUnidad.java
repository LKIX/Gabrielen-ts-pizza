package com.example.crudrapido.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity(name="ingredienteUnidad")
@Table(name="tbl_ingredienteUnidad")
@PrimaryKeyJoinColumn(name="id",referencedColumnName="id")

public class IngredienteUnidad extends Ingrediente{
    private String Unidad = "Und";

    public IngredienteUnidad(String id, String nombre, float cantidad) {
        super(id, nombre, cantidad);
    }

    public String getUnidad() {
        return Unidad;
    }
}