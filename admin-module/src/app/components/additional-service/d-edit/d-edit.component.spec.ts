import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DEditComponent } from './d-edit.component';

describe('DEditComponent', () => {
  let component: DEditComponent;
  let fixture: ComponentFixture<DEditComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DEditComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
