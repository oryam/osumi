import { NgModule } from '@angular/core';

import { AppVendorModule } from "./vendor/vendor.module";
import { AppRoutingModule } from './routing.module';
import { AppComponentModule } from './component/component.module';
import { AppServiceModule } from './service/service.module';
import { AppComponent } from './app.component';


@NgModule( {
    declarations: [
        AppComponent,
    ],
    imports: [
        AppVendorModule,
        AppServiceModule,
        AppRoutingModule,
        AppComponentModule,
    ],
    providers: [],
    bootstrap: [AppComponent],
} )
export class AppModule { }
