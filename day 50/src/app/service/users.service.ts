import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../models/users';
@Injectable({
  providedIn: 'root'
})
export class UsersService {
  httpUrl = 'http://localhost:8080/register/';
  user: User[];

  constructor(private httpClient: HttpClient, @Inject(HttpClient) private ht) { }
  getAllUsers(): Observable<User[]> {
    return this.httpClient.get<User[]>(this.httpUrl);
  }
  saveUsers(com: User): Observable<User> {
    return this.ht.post(this.httpUrl, com);
  }
  reg(){
    return this.ht.get(`http://localhost:8080/reg`)
  }

  deleteUsers(id: number): Observable<User> {
    return this.ht.delete(`http://localhost:8080/register/${id}`);
  }
  updateUsers(com: User): Observable<User> {
    return this.ht.put(` http://localhost:8080/register/`, com);
  }
  getUsersById(id: number): Observable<User> {
    return this.ht.delete(`http://localhost:8080/register/${id}`);
    }

    serActivation(obj){
      return this.ht.put(`http://localhost:8080/register/activate`,obj)
    }
}  

