import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';  // Asegúrate de importar FormsModule
import { Router } from '@angular/router';
import { BebidaProcesada } from '../BebidaProcesada';
import { BebidaProcesadaService } from '../bebida-procesada.service';


@Component({
  selector: 'app-registrar-bebida-procesada',
  standalone: true,
  imports: [CommonModule, FormsModule],  // Asegúrate de incluir FormsModule
  templateUrl: './registrar-bebida-procesada.component.html',
  styleUrls: ['./registrar-bebida-procesada.component.css']
})
export class RegistrarBebidaProcesadaComponent implements OnInit {

  bebidaProcesada: BebidaProcesada = new BebidaProcesada();
  constructor(private bebidaProcesadaServicio: BebidaProcesadaService, private router: Router) { }

  ngOnInit(): void {
    console.log(this.bebidaProcesada);
  }

  guardarBebidaProcesada() {
    this.bebidaProcesadaServicio.registrarBebidaProcesada(this.bebidaProcesada).subscribe(dato => {
      console.log(dato);
      this.irListaBebidaProcesada();
    }, error => console.log(error));
  }

  irListaBebidaProcesada() {
    this.router.navigate(['lista-bebidas-procesadas'])
  }


  onSubmit() {
    this.guardarBebidaProcesada();
  }
}
