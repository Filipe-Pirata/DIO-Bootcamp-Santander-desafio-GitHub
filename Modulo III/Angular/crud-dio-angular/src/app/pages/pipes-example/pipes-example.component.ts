import { UpperCasePipe } from '@angular/common';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes-example',
  templateUrl: './pipes-example.component.html',
  styleUrls: ['./pipes-example.component.css']
})
export class PipesExampleComponent implements OnInit {
  number = 0;
  text= 'hello world!'; 
  date= new Date;
  pessoa = {
    nome:'Filipe',
    idade:'27',
    profissao: 'dev'

  }

    nomes = ['Filipe'] 

  constructor(private upperCasePipe: UpperCasePipe) { }

  ngOnInit(): void {
    this.text = this.upperCasePipe.transform('')
  }
  
  add(text:string) {
    this.nomes.push(text);

  }
}
