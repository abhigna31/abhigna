import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { IpolistService } from '../ipolist.service';

@Component({
  selector: 'app-addipo',
  templateUrl: './addipo.component.html',
  styleUrls: ['./addipo.component.css']
})
export class AddipoComponent implements OnInit {

  addipo:FormGroup;
  constructor(private formBuilder:FormBuilder,private ipolistService : IpolistService) { }
  ngOnInit() {
    this.addipo=this.formBuilder.group({
    id:[],
    companyname:['',Validators.required],
    stockexchange:['',Validators.required],
    ppshare:['',Validators.required],
    shares:['',Validators.required],
    datetime:['',Validators.required],
    remarks:['',Validators.required]
    });
  }
  addTheIpo(){
    this.ipolistService.saveIpo(this.addipo.value).subscribe(data => {
      console.log('Ipo Inserted Successfully');
    });
    
 }
 deleteTheIpo(){
  this.ipolistService.deleteIpo(this.addipo.value).subscribe(data=>{
   alert('Ipo Deleted Successfully' +data);
 });
 }
  onSubmit(){
    console.log(this.addipo.value);
  }
}

