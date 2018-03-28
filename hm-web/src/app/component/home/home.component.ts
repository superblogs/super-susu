import {Component, OnInit} from '@angular/core';
import {LoginService} from '../../service/login.service';
import { DomSanitizer } from '@angular/platform-browser';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  user;
  hello;

  constructor(private loginService: LoginService,private sanitizer: DomSanitizer) {
    this.hello = this.sanitizer.bypassSecurityTrustResourceUrl(
      "https://qualmodel.wecredo.com/MyModel.html?param=Mlmrszw4yQxTQ0Xf2iEiT6Imx05AYY3eTSsDTIjsGfe/6OKbhX9/Rdse/a8g24Hi2h06b2uxW3YrlcLkkVGpj+zo47h+FvWtjcO7RS+FmwC4E562C9N9lv6J3tlo/29QZwxN6UildzeD/BV3hMo/ehcRNKLHQr/hlLbyxzdNHmugS5h8X+V7Qw==&sign=65f78f89f8310a187909ef437af4f10b");
  }

  ngOnInit() {

  }

  test() {
    this.loginService.getUser().subscribe(user => {
      this.user = user;
    });
  }

}
