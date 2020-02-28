import { Component, OnInit } from '@angular/core';
import { FormGroup,FormBuilder,Validators } from '@angular/forms';
import { CompanyService } from '../company.service';
@Component({
  selector: 'app-addcompany',
  templateUrl: './addcompany.component.html',
  styleUrls: ['./addcompany.component.css']
})
export class AddcompanyComponent implements OnInit {
  addcompany:FormGroup;
  constructor(private formBuilder:FormBuilder,private companyService : CompanyService) { }
  ngOnInit() {
    this.addcompany=this.formBuilder.group({
    id:['',Validators.required],
    sector:['',Validators.required],
    name:['',Validators.required],
    ceo:['',Validators.required],
    bod:['',Validators.required],
    turnover:['',Validators.required],
    });
  }
  addTheCompany(){
    this.companyService.saveCompany(this.addcompany.value).subscribe(data => {
      console.log('Company Inserted Successfully');
    });
    
 }
deleteCompany(){
  this.companyService.deleteCompany(this.addcompany.value).subscribe(data=>{
   alert('Company Deleted Successfully' +data);
  });
 }
  onSubmit(){
    console.log(this.addcompany.value);
  }
}