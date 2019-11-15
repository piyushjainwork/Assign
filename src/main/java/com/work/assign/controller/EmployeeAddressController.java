package com.work.assign.controller;

import java.util.HashMap;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.work.assign.Models.EmployeeAddress;
import com.work.assign.Pojo.EmployeeAddressPojo;
import com.work.assign.Service.EmployeeAddressService;



@RestController
public class EmployeeAddressController {
	
	private final Logger logger = LoggerFactory.getLogger(EmployeeAddressController.class);
	@Autowired
	EmployeeAddressService empservice;

	@PostMapping("/postempaddress")
	public void postEmpAddress(@Valid @RequestBody EmployeeAddressPojo empinout) {
		logger.debug("inside posting employee Address");
		empservice.postEmpAddress(empinout);
		
		logger.debug(" Employee address posted successfully");
	}

	@GetMapping("/getalladdress")
	public List<EmployeeAddress> getAllAddress() {
		
		return empservice.getAllAddress();
	}

	@DeleteMapping("/delete/{addressid}")
	public String deleteAddress(@PathVariable long addressid) {
		return empservice.deleteByAddressId(addressid);
	}

	@GetMapping("/getempaddress/{empid}")
	public List<HashMap<String, String>> getAddressByEmpid(@PathVariable long empid) {
		return empservice.getAddressEmp(empid);
	}
	
	

}