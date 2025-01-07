package com.example.crudrapido.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudrapido.model.Venta;

public interface VentaRepositorio extends JpaRepository<Venta, Integer> {
}
