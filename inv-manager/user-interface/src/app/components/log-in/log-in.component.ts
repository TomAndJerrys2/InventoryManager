import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { IntegrationService } from '../../services/integration.service';
import { LoginReq } from '../../models/login-req';

@Component({
  selector: 'app-log-in',
  imports: [],
  templateUrl: './log-in.component.html',
  styleUrl: './log-in.component.css'
})
export class LogInComponent {
  constructor(private integration: IntegrationService) {}

  // form group for the login control flow
  loginForm : FormGroup = new FormGroup({
    username: new FormControl(''),
    password: new FormControl('')
  });

  request: LoginReq = new LoginReq;

  loginHandler() {
    const formVal = this.loginForm.value;

    // data validating the form
    // empty form
    if(formVal.username == '' || formVal.password == '') {
      console.log("Wrong Credentials");
      return;
    }
  }
}
