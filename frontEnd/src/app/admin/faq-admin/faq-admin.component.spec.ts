import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FaqAdminComponent } from './faq-admin.component';

describe('FaqAdminComponent', () => {
  let component: FaqAdminComponent;
  let fixture: ComponentFixture<FaqAdminComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FaqAdminComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FaqAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
