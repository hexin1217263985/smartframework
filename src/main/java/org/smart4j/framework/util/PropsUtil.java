package org.smart4j.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * created on 2018/1/30
 * 属性文件工具类
 * @author hexin
 */
public final class PropsUtil {
    private final static Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 加载属性文件
     */
    public static Properties loadProps(String fileName) {
        Properties properties = null;
        try (InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName)) {
            if (is == null)
                throw new FileNotFoundException(fileName + " file is not found");
            properties = new Properties();
            properties.load(is);
        } catch (IOException e) {
            LOGGER.error("load properties file failure", e);
        }
        return properties;
    }

    /**
     * 获取字符型属性（默认值为空字符串）
     */
    public static String getString(Properties props, String key) {
        return getString(props, key, "");
    }

    /**
     * 获取字符型属性（可指定默认值）
     */
    public static String getString(Properties props, String key, String defaultValue) {
        String value = defaultValue;
        if (props.containsKey(key))
            value = props.getProperty(key);
        return value;
    }

    /**
     * 获取数值型属性（默认为0）
     * @param props
     * @param key
     * @return
     */
    public static int getInt(Properties props, String key) {
        return getInt(props, key, 0);
    }
    /**
     * 获取数值型属性（可以指定默认值)
     */
    public static int getInt(Properties props, String key, int defaultValue) {
        int value = defaultValue;
        if (props.containsKey(key)) {
            //value = 0; TODO
        }
        return value;
    }

    /**
     * 获取布尔型属性（默认值为false）
     */
    public static boolean getBoolean(Properties props, String key) {
        return getBoolean(props, key, false);
    }
    /**
     * 获取布尔型属性（可以指定默认值）
     */
    public static boolean getBoolean(Properties props, String key, boolean defaultValue) {
        boolean value = defaultValue;
        if (props.containsKey(key)) {
            // TODO
        }
        return value;
    }
}
