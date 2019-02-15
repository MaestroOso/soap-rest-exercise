import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MovementComponentComponent } from './movement-component.component';

describe('MovementComponentComponent', () => {
  let component: MovementComponentComponent;
  let fixture: ComponentFixture<MovementComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MovementComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MovementComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
