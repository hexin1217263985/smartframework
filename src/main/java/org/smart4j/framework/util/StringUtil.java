package org.smart4j.framework.util;

/**
 * created on 2018/1/31
 *
 * @author hexin
 */
public class StringUtil {
    /**
     * 判断字符串是否为空或者null
     */
    public static boolean isNullOrEmpty(String str) {
        if (str != null && str.trim() != null)
            return false;
        return true;
    }

    /**
     * 判断字符串不为空并且不为NULL
     */
    public static boolean isNotNullOrEmpty(String str) {
        return !isNullOrEmpty(str);
    }
}
