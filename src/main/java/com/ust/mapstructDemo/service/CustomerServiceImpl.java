package com.ust.mapstructDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.mapstructDemo.mapper.CustomerMapper;
import com.ust.mapstructDemo.mapper.VehicleMapper;
import com.ust.mapstructDemo.model.Car;
import com.ust.mapstructDemo.model.Customer;
import com.ust.mapstructDemo.repository.CustomerRepository;
import com.ust.mapstructDemo.vo.CustomerVO;
import com.ust.mapstructDemo.vo.VehicleVO;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CustomerMapper customerMapper;
	@Autowired
	private VehicleMapper vehicleMapper;

	// for saving customer
	public boolean saveCustomer(CustomerVO vo) {
		customerRepository.save(customerMapper.CustomerVOToCustomer(vo));
		return true;
	}

	// for retreiving customers
	public List<CustomerVO> getAllCustomers() {
		return customerMapper.CustomerListToCustomerVOList(customerRepository.findAll());
	}

	// to get one customer based on id
	public CustomerVO getCustomer(long id) {
		return customerMapper.CustomerToCustomerVO(customerRepository.findById(id).get());
	}

	// to update a customer
	public boolean updateCustomer(CustomerVO vo) {
		Customer customer = customerRepository.findById(vo.getCustomerId()).get();
		if (customer != null) {
			Customer updatedCustomer = customerMapper.toUpdateCustomer(vo, customer);
			customerRepository.save(updatedCustomer);
			return true;
		}
		return false;
	}

	// test method
	public VehicleVO getVehicleVO(Car car) {
		return vehicleMapper.toVehicleVO(car);
	}

}
