package com.example.crudrapido.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;


@Entity(name="bebida")
@Table(name="tbl_bebida")
@PrimaryKeyJoinColumn(name="id",referencedColumnName="id")
@Inheritance(strategy = InheritanceType.JOINED)

public class Bebida extends Producto {
    public Bebida(String nombre, float precio ) {
        super(nombre,precio);
    }

    public Bebida() {
        super();
    }
}
