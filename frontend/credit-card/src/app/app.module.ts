import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HttpClientModule }    from '@angular/common/http';
import { CreditCardComponentComponent } from './components/credit-card-component/credit-card-component.component';
import { MovementComponentComponent } from './components/movement-component/movement-component.component';
import { UserComponentComponent } from './components/user-component/user-component.component';

import { MatTableModule } from '@angular/material';
import { CompleteComponent } from './components/complete/complete.component';

@NgModule({
  declarations: [
    AppComponent,
    CreditCardComponentComponent,
    MovementComponentComponent,
    UserComponentComponent,
    CompleteComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    MatTableModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
