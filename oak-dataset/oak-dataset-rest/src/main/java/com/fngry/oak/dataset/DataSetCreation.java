package com.fngry.oak.dataset;

import java.util.Date;

public class DataSetCreation {

    private String remark;

    private Date effectiveDateBegin;

    private Date effectiveDateEnd;


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getEffectiveDateBegin() {
        return effectiveDateBegin;
    }

    public void setEffectiveDateBegin(Date effectiveDateBegin) {
        this.effectiveDateBegin = effectiveDateBegin;
    }

    public Date getEffectiveDateEnd() {
        return effectiveDateEnd;
    }

    public void setEffectiveDateEnd(Date effectiveDateEnd) {
        this.effectiveDateEnd = effectiveDateEnd;
    }
}
