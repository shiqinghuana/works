package com.territory.utils;



import com.territory.worksservice.exception.code.BaseResponseCode;
import com.territory.worksservice.exception.code.ResponseCodeInterface;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName: DataResult
 * TODO:类文件简单描述
 * @Author: 小霍
 * @UpdateUser: 小霍
 * @Version: 0.0.1
 */

@Data
public class BaseResponse <T>{



    /**
     * 请求响应code， 0表示请求成功 其它表示失败
     */
    @ApiModelProperty(value = "请求响应code，01为成功 其他为失败")
    private int code;

    /**
     * 响应客户端的提示
     */
    @ApiModelProperty(value = "响应异常码详细信息")
    private String msg;

    /**
     * 响应客户端内容
     */
    @ApiModelProperty(value = "响应客户端内容")
    private T data;

    public BaseResponse(int code, T data) {
        this.code = code;
        this.data = data;
        this.msg=null;
    }

    public BaseResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseResponse(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data=null;
    }

    public BaseResponse() {
        this.code= BaseResponseCode.SUCCESS.getCode();
        this.msg=BaseResponseCode.SUCCESS.getMsg();
        this.data=null;
    }

    public BaseResponse(T data) {
        this.data = data;
        this.code= BaseResponseCode.SUCCESS.getCode();
        this.msg=BaseResponseCode.SUCCESS.getMsg();
    }

    public BaseResponse(ResponseCodeInterface responseCodeInterface) {
        this.data = null;
        this.code = responseCodeInterface.getCode();
        this.msg = responseCodeInterface.getMsg();
    }

    public BaseResponse(ResponseCodeInterface responseCodeInterface, T data) {
        this.data = data;
        this.code = responseCodeInterface.getCode();
        this.msg = responseCodeInterface.getMsg();
    }
    /**
     * 操作成功 data为null

     * @UpdateUser:
     * @Version:     0.0.1
     * @param
     * @return       com.xh.lesson.utils.DataResult<T>
     * @throws
     */
    public static BaseResponse success(){
        return new BaseResponse();
    }
    /**
     * 操作成功 data 不为null

     * @UpdateUser:
     * @Version:     0.0.1
     * @param data
     * @return       com.xh.lesson.utils.DataResult<T>
     * @throws
     */
    public static <T> BaseResponse success(T data){
        return new BaseResponse(data);
    }
    /**
     * 自定义 返回操作 data 可控

     * @UpdateUser:
     * @Version:     0.0.1
     * @param code
     * @param msg
     * @param data
     * @return       com.xh.lesson.utils.DataResult
     * @throws
     */
    public static <T> BaseResponse getResult(int code, String msg, T data){
        return new BaseResponse(code,msg,data);
    }
    /**
     *  自定义返回  data为null

     * @UpdateUser:
     * @Version:     0.0.1
     * @param code
     * @param msg
     * @return       com.xh.lesson.utils.DataResult
     * @throws
     */
    public static BaseResponse getResult(int code, String msg){
        return new BaseResponse(code,msg);
    }
    /**
     * 自定义返回 入参一般是异常code枚举 data为空

     * @UpdateUser:
     * @Version:     0.0.1
     * @param responseCode
     * @return       com.xh.lesson.utils.DataResult
     * @throws
     */
    public static BaseResponse getResult(BaseResponse responseCode){
        return new BaseResponse(responseCode);
    }
    public static BaseResponse getResult(BaseResponseCode responseCode){
        return new BaseResponse(responseCode);
    }

}
