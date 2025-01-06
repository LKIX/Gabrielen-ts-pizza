import { Component, OnInit } from '@angular/core';
import { Producto } from '../../typescript/producto';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';  // Asegúrate de importar FormsModule
import { ProductoService } from '../../servicios/producto.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-editar-producto',
  standalone: true,
  imports: [CommonModule, FormsModule],  // Asegúrate de incluir FormsModule
  templateUrl: './editar-producto.component.html',
  styleUrls: ['./editar-producto.component.css']
})
export class EditarProductoComponent implements OnInit {
  BuscarId: number;
  producto: Producto = new Producto();
  productos: Producto[];
  encontrar: boolean = false;
  constructor(private productoServicio: ProductoService, private router: Router) { }

  ngOnInit(): void {
    console.log(this.producto);
  }

  reemplazarProducto() {
    this.productoServicio.registrarProducto(this.producto).subscribe(dato => {
      console.log(dato);
      this.irListaProductos();
    }, error => console.log(error));
  }

  irListaProductos() {
    this.router.navigate(['producto'])
  }


  onSubmit() {
    this.reemplazarProducto();
  }

  buscarProducto() {
    if (this.BuscarId != 1) {
      this.productoServicio.obtenerListaDeProductos().subscribe(dato => {
        this.productos = dato;
      });
      console.log(this.productos[0].id);
      for (let i = 0; i < this.productos.length; i++) {
        if (this.BuscarId == this.productos[i].id) {
          this.encontrar = true;
          this.producto = this.productos[i];
          console.log(this.producto);
        }
      }
      if (this.encontrar == false) {
        alert("No se encontró el producto");
      }
      else {
        this.encontrar = false;
      }
    }
    else {
      alert("ID del producto base");
    }
  }
}
