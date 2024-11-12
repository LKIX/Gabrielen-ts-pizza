import { Component, OnInit } from '@angular/core';
import { Ingrediente } from '../ingrediente';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';  // Asegúrate de importar FormsModule
import { IngredienteService } from '../ingrediente.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-registrar-ingrediente',
  standalone: true,
  imports: [CommonModule, FormsModule],  // Asegúrate de incluir FormsModule
  templateUrl: './registrar-ingrediente.component.html',
  styleUrls: ['./registrar-ingrediente.component.css']
})
export class RegistrarIngredienteComponent implements OnInit {

  ingrediente: Ingrediente = new Ingrediente();
  constructor(private ingredienteServicio: IngredienteService, private router: Router) { }

  ngOnInit(): void {
    console.log(this.ingrediente);
  }

  guardarIngrediente() {
    this.ingredienteServicio.registrarIngrediente(this.ingrediente).subscribe(dato => {
      console.log(dato);
      this.irListaIngredientes();
    }, error => console.log(error));
  }

  irListaIngredientes() {
    this.router.navigate(['lista-ingredientes'])
  }


  onSubmit() {
    this.guardarIngrediente();
  }
}
