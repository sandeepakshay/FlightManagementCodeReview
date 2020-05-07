import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { Booking } from '../Booking';


import { Passenger } from '../passenger';
import { DataService } from '../data.service';
import { Flight } from '../flight';


@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent {

  /*********************************************************************
   *  Instance of Book for manupulation
   **********************************************************************/
  flightNumber: number;
 
  // flight:Flight;
  booking: Booking = new Booking();
  flight: Flight = new Flight();
  passenger: Passenger = new Passenger();
  info:String;
  errorInfo:String;
 flights:any=[];
  bookings: Booking[]=[];
 passengers: Passenger[]=[];
 up:number;
 public show_dialog:boolean=false;
 public button_name:any='show';
//  public show_dialog:boolean=false;
//  public button_name:any='Show';

;
  
  constructor(private bookingService: DataService, private route: Router) { }
  ngOnInit(): void {
    this.flight=new Flight();
    this.up=this.bookingService.IdToUpdate;
    this.bookingService.viewflight(this.up).subscribe(data=>this.flight=data);
    this.bookingService.getFlights().subscribe(data => {this.flights = data});
  // this.bookingService.viewbooking().subscribe(data => {this.bookings = data});
//  this.bookingService.viewPassenger().subscribe(data => {this.passengers = data});
//  
 }






  addBooking() {
    this.bookingService.addbooking(this.booking).subscribe(
      data=>{
      this.booking=data;
      
      alert('Booking Added!!');
      // let i="Booking Successful with Id :"+this.booking.bookingId;
      // console.log(data.bookingId);
      // alert(i);
      
      console.log(this.booking);
      this.info=data;    
      this.errorInfo=undefined;    
      },
      error=>{
              this.info=undefined;
              this.errorInfo=error.error;
            }
      
      );
   // this.route.navigateByUrl("/view");
  
  }

  // /*********************************************************************
  //  *  Instance of Book for manupulation
  //  **********************************************************************/

  // addPassenger() {
  //   this.bookingService.addPassenger(this.passenger).subscribe(
  //     data=>{
  //     this.passenger=data;
  //     console.log(this.passenger);
  //     // alert('ADDED');
  //     this.info=data;    
  //     this.errorInfo=undefined;    
  //     },

  //     error=>{
  //       this.info=undefined;
  //       this.errorInfo=error.error;
  //     }
    
  //     );
   // this.route.navigateByUrl("/view");

  

  
  
//   viewPassenger(){
//     console.log("inside ngOninitcomponent");
//     this.bookingService.viewPassenger().subscribe(data => {
//       this.passenger = data;
     
//     });
// }

// updateId(id:number){


//   this.bookingService.IdUpdate=id;
  

// }

toggle(){
  
  this.show_dialog=!this.show_dialog;
  if(this.show_dialog)
  this.button_name="hide";
  else
  this.button_name="show";
}


}