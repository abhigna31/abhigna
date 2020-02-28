import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { StockexchangeService } from '../stockexchange.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-updatestockexchange',
  templateUrl: './updatestockexchange.component.html',
  styleUrls: ['./updatestockexchange.component.css']
})
export class UpdatestockexchangeComponent implements OnInit {

  updatestockexchange: FormGroup;
  constructor(private formBuilder:FormBuilder,private stockexchangeService:StockexchangeService,private router:Router) { }

  ngOnInit() {
    this.updatestockexchange=this.formBuilder.group({
      id:[],
      name:['',Validators.required],
      remarks:['',Validators.required],
      

    });
    const id=localStorage.getItem('stockId');
    if(+id>0){
      this.stockexchangeService.getStockexchangeById(+id).subscribe(selist=>{
        this.updatestockexchange.patchValue(selist);
      });
    }
  }
    updateTheStockexchange(){
      this.stockexchangeService.updateStockexchange(this.updatestockexchange.value).subscribe(u =>{
        this.router.navigate(['stockexchangelist'])
      });
    }
  }

