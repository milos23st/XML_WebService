import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavigationComponent } from './components/navigation/navigation.component';
import { LoginComponent } from './components/login/login.component';
import { AddAgentComponent } from './components/add-agent/add-agent.component';
import { CommentsComponent } from './components/comments/comments.component';
import { CategoryComponent } from './components/category/category.component';
import { TypeComponent } from './components/type/type.component';
import { AdditionalServiceComponent } from './components/additional-service/additional-service.component';
import { UserOperationsComponent } from './components/user-operations/user-operations.component';

@NgModule({
  declarations: [
    AppComponent,
    NavigationComponent,
    LoginComponent,
    AddAgentComponent,
    CommentsComponent,
    CategoryComponent,
    TypeComponent,
    AdditionalServiceComponent,
    UserOperationsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
