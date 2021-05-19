//package com.territory.workswebs.handler;
//
//import com.territory.worksservice.exception.BusinessException;
//import com.territory.worksservice.exception.code.BaseResponseCode;
//import com.territory.workswebs.utils.BaseResponse;
//
//
//import org.apache.shiro.authz.UnauthorizedException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.validation.ObjectError;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.List;
//
///**
// * @ClassName: RestExceptionHandler
// * TODO:类文件简单描述
// * @Author: 小霍
// * @UpdateUser: 小霍
// * @Version: 0.0.1
// */
//@RestControllerAdvice
//public class RestExceptionHandler {
//    private static final Logger log = LoggerFactory.getLogger(RestExceptionHandler.class);
//
//    @ExceptionHandler(value = Exception.class)
//    public BaseResponse exception(Exception e){
//        log.error(String.valueOf(e));
//        log.error("Exception,{},{}",e.getLocalizedMessage(),e);
//        return BaseResponse.getResult(BaseResponseCode.SYSTEM_ERROR);
//    }
//
//    @ExceptionHandler(value = BusinessException.class)
//    public BaseResponse businessException(BusinessException e, HttpServletRequest request, HttpServletResponse response){
//
//        log.error("businessException,{},{}",e.getLocalizedMessage(),e);
//
//        return BaseResponse.getResult(e.getCode(),e.getMsg());
//    }
//    /**
//     * 处理validation 框架异常
//     * @Author:      小霍
//     * @UpdateUser:
//     * @Version:     0.0.1
//     * @param e
//     * @return       com.yingxue.lesson.utils.DataResult<T>
//     * @throws
//     */
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    <T> BaseResponse<T> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
//
//        log.error("methodArgumentNotValidExceptionHandler bindingResult.allErrors():{},exception:{}", e.getBindingResult().getAllErrors(), e);
//        List<ObjectError> errors = e.getBindingResult().getAllErrors();
//        return createValidExceptionResp(errors);
//    }
//    private <T> BaseResponse<T> createValidExceptionResp(List<ObjectError> errors) {
//        String[] msgs = new String[errors.size()];
//        int i = 0;
//        for (ObjectError error : errors) {
//            msgs[i] = error.getDefaultMessage();
//            log.info("msg={}",msgs[i]);
//            i++;
//        }
//        return BaseResponse.getResult(BaseResponseCode.METHOD_IDENTITY_ERROR.getCode(), msgs[0]);
//    }
//
//    @ExceptionHandler(UnauthorizedException.class)
//    public BaseResponse unauthorizedException(UnauthorizedException e){
//        log.error("UnauthorizedException,{},{}",e.getLocalizedMessage(),e);
//        return BaseResponse.getResult(BaseResponseCode.NOT_PERMISSION);
//    }
//}
