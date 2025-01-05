import { ListaIngredientesComponent } from "../listas/lista-ingredientes/lista-ingredientes.component";
import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { RegistrarIngredienteComponent } from "../formularios/registrar-ingrediente/registrar-ingrediente.component";

const routes: Routes = [{ path: 'ingredientes', component: ListaIngredientesComponent },
{ path: '', redirectTo: 'ingredientes', pathMatch: 'full' },
{ path: 'registrar-ingrediente', component: RegistrarIngredienteComponent }];

@NgModule
  ({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })

export class AppRoutingModuke { }
