package com.fngry.oak.dataset.dataobject;

import java.util.Date;

public class DataSetDO {

    private Long id;

    private String creator;

    private Date gmtCreated;

    private Date gmtModified;

    private Long definitionId;

    private String remark;

    private String namespace;

    private Date effectiveDateBegin;

    private Date effectiveDateEnd;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Long getDefinitionId() {
        return definitionId;
    }

    public void setDefinitionId(Long definitionId) {
        this.definitionId = definitionId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
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
