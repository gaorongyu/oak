package com.fngry.oak.function.impl.mapping;

import com.fngry.oak.dataset.provision.DataSetProvision;
import com.fngry.oak.function.*;

public class DataSetFieldMappingFunction<T extends OakDataObject> implements FieldMappingFunction<T> {

    private static final long serialVersionUID = 228402724558461673L;

    @FunctionParam(type = FunctionParamType.DATA_SET_DEFINITION)
    private Long dataSetDefintionId;

    @FunctionParam(type = FunctionParamType.DATA_SET)
    private Long dataSetId;

    private DataSetProvision provision;

    @Override
    public Object apply(OakContext context, String fieldName, T target) throws Exception {
        DataSetProvision dataSetProvision = getDataSetProvision(context);
        return dataSetProvision.retrive(target::get);
    }

    private DataSetProvision getDataSetProvision(OakContext context) {
        if (this.provision != null) {
            return this.provision;
        }

        return this.provision = context.getDataSetProvision(dataSetDefintionId, dataSetId);
    }

}
