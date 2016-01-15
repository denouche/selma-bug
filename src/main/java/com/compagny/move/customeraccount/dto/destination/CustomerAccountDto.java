package com.compagny.move.customeraccount.dto.destination;

import java.io.Serializable;

public class CustomerAccountDto implements Serializable {

    private NaturalPersonClassificationsDto classificationList;

	public NaturalPersonClassificationsDto getClassificationList() {
		return classificationList;
	}

	public void setClassificationList(NaturalPersonClassificationsDto classificationList) {
		this.classificationList = classificationList;
	}

}
