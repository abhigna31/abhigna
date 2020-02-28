import { Component, OnInit } from '@angular/core';
import { FormGroup, Validators, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-stock-exchange',
  templateUrl: './stock-exchange.component.html',
  styleUrls: ['./stock-exchange.component.css']
})
export class StockExchangeComponent implements OnInit {

  stockExchange:FormGroup;
  constructor(private formBuilder:FormBuilder,private a: Router) { }
  ngOnInit() {
    this.stockExchange=this.formBuilder.group({
      stockname:['',Validators.required],
      stockid:['',Validators.required],
      remarks:['',Validators.required],
    });
  }
  addCompany()
  {
      console.log('StockExchange Inserted Successfully' );
  }
  
  onSubmit()
  {
    console.log(this.stockExchange.value);
  }
  stlist()
  {
    this.a.navigate(['stockexchangelist']);
  }
  stupdate(){
    this.a.navigate(['updatestockexchange']);
  }
  stadd(){
    this.a.navigate(['addstockexchange']);
  }
 
}