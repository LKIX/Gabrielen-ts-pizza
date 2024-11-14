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
      if(dato!=null){
        alert("Se agrego el producto exitosamente")
      }else{
        alert("No se agrego el producto porque un ingrediente elegido no existe")
      }
      this.irListaProductos();
    }, error => console.log(error));
  }

  irListaProductos() {
    this.router.navigate(['producto'])
  }

  anadirIngrediente() {

  }

  onSubmit() {
    this.guardarProducto();
  }
}
