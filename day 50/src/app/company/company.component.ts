import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Company } from '../models/Company';
import { CompanyService } from '../company.service';

@Component({
  selector: 'app-company',
  templateUrl: './company.component.html',
  styleUrls: ['./company.component.css']
})
export class CompanyComponent implements OnInit {
   
  
 constructor(private service:CompanyService, private router :Router) { }
  company: Company[];
   ngOnInit() {
     this.service.getAllCompany().subscribe(data => {
       this.company = data;
     });
   }
   deleteTheCompany(comp:Company){
     this.service.deleteCompany(comp.id).subscribe(data =>{
      this.company=this.company.filter(u=> comp.id !== u.id);
     });
     
   }
   updateCompany(comp : Company){
     localStorage.removeItem('companyId');
     localStorage.setItem('companyId',comp.id.toString());
     this.router.navigate(['updatecompany']);
 
   }

}
