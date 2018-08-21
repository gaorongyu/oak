package com.fngry.oak.dataset.tiny;

import com.fngry.oak.dataset.tiny.codec.Hex;

import java.util.List;
import java.util.function.Function;

public class TinyDataSetKeys {

    public static final int PREFIX_LENGTH = 16;

    public static final int SUFFIX_LEGTH = 16;

    public static final int KEY_LENGTH = PREFIX_LENGTH + SUFFIX_LEGTH;

    public static final byte[] SUFFIX_MAX = new byte[KEY_LENGTH];

    static {
        for (int i = 0; i < SUFFIX_LEGTH; i++) {
            SUFFIX_MAX[i] = (byte)0xFF;
        }
    }

    public static byte[] apply(Long dataSetId, List<String> keys, Function<String, ?> keyProvider) throws Exception {
        byte[] suffix = suffix(keys, keyProvider);
        return apply(dataSetId, suffix);
    }

    public static byte[] apply(Long dataSetId, byte[] suffix) throws Exception {
        byte[] prefix = prefix(dataSetId);
        return apply(prefix, suffix);
    }

    public static byte[] apply(byte[] prefix, byte[] suffix) {
        byte[] result = new byte[KEY_LENGTH];
        System.arraycopy(prefix, 0, result, 0, prefix.length);
        System.arraycopy(suffix, 0, result, PREFIX_LENGTH, suffix.length);

        return result;
    }

    public static byte[] max(byte[] prefix) {
        return apply(prefix, SUFFIX_MAX);
    }

    public static byte[] suffix(List<String> keys, Function<String, ?> values) throws Exception {
        return DigestUtil.digest(keys, values);
    }

    public static byte[] prefix(Long dataSetId) throws Exception {
        return DigestUtil.digest(dataSetId);
    }

    public static String prefixString(Long dataSetId) throws Exception {
        byte[] prefix = prefix(dataSetId);
        return key(prefix);
    }

    private static String key(byte[] prefix) {
        return Hex.encodeHexString(prefix);
    }

    public static byte[] key(String key) throws Exception {
        if (key == null || "".equals(key.trim())) {
            return new byte[] {0};
        }
        return Hex.decodeHex(key.toCharArray());
    }

}
