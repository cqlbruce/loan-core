package com.wu.fund.util;

import org.springframework.cglib.beans.BeanCopier;
import org.springframework.util.SerializationUtils;

import java.util.*;

/**
 * @Author: wangying
 * @Description:
 * @Date: Created in  2018/5/11
 */
public class BeanCopierUtils {

    static final Map<String, BeanCopier> BEAN_COPIERS = new HashMap<String, BeanCopier>();

    /**
     * CachedBeanCopier 浅拷贝单个对象
     * @param srcObj
     * @param destClass
     * @param <T>
     * @return
     */
    public static<T> T copy(Object srcObj, Class<T> destClass) {
        if (srcObj == null) return null;

        T destObj = null;
        try {
            destObj = destClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return copy(srcObj, destObj);
    }

    /**
     * CachedBeanCopier 浅拷贝单个对象
     * @param srcObj
     * @param destObj
     * @param <T>
     * @return
     */
    public static<T> T copy(Object srcObj, T destObj) {
        if (srcObj == null) return null;

        String key = genKey(srcObj.getClass(), destObj.getClass());
        BeanCopier copier = null;
        if (!BEAN_COPIERS.containsKey(key)) {
            copier = BeanCopier.create(srcObj.getClass(), destObj.getClass(), false);
            BEAN_COPIERS.put(key, copier);
        } else {
            copier = BEAN_COPIERS.get(key);
        }

        copier.copy(srcObj, destObj, null);
        return destObj;
    }

    /**
     * CachedBeanCopier 浅拷贝List对象
     * @param srcObjList
     * @param destClass
     * @param <T>
     * @return
     */
    public static <T> List<T> copyList(Object srcObjList, Class<T> destClass) {
        List<T> destObjList = new ArrayList<>();

        if (!(srcObjList instanceof Collection))
            throw new ClassCastException(); //类型错误，不是集合类型

        Collection srcObjList1 = (Collection) srcObjList;

        if (srcObjList1.size() <= 0) return null;

        for (Object srcObj : srcObjList1) {
            T destObj = copy(srcObj, destClass);
            destObjList.add(destObj);
        }
        return destObjList;
    }

    /**
     *
     * Description: 通过序列化、反序列化方式实现对象深拷贝
     *
     * @param destClass
     * @param srcDto
     * @return
     * @throws Exception
     * 用法：BasePO basePO = DTOBeanUtil.deepCopyDtoBySerialization(param, BasePO.class);
     */
    @SuppressWarnings("unchecked")
    public static <T extends java.io.Serializable> T deepCopy(T srcDto, Class<T> destClass)
            throws Exception {
        if (!destClass.equals(srcDto.getClass())) {
            throw new Exception("类型不匹配！");
        }
        T destDto = (T) srcDto.getClass().newInstance();
        byte[] srcByte = SerializationUtils.serialize(srcDto);
        Object obj = SerializationUtils.deserialize(srcByte);
        destDto = destClass.cast(obj);
        return destDto;
    }

    private static String genKey(Class<?> srcClazz, Class<?> destClazz) {
        return srcClazz.getName() + destClazz.getName();
    }
}
