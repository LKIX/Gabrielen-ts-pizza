import { IngredienteService } from '../../servicios/ingrediente.service';
import { NgFor } from '@angular/common';
import { Ingrediente } from '../../typescript/ingrediente';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-lista-ingredientes',
  standalone: true,
  imports: [NgFor, CommonModule, FormsModule],
  templateUrl: './lista-ingredientes.component.html',
  styleUrls: ['./lista-ingredientes.component.css'] // Corrige 'styleUrl' a 'styleUrls'
})

export class ListaIngredientesComponent implements OnInit {

  ingredientes: Ingrediente[]; // Inicializa la lista de ingredientes
  ingredienteBuscados: Ingrediente[];
  busqueda: string = ''; // Variable para almacenar la búsqueda

  constructor(private ingredienteServicio: IngredienteService, private router: Router) { }

  ngOnInit(): void {
    this.obtenerIngredientes();
  }

  private obtenerIngredientes() {
    this.ingredienteServicio.obtenerListaDeIngredientes().subscribe(dato => {
      this.ingredientes = dato;
    });
  }

  eliminarIngrediente(id: number) {
    this.ingredienteServicio.eliminarIngrediente(id).subscribe(dato => {
      console.log(dato);
      if (dato) {
        alert("Se eliminó el ingrediente exitosamente");
      } else {
        alert("No se eliminó el ingrediente porque está siendo usado");
      }
      this.obtenerIngredientes();
    });
  }

  redirigir() {
    this.router.navigate(["/registro-ingredientes"]);
  }
  almacenarBusqueda() {
    console.log('Valor de búsqueda almacenado:', this.busqueda); // Muestra el valor en la consola
    for (let i = 0; i < this.ingredientes.length; i++) {
      if (this.busqueda == this.ingredientes[i].nombre || this.busqueda == String(this.ingredientes[i].id)) {
      }
      else {
        this.ingredientes.splice(i, 1);
        i--;
      }

    }
  }
  actualizar() {
    this.obtenerIngredientes();
  }
  editar() {
    this.router.navigate(["/editar-ingrediente"]);
  }
}
