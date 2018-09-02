import { Component, OnInit } from '@angular/core';
import { Accommodation } from '../accommodation';
import { AccommodationService } from '../../services/accommodation.service';
import { ActivatedRoute, Params, Router } from '@angular/router';

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

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private accommodationService: AccommodationService
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

  reserve() {}


}
