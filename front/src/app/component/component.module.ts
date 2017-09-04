import { NgModule } from '@angular/core';

import { AppVendorModule } from "../vendor/vendor.module";
import { AppServiceModule } from '../service/service.module';

import { ItemListComponent } from './item/list/item-list.component';


@NgModule( {
    imports: [
        AppVendorModule,
        AppServiceModule,
    ],
    declarations: [
        ItemListComponent
    ],
    exports: [
        ItemListComponent
    ],
} )
export class AppComponentModule { }
