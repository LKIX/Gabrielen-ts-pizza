package com.example.crudrapido.model;
import jakarta.persistence.*;

@Entity(name="ingredienteGramos")
@Table(name="tbl_ingredienteGramos")
@PrimaryKeyJoinColumn(name="id",referencedColumnName="id")

public class IngredienteGramos extends Ingrediente{
    private String Unidad= "Gr";

    public IngredienteGramos( String nombre, float cantidad) {
        super(nombre, cantidad);
    }

    public IngredienteGramos() {

    }


    public String getUnidad() {
        return Unidad;
    }
}