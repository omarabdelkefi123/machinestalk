import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserMachinestalkService {
  private baseUrl = 'http://localhost:8080/api';
  constructor(private http: HttpClient,) { }
 
  getuserList(): Observable<any> {
    return this.http.get(`${this.baseUrl}` + `/user-machinestal/liste`);
  }
  addusers(users: any): Observable<any> {
    return this.http.post(`${this.baseUrl}` + `/user-machinestalk/save`, users);
  }
}
