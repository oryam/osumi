import { Injectable } from '@angular/core';
import { Http, Response, RequestOptions, Headers } from '@angular/http';
import { Observable } from 'rxjs/Observable';

export class HttpService {

    contextUrl = '/service/rest';

    constructor( private http: Http ) { }

    protected sendGet( url: string ): Observable<any> {
        return this.http
            .get( `${this.contextUrl}/${url}`, this.getOptions() )
            .map( this.handleResponse )
            .catch( this.handleError );
    }

    private getOptions(): RequestOptions {
        const headers = new Headers( { 'Content-Type': 'application/json' } );
        const options = new RequestOptions( { headers: headers } );
        return options;
    }

    private handleResponse( response: Response ): any {
        return response.json();
    }

    private handleError( error ): Observable<any> {
        const err = error.json();
        console.error( 'Error calling http service', err );
        throw err;
    }

}
