import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Company } from 'src/app/models/Company';
import { CompanyService } from 'src/app/company.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-updatecompany',
  templateUrl: './updatecompany.component.html',
  styleUrls: ['./updatecompany.component.css']
})
export class UpdatecompanyComponent implements OnInit {

  updateCompany :FormGroup;
  constructor(private formBuilder:FormBuilder,private companyService:CompanyService,private router:Router) { }

  ngOnInit() {
    this.updateCompany=this.formBuilder.group({
    id:['',Validators.required],
    sector:['',Validators.required],
    name:['',Validators.required],
    ceo:['',Validators.required],
    bod:['',Validators.required],
    turnover:['',Validators.required],
  });
  const id=localStorage.getItem('companyId');
  if(+id > 0){
    console.log("uodate::id "+id);
    this.companyService.getCompanyById(+id).subscribe(comp => {
      this.updateCompany.patchValue(comp);
    });
  }
}
  updateTheCompany(){
    this.companyService.updateCompany(this.updateCompany.value).subscribe(u =>{
      this.router.navigate(['/company'])
    });
  }}