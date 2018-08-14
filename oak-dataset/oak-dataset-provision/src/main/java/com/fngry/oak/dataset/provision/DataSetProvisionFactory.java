package com.fngry.oak.dataset.provision;

import com.fngry.oak.dataset.DataSetDefinitionObject;
import com.fngry.oak.dataset.DataSetObject;

import java.util.Collection;

public interface DataSetProvisionFactory<T extends DataSetDefinitionObject> {

    String getType();

    DataSetProvision create(T definition, Collection<DataSetObject> dataSets);

}
