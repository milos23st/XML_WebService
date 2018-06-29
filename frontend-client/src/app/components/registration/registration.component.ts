import { Component, OnInit} from '@angular/core';

import {Router} from '@angular/router';
import { Observable } from 'rxjs/Observable';

import { UserService } from './../user/user.service';
import { User } from './../user/user';
import { NgForm } from '@angular/forms';



@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

    user = new User('', '', '', '', '', '');

  constructor(
    private userService: UserService,
    private router: Router
  ) { }

  ngOnInit() {
  }

  register() {
        this.userService.addUser(this.user).subscribe(
      data => {
        console.log('uspesno')
        this.router.navigate(['login']);
      },
      error => {
        console.log('neuspesno')
      }
    );

  }

}
