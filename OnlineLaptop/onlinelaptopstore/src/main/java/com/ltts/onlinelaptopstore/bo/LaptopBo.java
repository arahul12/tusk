package com.ltts.onlinelaptopstore.bo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.onlinelaptopstore.model.Laptop;

@Repository
public interface LaptopBo extends JpaRepository<Laptop, Integer>{

}
