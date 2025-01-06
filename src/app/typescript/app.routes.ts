import { Routes } from '@angular/router';

export const routes: Routes = [
    {
        path: '',
        loadComponent: () => import('../listas/lista-ingredientes/lista-ingredientes.component').then(m => m.ListaIngredientesComponent)
    },
    {
        path: 'registro-ingredientes',
        loadComponent: () => import('../formularios/registrar-ingrediente/registrar-ingrediente.component').then(m => m.RegistrarIngredienteComponent)
    }, {
        path: 'lista-ingredientes',
        loadComponent: () => import('../listas/lista-ingredientes/lista-ingredientes.component').then(m => m.ListaIngredientesComponent)
    }, {
        path: 'producto',
        loadComponent: () => import('../listas/producto/producto.component').then(m => m.ProductoComponent)
    }, {
        path: 'registro-Producto',
        loadComponent: () => import('../formularios/registrar-producto/registrar-producto.component').then(m => m.RegistrarProductoComponent)
    }, {
        path: 'pedido',
        loadComponent: () => import('../listas/pedido/pedido.component').then(m => m.PedidoComponent)
    }
    , {
        path: 'registro-pedido',
        loadComponent: () => import('../formularios/registrar-pedido/registrar-pedido.component').then(m => m.RegistrarPedidoComponent)
    },
    {
        path: 'venta',
        loadComponent: () => import('../listas/venta/venta.component').then(m => m.VentaComponent)
    }
    , {
        path: 'registro-venta',
        loadComponent: () => import('../formularios/registrar-venta/registrar-venta.component').then(m => m.RegistrarVentaComponent)
    }

    , {
        path: 'editar-ingrediente',
        loadComponent: () => import('../formularios/editar-ingrediente/editar-ingrediente.component').then(m => m.EditarIngredienteComponent)
    }

    , {
      path: 'editar-producto',
      loadComponent: () => import('../formularios/editar-producto/editar-producto.component').then(m => m.EditarProductoComponent),
    }








];
