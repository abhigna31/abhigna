import { Injectable } from '@angular/core';
import { USERS } from '../app/models/mock-user'; 
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../app/models/users'
@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  getAll: any;
  getAllCompany() {
    throw new Error("Method not implemented.");
  }

  httpUrl = 'http://localhost:8080/register/';
   users =USERS;
  ht: any;
  constructor(private httpClient: HttpClient) { }
 
  getAllUsers(){
    return this.httpClient.get<User[]>(this.httpUrl);
  }

  saveUser(user : User): Observable<User>{
    return this.httpClient.post<User>(this.httpUrl , user);
  }
  deleteUser(id:number):Observable<User>{
    return this.httpClient.delete<User>(this.httpUrl+id);
 }
updateUser(user:User):Observable<User>{
  return this.httpClient.put<User>(this.httpUrl,user);
}
 getUserById(id:number):Observable<User>{
  return this.ht.delete(`http://localhost/register/${id}`);
 }

}

