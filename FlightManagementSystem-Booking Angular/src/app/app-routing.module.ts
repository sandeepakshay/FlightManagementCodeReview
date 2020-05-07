import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddbookComponent } from './addbook/addbook.component';
import { ViewbookComponent } from './viewbook/viewbook.component';
import {AnoopComponent} from './Anoop/anoop.component';
import { ViewBookingComponent } from './view-booking/view-booking.component';
import { ViewTicketComponent } from './view-ticket/view-ticket.component';






const routes: Routes = [{ path: 'add', component: AddbookComponent },
                        { path: 'view', component: ViewbookComponent },
                        { path: 'xyz', component: AnoopComponent },
                        { path: 'viewb', component: ViewBookingComponent },
                        {path: 'viewt', component: ViewTicketComponent },
                        
                       
                      
                        
                      ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
