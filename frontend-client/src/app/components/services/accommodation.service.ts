import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { AdditionalService } from './../models/additionalService';
import { Accommodation } from './../accommodation/accommodation';
import { AccommodationType } from '../models/accommodationType';
import { AccommodationCategory } from './../models/accommodationCategory';



const httpOptions = {
        headers: new HttpHeaders({ 'Content-type': 'application/json'})
      };


@Injectable({
  providedIn: 'root'
})



export class AccommodationService {
    
  private url_dodatnaUsl = 'https://localhost:8443/dodatneUsluge';
  private url_tip = 'https://localhost:8443/tipovi';
  private url_kategorija = 'https://localhost:8443/kategorije';


  constructor(private http: HttpClient) { }
  
  
  getDodatne(): Observable<AdditionalService[]> {
      return this.http.get<AdditionalService[]>(this.url_dodatnaUsl, httpOptions);
    }

  getTipovi(): Observable<AccommodationType[]> {
      return this.http.get<AccommodationType[]>(this.url_tip, httpOptions);
    }

  getKategorije(): Observable<AccommodationCategory[]> {
      return this.http.get<AccommodationCategory[]>(this.url_kategorija, httpOptions);
    }
  
}
