package com.ust.mapstructDemo.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.ust.mapstructDemo.model.Student;
import com.ust.mapstructDemo.vo.StudentVO;

@Mapper
public interface StudentMapper {
	
	//Update exist bean without return value
	//void updateStudent(StudentVO studentVO,@MappingTarget Student student);
	
	//Update exist bean and return it
	//Student updateStudent1(StudentVO studentVO,@MappingTarget Student student);
	
	@Mapping(target = "mark",source = "markInVO")
	Student toEntity(StudentVO studentvo);
	
	@Mapping(target = "mark",source = "name")
	Student toEntity1(StudentVO studentvo);
	
	@Mapping(target = "mark",source = "city")
	Student toEntity2(StudentVO studentvo);
	
	
	@InheritInverseConfiguration(name = "toEntity2")
	//@Mapping(target = "markInVO" ,ignore = true)
	StudentVO toStudentVo(Student student);
	
}
