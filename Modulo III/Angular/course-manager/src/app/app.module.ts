import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';

import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { CourseModule } from './courses/course.module';
import { CoreModule } from './core/core.module';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    CoreModule,
    BrowserModule,  
    CourseModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: '', redirectTo: 'courses',  pathMatch: 'full' },
      

    ])

    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
