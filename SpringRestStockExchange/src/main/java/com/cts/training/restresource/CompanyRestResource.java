package com.cts.training.restresource;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cts.training.model.Company;

public interface CompanyRestResource extends PagingAndSortingRepository<Company, Integer> {

}
