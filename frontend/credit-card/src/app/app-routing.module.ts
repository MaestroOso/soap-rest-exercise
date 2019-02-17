import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CreditCardComponentComponent } from './components/credit-card-component/credit-card-component.component';
import { MovementComponentComponent } from './components/movement-component/movement-component.component';
import { UserComponentComponent } from './components/user-component/user-component.component';
import { CompleteComponent } from './components/complete/complete.component'

const routes: Routes = [
  { path: '', redirectTo: '/all', pathMatch: 'full' },
  { path: 'all', component: CompleteComponent },
  { path: 'users', component: UserComponentComponent },
  { path: 'creditcards', component: CreditCardComponentComponent },
  { path: 'movements', component: MovementComponentComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
