package com.example.crudrapido.model;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity(name="ingredienteGramos")
@Table(name="tbl_ingredienteGramos")
@PrimaryKeyJoinColumn(name="id",referencedColumnName="id")

public class IngredienteGramos extends Ingrediente{
    private String Unidad= "Gr";

    public IngredienteGramos(String id, String nombre, float cantidad) {
        super(id, nombre, cantidad);
    }

    public String getUnidad() {
        return Unidad;
    }
}