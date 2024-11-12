import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BebidaProcesadaComponent } from './bebida-procesada.component';

describe('BebidaProcesadaComponent', () => {
  let component: BebidaProcesadaComponent;
  let fixture: ComponentFixture<BebidaProcesadaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BebidaProcesadaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BebidaProcesadaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
