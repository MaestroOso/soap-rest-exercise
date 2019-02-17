import { Component, OnInit } from '@angular/core';
import { CreditCardServiceService } from '../../services/creditcard/credit-card-service.service'
import { Observable } from 'rxjs';
import { MatTableModule, MatTableDataSource, MatSort } from '@angular/material';
import { DataSource } from '@angular/cdk/table';

@Component({
  selector: 'app-credit-card-component',
  templateUrl: './credit-card-component.component.html',
  styleUrls: ['./credit-card-component.component.css']
})
export class CreditCardComponentComponent implements OnInit {

  creditcards: Observable<any>;

  columnsToDisplay = ['number', 'franchise','token', 'userDocumentNumber', 'expDate'];

  constructor(private creditCardService: CreditCardServiceService) { }

  ngOnInit() {
    this.creditCardService.getCreditCards().subscribe(data => {
      this.creditcards = data;
      console.log("Credit Card ", data);
    })
  }

}
