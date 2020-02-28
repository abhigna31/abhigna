import { TestBed } from '@angular/core/testing';

import { IpolistService } from './ipolist.service';

describe('IpolistService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: IpolistService = TestBed.get(IpolistService);
    expect(service).toBeTruthy();
  });
});
