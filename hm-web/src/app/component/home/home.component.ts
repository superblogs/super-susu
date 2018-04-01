import {Component, Inject, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  private helloPipe:string;
  private helloPipe1: string;

  constructor(@Inject(ActivatedRoute) private router: ActivatedRoute) {

    this.helloPipe = null;

  }

  ngOnInit() {
  console.log("进入init");
  this.setHelloPipeValue();

      console.log(location.href)
  }






  setHelloPipeValue(){
    this.helloPipe = "https://qualmodel.wecredo.com/MyModel.html?param=Mlmrszw4yQxTQ0Xf2iEiT6Imx05AYY3eTSsDTIjsGfe/6OKbhX9/Rdse/a8g24Hi2h06b2uxW3YrlcLkkVGpj+zo47h+FvWtjcO7RS+FmwC4E562C9N9lv6J3tlo/29QZwxN6UildzeD/BV3hMo/ehcRNKLHQr/hlLbyxzdNHmugS5h8X+V7Qw==&sign=65f78f89f8310a187909ef437af4f10b";

    this.helloPipe1 = "http://www.baidu.com";
  }

}
