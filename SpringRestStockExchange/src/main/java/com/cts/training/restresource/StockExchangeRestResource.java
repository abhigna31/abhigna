package com.cts.training.restresource;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.cts.training.model.StockExchange;


public interface StockExchangeRestResource extends PagingAndSortingRepository<StockExchange, Integer> {

}
