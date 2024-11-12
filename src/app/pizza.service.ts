
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Pizza } from './Pizza';

@Injectable({
  providedIn: 'root'
})
export class PizzaService {


  private baseURL = "http://localhost:8080/api/v1/pizzas";


  constructor(private httpClient: HttpClient) { }

  obtenerListaDePizzas(): Observable<Pizza[]> {
    return this.httpClient.get<Pizza[]>(`${this.baseURL}`);
  }

  registrarPizza(pizza: Pizza): Observable<Object> {
    //console.log(pizza.ID, pizza.idsPizza, pizza.nombre, pizza.precio, pizza.precioPizzaGrande, pizza.precioPizzaIndividual);
    return this.httpClient.post(`${this.baseURL}`, pizza)

  }

  eliminarPizza(ID: number): Observable<Object> {
    return this.httpClient.post(`${this.baseURL}/${ID}`, Pizza);
  }
}
