import { JsonPipe } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { UserService } from '../../services/user-service';

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
  constructor(private userService:UserService){}

  public user = {
    username: '',
    firstName: '',
    lastName: '',
    email: '',
    password: ''
  };

  formSubmit(){
    //add user > user service
    this.userService.addUser(this.user).subscribe({
      next: (data) => {
        console.log(data);
        alert('success');
      },
      error: (err) => {
        console.error(err);
        alert('something went wrong');
      },
      complete: () => {
        console.log('Completed');
      },
    });

  }

}
