package com.example.crudrapido.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudrapido.Repository.PizzaRepostory;
import com.example.crudrapido.model.Pizza;

@RestController
@RequestMapping("/api/v3/")
@CrossOrigin(origins = "http://localhost:4200")
public class PizzaControlador {
  @Autowired
  private PizzaRepostory pizzaRepostory;

  @GetMapping("/pizzas")
  public List<Pizza> ListarPizzas(){
    System.out.println(pizzaRepostory.findAll());
    return pizzaRepostory.findAll();
  }
  @PostMapping("/pizzas")
  public Pizza guardarPizza(@RequestBody Pizza pizza){
    System.out.println(pizza.getPrecioGrande());        
    return pizzaRepostory.save(pizza);
    /*List<Pizza> revisar=pizzaRepostory.findAll();
    boolean revisarB=true;
    for(Pizza i:revisar){
      if (i.getNombre().equals(pizza.getNombre())) {
        revisarB = false;
        break;
      }
    }
    if(revisarB){
      return pizzaRepostory.save(pizza);
    }
    else
    {return null;}*/
  }
}
