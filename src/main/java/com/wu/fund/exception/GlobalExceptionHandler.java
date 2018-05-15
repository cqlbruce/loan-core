package com.wu.fund.exception;

import com.netflix.client.ClientException;
import com.wu.fund.common.resp.Resp;
import feign.RetryableException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: wangying
 * @Description:全局异常处理
 * @Date: Created in  2018/5/14
 */
@Order(-1000)
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = CommonException.class)
    public Resp orderExceptionHandler(HttpServletRequest request, CommonException e) {
        LOG.info(e.getMessage(), e);
        return Resp.fail(e.getErrorCode(), e.getMessage());
    }


    @ExceptionHandler(value = ClientException.class)
    public Resp clientExceptionHandler(HttpServletRequest request, ClientException e) {
        String message = e.getMessage();
        LOG.info(e.getMessage(), e);

            return Resp.fail(String.valueOf(e.getErrorCode()), message);

    }

    @ExceptionHandler(value = RetryableException.class)
    public Resp retryableExceptionHandler(HttpServletRequest request, RetryableException e) {
        String errorMessage = e.getMessage();
        LOG.info(e.getMessage(), e);

            return Resp.fail(e.getMessage());

    }

    @ExceptionHandler(value = IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Resp illegalArgumentExceptionHandler(HttpServletRequest request, IllegalArgumentException e) {
        LOG.info(e.getMessage(), e);
        return Resp.fail(e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Resp exceptionHandler(HttpServletRequest request, Exception e) {
        LOG.info(e.getMessage(), e);
        return Resp.fail( e.getLocalizedMessage());
    }
}
