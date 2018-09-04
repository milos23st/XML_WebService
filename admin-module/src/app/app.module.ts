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

import { FormsModule } from '@angular/forms'; // <== add the imports!
import { TokenStorage } from './components/login/token-storage';
import { LoginService } from './components/login/login.service';
import { HttpClient, HttpHandler, HttpClientModule } from '@angular/common/http';
import { DEditComponent } from './components/additional-service/d-edit/d-edit.component';
import { CEditComponent } from './components/category/c-edit/c-edit.component';
import { TEditComponent } from './components/type/t-edit/t-edit.component';



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
    UserOperationsComponent,
    DEditComponent,
    CEditComponent,
    TEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule, 
    HttpClientModule
    
  ],
  providers: [
    TokenStorage,
    LoginService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
