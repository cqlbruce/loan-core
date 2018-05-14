package com.wu.fund.util;

import java.math.BigDecimal;

/**
 * @Description:数字处理工具类
 * @author cql
 * @date:   2018年5月14日 
 */
public class NumberUtil {
	
	
    /**
     * @Title: yuanToCent
     * @Description: 将元转换为分
     * @param @param yuanObject
     * @param @return 设定文件
     * @return long 返回类型
     * @throws
     */
    public static final long yuanToCent(Object yuanObject) {
        if (null == yuanObject) {
            throw new IllegalArgumentException((new StringBuilder("yuanObject [")).append(yuanObject).append("] should not be null.").toString());
        } else {
            BigDecimal yuan = toDecimal(yuanObject);
            yuan = yuan.setScale(2, 4);
            BigDecimal cent = yuan.multiply(new BigDecimal(100));
            return cent.longValue();

        }
    }

    /**
     * @Title: yuanToCentString
     * @Description: 将元转换为分
     * @param yuanObject
     * @return设定文件 String返回类型
     * @throws
     */
    public static final String yuanToCentString(Object yuanObject) {
        if (null == yuanObject) {
            throw new IllegalArgumentException((new StringBuilder("yuanObject [")).append(yuanObject).append("] should not be null.").toString());
        } else {
            BigDecimal yuan = toDecimal(yuanObject);
            yuan = yuan.setScale(2, 4);
            BigDecimal cent = yuan.multiply(new BigDecimal(100));
            return String.valueOf(cent.longValue());
        }
    }
    
    public static BigDecimal toDecimal(Object object) {
        BigDecimal aDecimal = null;
        if (object instanceof String)
            aDecimal = org.springframework.util.NumberUtils.parseNumber((String) object, BigDecimal.class);
        else if (object instanceof Number)
            aDecimal = org.springframework.util.NumberUtils.convertNumberToTargetClass((Number) object, BigDecimal.class);
        else
            throw new IllegalArgumentException((new StringBuilder("Substract param a  type illegal [")).append(object).append("].").toString());
        return aDecimal;
    }

}
