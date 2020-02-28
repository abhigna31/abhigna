import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

import { Router } from '@angular/router';
import { User } from '../models/users';
import { UsersService } from '../service/users.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  updateUser :FormGroup;
  constructor(private formBuilder:FormBuilder,private usersService:UsersService,private router:Router) { }

  ngOnInit() {
    this.updateUser=this.formBuilder.group({
      id:[],
      username:['',Validators.required],
      firstname:['',Validators.required],
      lastname:['',Validators.required],
      email:['',Validators.required],
      phone:['',Validators.required],
      password:['',Validators.required],
      

    });
    const id=localStorage.getItem('userId');
    if(+id>0){
      this.usersService.getUsersById(+id).subscribe(user=>{
        this.updateUser.patchValue(user);
      });
    }
  }
    updateTheUser(){
      this.usersService.updateUsers(this.updateUser.value).subscribe(u =>{
        this.router.navigate(['users'])
      });
    }
 

}
