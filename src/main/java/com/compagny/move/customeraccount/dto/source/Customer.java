
package com.compagny.move.customeraccount.dto.source;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "classificationList"
})
public class Customer
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ClassificationList classificationList;

    public ClassificationList getClassificationList() {
        return classificationList;
    }

    public void setClassificationList(ClassificationList value) {
        this.classificationList = value;
    }

}
