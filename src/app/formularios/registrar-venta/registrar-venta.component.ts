import { Component, OnInit } from '@angular/core';
import { Venta } from '../../typescript/venta';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';  // Asegúrate de importar FormsModule
import { VentaService } from '../../servicios/venta.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-registrar-venta',
  standalone: true,
  imports: [CommonModule, FormsModule],  // Asegúrate de incluir FormsModule
  templateUrl: './registrar-venta.component.html',
  styleUrls: ['./registrar-venta.component.css']
})
export class RegistrarVentaComponent implements OnInit {

  venta: Venta = new Venta();
  ventas: Venta[];
  constructor(private ventaServicio: VentaService, private router: Router) { }
  buscarId: number;
  encontrar: boolean = false;
  respaldoNombre: string;
  respaldoPago: string;
  ngOnInit(): void {
    console.log(this.venta);
  }

  guardarVenta() {
    this.ventaServicio.registrarVenta(this.venta).subscribe(dato => {
      console.log(dato);
      this.irListaVentas();
    }, error => console.log(error));
    this.irListaVentas();
  }

  irListaVentas() {
    this.router.navigate(['venta'])
  }


  onSubmit() {
    console.log('arriba');
    console.log(this.venta);
    console.log(this.venta.pago);
    this.respaldoNombre = this.venta.nombre;
    this.respaldoPago = this.venta.pago;
    this.guardarVenta();
  }

  buscarVenta() {
    if (this.buscarId != 1) {
      this.ventaServicio.obtenerListaDeVentas().subscribe(dato => {
        this.ventas = dato;
      });
      console.log(this.ventas[0].id);
      for (let i = 0; i < this.ventas.length; i++) {
        if (this.buscarId == this.ventas[i].id) {
          this.encontrar = true;
          this.venta = this.ventas[i];
          console.log(this.venta);
          console.log(this.venta.pago);
        }
      }
      if (this.encontrar == false) {
        alert("No se encontró la venta");
      }
      else {
        this.encontrar = false;
      }
    }
  }
}
