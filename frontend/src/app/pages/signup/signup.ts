import { JsonPipe } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';

@Component({
  selector: 'app-signup',
  imports: [
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    FormsModule,
    JsonPipe,
  ],
  templateUrl: './signup.html',
  styleUrl: './signup.scss',
})
export class Signup {

  public user = {
    username: '',
    firstName: '',
    lastName: '',
    email: '',
    password: ''
  };

  formSubmit(){
    console.log(this.user);
  }

}
