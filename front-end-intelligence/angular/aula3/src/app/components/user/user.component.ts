import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.scss']
})
export class UserComponent implements OnInit {

  formUser: FormGroup;


  constructor(private formBuilder: FormBuilder) { 

    this.formUser = this.formBuilder.group({
      _id: [{value: '123456', disabled: true}],
      nome: [{value: 'Mike', disabled: false}],
      sobrenome: [{value: 'Andrews', disabled: false}],
      email: [{value: 'michaelcl98@hotmail.com', disabled: false}],
      telefone: [{value: '(11) 95060-3012', disabled:false}],
    });

  }

  ngOnInit() {
  }

  public saveUser(){
    alert(`Usuário ${this.formUser.value.nome} salvo com sucesso`)
  }

}
