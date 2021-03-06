package com.wu.fund.sys;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @Description: 线程池异步执行配置
 * @author cql
 * @date:   2018年5月15日 
 */
@Configuration
@EnableAsync
public class ThreadPoolTaskExecutorConfig {
	
    private static final Logger logger = LoggerFactory.getLogger(ThreadPoolTaskExecutorConfig.class);

    @Bean
    public Executor asyncServiceExecutor() {
        logger.info("asyncServiceExecutor start ...");
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //配置核心线程数
        executor.setCorePoolSize(100);
        //配置最大线程数
        executor.setMaxPoolSize(800);
        //配置队列大小
        executor.setQueueCapacity(100000);
        
        executor.setKeepAliveSeconds(60);
        
        //配置线程池中的线程的名称前缀
        executor.setThreadNamePrefix("async-service-");
        		
        // rejection-policy：当pool已经达到max size的时候，如何处理新任务
        // CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //执行初始化
        executor.initialize();
        return executor;
    }
	

}
