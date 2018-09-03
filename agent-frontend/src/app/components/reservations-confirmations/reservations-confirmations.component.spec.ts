import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReservationsConfirmationsComponent } from './reservations-confirmations.component';

describe('ReservationsConfirmationsComponent', () => {
  let component: ReservationsConfirmationsComponent;
  let fixture: ComponentFixture<ReservationsConfirmationsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReservationsConfirmationsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReservationsConfirmationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
