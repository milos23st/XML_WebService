import { Component, OnInit } from '@angular/core';
import { NoveDodatneusluge } from '../../models/nove-dodatneusluge';
import { Dodatneusluge } from '../../models/dodatneusluge';
import { DodatneService } from '../../services/dodatne.service';
import { ActivatedRoute, Params } from '@angular/router';
import { Location } from '@angular/common';
import { NgForm } from '@angular/forms/src/forms';


@Component({
  selector: 'app-d-edit',
  templateUrl: './d-edit.component.html',
  styleUrls: ['./d-edit.component.css']
})
export class DEditComponent implements OnInit {

  novaDodatnausluga: NoveDodatneusluge= new NoveDodatneusluge("");
  dodatnauslugaId: string;
  dodatnauslugaEdit: Dodatneusluge;
  dodatneusluge: Dodatneusluge[];

  constructor(private dodatneuslugeService: DodatneService,
              private location: Location,
              private route: ActivatedRoute) { }

               getDodatnausluga() {
                this.dodatneuslugeService.getDodatnaById(this.dodatnauslugaId).subscribe(
                  (dodatnausluga) => this.dodatnauslugaEdit = dodatnausluga
                );
              }

  ngOnInit() {

        if(this.route.snapshot.params['dodatnauslugaId']){
      this.route.params.subscribe(
        (params: Params) => {
          this.dodatnauslugaId = params["dodatnauslugaId"];
        }
      );
      this.getDodatnausluga();
    }  
  }
  novaDodatnauslugaSubmit(forma: NgForm) {
    this.novaDodatnausluga.name = forma.value.naziv;
   
    this.dodatneuslugeService.addDodatna(this.novaDodatnausluga).subscribe();
    forma.reset();
    this.location.back();
  }



  dodatnauslugaUpdtSubmit(forma: NgForm){
    this.dodatnauslugaEdit.name = forma.value.name;
    this.dodatneuslugeService.updateDodatnausluga(this.dodatnauslugaEdit).subscribe();
    forma.reset();
    this.location.back();
  }

  dodatnauslugaEdt() {
    this.dodatneuslugeService.updateDodatnausluga(this.dodatnauslugaEdit).subscribe();
    this.location.back();
  }


}
