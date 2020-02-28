import { Injectable, Inject } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Company } from './models/Company';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CompanyService {
  
  httpUrl='http://localhost:8080/company/';
com:Company;

constructor(private httpClient:HttpClient, @Inject(HttpClient)  private ht) { }

getAllCompany()
{
  return this.httpClient.get<Company[]>(this.httpUrl);
}
saveCompany(com:Company):Observable<Company>
{
  return this.ht.post(this.httpUrl,com);
}

  deleteCompany(id:number):Observable<Company>{
    return this.ht.delete(`http://localhost:8080/company/${id}`);
 }
updateCompany(com:Company):Observable<Company>{
  console.log("compa uodate: "+com.ceo+"  "+com.name);
  return this.ht.put(`http://localhost:8080/company`,com);
}
 getCompanyById(id:number):Observable<Company>{
  return this.ht.get(`http://localhost:8080/company/${id}`);
 }

}

