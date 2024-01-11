package com.niveus.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.niveus.main.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
