import { Observable } from 'rxjs/Observable';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http: HttpClient) { }
  attemptAuth(ussername: string, password: string): Observable<any> {
    const credentials = { email: ussername, password: password };
    console.log('attempAuth ::' + ussername + '::::' + password);
    return this.http.post<any>(
      'https://localhost:8443/auth/loginUser/',
      credentials
    );
  }

}
