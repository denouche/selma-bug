
package com.compagny.move.customeraccount.dto.source;

import java.util.ArrayList;
import java.util.List;


public class ClassificationList {

    protected List<Classification> classification;

    public List<Classification> getClassification() {
        if (classification == null) {
            classification = new ArrayList<Classification>();
        }
        return this.classification;
    }

}
