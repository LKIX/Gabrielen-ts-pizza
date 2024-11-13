import { Component, OnInit } from '@angular/core';
import { Producto } from '../producto';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';  // Asegúrate de importar FormsModule
import { ProductoService } from '../producto.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-registrar-producto',
  standalone: true,
  imports: [CommonModule, FormsModule],  // Asegúrate de incluir FormsModule
  templateUrl: './registrar-producto.component.html',
  styleUrls: ['./registrar-producto.component.css']
})
export class RegistrarProductoComponent implements OnInit {

  producto: Producto = new Producto();
  constructor(private productoServicio: ProductoService, private router: Router) { }

  ngOnInit(): void {
    console.log(this.producto);
  }

  guardarProducto() {
    this.productoServicio.registrarProducto(this.producto).subscribe(dato => {
      console.log(dato);
      this.irListaProductos();
    }, error => console.log(error));
  }

  irListaProductos() {
    this.router.navigate(['lista-productos'])
  }


  onSubmit() {
    this.guardarProducto();
  }
}
