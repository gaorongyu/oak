package com.fngry.oak.dataset.tiny;

import com.fngry.oak.dataset.DataSetDefinitionCreation;

import java.util.Collection;

public class TinyDataSetDefinitionCreation extends DataSetDefinitionCreation {

    private Collection<TinyDataSetColumn> columns;

    public Collection<TinyDataSetColumn> getColumns() {
        return columns;
    }

    public void setColumns(Collection<TinyDataSetColumn> columns) {
        this.columns = columns;
    }

}
