package com.fngry.oak.dataset.tiny;

import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class DigestUtil {

    private static final byte[] NULL = new byte[] {0};

    public static byte[] digest(List<String> keys,Function<String, ?> values) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("MD5");
        Iterator<String> iterator = keys.iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            if (key == null) {
                digest.update(NULL);
            }
            digest.update(toBytes(key));
            digest.update(NULL);
        }
        return digest.digest();
    }

    public static byte[] digest(Object object) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("MD5");

        if (object == null) {
            digest.update(NULL);
        }
        digest.update(toBytes(object));
        digest.update(NULL);

        return digest.digest();
    }

    private static byte[] toBytes(Object object) throws Exception {
        return object.toString().getBytes("UTF-8");
    }

}
