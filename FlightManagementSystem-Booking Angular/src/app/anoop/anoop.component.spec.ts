import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AnoopComponent } from './anoop.component';

describe('AnoopComponent', () => {
  let component: AnoopComponent;
  let fixture: ComponentFixture<AnoopComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AnoopComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AnoopComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
