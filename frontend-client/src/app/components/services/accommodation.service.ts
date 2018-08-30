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

  private url_smestaj = 'https://localhost:8443/smestaj';

  
  private url_check_dod = '';
  private url_check_tip = '';
  private url_check_kat = '';





  constructor(private http: HttpClient) { }


  getAccommodations(): Observable<Accommodation[]> {
    return this.http.get<Accommodation[]>(this.url_smestaj, httpOptions);
  }

  getAccommodationById(id: string): Observable<Accommodation> {
    return this.http.get<Accommodation>(this.url_smestaj + '/' + id, httpOptions);
  }

  search(model: any, dodatne: String[], tipovi: String[], kategorije: String[]) {
    this.url_check_dod = '';
    this.url_check_kat = '';
    this.url_check_tip = '';

    if (dodatne.length !== 0) {
      for (const d of dodatne) {
        this.url_check_dod = this.url_check_dod + '&dodatna=' + d;
      }
    }
    if (tipovi.length !== 0) {
      for (const t of tipovi) {
        this.url_check_tip = this.url_check_tip + '&tip=' + t;
      }
    }
    if (kategorije.length !== 0) {
      for (const k of kategorije) {
        this.url_check_kat = this.url_check_kat + '&kategorija=' + k;
      }
    }
    return this.http.get<Accommodation[]>(this.url_smestaj + '/search?mesto=' + model.mesto + '&brOsoba=' + model.peopleM +
    '&datumOd=' + model.dateS + '&datumDo=' + model.dateE + this.url_check_dod + this.url_check_tip + this.url_check_kat);
  }
  
  
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
