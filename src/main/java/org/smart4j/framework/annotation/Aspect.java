package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * created on 2018/2/8
 *  切面注解
 * @author hexin
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    /**
     * 注解
     */
    Class<? extends Annotation> value();
}
