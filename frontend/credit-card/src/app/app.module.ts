import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HttpClientModule }    from '@angular/common/http';
import { CreditCardComponentComponent } from './components/CreditCard/credit-card-component/credit-card-component.component';
import { MovementComponentComponent } from './components/movement-component/movement-component.component';

@NgModule({
  declarations: [
    AppComponent,
    CreditCardComponentComponent,
    MovementComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
