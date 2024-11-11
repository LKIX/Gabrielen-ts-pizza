package com.example.crudrapido.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity(name="bebidaNatural")
@Table(name="tbl_bebidaNatural")
@PrimaryKeyJoinColumn(name="id",referencedColumnName="id")

public class BebidaNatural extends Bebida {
    private List<Integer> listaBebida;

    public BebidaNatural(String nombre,float precio) {
        super(nombre, precio);
        listaBebida = new ArrayList<>();
    }

    public BebidaNatural() {
        super();
    }
}