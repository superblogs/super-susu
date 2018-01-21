import {Routes} from '@angular/router';
import {LoginComponent} from './component/login/login.component';
import {HomeComponent} from "./component/home/home.component";

export const ROUTES: Routes = [
  {
    path: '',
    pathMatch: 'full',
    redirectTo: '/login'
  },
  {
    path: 'login',
    component: LoginComponent,
  },
  {
    path: 'home',
    component: HomeComponent,
  },
];
