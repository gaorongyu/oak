package com.fngry.oak.function.util;

import com.fngry.oak.function.FunctionException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Enumeration;
import java.util.function.Consumer;

/**
 * find function util
 * refer to java.util.ServiceLoader
 *
 */
public class Loader {

    private static String PREFIX = "function/";

    public static <T> void load(Class<T> clazz, Consumer<Class<? extends T>> consumer) {
        load(clazz.getName(), e -> {
            if (clazz.isAssignableFrom(e)) {
                consumer.accept((Class<? extends T>) e);
            } else {
                throw new FunctionException(String.format("class %s incompatible with %s", e, clazz));
            }
        });
    }

    public static <T> void load(String clazz, Consumer<Class<? extends T>> consumer) {
        Enumeration<URL> urls;
        try {
            urls = Loader.class.getClassLoader().getResources(PREFIX + clazz);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (urls.hasMoreElements()) {
            load(urls.nextElement(), consumer);
        }
    }

    public static <T> void load(URL url, Consumer<Class<? extends T>> consumer) {
        InputStream in = null;
        BufferedReader r = null;
        try {
            in = url.openStream();
            r = new BufferedReader(new InputStreamReader(in, "utf-8"));
            String line;
            while ((line = r.readLine()) != null && !"".equals(line.trim())) {
                Class clazz = Class.forName(line);
                consumer.accept(clazz);
            }
        } catch (Exception x) {
            fail("Error reading configuration file", x);
        } finally {
            try {
                if (r != null) {
                    r.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException y) {
                fail("Error closing configuration file", y);
            }
        }
    }

    private static void fail(String msg, Throwable cause) throws FunctionException {
        throw new FunctionException(msg, cause);
    }
    
}
