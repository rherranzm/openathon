import { TestBed, inject } from '@angular/core/testing';

import { VelocitytestService } from './velocitytest.service';

describe('VelocitytestService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [VelocitytestService]
    });
  });

  it('should be created', inject([VelocitytestService], (service: VelocitytestService) => {
    expect(service).toBeTruthy();
  }));
});
