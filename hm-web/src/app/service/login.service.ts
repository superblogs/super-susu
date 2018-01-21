import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/Observable';

@Injectable()
export class LoginService {

  constructor(private httpClient: HttpClient) {
  }

  getUser(): Observable<any> {
    return this.httpClient.get(`/api/user`);
  }

  login(user): Observable<any> {
    return this.httpClient.post(`/api/login?username=${user.username}&password=${user.password}`, null)
      ;
  }
}
