import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import "rxjs/add/operator/map";
import {Observable} from "rxjs/Observable";

@Injectable()
export class SearchService {

  private headers: HttpHeaders;

  constructor(private http: HttpClient) {
    this.headers = new HttpHeaders()
      .set('Content-Type', 'application/json;charset=UTF-8');
  }

  configUrl = 'assets/config.json';

  getConfig():Observable<any>{
    return this.http.get(this.configUrl,{headers:this.headers});
  }
}
