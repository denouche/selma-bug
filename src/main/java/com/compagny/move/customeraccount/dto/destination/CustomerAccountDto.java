package com.compagny.move.customeraccount.dto.destination;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class CustomerAccountDto implements Serializable {

    private NaturalPersonClassificationsDto naturalPersonClassifications;

	public NaturalPersonClassificationsDto getNaturalPersonClassifications() {
		return naturalPersonClassifications;
	}

	public void setNaturalPersonClassifications(NaturalPersonClassificationsDto naturalPersonClassifications) {
		this.naturalPersonClassifications = naturalPersonClassifications;
	}

}
