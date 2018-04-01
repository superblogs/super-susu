import {Injectable} from '@angular/core';
import {ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot} from '@angular/router';
import {Observable} from 'rxjs/Observable';

@Injectable()
export class AuthGuard implements CanActivate {

  constructor(private route: Router) {
  }

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<boolean> | Promise<boolean> | boolean {

    //AuthGuard <List >
    var path = route.routeConfig.path;
    console.log(path);
    const nextRoute = ['home', 'good-list', 'good-detail', 'cart', 'profile'];

    console.log(sessionStorage.getItem('loginStatus'));
    if (!sessionStorage.getItem('loginStatus')) {
      this.route.navigateByUrl('/');
    }
    return !!sessionStorage.getItem('loginStatus');
  }

}


