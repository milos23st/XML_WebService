import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { AdditionalService } from './../models/additionalService';
import { Accommodation } from './../accommodation/accommodation';


const httpOptions = {
        headers: new HttpHeaders({ 'Content-type': 'application/json'})
      };


@Injectable({
  providedIn: 'root'
})



export class AccommodationService {
    
  private url_dodatnaUsl = 'http://localhost:8080/dodatneusluge';


  constructor(private http: HttpClient) { }
  
  
  getDodatne(): Observable<AdditionalService[]> {
      return this.http.get<AdditionalService[]>(this.url_dodatnaUsl, httpOptions);
    }
}
