import {Routes} from '@angular/router';
import {LoginComponent} from './component/login/login.component';
import {HomeComponent} from './component/home/home.component';
import {SearchNewComponent} from "./component/search/search-new/search-new.component";

export const ROUTES: Routes = [
  {
    path: '',
    pathMatch: 'full',
    redirectTo: '/home'
  },
  {
    path: 'home',
    component: HomeComponent
    //canActivate: [AuthGuard]
  },
  {
    path: 'login',
    component: LoginComponent,
  },

  {
    path: 'search',
    component: SearchNewComponent
  },
];
