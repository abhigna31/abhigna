import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-adminhome',
  templateUrl: './adminhome.component.html',
  styleUrls: ['./adminhome.component.css']
})
export class AdminhomeComponent implements OnInit {

  constructor(private router:Router) { }

  importdata(){
    this.router.navigate(['/importdata']);
  }
  companydet(){
    this.router.navigate(['/companydetails']);
  }
  stockEx(){
    this.router.navigate(['/stockExchange']);
  }
  ipodet(){
    this.router.navigate(['/ipodetails']);
  }
  ngOnInit() {
  }

}
