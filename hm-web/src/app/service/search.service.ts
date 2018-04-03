import {Injectable} from '@angular/core';
import {HttpHeaders} from "@angular/common/http";
import "rxjs/add/operator/map";
import {Observable} from "rxjs/Observable";
import {Http} from "@angular/http";

@Injectable()
export class SearchService {

  private headers: HttpHeaders;

  constructor(private http: Http) {
    this.headers = new HttpHeaders()
      .set('Content-Type', 'application/json;charset=UTF-8');
  }

  configUrl = 'assets/config.json';

  getConfigUrlByHttp():Observable<any>{
    return this.http.get(this.configUrl);
  }

  getConfigUrlByHttpClient():Observable<any>{
    return this.http.get(this.configUrl);
  }
}
