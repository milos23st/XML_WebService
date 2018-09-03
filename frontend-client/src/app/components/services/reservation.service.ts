import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Reservation } from './../models/reservation';
import { Observable } from 'rxjs/Observable';


const httpOptions = {
        headers: new HttpHeaders({ 'Content-type': 'application/json'})
      };


@Injectable({
  providedIn: 'root'
})
export class ReservationService {

  private url_reservation = 'https://localhost:8443/rezervacija';

  constructor(private http: HttpClient) { }

  addReservation(rezervacija: Reservation, accommodationId: string, userId: string): Observable<Reservation> {
    return this.http.post<Reservation>(this.url_reservation + '?smestaj=' + accommodationId +
     '&korisnik=' + userId , rezervacija, httpOptions);
  }

  deleteRezervacija(id: string): Observable<Reservation> {
    return this.http.delete<Reservation>(this.url_reservation + '/' + id, httpOptions);
  }

}
