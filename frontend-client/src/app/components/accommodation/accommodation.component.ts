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
  accommodation: Accommodation;
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
  dateStart: Date;
  dateEnd: Date;

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
