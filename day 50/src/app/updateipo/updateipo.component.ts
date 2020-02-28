import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { IpolistService } from '../ipolist.service';
import { Router } from '@angular/router';
import { IpolistComponent } from '../ipolist/ipolist.component';
import { Ipolist } from '../models/ipolist';

@Component({
  selector: 'app-updateipo',
  templateUrl: './updateipo.component.html',
  styleUrls: ['./updateipo.component.css']
})
export class UpdateipoComponent implements OnInit {

  updateIpo :FormGroup;
  ipolistService: any;
  constructor(private formBuilder:FormBuilder,private usersService:IpolistService,private router:Router) { }

  ngOnInit() {
    this.updateIpo=this.formBuilder.group({
      id:[],
      companyname:['',Validators.required],
      stockexchange:['',Validators.required],
      ppshare:['',Validators.required],
      shares:['',Validators.required],
      datetime:['',Validators.required],
      remarks:['',Validators.required],
      

    });
    const id=localStorage.getItem('ipoId');
    if(+id>0){
      this.ipolistService.getIpoById(+id).subscribe(Ipolist=>{
        this.updateIpo.patchValue(Ipolist);
      });
    }
  }
    updateTheIpo(){
      this.ipolistService.updateIpo(this.updateIpo.value).subscribe(u =>{
        this.router.navigate(['ipolist'])
      });
    }
  }
