
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Venta } from '../typescript/venta';

@Injectable({
  providedIn: 'root'
})
export class VentaService {


  private baseURL = "http://localhost:8080/api/v1/ventas";


  constructor(private httpClient: HttpClient) { }

  obtenerListaDeVentas(): Observable<Venta[]> {
    return this.httpClient.get<Venta[]>(`${this.baseURL}`);
  }

  registrarVenta(nombre : String, id: number): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}`, nombre)

  }

  eliminarVenta(id: number): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}/${id}`, Venta);
  }
}
