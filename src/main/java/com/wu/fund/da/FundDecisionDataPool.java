package com.wu.fund.da;

import com.alibaba.fastjson.JSON;
import com.experian.stratman.datasources.runtime.IData;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: wangying
 * @Description:策略软件 输入 或 输出的数据集合
 * @Date: Created in  2018/5/15
 */
public class FundDecisionDataPool implements IData {

    private String layout;
    private Map<String, Object> idata;

    public FundDecisionDataPool(String layout) {
        this.layout= layout;
        this.idata = new HashMap();
    }


    @Override
    public Object getValue(String key) {
        return idata.get(key);
    }

    @Override
    public void setValue(String key, Object value) {
        idata.put(key, value);
    }

    @Override
    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }


    public Map<String, Object> getIdata() {
        return idata;
    }

    public void setIdata(Map<String, Object> idata) {
        this.idata.putAll(idata);
    }


    /**
     * 获取字符串
     *
     * @param key     键
     * @return
     */
    public String getString(String key) {
        Object obj = idata.get(key);
        if(obj instanceof String){
            return (String) obj;
        }
        throw new RuntimeException(obj + " is not a string.");
    }

    /**
     * 获取数字
     *
     * @param key     键
     * @return
     */
    public double getDouble(String key) {
        Object obj = idata.get(key);
        if(obj instanceof Number){
            return ((Number) obj).doubleValue();
        }
        throw new RuntimeException(obj + " is not a number.");
    }

    /**
     * 获取日期
     *
     * @param key     键
     * @return
     */
    public Date getDate(String key) {
        Object obj = idata.get(key);
        if(obj instanceof Date){
            return (Date) obj;
        }
        throw new RuntimeException(obj + " is not a date.");
    }

    @Override
    public String toString() {
        if (MapUtils.isNotEmpty(idata)) {
            return JSON.toJSONString(idata);
        } else {
            return StringUtils.EMPTY;
        }
    }

}
