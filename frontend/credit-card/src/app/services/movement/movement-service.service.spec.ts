import { TestBed } from '@angular/core/testing';

import { MovementServiceService } from './movement-service.service';

describe('MovementServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MovementServiceService = TestBed.get(MovementServiceService);
    expect(service).toBeTruthy();
  });
});
