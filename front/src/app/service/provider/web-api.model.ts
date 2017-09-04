// Generated using typescript-generator version 1.25.322 on 2017-09-04 00:21:57.

export class ItemDetailView {
    code: string;
    value: number;
}

export class SearchResultView<T> {
    total: number;
    values: T[];
}

export class ItemSearchResultView extends SearchResultView<ItemDetailView> {
}
