import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { AvailabilityComponent } from './components/availability/availability.component';
import { MessagesComponent } from './components/messages/messages.component';
import { ReservationsConfirmationsComponent } from './components/reservations-confirmations/reservations-confirmations.component';
import { AddAccommodationComponent } from './components/add-accommodation/add-accommodation.component';

const routes: Routes = [

   { path: 'login', component: LoginComponent},
   { path: 'zauzetost', component: AvailabilityComponent},
   { path: 'poruke', component: MessagesComponent},
   { path: 'rezpotvrda', component: ReservationsConfirmationsComponent},
   { path: 'dodavanje', component: AddAccommodationComponent}
   
   
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
