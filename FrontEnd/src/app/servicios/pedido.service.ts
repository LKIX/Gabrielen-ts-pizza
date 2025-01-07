
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Pedido } from '../typescript/Pedido';

@Injectable({
  providedIn: 'root'
})
export class PedidoService {


  private baseURL = "http://localhost:8080/api/v1/pedidos";


  constructor(private httpClient: HttpClient) { }

  obtenerListaDePedidos(): Observable<Pedido[]> {
    return this.httpClient.get<Pedido[]>(`${this.baseURL}`);
  }

  registrarPedido(pedido: Pedido): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}`, pedido)

  }

  eliminarPedido(id: number): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}/${id}`, Pedido);
  }

  registrarVenta(pedido: Pedido): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}/${"v"}`, pedido)
  }
}
