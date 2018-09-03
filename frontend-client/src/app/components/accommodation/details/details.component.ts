import { Component, OnInit } from '@angular/core';
import { Accommodation } from '../accommodation';
import { AccommodationService } from '../../services/accommodation.service';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { Reservation } from '../../models/reservation';
import { ReservationService } from '../../services/reservation.service';
import { User } from '../../user/user';

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

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private accommodationService: AccommodationService,
    private reservationService: ReservationService
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
  }

    getAccommodation(id: string) {
    this.accommodationService.getAccommodationById(id).subscribe(
      data => {
        this.accommodation = data;
        this.accommodation.price = Number(localStorage.getItem(this.accommodationId));
      }
    );
  }

  reserve() {

    this.reservation = new Reservation(new Date(this.date1) , new Date(this.date2), this.accommodation.price);
      this.reservationService.addReservation(this.reservation, this.accommodationId, this.user.id).subscribe();


  }


}
