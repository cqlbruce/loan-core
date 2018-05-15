package com.wu.fund.common;

/**
 * @Description:静态变量 
 * @author cql
 * @date:   2018年5月14日 
 */
public interface Constants {

    // DA的常量
    interface DaConstants {
        // 输入域的名字
        String DA_INPUT_VARS_LAYOUT_NAME = "INPUT";
        // 输出域的名字
        String DA_OUTPUT_VARS_LAYOUT_NAME = "OUTPUT";
        //  是原因码的别名,存储的是各种code对应的说明
        String DA_CODE_ALIAS = "ABC";
        // 此参数没有提供
        String DA_CONTROL_LAYOUT_NAME = "OCONTROL";
        String DA_ALIAS = "WDUNION";
        String DA_SIGNATURE = "WDUNION";
        String DA_SIGNATURE_BAK = "WDUNION_BAK";


        String SDS_LOG_BEGIN = "SDS_LOG_Begin_requestId=";
        String SDS_LOG_END = "SDS_LOG_End_requestId=";
    }

	


			
}
