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
  private url_login = 'https://localhost:8443/auth/loginUser';
  private url_korisnik = 'https://localhost:8443/auth/user';

   addUser(user: User): Observable<User> {
    return this.http.post<User>(this.url_register, user, httpOptions);
  }

  loginUser(id: any): Observable<User> {
    return this.http.get<User>(this.url_login + '/' + id.sub + '/');
  }

  getKorisnik(id: any): Observable<User> {
    return this.http.get<User>(this.url_korisnik + '/' + id.sub + '/');
  }


// -------------


  constructor(private http: HttpClient) { }
}

