import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { CategoryComponent } from './components/category/category.component';
import { AdditionalServiceComponent } from './components/additional-service/additional-service.component';
import { TypeComponent } from './components/type/type.component';
import { CommentsComponent } from './components/comments/comments.component';
import { UserOperationsComponent } from './components/user-operations/user-operations.component';
import { AddAgentComponent } from './components/add-agent/add-agent.component';


const routes: Routes = [
  { path: 'category', component: CategoryComponent},
  { path: 'additional', component: AdditionalServiceComponent},
  { path: 'type', component: TypeComponent},
  { path: 'login', component: LoginComponent},
  { path: 'comments', component: CommentsComponent},
  { path: 'adblock', component: UserOperationsComponent},
  { path: 'addagent', component: AddAgentComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
