import { Component, OnInit } from '@angular/core';
import { Ingrediente } from '../ingrediente';

@Component({
  selector: 'app-registrar-ingrediente',
  standalone: true,
  imports: [],
  templateUrl: './registrar-ingrediente.component.html',
  styleUrl: './registrar-ingrediente.component.css'
})
export class RegistrarIngredienteComponent implements OnInit {
  ingrediente: Ingrediente = new Ingrediente();
  constructor() {
  }
  ngOnInit(): void {
    console.log(this.ingrediente);
  }
  onSubmit() {
    console.log(this.ingrediente);
  }

}
