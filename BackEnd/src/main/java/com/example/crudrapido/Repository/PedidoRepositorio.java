package com.example.crudrapido.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudrapido.model.Pedido;

@Repository
public interface PedidoRepositorio extends JpaRepository<Pedido, Integer> {

}
