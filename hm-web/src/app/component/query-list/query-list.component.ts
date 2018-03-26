import {Component, OnInit} from '@angular/core';
import {searchDto} from "../../models/model";
import {BasedSearchService} from "../../service/based-search.service";


@Component({
  selector: 'app-query-list',
  templateUrl: './query-list.component.html',
  styleUrls: ['./query-list.component.css']
})
export class QueryListComponent implements OnInit {

  searchDto: searchDto;
  private config: { heroesUrl: any; textfile: any };

  constructor(private searchService: BasedSearchService) {
  }

  ngOnInit() {
    console.log(this.searchService.getConfig());
  }

}
