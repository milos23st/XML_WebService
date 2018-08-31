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

  accommodationId: string;
  accommodation: Accommodation;
  datumOd: string;
  datumDo: string;
  naziv: string;
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
        this.datumOd = localStorage.getItem('datumOd');
        this.datumDo = localStorage.getItem('datumDo');
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
