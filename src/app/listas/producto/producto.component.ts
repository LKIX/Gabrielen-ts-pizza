
import { ProductoService } from '../../servicios/producto.service';
import { CommonModule, NgFor } from '@angular/common';
import { Producto } from '../../typescript/producto';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-lista-Productos',
  standalone: true,
  imports: [NgFor, CommonModule, FormsModule],
  templateUrl: './Producto.component.html',
  styleUrl: './Producto.component.css'
})
export class ProductoComponent implements OnInit {

  Productos: Producto[];

  busqueda: string = ''; // Variable para almacenar la búsqueda

  constructor(private ProductoServicio: ProductoService, private router: Router) { }

  ngOnInit(): void {
    this.obtenerProductos();
  }

  private obtenerProductos() {

    this.ProductoServicio.obtenerListaDeProductos().subscribe(dato => {
      this.Productos = dato;
    })
  }

  eliminarProducto(id: number) {
    this.ProductoServicio.eliminarProducto(id).subscribe(dato => {
      console.log(dato);
      if (dato) {
        alert("El producto se elimino satisfactoriamente")
      } else {
        alert("No se pudo eliminar su producto debido a que es un producto base")
      }
      this.obtenerProductos();
    })
  }

  redirigirProducto() {
    this.router.navigate(["/registro-Producto"])
  }
  almacenarBusqueda() {
    console.log('Valor de búsqueda almacenado:', this.busqueda); // Muestra el valor en la consola
    for (let i = 0; i < this.Productos.length; i++) {
      if (this.busqueda == this.Productos[i].nombre || this.busqueda == String(this.Productos[i].id)) {
      }
      else {
        this.Productos.splice(i, 1);
        i--;
      }

    }
  }
  actualizar() {
    this.obtenerProductos();
  }
  editar() {
    this.router.navigate(["/editar-producto"]);
  }

}
