package com.work.assign.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.work.assign.Models.Employee;
import com.work.assign.Models.EmployeeAddress;


@Repository
public interface EmployeeAddressDao extends JpaRepository<EmployeeAddress, Long> {

	public List<EmployeeAddress> findByEmployee(Employee employee);

}
