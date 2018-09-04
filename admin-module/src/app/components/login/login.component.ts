import { Component, OnInit } from '@angular/core';
import { LoginService } from './login.service';
import { Router } from '@angular/router';
import { TokenStorage } from './token-storage';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  model: any = {};
  constructor(
    private token: TokenStorage,
    private router: Router,
    private authService: LoginService,
  ) { }

  ngOnInit() {
  }

  login() {

    this.authService.attemptAuth(this.model.email, this.model.password).subscribe(
      data => {
        console.log('ok Working');
        this.token.saveToken(data.response);
        this.router.navigate(['type']);
        window.location.reload();
      },
      error => {
        console.log(error);
      },
      () => console.log('done')
    );
}
}
