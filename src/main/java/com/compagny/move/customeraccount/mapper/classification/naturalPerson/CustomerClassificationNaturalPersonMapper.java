package com.compagny.move.customeraccount.mapper.classification.naturalPerson;

import com.compagny.move.customeraccount.dto.destination.NaturalPersonClassificationsDto;
import com.compagny.move.customeraccount.dto.source.Classification;
import com.compagny.move.customeraccount.mapper.classification.ICustomerClassificationMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerClassificationNaturalPersonMapper implements ICustomerClassificationMapper {

    public void updateDto_childrenNumber(NaturalPersonClassificationsDto dto, Classification classification) {
        dto.setChildrenNumber(classification.getCode());
    }

    public void updateClassification_childrenNumber(Classification classification, NaturalPersonClassificationsDto dto) {
        classification.setCode(dto.getChildrenNumber());
    }

}
