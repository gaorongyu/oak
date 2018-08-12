package com.fngry.oak.function.impl;

import com.fngry.oak.function.OakDataObject;
import com.fngry.oak.function.FunctionException;
import com.fngry.oak.function.codec.Hex;

import java.security.MessageDigest;
import java.util.Collection;

public class FunctionSupport {

    public static String digest(Collection<String> keys, OakDataObject dataObject) {
        try {
            MessageDigest digest = MessageDigest.getInstance("MD5");

            for (String key : keys) {
                Object value = dataObject.get(key);

                digest.update(toBytes(key));
                if (value != null) {
                    digest.update(toBytes(value));
                }
            }
            return Hex.encodeHexString(digest.digest());
        } catch (Exception e) {
            throw new FunctionException(String.format("digest %s %s exception", dataObject, keys), e);
        }
    }

    public static String concat(Collection<String> keys, OakDataObject dataObject) {
        StringBuffer valueConcat = new StringBuffer();
        for (String key : keys) {
            Object value = dataObject.get(key);
            valueConcat.append(value).append("_");
        }
        return valueConcat.toString();
    }


    private static byte[] toBytes(Object object) throws Exception {
        return object.toString().getBytes("UTF-8");
    }

}
