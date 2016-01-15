
package com.compagny.move.customeraccount.dto.source;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ClassificationList
    implements Serializable
{

    protected List<Classification> classification;

    public List<Classification> getClassification() {
        if (classification == null) {
            classification = new ArrayList<Classification>();
        }
        return this.classification;
    }

}
