
import { ProductoService } from '../../servicios/producto.service';
import { NgFor } from '@angular/common';
import { Producto } from '../../typescript/producto';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-lista-Productos',
  standalone: true,
  imports: [NgFor],
  templateUrl: './Producto.component.html',
  styleUrl: './Producto.component.css'
})
export class ProductoComponent implements OnInit {

  Productos: Producto[];

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


}
