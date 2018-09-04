import { TestBed, inject } from '@angular/core/testing';

import { KategorijeService } from './kategorije.service';

describe('KategorijeService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [KategorijeService]
    });
  });

  it('should be created', inject([KategorijeService], (service: KategorijeService) => {
    expect(service).toBeTruthy();
  }));
});
