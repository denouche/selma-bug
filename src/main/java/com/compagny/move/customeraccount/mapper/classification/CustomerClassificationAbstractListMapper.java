package com.compagny.move.customeraccount.mapper.classification;

import com.compagny.move.customeraccount.dto.source.ClassificationList;
import com.compagny.move.customeraccount.mapper.CustomerAbstractExternalListMapper;

public abstract class CustomerClassificationAbstractListMapper<DESTINATION> extends CustomerAbstractExternalListMapper {

    private Class<DESTINATION> clazz;

    public CustomerClassificationAbstractListMapper(Class<DESTINATION> clazz) {
        this.clazz = clazz;
    }

    public DESTINATION asDtoList(ClassificationList in) {
        if(in == null || in.getClassification() == null) {
            return null;
        }
        return null;
    }


    public ClassificationList asList(DESTINATION in) {
        if(in == null) {
            return null;
        }
        return null;
    }

}
