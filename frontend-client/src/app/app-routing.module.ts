import { NgModule } from '@angular/core';
import { Routes, RouterModule, Router } from '@angular/router';
import { AppComponent } from './app.component';
import { NavigationComponent } from './components/navigation/navigation.component';
import { LoginComponent } from './components/login/login.component';
import { AccommodationComponent } from './components/accommodation/accommodation.component';
import { RegistrationComponent} from './components/registration/registration.component';
import { DetailsComponent } from './components/accommodation/details/details.component';

const routes: Routes = [
  { path: 'accommodation', component: AccommodationComponent},
  { path: 'login', component: LoginComponent},
  { path: 'registration', component: RegistrationComponent},
  { path: 'accommodation/details/:accommodationId', component: DetailsComponent}

];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  declarations: []
})
export class AppRoutingModule { }
