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
        path: 'producto',
        loadComponent: () => import('./producto/producto.component').then(m => m.ProductoComponent)
    }, {
        path: 'registro-Producto',
        loadComponent: () => import('./registrar-producto/registrar-producto.component').then(m => m.RegistrarProductoComponent)
    }, {
        path: 'pedido',
        loadComponent: () => import('./pedido/pedido.component').then(m => m.PedidoComponent)
    }
    , {
        path: 'registro-pedido',
        loadComponent: () => import('./registrar-pedido/registrar-pedido.component').then(m => m.RegistrarPedidoComponent)
    }




];
