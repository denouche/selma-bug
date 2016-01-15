package com.compagny.move.customeraccount.mapper.classification.naturalPerson;

import com.compagny.move.customeraccount.dto.destination.NaturalPersonClassificationsDto;
import com.compagny.move.customeraccount.mapper.classification.CustomerClassificationAbstractListMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerClassificationNaturalPersonListMapper extends CustomerClassificationAbstractListMapper<NaturalPersonClassificationsDto> {

    public CustomerClassificationNaturalPersonListMapper() {
        super(NaturalPersonClassificationsDto.class);
    }

}
