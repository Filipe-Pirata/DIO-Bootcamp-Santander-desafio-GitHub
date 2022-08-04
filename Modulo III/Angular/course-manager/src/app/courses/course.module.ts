import { NgModule } from "@angular/core";
import { CourseListComponent } from "./courses-list.component";
import { CourseInfoComponent } from "./courses.info.component";
import { RouterModule} from '@angular/router';
import { FormsModule } from "@angular/forms";
import { CommonModule } from "@angular/common";
import { StarModule } from "../shared/component/star/star.module";
import { AppPipeModule } from "../shared/pipe/app-pipe.module";
import { Error404Component } from "../core/component/404/Error404.component";



@NgModule({
  declarations: [
    CourseListComponent,
    CourseInfoComponent,
    Error404Component
  
    
  ],
  imports: [
    AppPipeModule,
    StarModule,
    CommonModule,
    FormsModule,
     RouterModule.forChild([
      {
        path: '', 
        redirectTo: 'courses',
        pathMatch: 'full' },
        {
        path:'courses/info/:id' , 
        component: CourseInfoComponent

        }

    ]),



  ]

})
export class CourseModule {} 