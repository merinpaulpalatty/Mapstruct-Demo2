package com.ust.mapstructDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ust.mapstructDemo.model.Car;
import com.ust.mapstructDemo.service.CustomerService;
import com.ust.mapstructDemo.vo.CustomerVO;
import com.ust.mapstructDemo.vo.VehicleVO;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping
	public ResponseEntity<?> saveCustomer(@RequestBody CustomerVO vo) {
		if (customerService.saveCustomer(vo))
			return new ResponseEntity<String>("successfully saved", HttpStatus.CREATED);
		else
			return new ResponseEntity<String>("something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@GetMapping
	public ResponseEntity<?> getAllCustomers() {
		List<CustomerVO> VOs = customerService.getAllCustomers();
		return new ResponseEntity<>(VOs, HttpStatus.OK);
	}
	
	@GetMapping("/getCustomer/{id}")
	public ResponseEntity<?> getCustomer(@PathVariable long id) {
		CustomerVO VO = customerService.getCustomer(id);
		return new ResponseEntity<>(VO, HttpStatus.OK);
	}
	
	@PutMapping("/updateCustomer")
	public ResponseEntity<String> upadteCustomer(@RequestBody CustomerVO vo) {
		if (customerService.updateCustomer(vo))
			return new ResponseEntity<>("successfully updated", HttpStatus.OK);
		else
			return new ResponseEntity<>("something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@GetMapping("testurl")
	public ResponseEntity<?> test() {
		Car car = new Car();
		car.setId(1);
		car.setName("alto");
		VehicleVO vehcileVO= customerService.getVehicleVO(car);
		return new ResponseEntity<>(vehcileVO, HttpStatus.OK);
	} 
	
	

}
