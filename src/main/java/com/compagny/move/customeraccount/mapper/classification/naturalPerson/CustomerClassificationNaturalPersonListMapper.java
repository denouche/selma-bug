package com.compagny.move.customeraccount.mapper.classification.naturalPerson;

import com.compagny.move.customeraccount.dto.destination.NaturalPersonClassificationsDto;
import com.compagny.move.customeraccount.dto.source.ClassificationList;
import org.springframework.stereotype.Component;

@Component
public class CustomerClassificationNaturalPersonListMapper {

    public NaturalPersonClassificationsDto asDtoList(ClassificationList in) {
        if(in == null || in.getClassification() == null) {
            return null;
        }
        return null;
    }

    public ClassificationList asList(NaturalPersonClassificationsDto in) {
        if(in == null) {
            return null;
        }
        return null;
    }

}
