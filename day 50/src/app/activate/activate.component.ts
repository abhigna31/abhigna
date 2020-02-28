import { Component, OnInit, Inject } from '@angular/core';
import { UsersService } from '../service/users.service';

@Component({
  selector: 'app-activate',
  templateUrl: './activate.component.html',
  styleUrls: ['./activate.component.css']
})
export class ActivateComponent implements OnInit {
  msg;
  showImg:boolean;
  constructor(@Inject(UsersService) private service) { }

  ngOnInit() {
    this.checkActivation()
  }
  checkActivation(){
    var urlad = document.URL
    var strarr = urlad.split("?")
    var str = strarr[1]
    str = str.substring(0, str.length-1);
    this.service.serActivation({email:str}).subscribe(dt => {
      if(dt.result=="ok"){
        this.msg="activation successfull"
      }
      else{
        this.msg="your account is activated"
      }
    });
  }
}











