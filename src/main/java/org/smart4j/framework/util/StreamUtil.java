package org.smart4j.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * created on 2018/2/7
 *  流操作工具类
 * @author hexin
 */
public class StreamUtil {

    private static final Logger log = LoggerFactory.getLogger(StreamUtil.class);

    /**
     * 从流中获取字符串
     */
    public static String getString(InputStream is) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            log.error("read line from inputstream failed.", e);
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
