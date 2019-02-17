import {Injectable} from '@angular/core';
import {ActivatedRouteSnapshot, Resolve, RouterStateSnapshot} from '@angular/router';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {environment} from '../../../environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  users: any[];

  constructor(private http: HttpClient) {
  }

  getUsers(): Observable<any> {
       return this.http.get(environment.apiUrl + '/user/all/');
   }
}
