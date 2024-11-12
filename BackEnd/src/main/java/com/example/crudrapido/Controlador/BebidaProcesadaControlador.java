package com.example.crudrapido.Controlador;

import com.example.crudrapido.Repository.BebidaProcesadaRepository;
import com.example.crudrapido.model.BebidaProcesada;
import com.example.crudrapido.model.Ingrediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/")
@CrossOrigin(origins = "http://localhost:4200")
public class BebidaProcesadaControlador {
  @Autowired
  BebidaProcesadaRepository repositorio;

  @GetMapping("/")
  public List<BebidaProcesada> ListarBebida() {
    return repositorio.findAll();
  }

  @PostMapping("/")
   public BebidaProcesada bebidaProcesada(@RequestBody BebidaProcesada bebida) {
    return repositorio.save(bebida);
  }
  @PostMapping("/")
  public void eliminarBebida(@RequestBody BebidaProcesada bebida) {
    repositorio.delete(bebida);
  }
}
