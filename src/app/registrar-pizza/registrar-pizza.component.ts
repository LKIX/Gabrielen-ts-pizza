import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';  // Asegúrate de importar FormsModule
import { Router } from '@angular/router';
import { Pizza } from '../Pizza';
import { PizzaService } from '../pizza.service';


@Component({
  selector: 'app-registrar-ingrediente',
  standalone: true,
  imports: [CommonModule, FormsModule],  // Asegúrate de incluir FormsModule
  templateUrl: './registrar-pizza.component.html',
  styleUrls: ['./registrar-pizza.component.css']
})
export class RegistrarPizzaComponent implements OnInit {

  pizza: Pizza = new Pizza();
  constructor(private pizzaServicio: PizzaService, private router: Router) { }

  ngOnInit(): void {
    console.log(this.pizza);
  }

  guardarPizza() {
    this.pizzaServicio.registrarPizza(this.pizza).subscribe(dato => {
      console.log(dato);
      this.irListaPizza();
    }, error => console.log(error));
  }

  irListaPizza() {
    this.router.navigate(['/lista-pizzas'])
  }


  onSubmit() {
    this.guardarPizza();
  }
}
