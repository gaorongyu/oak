package com.fngry.oak.dataset.tiny;

import java.util.Date;
import java.util.List;

public class TinyDataSetEntryObject {

    private String key;

    private Date gmtCreate;

    private Date gmtModified;

    private String creator;

    private String modifier;

    private List<?> keys;

    private List<?> values;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public List<?> getKeys() {
        return keys;
    }

    public void setKeys(List<?> keys) {
        this.keys = keys;
    }

    public List<?> getValues() {
        return values;
    }

    public void setValues(List<?> values) {
        this.values = values;
    }
}
