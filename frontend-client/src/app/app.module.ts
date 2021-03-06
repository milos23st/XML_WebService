import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { NavigationComponent } from './components/navigation/navigation.component';
import { AccommodationComponent } from './components/accommodation/accommodation.component';
import { LoginComponent } from './components/login/login.component';
import { AppRoutingModule } from './app-routing.module';
import { RegistrationComponent } from './components/registration/registration.component';
import { TokenStorage } from './components/login/token-storage';
import { UserService } from './components/user/user.service';

import { RouterModule } from '@angular/router/src/router_module';

import { HttpClient, HttpHandler, HttpClientModule } from '@angular/common/http';
import { DetailsComponent } from './components//accommodation/details/details.component';


@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    AccommodationComponent,
    LoginComponent,
    RegistrationComponent,
    DetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    TokenStorage,
    UserService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
