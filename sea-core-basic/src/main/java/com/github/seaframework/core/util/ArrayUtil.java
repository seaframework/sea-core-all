package com.github.seaframework.core.util;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * array util
 *
 * @author spy
 * @version 1.0 2019-08-14
 * @since 1.0
 */
@Slf4j
public final class ArrayUtil {

    private ArrayUtil() {
    }

    /**
     * check array is empty
     *
     * @param <T>   数组元素类型
     * @param array 数组
     * @return 是否为空
     */
    public static <T> boolean isEmpty(final T... array) {
        return array == null || array.length == 0;
    }

    /**
     * 对象是否为数组对象
     *
     * @param obj 对象
     * @return 是否为数组对象，如果为{@code null} 返回false
     */
    public static boolean isArray(Object obj) {
        if (null == obj) {
            return false;
        }
        return obj.getClass().isArray();
    }

    /**
     * to array
     *
     * @param list
     * @return
     */
    public static String[] toArray(List<String> list) {
        if (ListUtil.isEmpty(list)) {
            return new String[0];
        }

        String[] arrays = new String[list.size()];

        return list.toArray(arrays);
    }

    public static Object[] toObjArray(List<Object> list) {
        if (ListUtil.isEmpty(list)) {
            return new Object[0];
        }
        return list.toArray();
    }


}
