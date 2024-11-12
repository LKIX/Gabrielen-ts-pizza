import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { BebidaProcesada } from './BebidaProcesada'

@Injectable({
  providedIn: 'root'
})
export class BebidaProcesadaService {


  private baseURL = "http://localhost:8080/api/v1/ingredientes"; //cambiar luego de hacer el control


  constructor(private httpClient: HttpClient) { }

  obtenerListaDeBebidasProcesadas(): Observable<BebidaProcesada[]> {
    return this.httpClient.get<BebidaProcesada[]>(`${this.baseURL}`);
  }

  registrarBebidaProcesada(bebidaProcesada: BebidaProcesada): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}`, BebidaProcesada)

  }

  eliminarBebidaProcesada(id: number): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}/${id}`, BebidaProcesada);
  }
}
