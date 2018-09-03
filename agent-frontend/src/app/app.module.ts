import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { NavigationComponent } from './components/navigation/navigation.component';
import { LoginComponent } from './components/login/login.component';
import { AddAccommodationComponent } from './components/add-accommodation/add-accommodation.component';
import { MessagesComponent } from './components/messages/messages.component';
import { AvailabilityComponent } from './components/availability/availability.component';
import { ReservationsConfirmationsComponent } from './components/reservations-confirmations/reservations-confirmations.component';

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    LoginComponent,
    AddAccommodationComponent,
    MessagesComponent,
    AvailabilityComponent,
    ReservationsConfirmationsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
