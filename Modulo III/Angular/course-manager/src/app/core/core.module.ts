import { NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";
import { Error404Component } from "./component/404/Error404.component";
import { NavBarComponent } from "./component/nav-bar/nav-bar.component";



@NgModule(
{
  declarations: [
  NavBarComponent],
  exports: [
  NavBarComponent],
  imports: [
  RouterModule.forChild([
      { path:"**", component: Error404Component}
  ])]


)

export class CoreModule{}