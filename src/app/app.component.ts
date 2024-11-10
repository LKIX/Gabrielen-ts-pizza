import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ListaIngredientesComponent } from "./lista-ingredientes/lista-ingredientes.component";


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ListaIngredientesComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'

})
export class AppComponent {
  title = 'pizzeria-frontend';
}
