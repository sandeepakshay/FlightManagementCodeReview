import { TestBed } from '@angular/core/testing';

import { AnoopService } from './anoop.service';

describe('AnoopService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AnoopService = TestBed.get(AnoopService);
    expect(service).toBeTruthy();
  });
});
