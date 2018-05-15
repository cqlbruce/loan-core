package com.wu.fund.da;

import org.grlea.logBridge.LogBridge;
import org.grlea.logBridge.LogBridgeFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: wangying
 * @Description:在Logback里配置 DA的日志单独打到某个文件
 * @Date: Created in  2018/5/15
 */
public class DALogbackLogBridgeFactory implements LogBridgeFactory {


    public LogBridge getLogBridge(Class var1) {
        return new DALogbackLogBridgeFactory.Bridge(LoggerFactory.getLogger(var1.getName()));
    }

    private static final class Bridge implements LogBridge {

        private final Logger logger;

        public Bridge(Logger var1) {
            this.logger = var1;
        }

        public boolean isErrorEnabled() {
            return this.logger.isErrorEnabled();
        }

        public boolean isWarnEnabled() {
            return this.logger.isWarnEnabled();
        }

        public boolean isInfoEnabled() {
            return this.logger.isInfoEnabled();
        }

        public boolean isDebugEnabled() {
            return this.logger.isDebugEnabled();
        }

        public boolean isVerboseEnabled() {
            return false;
        }

        public boolean isTracingEnabled() {
            return this.logger.isTraceEnabled();
        }

        public void error(String var1) {
            this.logger.error(var1);
        }

        public void error(String var1, Object var2) {
            this.logger.error(var1 + "------" + var2);
        }

        public void error(Throwable var1) {
            this.logger.error("Bridge", var1);
        }

        public void warn(String var1) {
            this.logger.warn(var1);
        }

        public void warn(String var1, Object var2) {
            this.logger.warn(var1 + var2);


        }

        public void warn(Throwable var1) {
            this.logger.warn("Bridge", var1);
        }

        public void info(String var1) {
            this.logger.info(var1);
        }

        public void info(String var1, Object var2) {
            this.logger.info(var1 + " -----: " + var2);

        }

        public void info(Throwable var1) {
            this.logger.info("Bridge", var1);
        }

        public void debug(String var1) {
            this.logger.debug(var1);
        }

        public void debug(String var1, Object var2) {
            this.logger.debug(var1 + ":------- " + var2);

        }

        public void debug(Throwable var1) {
            this.logger.debug("Bridge", var1);
        }

        public void verbose(String var1) {
            this.logger.info(var1);
        }

        public void verbose(String var1, Object var2) {
            this.logger.info(var1 + ":---- " + var2);

        }

        public void verbose(Throwable var1) {
            this.logger.info("Bridge", var1);
        }

        public void entry(String var1) {
            this.logger.trace(var1);
        }

        public void exit(String var1) {
            this.logger.trace(var1);
        }

    }
}