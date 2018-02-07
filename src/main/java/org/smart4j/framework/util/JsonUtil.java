package org.smart4j.framework.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * created on 2018/2/7
 *  JSON工具类
 * @author hexin
 */
public class JsonUtil {

    private static final Logger log = LoggerFactory.getLogger(JsonUtil.class);

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /**
     * 将POJO转为JSON
     */
    public static <T> String toJson(T t) {
        String json;
        try {
            json = OBJECT_MAPPER.writeValueAsString(t);
        } catch (JsonProcessingException e) {
            log.error("convert POJO to JSON failed", e);
            throw new RuntimeException(e);
        }
        return json;
    }

    /**
     * 将json转为POJO对象
     */
    public static <T> T fromJson(String obj, Class<T> type) {
        T t;
        try {
            t = OBJECT_MAPPER.readValue(obj, type);
        } catch (IOException e) {
            log.error("convert JSON to Object failed", e);
            throw new RuntimeException(e);
        }
        return t;
    }
}
