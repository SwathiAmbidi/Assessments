import { Component, OnInit } from '@angular/core';

interface taskPriority{
  priority:number;
  taskName:string;
  status:string;
}


@Component({
  selector: 'app-taskprioritycomponent',
  templateUrl: './taskprioritycomponent.component.html',
  styleUrls: ['./taskprioritycomponent.component.css']
})
export class TaskprioritycomponentComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }


  
tasks:taskPriority[]=[];
userinput = {} as taskPriority;

addOrUpdate(name:string,priority:string){
  let isExisting:boolean = false;
    
    for(let i = 0;i<this.tasks.length;i++)
    {
      if(this.tasks[i].taskName == name)
      {
        isExisting = true;
        this.tasks[i].priority = parseInt(priority);
        break;
      }
    }

    if(!isExisting)
    {
      let pri:number = parseInt(priority);
      let tempTask:taskPriority={
        taskName:name,
        priority:pri,
        status:"pending"
      };
      this.tasks.push(tempTask);
    }

  }
getAllTasks():taskPriority[]{
  return this.tasks;
}

  changeStatus(status:string, name:string){
   this.tasks.forEach(task=>{
     if(task.taskName.localeCompare(name)==0){
       task.status=status;
     }
   })
  }
}