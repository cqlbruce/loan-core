package com.wu.fund.da;

import com.experian.eda.component.decisionagent.strategyloader.IStrategyLoader;
import com.experian.eda.framework.runtime.common.config.DecisionAgentConfig;

import java.io.*;



/**
 *  本地策略加载器
 *  * 与 com.experian.stratman.decisionagent.business.AlternateStrategyLoader 效果一样
 * @Author: wangying
 * @Description:
 * @Date: Created in  2018/5/15
 */
public class LocalStrategyLoader implements IStrategyLoader {
	
	private static final String STRATEGY_STRAT_PATH = "strategy.path";

	@Override
	public InputStream getStream(String strategyName) throws IOException {
		if(strategyName.startsWith("/")){
			strategyName = strategyName.substring(1);
		}
		InputStream inputStream = null;
		int i = 1;
		while(true){
			String strategyPath = DecisionAgentConfig.instance().getProperty(STRATEGY_STRAT_PATH + i++, "none");
			if(strategyPath.equals("none")){
				break;
			}else{
				if(!strategyPath.endsWith("/")){
					strategyPath = strategyPath + "/";
				}
				File file = new File(strategyPath, strategyName);
				if(file.exists()){
					inputStream = new FileInputStream(file);
					break;
				}
			}
		}
		if(inputStream == null){
			throw new FileNotFoundException("File not found in all configured directories");
		}
		return inputStream;
	}

}
