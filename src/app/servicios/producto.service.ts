
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Producto } from '../typescript/producto';

@Injectable({
  providedIn: 'root'
})
export class ProductoService {


  private baseURL = "http://localhost:8080/api/v1/productos";


  constructor(private httpClient: HttpClient) { }

  obtenerListaDeProductos(): Observable<Producto[]> {
    return this.httpClient.get<Producto[]>(`${this.baseURL}`);
  }

  registrarProducto(Producto: Producto): Observable<Object> {
    console.log(Producto);
    return this.httpClient.post(`${this.baseURL}`, Producto)

  }

  eliminarProducto(id: number): Observable<Object> {

    return this.httpClient.post(`${this.baseURL}/${id}`, Producto);
  }
}
