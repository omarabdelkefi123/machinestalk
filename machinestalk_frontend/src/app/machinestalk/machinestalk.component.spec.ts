import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MachinestalkComponent } from './machinestalk.component';

describe('MachinestalkComponent', () => {
  let component: MachinestalkComponent;
  let fixture: ComponentFixture<MachinestalkComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MachinestalkComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MachinestalkComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
