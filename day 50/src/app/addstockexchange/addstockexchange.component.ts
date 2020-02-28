import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { StockexchangeService } from '../stockexchange.service';

@Component({
  selector: 'app-addstockexchange',
  templateUrl: './addstockexchange.component.html',
  styleUrls: ['./addstockexchange.component.css']
})
export class AddstockexchangeComponent implements OnInit {

  addstockexchange:FormGroup;
  constructor(private formBuilder:FormBuilder,private stockexchangeService : StockexchangeService) { }
  ngOnInit() {
    this.addstockexchange=this.formBuilder.group({
    
      name:['',Validators.required],
      id:['',Validators.required],
      remarks:['',Validators.required]

    });
  }
  addTheStockexchange(){
    this.stockexchangeService.saveStockexchange(this.addstockexchange.value).subscribe(data => {
      console.log('Stockexchange Inserted Successfully');
    });
    
 }
deleteStockexchange(){
  this.stockexchangeService.deleteStockexchange(this.addstockexchange.value).subscribe(data=>{
   alert('Stockexchange Deleted Successfully' +data);
  });
 }
  onSubmit(){
    console.log(this.addstockexchange.value);
  }
}