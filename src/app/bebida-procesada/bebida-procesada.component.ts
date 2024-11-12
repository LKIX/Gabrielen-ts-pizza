
import { IngredienteService } from './../ingrediente.service';
import { NgFor } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BebidaProcesada } from '../BebidaProcesada';
import { BebidaProcesadaService } from '../bebida-procesada.service';

@Component({
  selector: 'app-lista-ingredientes',
  standalone: true,
  imports: [NgFor],
  templateUrl: './bebida-procesada.component.html',
  styleUrl: './bebida-procesada.component.css'
})
export class BebidaProcesadaComponent implements OnInit {

  bebidasProcesadas: BebidaProcesada[];

  constructor(private bebidaProcesadaServicio: BebidaProcesadaService, private router: Router) { }

  ngOnInit(): void {
    this.obtenerBebidasProcesadas();
  }

  private obtenerBebidasProcesadas() {

    this.bebidaProcesadaServicio.obtenerListaDeBebidasProcesadas().subscribe(dato => {
      this.bebidasProcesadas = dato;
    })
  }

  eliminarBebidaProcesada(id: number) {
    this.bebidaProcesadaServicio.eliminarBebidaProcesada(id).subscribe(dato => {
      console.log(dato);
      this.obtenerBebidasProcesadas();
    })
  }

  redirigirBebidasProcesadas() {
    this.router.navigate(["/registro-bebidasProcesadas"])
  }


}

