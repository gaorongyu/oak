package com.fngry.oak.dataset.provision;

import com.fngry.oak.dataset.DataSetProvisionObject;
import sun.net.www.http.HttpClient;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

public class DataSetProvisionClient {

    private static Map<String, DataSetProvisionFactory> DATA_SET_PROVISION_FACTORIES = new HashMap<>();

    private static final String DATA_SET_DEFINITION_ID = "dataSetDefinitionId";

    private static final String DATA_SET_ID = "dataSetId";

    private static final String BIZ_DATE = "bizDate";

    static {
        // load dataset factory
        ServiceLoader<DataSetProvisionFactory> serviceLoaders = ServiceLoader.load(DataSetProvisionFactory.class);
        serviceLoaders.forEach(e -> DATA_SET_PROVISION_FACTORIES.put(e.getType(), e));
    }

    private String domainName;

    private String path;

    public DataSetProvisionClient(String domainName, String path) {
        this.domainName = domainName;
        this.path = path;
    }

    public static DataSetProvisionFactory getFactory(String type) {
        return DATA_SET_PROVISION_FACTORIES.get(type);
    }

    public DataSetProvision create(Long dataSetDefinitionId, Long dataSetId, Date bizDate) throws Exception {
        DataSetProvisionObject meta = select(dataSetDefinitionId, dataSetId, bizDate);

        DataSetProvisionFactory factory = getFactory(meta.getDefinition().getType());
        if (factory == null) {
            throw new IllegalStateException("DataSetProvisionFactory not exists: "
                    + meta.getDefinition().getType());
        }
        return factory.create(meta.getDefinition(), meta.getDataSets());
    }

    private DataSetProvisionObject select(Long dataSetDefinitionId, Long dataSetId, Date bizDate) {
        if (dataSetDefinitionId == null) {
            throw new IllegalArgumentException("dataSetDefinitionId is required");
        }
        Map<String, String> params = new HashMap<>();
        params.put(DATA_SET_DEFINITION_ID, dataSetDefinitionId.toString());

        if (dataSetId != null) {
            params.put(DATA_SET_ID, dataSetId.toString());
        }

        // http get

        return null;
    }

}
