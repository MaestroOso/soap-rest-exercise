import {Injectable} from '@angular/core';
import {ActivatedRouteSnapshot, Resolve, RouterStateSnapshot} from '@angular/router';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {environment} from '../../../environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CreditCardServiceService {

  creditcards: any[];
  constructor(private http: HttpClient) {
  }

  getCreditCards(): Observable<any> {
       return this.http.get(environment.apiUrl + '/creditcard/all/');
   }
}
