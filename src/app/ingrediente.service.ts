import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class IngredienteService {

  constructor() { }

  private baseUrl = "http://localhost:8080/api/v1/ingredientes";
}
