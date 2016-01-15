
package com.compagny.move.customeraccount.dto.source;

import java.io.Serializable;

public class Classification
    implements Serializable
{

    protected String code;
    protected Integer type;

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer value) {
        this.type = value;
    }

}
