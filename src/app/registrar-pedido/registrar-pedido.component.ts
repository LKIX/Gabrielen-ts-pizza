import { Component, OnInit } from '@angular/core';
import { Pedido } from '../Pedido';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';  // Asegúrate de importar FormsModule
import { PedidoService } from '../pedido.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-registrar-pedido',
  standalone: true,
  imports: [CommonModule, FormsModule],  // Asegúrate de incluir FormsModule
  templateUrl: './registrar-pedido.component.html',
  styleUrls: ['./registrar-pedido.component.css']
})
export class RegistrarPedidoComponent implements OnInit {

  pedido: Pedido = new Pedido();
  constructor(private pedidoServicio: PedidoService, private router: Router) { }

  ngOnInit(): void {
    console.log(this.pedido);
  }

  guardarPedido() {
    this.pedidoServicio.registrarPedido(this.pedido).subscribe(dato => {
      console.log(dato);
      if(dato== null){
        alert("No se guardo su pedido, debido a que ingreso un producto inexistente")
      }else{
        alert("Se ha guardado su producto exitosamente")
      }
      this.irListaPedidos();
    }, error => console.log(error));
  }

  irListaPedidos() {
    this.router.navigate(['/pedido'])
  }


  onSubmit() {
    this.guardarPedido();
  }
}
