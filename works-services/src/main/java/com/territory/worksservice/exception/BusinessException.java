package com.territory.worksservice.exception;


import com.territory.worksservice.exception.code.ResponseCodeInterface;

/**
 * @ClassName: BusinessException
 * @Version: 0.0.1
 */
public class BusinessException extends RuntimeException {

    /**
     * 提示编码
     */
    private final  int code;

    /**
     * 后端提示语
     */
    private final String msg;

    public BusinessException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public BusinessException(ResponseCodeInterface responseCodeInterface) {
        this(responseCodeInterface.getCode(),responseCodeInterface.getMsg());
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
