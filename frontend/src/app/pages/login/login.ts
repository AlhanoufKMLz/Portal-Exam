import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatSnackBar, MatSnackBarModule } from '@angular/material/snack-bar';
import { UserService } from '../../services/user-service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-login',
  imports: [
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    FormsModule,
    MatSnackBarModule,
  ],
  templateUrl: './login.html',
  styleUrl: './login.scss',
})
export class Login {
  constructor(private userService:UserService, private snack:MatSnackBar){}

  public user = {
    username: '',
    password: ''
  };

  formSubmit(){
    //check the username
    if(this.user.username == '' || this.user.username == null){
      this.snack.open("Username is required !!", "ok",{
        duration: 3000,
      });
      return;
    }

    //add user : userservice
    this.userService.addUser(this.user).subscribe({
      next: (data:any) => {
        console.log(data);
        Swal.fire("Welcome "+ data.firstName +",", "You have been successfully registered.", "success");
      },
      error: (err) => {
        console.error(err);
        this.snack.open('something went wrong !!', "", {
          duration: 3000,
        });
      },
      complete: () => {
        console.log('Completed');
      },
    });

  }


}
