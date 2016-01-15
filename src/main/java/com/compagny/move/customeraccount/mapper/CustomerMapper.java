package com.compagny.move.customeraccount.mapper;

import com.compagny.move.customeraccount.dto.destination.CustomerAccountDto;
import com.compagny.move.customeraccount.dto.source.Customer;
import com.compagny.move.customeraccount.mapper.classification.naturalPerson.CustomerClassificationNaturalPersonListMapper;
import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.IoC;
import fr.xebia.extras.selma.Mapper;

@Mapper(
        withIgnoreMissing = IgnoreMissing.ALL,
        withIoC = IoC.SPRING,
        withCustom = {
                CustomerClassificationNaturalPersonListMapper.class
        },
        withCustomFields = {
                @Field({"classificationList", "naturalPersonClassifications"})
        }
)
public interface CustomerMapper {

    CustomerAccountDto asCustomerAccountDto(Customer customer);

    Customer asCustomerAccount(CustomerAccountDto customerAccountDto);

}
