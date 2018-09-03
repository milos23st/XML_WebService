import { Component, OnInit } from '@angular/core';
import { Accommodation } from '../accommodation';
import { AccommodationService } from '../../services/accommodation.service';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { Reservation } from '../../models/reservation';
import { ReservationService } from '../../services/reservation.service';
import { User } from '../../user/user';
import { TokenStorage } from '../../login/token-storage';
import * as jwt_decode from 'jwt-decode';
import { UserService } from '../../user/user.service';
import { CommentsService } from '../../services/comments.service';
import { Comment } from '../../models/comment';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

  accommodation: Accommodation;
  accommodationId: string;
  date1: string;
  date2: string;
  ime: string;
  koment: string;
  komentar: Comment;
  user: User;
  reservation: Reservation;
  dopustenKomentar = false;

  constructor(
    private token: TokenStorage,
    private route: ActivatedRoute,
    private router: Router,
    private accommodationService: AccommodationService,
    private reservationService: ReservationService,
    private korisnikService: UserService,
    private commentsService: CommentsService
  ) { }

  ngOnInit() {

      if (this.route.snapshot.params['accommodationId']) {
      this.route.params.subscribe((params: Params) => {
        this.accommodationId = params['accommodationId'];
        this.getAccommodation(this.accommodationId);
        this.date1 = localStorage.getItem('date1');
        this.date2 = localStorage.getItem('date2');
      });
    }
    if (this.token.getToken() !== null) {
      this.korisnikService.getKorisnik(jwt_decode(this.token.getToken())).subscribe(
        data => {
          this.user = data;
          this.dopustenKomentar = true;

        }
      );
    }
  }

    getAccommodation(id: string) {
    this.accommodationService.getAccommodationById(id).subscribe(
      data => {
        this.accommodation = data;
        this.accommodation.price = Number(localStorage.getItem(this.accommodationId));

      }
    );
  }

  addComment() {
    if (this.token.getToken() === null) {
      this.router.navigate(['login']);
    } else {
      this.sendKomentar();
      (<HTMLInputElement>document.getElementById('txtarea')).value = '';
      console.log('Komentar je poslat na odobravanje');
    }
  }


  sendKomentar() {
    this.korisnikService.getKorisnik(jwt_decode(this.token.getToken())).subscribe(
      data => {
        this.ime = data.ime;
        this.komentar = new Comment(this.koment , false, this.ime);
        console.log(this.komentar);
        this.commentsService.addComment(this.komentar, this.accommodationId).subscribe();
      }
    );
  }

  reserve() {

    if (this.token.getToken() === null) {
    console.log('Morate biti ulogovani');
    this.router.navigate(['login']);

    } else {
    this.reservation = new Reservation(new Date(this.date1) , new Date(this.date2), this.accommodation.price);
      this.reservationService.addReservation(this.reservation, this.accommodationId, this.user.id).subscribe();
      this.router.navigate(['accommodation']);
    }
  }


}
