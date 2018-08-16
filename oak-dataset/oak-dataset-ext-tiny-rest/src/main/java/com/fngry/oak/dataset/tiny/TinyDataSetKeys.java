package com.fngry.oak.dataset.tiny;

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
        return null;
    }

    public static byte[] prefix(Long dataSetId) throws Exception {
        return null;
    }

    public static String prefixString(Long dataSetId) throws Exception {
        return null;
    }

}
