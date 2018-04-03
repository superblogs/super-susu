import {Component, OnInit} from '@angular/core';
import {SearchService} from "../../service/search.service";
import {Observable} from "rxjs/Observable";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  hello: any;

  source: Observable<any>;
  sourceHttpClient: Observable<any>;

  configDto:Object;


  constructor(private search: SearchService) {
    this.source = this.search.getConfigUrlByHttp().map((res) => res.json());
    this.sourceHttpClient = this.search.getConfigUrlByHttpClient().map((res) => res.json());
  }

  ngOnInit() {
    // this.source.subscribe((data) => console.log(data));
    this.sourceHttpClient.subscribe((data) => this.hello = data);
  }

}
