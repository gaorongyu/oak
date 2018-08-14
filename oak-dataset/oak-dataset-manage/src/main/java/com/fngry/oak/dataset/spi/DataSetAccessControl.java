package com.fngry.oak.dataset.spi;

public interface DataSetAccessControl {

    enum NamespaceOperation {
        CREATE,
        VIEW,
        EDIT,
        DELETE
    }

    String user();

    /**
     * assert
     * @param namespace
     * @param operation
     */
    void assertNamespace(String namespace, NamespaceOperation operation);

}
