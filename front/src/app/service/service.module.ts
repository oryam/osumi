import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ItemService } from './provider/item.service';

@NgModule( {
    imports: [
        CommonModule,
    ],
    providers: [
        ItemService,
    ],
} )
export class AppServiceModule { }
