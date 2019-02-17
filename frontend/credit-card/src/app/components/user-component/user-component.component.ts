import { Component, OnInit } from '@angular/core';
import { UserService } from '../../services/user/user.service'
import { Observable } from 'rxjs';
import { MatTableModule, MatTableDataSource, MatSort } from '@angular/material';
import { DataSource } from '@angular/cdk/table';

@Component({
  selector: 'app-user-component',
  templateUrl: './user-component.component.html',
  styleUrls: ['./user-component.component.css']
})
export class UserComponentComponent implements OnInit {

  users: Observable<any>;

   columnsToDisplay = ['fullname', 'documentType', 'documentNumber', 'code'];

  constructor(private userService: UserService) {

   }

  ngOnInit() {
    this.userService.getUsers().subscribe(data => {
      this.users = data;
      console.log("La data es ", data);
    });
  }

}
