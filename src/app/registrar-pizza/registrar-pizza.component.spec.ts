import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrarPizzaComponent } from './registrar-pizza.component';

describe('RegistrarPizzaComponent', () => {
  let component: RegistrarPizzaComponent;
  let fixture: ComponentFixture<RegistrarPizzaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [RegistrarPizzaComponent]
    })
      .compileComponents();

    fixture = TestBed.createComponent(RegistrarPizzaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
