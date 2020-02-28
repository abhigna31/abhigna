import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { StockExchange } from './models/selist';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StockexchangeService {

  httpUrl='http://localhost:8080/stockexchange/';
stockexchange:StockExchange;

constructor(private httpClient:HttpClient, @Inject(HttpClient)  private ht) { }

getAllStockexchange(): Observable<StockExchange[]>
{
  return this.httpClient.get<StockExchange[]>(this.httpUrl);
}
saveStockexchange(stockexchange:StockExchange):Observable<StockExchange>
{
  return this.ht.post(this.httpUrl,stockexchange);
}

  deleteStockexchange(id:number):Observable<StockExchange>{
    return this.ht.delete(`http://localhost:8080/stockexchange/${id}`);
 }
updateStockexchange(stockexchange:StockExchange):Observable<StockExchange>{
  return this.ht.put(`http://localhost:8080/stockexchange`,stockexchange);
}
 getStockexchangeById(id:number):Observable<StockExchange>{
  return this.ht.get(`http://localhost:8080/stockexchange/${id}`);
 }

}


 