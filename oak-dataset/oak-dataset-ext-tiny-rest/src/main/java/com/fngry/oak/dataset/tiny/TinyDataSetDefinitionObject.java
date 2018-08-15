package com.fngry.oak.dataset.tiny;

import com.fngry.oak.dataset.DataSetDefinitionObject;

import java.util.List;
import java.util.Map;

public class TinyDataSetDefinitionObject extends DataSetDefinitionObject {

    public static final String TYPE = "TINY";

    private List<String> keys;

    private List<String> values;

    private Map<String, String> configuration;

    private String tableName;

    private String columnFamily;

    private String column;

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public Map<String, String> getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Map<String, String> configuration) {
        this.configuration = configuration;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnFamily() {
        return columnFamily;
    }

    public void setColumnFamily(String columnFamily) {
        this.columnFamily = columnFamily;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }
}
