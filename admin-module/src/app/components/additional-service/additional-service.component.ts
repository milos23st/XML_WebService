import { Component, OnInit } from '@angular/core';
import { Dodatneusluge } from '../models/dodatneusluge';
import { DodatneService } from '../services/dodatne.service';
import { NoveDodatneusluge } from '../models/nove-dodatneusluge';
import { Location } from '@angular/common';
import { NgForm } from '@angular/forms/src/directives/ng_form';
import { ActivatedRoute, Params, Router } from '@angular/router';



@Component({
  selector: 'app-additional-service',
  templateUrl: './additional-service.component.html',
  styleUrls: ['./additional-service.component.css']
})
export class AdditionalServiceComponent implements OnInit {

  dodatnaUsluga = new Dodatneusluge('');
  dodatneUsluge: Dodatneusluge[];
  dodatnauslugaId: string;
  dodatneuslugeEdit: Dodatneusluge;

  novaDodatnaUsluga = new NoveDodatneusluge('');

  constructor(private dodatneService: DodatneService,
              private location: Location,
              private route: ActivatedRoute,
              private router: Router           
  ) { }

  ngOnInit() {
    this.getDodatneusluge();
    console.log('this.dodatneUsluge');

        if(this.route.snapshot.params['dodatnauslugaId']){
      this.route.params.subscribe(
        (params: Params) => {
          this.dodatnauslugaId = params["dodatnauslugaId"];
        }
      );
      this.getDodatnaById();
    }  
  }
    
  

    getDodatneusluge(): void {
    this.dodatneService.getDodatneUsluge()
      .subscribe(dodatneUsluge => this.dodatneUsluge = dodatneUsluge);
  }

        getDodatnaById() {
      this.dodatneService.getDodatnaById(this.dodatnauslugaId).subscribe(
        (dodatnausluga) => this.dodatneuslugeEdit = dodatnausluga
      );
    }
     deleteDodatnausluga(dodatnausluga: Dodatneusluge) {
      this.dodatneService.deleteDodatnausluga(dodatnausluga).subscribe();
      this.dodatneUsluge = this.dodatneUsluge.filter(d => d !== dodatnausluga);
    }

    novaDodatnauslugaSubmit(forma: NgForm) {
    this.novaDodatnaUsluga.name = forma.value.name;
   
    this.dodatneService.addDodatna(this.novaDodatnaUsluga).subscribe();
    forma.reset();
    //this.location.back();
    this.ngOnInit();
   
  }
/*
    addDod() {
        this.dodatneService.addDodatna().subscribe(
      data => {
        console.log('uspesno')
      },
      error => {
        console.log('neuspesno')
      }
    );
*/

  }

