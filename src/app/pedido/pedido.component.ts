
import { PedidoService } from './../pedido.service';
import { NgFor } from '@angular/common';
import { Pedido } from './../Pedido';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-lista-Pedidos',
  standalone: true,
  imports: [NgFor],
  templateUrl: './Pedido.component.html',
  styleUrl: './Pedido.component.css'
})
export class PedidoComponent implements OnInit {

  Pedidos: Pedido[];

  constructor(private PedidoServicio: PedidoService, private router: Router) { }

  ngOnInit(): void {
    this.obtenerPedidos();
  }

  private obtenerPedidos() {

    this.PedidoServicio.obtenerListaDePedidos().subscribe(dato => {
      this.Pedidos = dato;
    })
  }

  eliminarPedido(id: number) {
    this.PedidoServicio.eliminarPedido(id).subscribe(dato => {
      console.log(dato);

      this.obtenerPedidos();
    })
  }

  redirigirPedido() {
    this.router.navigate(["/registro-pedido"])
  }


}
