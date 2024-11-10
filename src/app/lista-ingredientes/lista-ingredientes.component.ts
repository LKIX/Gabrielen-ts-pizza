import { NgFor } from '@angular/common';
import { Ingrediente } from './../ingrediente';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lista-ingredientes',
  standalone: true,
  imports: [NgFor],
  templateUrl: './lista-ingredientes.component.html',
  styleUrl: './lista-ingredientes.component.css'
})
export class ListaIngredientesComponent implements OnInit {

  ingredientes:Ingrediente[];

  constructor() {}

  ngOnInit(): void {
    this.ingredientes =[{
        "id":"1234",
        "nombre": "Queso",
        "cantidad": "100",
    },
    {
        "id":"1235",
        "nombre": "Tomate",
        "cantidad": "25",
    }
  ];
  }


}

