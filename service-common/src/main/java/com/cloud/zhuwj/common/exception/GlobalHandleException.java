/*
package com.cloud.zhuwj.common.exception;

import com.cloud.zhuwj.common.reponse.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


*/
/**
 * @author zhuwj
 * @version V1.0
 * @Description: 全局异常处理
 * @date 2018/1/20.
 *//*


@EnableWebMvc
@RestControllerAdvice
public class GlobalHandleException {

    private static final Logger logger = LoggerFactory.getLogger(GlobalHandleException.class);
    */
/**
     * 全局异常捕捉处理
     * @param ex
     * @return
     *//*

    @ExceptionHandler(value = Exception.class)
    public ResponseResult<String> errorHandler(Exception ex) {
        logger.info("GlobalControllerAdvice errorHandler  Exception...",ex);
        return ResponseResult.error(ex.getMessage().toString());
    }

    */
/**
     * 拦截捕捉自定义异常 BuessionException.class
     * @param ex
     * @return
     *//*

    @ExceptionHandler(value = BuessionException.class)
    public  ResponseResult<String> errorHandler(BuessionException ex) {
        logger.info("GlobalControllerAdvice errorHandler BuessionException ...",ex);
        return ResponseResult.error(ex.getCode(),ex.getMessage());
    }

}
*/
