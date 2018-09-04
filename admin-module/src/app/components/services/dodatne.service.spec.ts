import { TestBed, inject } from '@angular/core/testing';

import { DodatneService } from './dodatne.service';

describe('DodatneService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [DodatneService]
    });
  });

  it('should be created', inject([DodatneService], (service: DodatneService) => {
    expect(service).toBeTruthy();
  }));
});
