package com.wu.fund.da;

import com.experian.eda.component.decisionagent.strategyloader.IStrategyLoader;
import com.experian.eda.framework.runtime.common.config.DecisionAgentConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * @Author: wangying
 * @Description:远程策略加载器
 * @Date: Created in  2018/5/15
 */
public class RemoteStrategyLoader implements IStrategyLoader {


	private static final Logger logger = LoggerFactory.getLogger(RemoteStrategyLoader.class);
	private static final String STRATEGY_STRAT_URL = "strategy.url";

	@Override
	public InputStream getStream(String strategyName) throws IOException {
		if(strategyName.startsWith("/")){
			strategyName = strategyName.substring(1);
		}
		InputStream inputStream = null;
		int i = 1;
		while(true){
			String strategyUrl = DecisionAgentConfig.instance().getProperty(STRATEGY_STRAT_URL + i++, "none");
			if(strategyUrl.equals("none")){
				break;
			}else{
				try {
					if(!strategyUrl.endsWith("/")){
						strategyUrl = strategyUrl + "/";
					}
					URL url = new URL(strategyUrl + strategyName);
					inputStream = url.openStream();
					break;
				} catch (MalformedURLException e) {
					if(!strategyName.endsWith(".KEY")){
						logger.error(strategyUrl, e);
					}
				} catch (IOException e) {
					if(!strategyName.endsWith(".KEY")){
						String message = e.getMessage();
						if(message.startsWith("Connection") || message.contains("ProtocolException")){
							logger.error(strategyUrl, e);
						}
					}
				}
			}
		}
		if(inputStream == null){
			throw new FileNotFoundException("File not found in all configured urls");
		}
		return inputStream;
	}

}
