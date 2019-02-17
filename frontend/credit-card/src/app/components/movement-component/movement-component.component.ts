import { Component, OnInit } from '@angular/core';
import { MovementServiceService } from '../../services/movement/movement-service.service'
import { Observable } from 'rxjs';
import { MatTableModule, MatTableDataSource, MatSort } from '@angular/material';
import { DataSource } from '@angular/cdk/table';

@Component({
  selector: 'app-movement-component',
  templateUrl: './movement-component.component.html',
  styleUrls: ['./movement-component.component.css']
})
export class MovementComponentComponent implements OnInit {

  movements: Observable<any>;

  columnsToDisplay = ['id','amount','date','type','creditCardNumber'];

  constructor(private movementService: MovementServiceService) { }

  ngOnInit() {
    this.movementService.getMovements().subscribe(data => {
      this.movements = data;
      console.log("Movements ", data);
    });
  }

}
