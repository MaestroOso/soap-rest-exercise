import { Component, OnInit } from '@angular/core';
import { CreditCardComponentComponent } from '../credit-card-component/credit-card-component.component';
import { MovementComponentComponent } from '../movement-component/movement-component.component';
import { UserComponentComponent } from '../user-component/user-component.component';

@Component({
  selector: 'app-complete',
  templateUrl: './complete.component.html',
  styleUrls: ['./complete.component.css']
})
export class CompleteComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
