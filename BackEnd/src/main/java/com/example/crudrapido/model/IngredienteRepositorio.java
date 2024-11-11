package com.example.crudrapido.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredienteRepositorio extends JpaRepository<Ingrediente,String>{

}
