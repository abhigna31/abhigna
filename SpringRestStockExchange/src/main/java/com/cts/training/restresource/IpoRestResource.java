package com.cts.training.restresource;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cts.training.model.Ipo;

public interface IpoRestResource  extends PagingAndSortingRepository<Ipo, Integer>  {

}
