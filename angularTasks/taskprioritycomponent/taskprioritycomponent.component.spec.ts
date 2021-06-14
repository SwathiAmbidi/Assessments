import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TaskprioritycomponentComponent } from './taskprioritycomponent.component';

describe('TaskprioritycomponentComponent', () => {
  let component: TaskprioritycomponentComponent;
  let fixture: ComponentFixture<TaskprioritycomponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TaskprioritycomponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TaskprioritycomponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
