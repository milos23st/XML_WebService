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
  datumOd: Date;
  datumDo: Date;

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
    this.dates.push(this.model.datumOd);
    this.dates.push(this.model.datumDo);
    localStorage.setItem('datumOd', this.dates[0]);
    localStorage.setItem('datumOd', this.dates[1]);
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
          for (i = 0; i < this.accommodation.length; i++) {
            this.datumOd = new Date(this.model.datumOd);
            this.datumDo = new Date(this.model.datumDo);
            this.accommodation[i].price = 0;
            while (this.datumOd <= this.datumDo) {
              this.accommodation[i].price += this.accommodation[i].terms[this.datumOd.getMonth()].price;
              this.datumOd = new Date(this.datumOd.getTime() + (60 * 60 * 24 * 1000));
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
