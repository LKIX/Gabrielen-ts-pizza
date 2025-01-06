import { Component, OnInit } from '@angular/core';
import { Ingrediente } from '../../typescript/ingrediente';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';  // Asegúrate de importar FormsModule
import { IngredienteService } from '../../servicios/ingrediente.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-registrar-ingrediente',
  standalone: true,
  imports: [CommonModule, FormsModule],  // Asegúrate de incluir FormsModule
  templateUrl: './editar-ingrediente.component.html',
  styleUrls: ['./editar-ingrediente.component.css']
})
export class EditarIngredienteComponent implements OnInit {

  ingrediente: Ingrediente = new Ingrediente();
  constructor(private ingredienteServicio: IngredienteService, private router: Router) { }

  ngOnInit(): void {
    console.log(this.ingrediente);
  }

  guardarIngrediente() {
    this.ingredienteServicio.registrarIngrediente(this.ingrediente).subscribe(dato => {
      console.log(dato);
      if (dato != null) {
        alert("Se agrego el ingrediente exitosamente")
      } else {
        alert("No se agrego el ingrediente porque ya existe")
      }
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
