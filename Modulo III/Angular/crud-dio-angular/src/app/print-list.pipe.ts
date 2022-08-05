import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'printList'
})
export class PrintListPipe implements PipeTransform {

  transform(value: string[], ...args: unknown[]): unknown {
   let returnStr = '';
   if(value.length) {
    value.forEach(val => {
      returnStr = returnStr + ' ' + val
    })

   }
   return returnStr;

   }
    
  }

