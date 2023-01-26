import { Component } from '@angular/core';
import { UserMachinestalk } from '../models/user_machinestalk';
import { UserMachinestalkService } from '../services/user_machinestalk.service';

@Component({
  selector: 'app-machinestalk',
  templateUrl: './machinestalk.component.html',
  styleUrls: ['./machinestalk.component.scss']
})
export class MachinestalkComponent {
  users: UserMachinestalk[] | undefined;

  constructor(private apiService: UserMachinestalkService) { }

  ngOnInit() {
    this.apiService.getuserList().subscribe((users: any) => {
      this.users = users;
      this.apiService.addusers(this.users).subscribe((users: any) => {
      });
    });
  }
}
