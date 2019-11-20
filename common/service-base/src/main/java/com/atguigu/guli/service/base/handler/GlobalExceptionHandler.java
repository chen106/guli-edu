package com.atguigu.guli.service.base.handler;

import com.atguigu.guli.common.base.result.R;
import com.atguigu.guli.common.base.result.ResultCodeEnum;
import com.atguigu.guli.common.base.util.ExceptionUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chen
 * @date 2019/11/20/19:41
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e) {
        e.printStackTrace();
        return R.error();
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    public R error(HttpMessageNotReadableException e) {
//        e.printStackTrace();
        log.error(ResultCodeEnum.JSON_PARSE_ERROR.toString());
        log.error(ExceptionUtils.getMessage(e));
        return R.setResult(ResultCodeEnum.JSON_PARSE_ERROR);
    }


    @ExceptionHandler(BadSqlGrammarException.class)
    @ResponseBody
    public R error(BadSqlGrammarException e) {
//        e.printStackTrace();
        log.error(ResultCodeEnum.JSON_PARSE_ERROR.toString());
        log.error(ExceptionUtils.getMessage(e));
        return R.setResult(ResultCodeEnum.BAD_SQL_GRAMMAR);
    }
}