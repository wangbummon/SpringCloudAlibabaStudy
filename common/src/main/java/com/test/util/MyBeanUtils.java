package com.test.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.BeanUtils;

import java.util.Map;

/**
 * @author az
 * @description 对象转换工具类
 * @date 2022/7/3 0003
 */
public class MyBeanUtils {

    /**
     * 对象转换
     * @param source 源对象
     * @param targetClass 目标对象的class
     * @return
     * @param <T>
     * @param <M>
     */
    public static <T, M> T toBean(M source, Class<T> targetClass) {
        T target = null;
        try {
            target = targetClass.newInstance();
            BeanUtils.copyProperties(source, target);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return target;
    }

    /**
     * 对象转换为bean
     *
     * @param obj         对象
     * @param targetClass 要转换的类的class
     * @param <T>
     * @return
     */
    public static <T> T mapToBean(Object obj, Class<T> targetClass) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.convertValue(obj, targetClass);
    }

}
