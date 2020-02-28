import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Company } from '../models/Company';
import { StockexchangeService } from '../stockexchange.service';
import { StockExchange } from '../models/selist';

@Component({
  selector: 'app-stockexchangelist',
  templateUrl: './stockexchangelist.component.html',
  styleUrls: ['./stockexchangelist.component.css']
})
export class StockexchangelistComponent implements OnInit {

  constructor(private service:StockexchangeService, private router :Router) { }
  stockexchange: StockExchange[];
   ngOnInit() {
     this.service.getAllStockexchange().subscribe(data => {
       this.stockexchange = data;
     });
   }
   deleteTheStockExchange(stock:StockExchange){
     this.service.deleteStockexchange(stock.id).subscribe(data =>{
      this.stockexchange=this.stockexchange.filter(u=> stock.id !== u.id);
     });
     
   }
   updateTheStockExchange(stock : StockExchange){
     localStorage.removeItem('stockId');
     localStorage.setItem('stockId',stock.id.toString());
     this.router.navigate(['updatestock']);
 
   }

}

