import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {ROUTES} from './app.routes';
import {RouterModule} from '@angular/router';
import {LoginComponent} from './component/login/login.component';
import {LoginService} from './service/login.service';
import {HttpClientModule} from '@angular/common/http';
import { HomeComponent } from './component/home/home.component';
import {FormsModule} from '@angular/forms';
import {AuthGuard} from './service/AuthGuard';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(ROUTES),
  ],
  providers: [
    LoginService,
    AuthGuard
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
