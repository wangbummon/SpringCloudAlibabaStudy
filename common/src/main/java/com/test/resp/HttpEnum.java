package com.test.resp;

import lombok.*;

/**
 * @author az
 * @description 全局统一返回枚举
 * @date 2022/7/2 0002
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum HttpEnum {

    /**
     * 操作成功
     */
    OK(200,"操作成功",true),

    /**
     * 操作失败
     */
    FAILED(50001,"操作失败",false),
    ;

    private Integer status;

    private String msg;

    private Boolean success;

}
