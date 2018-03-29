import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {AppComponent} from './app.component';
import {ROUTES} from './app.routes';
import {RouterModule} from '@angular/router';
import {LoginComponent} from './component/login/login.component';
import {LoginService} from './service/login.service';
import {HttpClientModule} from '@angular/common/http';
import {HomeComponent} from './component/home/home.component';
import {FormsModule} from '@angular/forms';
import {AuthGuard} from './service/AuthGuard';
import {HeaderComponent} from './component/header/header.component';
import {FooterComponent} from './component/footer/footer.component';
import {SearchService} from "./service/search.service";
import {SearchResultsComponent} from './component/search-results/search-results.component';
import { AngularFontAwesomeModule } from 'angular-font-awesome';
import { SafeHtmlPipe } from './pipe/safe-html.pipe';
import { ZhongshiRoutingModule } from './app-routing/zhongshi-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    HeaderComponent,
    FooterComponent,
    SearchResultsComponent,
    SafeHtmlPipe
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AngularFontAwesomeModule,
    RouterModule.forRoot(ROUTES),
    ZhongshiRoutingModule,
  ],
  providers: [
    LoginService,
    AuthGuard,
    SearchService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
