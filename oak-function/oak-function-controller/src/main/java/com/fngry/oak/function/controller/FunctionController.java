package com.fngry.oak.function.controller;

import com.fngry.oak.function.FieldMappingFunctions;
import com.fngry.oak.function.FilterFunctions;
import com.fngry.oak.function.FunctionMetaObject;
import com.fngry.oak.function.FunctionRegistry;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 *
 * for ui define function of data object
 *
 * @author gaorongyu
 */
@RestController("/oak_common/function")
public class FunctionController {

    @RequestMapping(method = RequestMethod.GET, path = "meta")
    public Collection<FunctionMetaObject> meta(String type) {
        switch(type) {
            case "filter" : return meta(FilterFunctions.INSTANCE);
            case "field-mapping" : return meta(FieldMappingFunctions.INSTANCE);

            default : throw new IllegalArgumentException("not support type: " + type);
        }
    }

    private Collection<FunctionMetaObject> meta(FunctionRegistry registry) {
        return FunctionMetaObjects.apply(registry.getFunctionMetas());
    }

}
