import { Component, OnInit } from '@angular/core';

import { ItemService } from '../../../service/provider/item.service';
import { Item } from '../../../domain/item.model';
import { SearchResult } from "../../../domain/search-result.model";


@Component( {
    selector: 'osu-item-list',
    templateUrl: './item-list.component.html',
    styleUrls: ['./item-list.component.scss']
} )
export class ItemListComponent implements OnInit {

    items: Item[] = [];

    constructor(
        private service: ItemService,
    ) { }

    ngOnInit() {
        this.service
            .list()
            .subscribe(( result: SearchResult<Item> ) => this.items = result.values );
    }

}
