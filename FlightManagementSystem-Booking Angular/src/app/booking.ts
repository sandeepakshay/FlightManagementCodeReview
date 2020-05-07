import { Flight } from './flight';
import { Passenger } from './passenger';

export class Booking{
    bookingId:number;
    bookingdate:Date;
    noOfPassengers:number;
    flightNumber:number;
    //passenger:Passenger=new Passenger(); 
    UserId:number;
    ticketCost:number;
    passengerName:string;
    passengerAge:number;
    gender: string;
    seatType:string;
    extraBaggage:number;
    constructor(){}
}
export class fu{

    booking:Booking;

}