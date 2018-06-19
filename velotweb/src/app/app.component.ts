import { Component } from '@angular/core';
import { VelocitytestService } from './services/velocitytest.service';

@Component( {
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
} )
export class AppComponent {
    title = 'app';
    resultado: any;
    
    constructor( private serv: VelocitytestService ) {
        let that = this;
        this.serv.getData().subscribe(data => {
            that.resultado = data;
            console.log(data);
        });
    }    
    
}
