import { TestBed } from '@angular/core/testing';

import { BebidaProcesadaService } from './bebida-procesada.service';

describe('BebidaProcesadaService', () => {
  let service: BebidaProcesadaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BebidaProcesadaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
