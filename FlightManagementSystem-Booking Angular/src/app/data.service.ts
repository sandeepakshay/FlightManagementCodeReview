import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';

import{Observable} from 'rxjs';

import { Search } from './search';
import { Passenger } from './passenger';
import { Booking } from './Booking';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  IddToUpdate:number;
  IdtoUpdate:number;
  IdToUpdate:number;
  Idtoupdate:number;
  IdUpdate:number;
  IdUUpdate:number;

  successInfo:string;

  constructor(private http:HttpClient) { }


  getSuccessInfo():string{

       return this.successInfo;
  }

  setSuccessInfo(msg:string){

        this.successInfo=msg;
  }

  public getFlights():Observable<any>{
    return this.http.get("http://localhost:1111/flightlist");
    
  }
  public viewflight(flightNumber:number):Observable<any>{

    const httpOptions={

         headers:new HttpHeaders({'Content-type':'application/json'})
    };
    let endpoint=flightNumber
    return this.http.get("http://localhost:1111/getflight/"+flightNumber,httpOptions);
}
  
  public viewbooking():Observable<any>{
    return this.http.get("http://localhost:1111/viewBooking");
    
  }
  public addbooking(booking:Booking):Observable<any>{
    return this.http.post("http://localhost:1111/addBooking",booking,{responseType:'text'});
  }
  public cancelbooking(bookingId:number):Observable<any>
  {

         console.log("Booking Cancel");
         let endpoint=bookingId;
         return this.http.delete("http://localhost:1111/cancelBooking/"+endpoint);

  }
  public viewBooking(bookingId:number):Observable<any>{

         const httpOptions={

              headers:new HttpHeaders({'Content-type':'application/json'})
         };
         let endpoint=bookingId
         return this.http.get("http://localhost:1111/viewBooking/"+bookingId,httpOptions);
  }
  searchMethod(search:Search):Observable<any>{

          console.log("search service");
          return this.http.post("http://localhost:1113/search",search);
  }
  public viewPassenger():Observable<any>{
    return this.http.get("http://localhost:1111/getAllPassenger");
    
  }
  public addPassenger(passenger:Passenger):Observable<any>{
    return this.http.post("http://localhost:1111/addPassenger",passenger,{responseType:'json'});
    
  }
  public deletePassenger(bookingId:number):Observable<any>
  {

         console.log("Booking Cancel");
         let endpoint=bookingId;
         return this.http.delete("http://localhost:1111/deletePassenger/"+endpoint);

  }
  public viewpassenger(PnrNumber:number):Observable<any>{

         const httpOptions={

              headers:new HttpHeaders({'Content-type':'application/json'})
         };
         let endpoint=PnrNumber
         return this.http.get("http://localhost:1111/getPassenger/"+PnrNumber,httpOptions);
  }


}
