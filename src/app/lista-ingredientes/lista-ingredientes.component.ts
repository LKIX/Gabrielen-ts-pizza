
import { IngredienteService } from './../ingrediente.service';
import { NgFor } from '@angular/common';
import { Ingrediente } from './../ingrediente';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-lista-ingredientes',
  standalone: true,
  imports: [NgFor],
  templateUrl: './lista-ingredientes.component.html',
  styleUrl: './lista-ingredientes.component.css'
})
export class ListaIngredientesComponent implements OnInit {

  ingredientes: Ingrediente[];

  constructor(private ingredienteServicio: IngredienteService, private router: Router) { }

  ngOnInit(): void {
    this.obtenerIngredientes();
  }

  private obtenerIngredientes() {

    this.ingredienteServicio.obtenerListaDeIngredientes().subscribe(dato => {
      this.ingredientes = dato;
    })
  }

  eliminarIngrediente(id:number){
    this.ingredienteServicio.eliminarIngrediente(id).subscribe(dato =>{
      console.log(dato);
      this.obtenerIngredientes();
    })
  }

  redirigir() {
    this.router.navigate(["/registro-ingredientes"])
  }

}

