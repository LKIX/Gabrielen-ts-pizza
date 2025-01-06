import { Component, OnInit } from '@angular/core';
import { Ingrediente } from '../../typescript/ingrediente';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';  // Asegúrate de importar FormsModule
import { IngredienteService } from '../../servicios/ingrediente.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-editar-ingrediente',
  standalone: true,
  imports: [CommonModule, FormsModule],  // Asegúrate de incluir FormsModule
  templateUrl: './editar-ingrediente.component.html',
  styleUrls: ['./editar-ingrediente.component.css']
})
export class EditarIngredienteComponent implements OnInit {
  BuscarId: number;
  ingrediente: Ingrediente = new Ingrediente();
  ingredientes: Ingrediente[];
  encontrar: boolean = false;
  constructor(private ingredienteServicio: IngredienteService, private router: Router) { }

  ngOnInit(): void {
    console.log(this.ingrediente);
  }

  reemplazarIngrediente() {
    this.ingredienteServicio.reemplazarIngrediente(this.ingrediente).subscribe(dato => {
      console.log(dato);
      this.irListaIngredientes();
    }, error => console.log(error));
  }

  irListaIngredientes() {
    this.router.navigate(['lista-ingredientes'])
  }


  onSubmit() {
    this.reemplazarIngrediente();
  }

  buscarIngrediente() {
    if (this.BuscarId != 1) {
      this.ingredienteServicio.obtenerListaDeIngredientes().subscribe(dato => {
        this.ingredientes = dato;
      });
      console.log(this.ingredientes[0].id);
      for (let i = 0; i < this.ingredientes.length; i++) {
        if (this.BuscarId == this.ingredientes[i].id) {
          this.encontrar = true;
          this.ingrediente = this.ingredientes[i];
          console.log(this.ingrediente);
        }
      }
      if (this.encontrar == false) {
        alert("No se encontró el ingrediente");
      }
      else {
        this.encontrar = false;
      }
    }
    else {
      alert("ID del ingrediente base");
    }
  }
}
