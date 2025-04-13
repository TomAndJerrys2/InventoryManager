import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { LoginReq } from '../models/login-req';
import { Observable } from 'rxjs';
import { LoginRes } from '../models/login-res';

const API_URL = "http://localhost:{port}/api/loginHandler";

@Injectable({
  providedIn: 'root'
})
export class IntegrationService {

  constructor(private http: HttpClient) { }


  loginHandler(request: LoginReq):Observable<LoginRes> {
    return this.http.post<LoginRes>(API_URL, request);
  }
}
