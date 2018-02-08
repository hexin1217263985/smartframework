package org.smart4j.framework.proxy;

/**
 * created on 2018/2/8
 *  代理接口
 * @author hexin
 */
public interface Proxy {
    /**
     * 执行链式代理
     */
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
