package com.ltts.onlinelaptopstore.bo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.onlinelaptopstore.model.Sales;

@Repository
public interface SalesBo extends JpaRepository<Sales,Integer> {

}
