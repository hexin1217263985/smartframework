package org.smart4j.framework.util;

/**
 * created on 2018/1/30
 * 转型操作工具类
 * @author hexin
 */
public final class CastUtil {
    /**
     * 转为String型
     */
    public static String castString(Object obj) {
        return String.valueOf(obj).trim();
    }
    /**
     * 转为String型（提供默认值）
     */
    public static String castString(Object obj, String defaultValue) {
        return obj == null ? defaultValue : castString(obj);
    }

    /**
     * 转为double型
     */
    public static double castDouble(Object obj) {
        return Double.parseDouble(String.valueOf(obj).trim());
    }
    /**
     * 转为double型（提供默认值）
     */
    public static double castDouble(Object obj, double defaultValue) {
        return obj == null ? defaultValue : castDouble(obj);
    }

    /**
     * 转为long型
     */
    public static long castLong(Object obj) {
        return Long.parseLong(String.valueOf(obj).trim());
    }
    /**
     * 转为long型(提供默认值)
     */
    public static long castLong(Object obj, long defaultValue) {
        return obj == null ? defaultValue : castLong(obj);
    }

    /**
     * 转为int型
     */
    public static int castInt(Object obj) {
        return Integer.parseInt(String.valueOf(obj).trim());
    }
    /**
     * 转为int型（提供默认值）
     */
    public static int castInt(Object obj, int defaultValue) {
        return obj == null ? defaultValue : castInt(obj);
    }

    /**
     * 转为boolean型
     */
    public static boolean castBoolean(Object obj) {
        return Boolean.parseBoolean(String.valueOf(obj).trim());
    }
}
