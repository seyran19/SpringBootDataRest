package com.springboot.seirandzhafarov.springbootdatarest.dao;



import com.springboot.seirandzhafarov.springbootdatarest.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // Employee - с каким Entity работает
    // Integer - тип Primary key
    List<Employee> findAllByName(String name); // благодаря стандартизации имени метола Spring сам
                                              // его реализует
 }
