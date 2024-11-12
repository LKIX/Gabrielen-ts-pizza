import { Routes } from '@angular/router';

export const routes: Routes = [
    {
        path: '',
        loadComponent: () => import('./lista-ingredientes/lista-ingredientes.component').then(m => m.ListaIngredientesComponent)
    },
    {
        path: 'registro-ingredientes',
        loadComponent: () => import('./registrar-ingrediente/registrar-ingrediente.component').then(m => m.RegistrarIngredienteComponent)
    }, {
        path: 'lista-ingredientes',
        loadComponent: () => import('./lista-ingredientes/lista-ingredientes.component').then(m => m.ListaIngredientesComponent)
    }, {
        path: 'lista-pizzas',
        loadComponent: () => import('./pizza/pizza.component').then(m => m.PizzaComponent)
    }, {
        path: 'registro-pizzas',
        loadComponent: () => import('./registrar-pizza/registrar-pizza.component').then(m => m.RegistrarPizzaComponent)
    }, {
        path: 'lista-bebidas-procesadas',
        loadComponent: () => import('./bebida-procesada/bebida-procesada.component').then(m => m.BebidaProcesadaComponent)
    }, {
        path: 'registro-bebidasProcesadas',
        loadComponent: () => import('./registrar-bebida-procesada/registrar-bebida-procesada.component').then(m => m.RegistrarBebidaProcesadaComponent)
    }
];
