import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ListaIngredientesComponent } from "./lista-ingredientes/lista-ingredientes.component";
import { Router } from '@angular/router';
import { NgFor } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ListaIngredientesComponent, NgFor],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'

})

export class AppComponent {
  constructor(private router: Router) { }
  title = 'pizzeria-frontend';
  redirigir() {
    this.router.navigate(["/lista-ingredientes"])
  }
  redirigirProducto() {
    this.router.navigate(["/producto"])
  }
  redirigirPedido() {
    this.router.navigate(["/pedido"])
  }
  redirigirVenta() {
    this.router.navigate(["/venta"])
  }
}
