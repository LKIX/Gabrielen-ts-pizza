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
  constructor(private ventaServicio: VentaService, private router: Router) { }

  ngOnInit(): void {
    console.log(this.venta);
  }

  guardarVenta() {
    this.ventaServicio.registrarVenta(this.venta.nombre, this.venta.id).subscribe(dato => {
      console.log(dato);
      this.irListaVentas();
    }, error => console.log(error));
  }

  irListaVentas() {
    this.router.navigate(['venta'])
  }


  onSubmit() {
    this.guardarVenta();
  }
}
