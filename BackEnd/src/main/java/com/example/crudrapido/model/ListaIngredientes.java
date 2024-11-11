package com.example.crudrapido.model;

import java.util.LinkedList;
public class ListaIngredientes {
    private LinkedList<Ingrediente> ingredientes;

    public ListaIngredientes() {
        this.ingredientes = new LinkedList<Ingrediente>();
    }

    public LinkedList<Ingrediente> getIngredientes() {
        return this.ingredientes;
    }

    public void agregarIngrediente( String nombre, float cantidad, String unidad){
         if(unidad.equals("gr")){
             IngredienteGramos ingrediente= new IngredienteGramos(nombre,cantidad);
             this.ingredientes.add(ingrediente);
         } else if (unidad.equals("Und")) {
             IngredienteUnidad ingrediente= new IngredienteUnidad(nombre,cantidad);
             this.ingredientes.add(ingrediente);
         }
    }

    public Ingrediente getIngredientePos (int i){
        return this.ingredientes.get(i); 
    }

}
