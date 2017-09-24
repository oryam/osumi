import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';
import { HttpModule } from "@angular/http";

import { MaterialVendorModule } from './material/material.module';
import { FlexLayoutModule } from '@angular/flex-layout';


@NgModule( {
    imports: [
        CommonModule,
        BrowserModule,
        BrowserAnimationsModule,
        FormsModule,
        HttpModule,

        MaterialVendorModule,
        FlexLayoutModule,
    ],
    exports: [
        CommonModule,
        BrowserModule,
        BrowserAnimationsModule,
        FormsModule,
        HttpModule,

        MaterialVendorModule,
        FlexLayoutModule,
    ],
} )
export class AppVendorModule { }
