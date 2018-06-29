import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { catchError, retry } from 'rxjs/operators';

import { User } from './user';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


@Injectable()
export class UserService {

  private url_register = 'https://localhost:8443/auth/registerUser';
  
  private url_login = 'http://localhost:8080/auth/loginUser';

   addUser(user: User): Observable<User> {
    return this.http.post<User>(this.url_register, user, httpOptions);
    
  }
// -------------


  constructor(private http: HttpClient) { }
}

