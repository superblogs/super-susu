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
        sessionStorage.setItem('loginStatus', 'true');
        this.router.navigateByUrl('/home');
      } else {
        alert('账号或密码不正确');
      }
    },error => alert("网路连接失败！"));
  }
}
