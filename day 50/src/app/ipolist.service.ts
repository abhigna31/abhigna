import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Ipolist } from './models/ipolist';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class IpolistService {

  httpUrl='http://localhost:8080/ipo/';
ipo:Ipolist;

constructor(private httpClient:HttpClient, @Inject(HttpClient)  private ht) { }

getAllIpo(): Observable<Ipolist[]>
{
  return this.httpClient.get<Ipolist[]>(this.httpUrl);
}
saveIpo(ipo:Ipolist):Observable<Ipolist>
{
  return this.ht.post(this.httpUrl,ipo);
}

  deleteIpo(id:number):Observable<Ipolist>{
    return this.ht.delete(`http://localhost:8080/ipo/${id}`);
 }
updateIpo(ipo:Ipolist):Observable<Ipolist>{
  //console.log("ipos update: "+ipo.ppshare+"  "+ipo.companyname);
  return this.ht.put(`http://localhost:8080/ipo`,ipo);
}
 getIpoById(id:number):Observable<Ipolist>{
  return this.ht.get(`http://localhost:8080/ipo/${id}`);
 }

}

