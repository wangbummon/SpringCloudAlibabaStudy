package com.test.util;

import com.test.resp.HttpEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author az
 * @description 全局统一返回对象
 * @date 2022/7/2 0002
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HttpResult<T> {

    @ApiModelProperty("是否成功")
    private Boolean success;

    @ApiModelProperty("状态码")
    private Integer status;

    @ApiModelProperty("返回信息")
    private String msg;

    @ApiModelProperty("返回数据")
    private T data;

    /**
     * 操作成功
     *
     * @param msg
     * @param data
     * @param <T>
     * @return
     */
    public static <T> HttpResult<T> ok(String msg, T data) {
        return new HttpResult<T>(HttpEnum.OK.getSuccess(), HttpEnum.OK.getStatus(), msg, data);
    }

    public static <T> HttpResult<T> ok(T data) {
        return ok(HttpEnum.OK.getMsg(), data);
    }

    public static <T> HttpResult<T> ok(String msg) {
        return ok(msg, null);
    }

    /**
     * 操作失败
     *
     * @param msg
     * @param data
     * @param <T>
     * @return
     */
    public static <T> HttpResult<T> failed(String msg, T data) {
        return new HttpResult<T>(HttpEnum.FAILED.getSuccess(), HttpEnum.FAILED.getStatus(), msg, data);
    }

    public static <T> HttpResult<T> failed(T data) {
        return failed(null, data);
    }

    public static <T> HttpResult<T> failed(String msg) {
        return failed(msg, null);
    }


}
