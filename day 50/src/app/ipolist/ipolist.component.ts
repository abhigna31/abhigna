import { Component, OnInit } from '@angular/core';
import { IpolistService } from '../ipolist.service';
import { Router } from '@angular/router';
import { Ipolist } from '../models/ipolist';

@Component({
  selector: 'app-ipolist',
  templateUrl: './ipolist.component.html',
  styleUrls: ['./ipolist.component.css']
})
export class IpolistComponent implements OnInit  {
  
  
  constructor(private service:IpolistService, private router :Router) { }
  ipo: Ipolist[];
   ngOnInit() {
     this.service.getAllIpo().subscribe(data => {
       this.ipo = data;
     });
   }
   deleteTheIpo(ipos : Ipolist){
     this.service.deleteIpo(ipos.id).subscribe(data =>{
      this.ipo=this.ipo.filter(ipo=>ipo.id!==ipos.id);
     }); 
     
   }
   updateTheIpo(ipos : Ipolist){
     localStorage.removeItem('ipoId');
     localStorage.setItem('ipoId',ipos.id.toString());
     this.router.navigate(['updateipo']);
 
   }

}
