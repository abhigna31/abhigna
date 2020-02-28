import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
import { UsersService } from '../service/users.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registrationForm: FormGroup
  registerForm: any;

  constructor(private formBuilder:FormBuilder, private userService: UsersService) { }

  ngOnInit() {
    this.registrationForm=this.formBuilder.group({
      id:[],
      email:['',[Validators.required]],
      firstname:['',[Validators.required]],
      lastname:['',[Validators.required]],
      password:['',[Validators.required]],
      phone:['',[Validators.required]],
      username:['',[Validators.required]]
    })
  }
  addUser(){
    this.userService.saveUsers (this.registrationForm.value).subscribe(data => {
      console.log('User Inserted Successfully'+data);
    });
    
 }
//  deleteUser(){
//   this.userService.deleteUsers(this.registerForm.value).subscribe(data=>{
//     alert('User Deleted Successfully' +data);
//   });
// }
  onSubmit(){
   this.userService.reg().subscribe(dt=>{
     console.log("coming status::::"+dt.reg);
   })

  }


}
