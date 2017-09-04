import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ItemListComponent } from './component/item/list/item-list.component';


const AppRoutes: Routes = [
    {
        path: '',
        component: ItemListComponent,
    },
    {
        path: 'items',
        component: ItemListComponent,
    },
];

@NgModule( {
    imports: [RouterModule.forRoot( AppRoutes )],
    exports: [RouterModule],
} )
export class AppRoutingModule { }
