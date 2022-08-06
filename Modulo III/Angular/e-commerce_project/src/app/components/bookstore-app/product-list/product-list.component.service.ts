import {  Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http"
import { Book } from "./model/book"

@Injectable ()

export class BooksService {

 private url = 'https://sheet.best/api/sheets/dfbb30de-5471-4e9f-a41e-67c65f273cea' ; 

 httpOptions= {
  Headers: new HttpHeaders({'content-type': 'application/json'})

 }

 constructor(private http:HttpClient){
 
 }
 
 getBook(){
  return this.http.get(this.url)
 }

}