package com.example.crudrapido.Repository;

import com.example.crudrapido.Controlador.BebidaProcesadaControlador;
import com.example.crudrapido.model.BebidaProcesada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BebidaProcesadaRepository extends JpaRepository<BebidaProcesada,Integer> {
}
