import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddbookComponent } from './addbook/addbook.component';
import { ViewbookComponent } from './viewbook/viewbook.component';
import {HttpClientModule} from '@angular/common/http';
import { AnoopComponent } from './Anoop/anoop.component';
import { ViewBookingComponent } from './view-booking/view-booking.component';
import { ViewTicketComponent } from './view-ticket/view-ticket.component';








@NgModule({
  declarations: [
    AppComponent,
    AnoopComponent,
    AddbookComponent,
    ViewbookComponent,
    ViewBookingComponent,
    ViewTicketComponent,
  
   
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
