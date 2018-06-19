import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class VelocitytestService {
private url = 'http://localhost:8081/testTemplate';

  constructor(private http: Http) { }

  public getData() {
      let data = {
              template: 'pruebas.vm',
              datos: {
                  name: 'hola',
              },
      };
      return this.http.post(this.url, data).map((res: Response) => {
          return { respuesta: res };
      });
  }
  
}
