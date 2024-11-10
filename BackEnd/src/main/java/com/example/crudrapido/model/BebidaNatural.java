package com.example.crudrapido.model;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity(name="bebidaNatural")
@Table(name="tbl_bebidaNatural")
@PrimaryKeyJoinColumn(name="id",referencedColumnName="id")

public class BebidaNatural extends Bebida {
    private ArrayList<Integer> listaBebida;

    public BebidaNatural(String nombre, String id, float precio) {
        super(nombre, id, precio);
    }
    
}