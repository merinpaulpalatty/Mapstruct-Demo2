package com.ust.mapstructDemo.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.ust.mapstructDemo.model.Customer;
import com.ust.mapstructDemo.model.CustomerFullName;
import com.ust.mapstructDemo.vo.CustomerFullNameVO;
import com.ust.mapstructDemo.vo.CustomerVO;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
	
	
	CustomerVO CustomerToCustomerVO(Customer customer);
	
	Customer CustomerVOToCustomer(CustomerVO customerVO);
	
	List<CustomerVO> CustomerListToCustomerVOList(List<Customer> customers);
	
	Customer toUpdateCustomer(CustomerVO customerVO,@MappingTarget Customer customer);
	
	//only impl
	/*CustomerFullNameVO customerFullNameToVO (CustomerFullName fullName);
	
	default CustomerFullNameVO customerFullNameToVoOnly (CustomerFullName fullName) {    //impl for full Name
		CustomerFullNameVO fullNameVO = new CustomerFullNameVO();
		fullNameVO.setFullName(fullName.getFirstName()+ " "+fullName.getLastName());
		return fullNameVO;
	}*/
	
	
	
}
