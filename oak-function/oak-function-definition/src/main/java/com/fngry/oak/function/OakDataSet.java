package com.fngry.oak.function;

import java.util.List;

public interface OakDataSet {

    /**
     * get keys that can retrive data from dataSet
     * @return
     */
    List<String> getKeys();

    /**
     * get data by key fron dataSet
     * @param key
     * @return
     */
    Object retrive(String key);

}
