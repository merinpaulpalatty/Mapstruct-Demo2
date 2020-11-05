package com.ust.mapstructDemo.service;

import java.util.List;

import com.ust.mapstructDemo.model.Car;
import com.ust.mapstructDemo.vo.CustomerVO;
import com.ust.mapstructDemo.vo.VehicleVO;

public interface CustomerService {

	boolean saveCustomer(CustomerVO vo);

	List<CustomerVO> getAllCustomers();

	CustomerVO getCustomer(long id);

	boolean updateCustomer(CustomerVO vo);

	
	//test method
	VehicleVO getVehicleVO(Car car);

}
