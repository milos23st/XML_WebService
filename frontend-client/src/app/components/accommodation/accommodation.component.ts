import { Component, OnInit } from '@angular/core';
import { Accommodation } from './accommodation';
import { AccommodationType } from '../models/AccommodationType';
import { AccommodationCategory } from '../models/AccommodationCategory';
import { AdditionalService } from '../models/additionalService';
import { AccommodationService } from './../services/accommodation.service';

@Component({
  selector: 'app-accommodation',
  templateUrl: './accommodation.component.html',
  styleUrls: ['./accommodation.component.css']
})
export class AccommodationComponent implements OnInit {

  detailed = false;
  accommodation: Accommodation[];
  model: any = {};
  types: AccommodationType[];
  categories: AccommodationCategory[];
  additionalServices: AdditionalService[];

  results = false;
  chosenTypes = [];
  chosenCategories = [];
  chosenAdditionalServices = [];

  dates = [];
  cena: number;
  date1: Date;
  date2: Date;

  submitted = false;

  constructor(

          private accommodationService: AccommodationService

          ) { }

  ngOnInit() {

      this.accommodationService.getDodatne().subscribe(data => {
          this.additionalServices = data;
          for (const d of this.additionalServices) {
            d.checked = false;
          }
        });

      this.accommodationService.getTipovi().subscribe(data => {
      this.types = data;
      for (const t of this.types) {
        t.checked = false;
      }
    });
    this.accommodationService.getKategorije().subscribe(data => {
      this.categories = data;
      for (const k of this.categories) {
        k.checked = false;
      }
    });

     this.accommodationService.getAccommodations().subscribe(data => {
      this.accommodation = data;
      this.results = true;
     });

  }


  searchForAccommodation() {
    this.chosenAdditionalServices = [];
    this.chosenCategories = [];
    this.chosenTypes = [];
    for (const d of this.additionalServices) {
      if (d.checked) {
        this.chosenAdditionalServices.push(d.id);
      }
    }
    for (const t of this.types) {
      if (t.checked) {
        this.chosenTypes.push(t.id);
      }
    }
    for (const k of this.categories) {
      if (k.checked) {
        this.chosenCategories.push(k.id);
      }
    }
    this.dates = [];
    this.dates.push(this.model.dateS);
    this.dates.push(this.model.dateE);
    localStorage.setItem('date1', this.dates[0]);
    localStorage.setItem('date2', this.dates[1]);
    this.accommodationService
      .search(
        this.model,
        this.chosenAdditionalServices,
        this.chosenCategories,
        this.chosenTypes
      )
      .subscribe(data => {
        this.accommodation = data;
        if (this.accommodation.length === 0) {
          console.log('nije pronadjen takav smestaj');
        } else {
          // tslint:disable-next-line:prefer-const
          let i: number;
          // this.accommodation= [];
          for (i = 0; i < this.accommodation.length; i++) {
            this.date1 = new Date(this.model.dateS);
            this.date2 = new Date(this.model.dateE);
            this.accommodation[i].price = 0;
            while (this.date1 <= this.date2) {
              this.accommodation[i].price += this.accommodation[i].terms[1].price;
              this.date1 = new Date(this.date1.getTime() + (60 * 60 * 24 * 1000));
           }
           localStorage.setItem(this.accommodation[i].id, this.accommodation[i].price.toString());
          }
          this.results = true;
        }
      });
    window.scroll(0, 0);
  }


  toggleDetailed() {
    this.detailed = !this.detailed;
  }

  onSubmit() {

    this.submitted = true;

  }

  get diagnostic() { return JSON.stringify(this.model);
  }

}
