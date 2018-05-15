package com.wu.fund.da;

import com.wu.fund.common.Constants;

import java.util.Map;

/**
 * @Author: wangying
 * @Description:
 * @Date: Created in  2018/5/15
 */
public class FundDecisionPoolsBuilder {

    // 固定的控制变量集合
    FundDecisionDataPool controlArea;
    // 输入变量集合
    FundDecisionDataPool inputData;
    // 输出变量集合
    FundDecisionDataPool outputData;

    FundDecisionPoolsBuilder(String controlLayout, String inputLayout, String outputLayout) {
        controlArea = new FundDecisionDataPool(controlLayout);
        inputData = new FundDecisionDataPool(inputLayout);
        outputData = new FundDecisionDataPool(outputLayout);
    }

    FundDecisionPoolsBuilder() {
        controlArea = new FundDecisionDataPool(Constants.DaConstants.DA_CONTROL_LAYOUT_NAME);
        inputData = new FundDecisionDataPool(Constants.DaConstants.DA_INPUT_VARS_LAYOUT_NAME);
        outputData = new FundDecisionDataPool(Constants.DaConstants.DA_OUTPUT_VARS_LAYOUT_NAME);
        setDefaultControlArea();
    }

    public FundDecisionPoolsBuilder setControlArea(String alias, String sign) {
        this.controlArea.setValue("ALIAS", alias);
        this.controlArea.setValue("SIGNATURE", sign);
        return this;
    }

    public FundDecisionPoolsBuilder setDefaultControlArea() {
        this.controlArea.setValue("ALIAS", Constants.DaConstants.DA_ALIAS);
        this.controlArea.setValue("SIGNATURE", Constants.DaConstants.DA_SIGNATURE);
        return this;
    }

    public FundDecisionPoolsBuilder setInputData(Map<String, Object> inputDataParam) {
        this.inputData.setIdata(inputDataParam);
        return this;
    }

    public FundDecisionDataPool[] build() {
        FundDecisionDataPool[] dataPools = new FundDecisionDataPool[]{controlArea, inputData, outputData};
        return dataPools;
    }
}

