package org.smart4j.framework.bean;

import java.lang.reflect.Method;

/**
 * created on 2018/2/6
 *  封装Action信息
 * @author hexin
 */
public class Handler {
    /**
     * controller类
     */
    private Class<?> controllerClass;

    /**
     * Action方法
     */
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }
}
