
import { NgFor } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Venta } from '../../typescript/venta';
import { VentaService } from '../../servicios/venta.service';

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
      console.log(dato);
      this.ventas = dato;
    })
  }

  eliminarVenta(id: number) {
    this.ventaServicio.eliminarVenta(id).subscribe(dato => {
      console.log(dato);
      alert("la venta se ha eliminado exitosamente")
      this.obtenerVenta();
    })
  }

  redirigirVenta() {
    this.router.navigate(["/registro-venta"])
  }
  editar() {
    this.router.navigate(["/registrar-venta"]);
  }

}
