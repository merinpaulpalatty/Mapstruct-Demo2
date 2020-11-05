/*
 *  20-Oct-2020
 *  Copyright (c) 2020 Muthoot Group. All Rights Reserved.
 */
package com.ust.mapstructDemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ust.mapstructDemo.model.Customer;
import com.ust.mapstructDemo.model.Diet;
import com.ust.mapstructDemo.vo.DietVO;

/**
 * The Interface DietMapper.
 */
@Mapper(componentModel = "spring"
//,unmappedTargetPolicy = ReportingPolicy.ERROR
)
public interface DietMapper {

    /**
     * Diet to diet VO.
     *
     * @param diet the diet
     * @return the diet VO
     */
    DietVO dietToDietVO(Diet diet);

    /**
     * Diet to diet VO with constant.
     *
     * @param diet the diet
     * @return the diet VO
     */
    // @Mapping(target="qty",constant = "5")
    @Mapping(target = "targetDateInString", source = "targetDate", dateFormat = "dd-MM-yyyy HH:mm:ss")
    // @Mapping(target = "targetDate" ,expression = "java(new java.util.Date())")
    @Mapping(target = "expressionExp", expression = "java(diet.getFruits().get(0).getName())")
    @Mapping(target = "unmappedVo1", ignore = true)
    // @Mapping(target="qty",source = "weight")
    DietVO dietToDietVOWithConstant(Diet diet);

    /**
     * Diet to diet VO with qty.
     *
     * @param diet     the diet
     * @param customer the customer
     * @return the diet VO
     */
    @Mapping(target = "qty", source = "customer.age")
    DietVO dietToDietVOWithQty(Diet diet, Customer customer);

    /**
     * Diet vo to diet.
     *
     * @param dietVO the diet VO
     * @return the diet
     */
    Diet dietVoToDiet(DietVO dietVO);

    /**
     * To fruit VO.
     *
     * @param fruit the fruit
     * @return the fruit VO
     */
    /*
     * @Mapping(target = "fruitId", source = "fruitId", defaultValue = "20") FruitVO
     * toFruitVO(Fruit fruit);
     */

    /*
     * default void aaa(Diet diet) { diet.getFruits().get(0).getName();
     * LocalDateTime.now(); }
     */

}
