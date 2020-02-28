import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AdminhomeComponent } from './adminhome/adminhome.component';
import { UsersComponent } from './login/users/users.component';  
import { HttpClientModule } from '@angular/common/http';
import { ServiceService } from './service.service';
import { UpdateComponent } from './update/update.component';
import { HomeComponent } from './home/home.component';
import { ImportdataComponent } from './importdata/importdata.component';
import { CompanydetailsComponent } from './adminhome/companydetails/companydetails.component';
import { StockExchangeComponent } from './admin/stock-exchange/stock-exchange.component';
import { UserhomeComponent } from './userhome/userhome.component';
import { ComparecompanyComponent } from './user/comparecompany/comparecompany.component';
import { AddcompanyComponent } from './addcompany/addcompany.component';
import { UpdatecompanyComponent } from './admin/updatecompany/updatecompany.component';
import { DeletecompanyComponent } from './admin/deletecompany/deletecompany.component';
import { UpdateipoComponent } from './updateipo/updateipo.component';
import { ComparesectorComponent } from './comparesector/comparesector.component';
import { CompanyComponent } from '../app/company/company.component';
import { AddipoComponent } from './addipo/addipo.component';
import { IpolistComponent } from './ipolist/ipolist.component';
import { AddstockexchangeComponent } from './addstockexchange/addstockexchange.component';
import { UpdatestockexchangeComponent } from './updatestockexchange/updatestockexchange.component';
import { StockexchangelistComponent } from './stockexchangelist/stockexchangelist.component';
import { IpodetailsComponent } from './ipodetails/ipodetails.component';
import { ActivateComponent } from './activate/activate.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    AdminhomeComponent,
    UsersComponent,
    UpdateComponent,
    HomeComponent,
    ImportdataComponent,
    CompanydetailsComponent,
    StockExchangeComponent,
    UserhomeComponent,
    ComparecompanyComponent,
    AddcompanyComponent,
    UpdatecompanyComponent,
    DeletecompanyComponent,
    UpdateipoComponent,
    ComparesectorComponent,
    CompanyComponent,
    AddipoComponent,
    IpolistComponent,
    AddstockexchangeComponent,
    UpdatestockexchangeComponent,
    StockexchangelistComponent,
    IpodetailsComponent,
    ActivateComponent,

  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
