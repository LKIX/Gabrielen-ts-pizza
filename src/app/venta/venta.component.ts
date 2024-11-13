
import { NgFor } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Venta } from '../venta';
import { VentaService } from '../venta.service';

@Component({
  selector: 'app-venta',
  standalone: true,
  imports: [NgFor],
  templateUrl: './venta.component.html',
  styleUrl: './venta.component.css'
})
export class VentaComponent implements OnInit {

  ventas: Venta[];

  constructor(private ventaServicio: VentaService, private router: Router) { }

  ngOnInit(): void {
    this.obtenerVenta();
  }

  private obtenerVenta() {

    this.ventaServicio.obtenerListaDeVentas().subscribe(dato => {
      this.ventas = dato;
    })
  }

  eliminarVenta(id: number) {
    this.ventaServicio.eliminarVenta(id).subscribe(dato => {
      console.log(dato);
      this.obtenerVenta();
    })
  }

  redirigirVenta() {
    this.router.navigate(["/registro-venta"])
  }


}
