import { Component, OnInit } from '@angular/core';
import { Accommodation } from './accommodation';
import { AccommodationType } from '../models/AccommodationType';
import { AccommodationCategory } from '../models/AccommodationCategory';
import { AdditionalService } from '../models/additionalService';

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

  constructor() { }

  ngOnInit() {
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
