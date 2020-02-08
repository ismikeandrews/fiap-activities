import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-contato', //tag html do componente de contato
  templateUrl: './contato.component.html',
  styleUrls: ['./contato.component.scss']
})
export class ContatoComponent implements OnInit {

  constructor() { }

  ngOnInit() {
    console.log("hello world")
  }

}
