package com.example.crudrapido.Repository;

import com.example.crudrapido.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepostory extends JpaRepository<Pizza,Integer> {
}
