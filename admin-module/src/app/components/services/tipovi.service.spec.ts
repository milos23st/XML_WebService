import { TestBed, inject } from '@angular/core/testing';

import { TipoviService } from './tipovi.service';

describe('TipoviService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [TipoviService]
    });
  });

  it('should be created', inject([TipoviService], (service: TipoviService) => {
    expect(service).toBeTruthy();
  }));
});
