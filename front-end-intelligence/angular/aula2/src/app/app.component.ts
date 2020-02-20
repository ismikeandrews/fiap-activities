import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'aula2';

  images: Array<any> = [
    {
      url: "./assets/img/mulher-gritando.jpg",
      titulo: "Gato1",
      ativa: true
    },
    {
      url: "./assets/img/gato-cry.jpg",
      titulo: "Crying Cat",
      ativa: true
    },
    {
      url: "./assets/img/cat.jpeg",
      titulo: "cat",
      ativa: true
    },
    {
      url: "./assets/img/ferrari.jpg",
      titulo: "ferrari",
      ativa: false
    },
  ] 

  deletar(index: string){
    this.images[index].ativa = false
  }
  add(){
    this.images[3].ativa = true
  }
}
