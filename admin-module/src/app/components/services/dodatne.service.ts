import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Dodatneusluge } from '../models/dodatneusluge';
import { NoveDodatneusluge } from '../models/nove-dodatneusluge';
import { of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json', 'Access-Control-Allow-Origin': 'true' })
};

@Injectable({
  providedIn: 'root'
})
export class DodatneService {

  private url_dodatne = 'https://localhost:8443/dodatneusluge';

    getDodatneUsluge(): Observable<Dodatneusluge[]> {
    return this.http.get<Dodatneusluge[]>(this.url_dodatne);
  }
  getDodatnaById(id: string): Observable<Dodatneusluge> {
    return this.http.get<Dodatneusluge>(this.url_dodatne + '/' + id);
  }

    addDodatnaaa(dodatnaUsluga: Dodatneusluge): Observable<Dodatneusluge> {
    return this.http.post<Dodatneusluge>(this.url_dodatne, dodatnaUsluga, httpOptions);
  }

    addDodatna(dodatnausluga: NoveDodatneusluge): Observable<NoveDodatneusluge> {
    return this.http.post<NoveDodatneusluge>(this.url_dodatne, dodatnausluga, httpOptions).pipe(
      catchError(this.handleError<NoveDodatneusluge>('insertDodatnausluga'))
    )
  }

  updateDodatnausluga(dodatnausluga: Dodatneusluge): Observable<Dodatneusluge> {
    const id = typeof dodatnausluga === 'string' ? dodatnausluga : dodatnausluga.id;
    const url = `${this.url_dodatne}/${id}`;
    return this.http.put<Dodatneusluge>(url, dodatnausluga, httpOptions).pipe(
      catchError(this.handleError<Dodatneusluge>('updateDodatnausluga'))
    );
  }

  deleteDodatnausluga(dodatnausluga: Dodatneusluge | string): Observable<Dodatneusluge> {
    const id = typeof dodatnausluga === 'string' ? dodatnausluga : dodatnausluga.id;
    const url = `${this.url_dodatne}/${id}`;

    return this.http.delete<Dodatneusluge>(url, httpOptions).pipe(
      catchError(this.handleError<Dodatneusluge>('deleteDodatnausluga'))
    );
  }

  
  constructor(private http: HttpClient) { }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption


      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }
}
