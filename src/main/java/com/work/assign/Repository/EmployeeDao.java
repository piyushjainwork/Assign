package com.work.assign.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.work.assign.Models.Employee;




@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

	Employee findById(long id);

}

