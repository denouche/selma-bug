package com.compagny.move.customeraccount.mapper;

import com.compagny.move.customeraccount.dto.destination.CustomerAccountDto;
import com.compagny.move.customeraccount.dto.source.Customer;
import com.compagny.move.customeraccount.mapper.classification.naturalPerson.CustomerClassificationNaturalPersonListMapper;
import fr.xebia.extras.selma.Mapper;

@Mapper(
        withCustom = {
                CustomerClassificationNaturalPersonListMapper.class
        }
)
public interface CustomerMapper {

    CustomerAccountDto asCustomerAccountDto(Customer customer);

    Customer asCustomerAccount(CustomerAccountDto customerAccountDto);

}
