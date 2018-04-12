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
import {SearchResultsComponent} from './component/search/search-results/search-results.component';

import {AngularFontAwesomeModule} from 'angular-font-awesome';
import {SafeHtmlPipe} from './pipe/safe-html.pipe';
import {ZhongshiRoutingModule} from './app-routing/zhongshi-routing.module';

import {HttpModule} from "@angular/http";
import {NgZorroAntdModule} from "ng-zorro-antd";
import {SearchBarComponent} from "./component/search/search-bar/search-bar.component";
import {SearchNewComponent} from './component/search/search-new/search-new.component';
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {PopoverModule} from "ngx-bootstrap";


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HomeComponent,
    HeaderComponent,
    FooterComponent,
    SearchResultsComponent,
    SafeHtmlPipe,
    SearchBarComponent,
    SearchNewComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    HttpModule,
    AngularFontAwesomeModule,
    BrowserAnimationsModule,
    RouterModule.forRoot(ROUTES),
    PopoverModule.forRoot(),
    NgZorroAntdModule.forRoot(),

    ZhongshiRoutingModule,
  ],
  providers: [
    LoginService,
    AuthGuard,
    SearchService
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
