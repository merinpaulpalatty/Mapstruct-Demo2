package com.ust.mapstructDemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;

import com.ust.mapstructDemo.vo.Sports;
import com.ust.mapstructDemo.vo.SportsPeople;

@Mapper
public interface SportsMapper {
	
	/*@ValueMapping(source = "DHONI", target = "CRICKET")
	@ValueMapping(source = "FEDERER", target = "TENNIS")
	@ValueMapping(source = "NADAL", target = "TENNIS")
	@ValueMapping(source = "RAINA", target = "CRICKET")
	@ValueMapping(source = "MESSI", target = "FOOTBALL")
	Sports toSports(SportsPeople sportsPeople);*/
	
	@ValueMapping(source =MappingConstants.NULL,target = "MERIN")
	@ValueMapping(source =MappingConstants.ANY_REMAINING,target = "CRICKET")
	@ValueMapping(source = "NADAL", target = "TENNIS")
	//@ValueMapping(source =MappingConstants.ANY_UNMAPPED,target = "CRICKET")
	Sports toSportsByGroup(SportsPeople sportsPeople);

}
