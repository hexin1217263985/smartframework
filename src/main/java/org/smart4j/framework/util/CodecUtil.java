package org.smart4j.framework.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * created on 2018/2/7
 *  编码与解码操作
 * @author hexin
 */
public class CodecUtil {

    private final static Logger log = LoggerFactory.getLogger(CodecUtil.class);

    private final static String CHARSET = "UTF-8";
    /**
     * 将URL编码
     */
    public static String encodeURL(String source) {
        String target;
        try {
            target = URLEncoder.encode(source, CHARSET);
        } catch (UnsupportedEncodingException e) {
            log.error("encode url failed.", e);
            throw new RuntimeException(e);
        }
        return target;
    }

    /**
     * 将URL解码
     */
    public static String decodeURL(String target) {
        String source;
        try {
            source = URLDecoder.decode(target, CHARSET);
        } catch (UnsupportedEncodingException e) {
            log.error("decode url failed", e);
            throw new RuntimeException(e);
        }
        return source;
    }
}
