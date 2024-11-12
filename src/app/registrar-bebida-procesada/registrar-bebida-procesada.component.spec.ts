import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrarBebidaProcesadaComponent } from './registrar-bebida-procesada.component';

describe('RegistrarBebidaProcesadaComponent', () => {
  let component: RegistrarBebidaProcesadaComponent;
  let fixture: ComponentFixture<RegistrarBebidaProcesadaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RegistrarBebidaProcesadaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegistrarBebidaProcesadaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
