import { Component, OnInit } from '@angular/core';
import { ServiceService } from 'src/app/service.service';
import { User } from '../../models/users'
import { Router } from '@angular/router';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {


  constructor(private service:ServiceService, private router :Router) { }
 users: User[];
  ngOnInit() {
    this.service.getAllUsers().subscribe(data => {
      this.users = data;
    });
  }
  deleteTheUser(user:User){
    this.service.deleteUser(user.id).subscribe();
    this.users=this.users.filter(u=>u!==user);
  }
  updateUser(user:User){
    localStorage.removeItem('userId');
    localStorage.setItem('userId',user.id.toString());
    this.router.navigate(['update']);

  }
 }

