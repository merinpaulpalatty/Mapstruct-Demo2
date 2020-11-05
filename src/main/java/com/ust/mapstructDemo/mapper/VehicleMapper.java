package com.ust.mapstructDemo.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.ust.mapstructDemo.model.Bike;
import com.ust.mapstructDemo.model.Car;
import com.ust.mapstructDemo.model.Vehicle;
import com.ust.mapstructDemo.vo.VehicleType;
import com.ust.mapstructDemo.vo.VehicleVO;

@Mapper(componentModel = "spring")
public abstract class VehicleMapper {
	
	@BeforeMapping
	protected void detemineType(Vehicle vehicle,@MappingTarget VehicleVO vehicleVO) {
		if(vehicle instanceof Car) {
			vehicleVO.setVehicleType(VehicleType.FOUR_WHEELER);
		}
		if(vehicle instanceof Bike) {
			vehicleVO.setVehicleType(VehicleType.TWO_WHEELER);
		}
	}
	
	@AfterMapping
	protected void nameToUpperCase(@MappingTarget VehicleVO vehicleVO) {
		vehicleVO.setName(vehicleVO.getName().toUpperCase());
	}
	
	public abstract VehicleVO toVehicleVO (Vehicle vehicle);
	
	

}
