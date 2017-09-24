import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Observable } from 'rxjs/Observable';

import { HttpService } from './http.service';
import { SearchResultView, ItemDetailView } from './web-api.model';
import { Item } from '../../domain/item.model';
import { SearchResult } from "../../domain/search-result.model";

@Injectable()
export class ItemService extends HttpService {

    constructor( http: Http ) {
        super( http );
    }

    list(): Observable<SearchResult<Item>> {
        return this.sendGet( 'item' ).map(( result: SearchResultView<ItemDetailView> ) => this.mapSearchResult( result ) );
    }

    private mapSearchResult( result: SearchResultView<ItemDetailView> ): SearchResult<Item> {
        const model = new SearchResult<Item>();
        model.total = result.total;
        model.values = result.values.map(( value: ItemDetailView ) => this.mapDetail( value ) );
        return model;
    }

    private mapDetail( detail: ItemDetailView ): Item {
        const model = new Item();
        model.code = detail.code;
        model.value = detail.value;
        return model;
    }

}
