
import { NgFor } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PizzaService } from '../pizza.service';
import { Pizza } from '../Pizza';

@Component({
  selector: 'app-pizza',
  standalone: true,
  imports: [NgFor],
  templateUrl: './pizza.component.html',
  styleUrl: './pizza.component.css'
})
export class PizzaComponent implements OnInit {

  pizzas: Pizza[];

  constructor(private pizzaServicio: PizzaService, private router: Router) { }

  ngOnInit(): void {
    this.obtenerPizzas();
  }

  private obtenerPizzas() {

    this.pizzaServicio.obtenerListaDePizzas().subscribe(dato => {
      this.pizzas = dato;
    })
  }

  eliminarPizza(ID: number) {
    this.pizzaServicio.eliminarPizza(ID).subscribe(dato => {
      console.log(dato);
      this.obtenerPizzas();
    })
  }

  redirigir() {
    this.router.navigate(["/registro-pizzas"])
  }
}