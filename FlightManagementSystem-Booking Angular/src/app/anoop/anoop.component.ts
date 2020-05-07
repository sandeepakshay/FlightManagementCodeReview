import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { Flight } from '../flight';
import { DataService } from '../data.service';


@Component({
  selector: 'app-anoop',
  templateUrl: './anoop.component.html',
  styleUrls: ['./anoop.component.css']
})
export class AnoopComponent implements OnInit {
id:number;
  
  flights:Flight[]=[];
  from_loc:string;
  flight: Flight = new Flight();

  editFlag: boolean = false;
  constructor(private flightService:DataService,private router:Router) { }

  ngOnInit(): void {
    
    // let resp=this.service.getFlights();
    // resp.subscribe((data)=>this.flights=data);
    this.flightService.getFlights().subscribe(data => {
      this.flights = data});
  }
  
    updateId(id:number){


      this.flightService.IdToUpdate=id;

}

  
}

