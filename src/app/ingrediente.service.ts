import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ingrediente } from './ingrediente';

@Injectable({
  providedIn: 'root'
})
export class IngredienteService {


  private baseURL = "http://localhost:8080/api/v1/ingredientes";

  constructor(private httpClient: HttpClient) { }

  obtenerListaDeIngredientes(): Observable<Ingrediente[]> {
    return this.httpClient.get<Ingrediente[]>(`${this.baseURL}`);
  }
}
