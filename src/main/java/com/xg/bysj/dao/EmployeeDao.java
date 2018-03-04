package com.xg.bysj.dao;

import com.xg.bysj.domain.Employee;
import com.xg.bysj.jpaRepository.MyRepository;


public interface EmployeeDao extends MyRepository<Employee, Integer> {

}