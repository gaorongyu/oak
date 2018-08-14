package com.fngry.oak.function;

import com.fngry.oak.dataset.provision.DataSetProvision;

import java.util.Map;

public interface OakContext {

    DataSetProvision getDataSetProvision(Long dataSetDefinitionId, Long dataSetId);

    Map<String, Object> getVariables();

}
