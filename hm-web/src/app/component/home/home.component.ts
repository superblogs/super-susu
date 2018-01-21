import {Component, OnInit} from '@angular/core';
import {LoginService} from '../../service/login.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  user;

  constructor(private loginService: LoginService) {
  }

  ngOnInit() {

  }

  test() {
    this.loginService.getUser().subscribe(user => {
      this.user = user;
    });
  }

}
