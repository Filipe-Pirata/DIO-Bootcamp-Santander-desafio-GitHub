
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  apiUrl = 'https://sheet.best/api/sheets/875a9ca8-42af-49bc-9352-0a78dc56630f'
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
     

    })
    

  }

  constructor(private httpClient: HttpClient) { }

  // C.R.U.D. = CREAT, READ ,UPDATE , DELET  
  // Retorna Lista de Usuarios READ

  getUsers():Observable<User[]> {

    return this.httpClient.get<User[]>(this.apiUrl);
  }

  // Salva usuario no banco -> CREATE 

  postUser(user: User):Observable<User> {
    return this.httpClient.post<User>(this.apiUrl, user , this.httpOptions)

  }


  // Exclui o usuario do banco -> DELETE

  deleteUser(id: number): Observable<User> {
    return this.httpClient.delete<User>(`${this.apiUrl}/id/${id}`)


  }
  // Edita usuario - > UPDATE

  updateUser(id: string, user: User): Observable<User>{
    return this.httpClient.put<User>(`${this.apiUrl}/id/${id}`, user, this.httpOptions);
  }

  // Lista Usuario Unico
  getUser(id: string): Observable<User[]>{
   return this.httpClient.get<User[]>(`${this.apiUrl}/id/${id}`)

  }
}
