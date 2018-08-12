package com.fngry.oak.function;

import java.util.Map;

public interface OakContext {

    OakDataSet getDataSet(String dataSetName);

    Map<String, Object> getVariables();

}
