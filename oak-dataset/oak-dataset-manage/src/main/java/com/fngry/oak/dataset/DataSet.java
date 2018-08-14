package com.fngry.oak.dataset;

import java.util.Date;

public interface DataSet {

    String getNamespace();

    Long getDefinitionId();

    Long getId();

    Date getEffectiveDateBegin();

    Date getEffectiveDateEnd();

    String getType();

    String getRemark();

    String getCreator();

    String getGemCreated();

}
