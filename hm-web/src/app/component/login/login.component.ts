import {Component, OnInit} from '@angular/core';
import {LoginService} from '../../service/login.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user = {
    username: '',
    password: ''
  };

  constructor(private loginService: LoginService, private router: Router) {
  }

  ngOnInit() {
  }

  login() {
    this.loginService.login(this.user).subscribe(response => {
      console.log(response);
      if (response.authenticated) {
        this.router.navigateByUrl('/home');

      }
    });
  }
}
