import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { UsersComponent } from './login/users/users.component';
import { HomeComponent } from './home/home.component';
import { AdminhomeComponent } from './adminhome/adminhome.component';
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
import { Company } from './models/Company';
import { CompanyComponent } from './company/company.component';
import { UpdateComponent } from './update/update.component';
import { AddipoComponent } from './addipo/addipo.component';
import { IpolistComponent } from './ipolist/ipolist.component';
import { AddstockexchangeComponent } from './addstockexchange/addstockexchange.component';
import { UpdatestockexchangeComponent } from './updatestockexchange/updatestockexchange.component';
import { StockexchangelistComponent } from './stockexchangelist/stockexchangelist.component';
import { IpodetailsComponent } from './ipodetails/ipodetails.component';
import { ActivateComponent } from './activate/activate.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'users', component:UsersComponent},
  { path: 'register', component: RegisterComponent},
  {path: 'home',component:HomeComponent},
  {path:'adminhome',component:AdminhomeComponent},
  {path:'importdata',component:ImportdataComponent},
  {path:'companydetails',component:CompanydetailsComponent},
  {path:'stockExchange',component:StockExchangeComponent},
  {path:'userhome',component:UserhomeComponent},
  {path:'comparecompany',component:ComparecompanyComponent},
  {path:'addcompany',component:AddcompanyComponent},
  {path:'updatecompany',component:UpdatecompanyComponent},
  {path:'deletecompany',component:DeletecompanyComponent},
  {path:'updateipo',component:UpdateipoComponent},
  {path:'comparesector',component:ComparesectorComponent},
  {path:'company',component:CompanyComponent},
  {path:'update',component:UpdateComponent},
  {path:'addipo',component:AddipoComponent},
  {path:'ipolist',component:IpolistComponent},
  {path:'addstockexchange',component:AddstockexchangeComponent},
  {path:'updatestock',component:UpdatestockexchangeComponent},
  {path:'stockexchangelist',component:StockexchangelistComponent},
  {path:'ipodetails',component:IpodetailsComponent},
  {path:'activate',component:ActivateComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
