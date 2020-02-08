import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
//importar componente de contatos
import { ContatoComponent } from './contato/contato.component'

const routes: Routes = [
  {
    path: "contato", component: ContatoComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
