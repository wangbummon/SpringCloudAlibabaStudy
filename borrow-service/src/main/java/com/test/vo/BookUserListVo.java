package com.test.vo;

import com.test.entity.Book;
import com.test.entity.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author az
 * @description 书籍信息和借阅过的用户列表
 * @date 2022/7/2 0002
 */
@Data
@Builder
public class BookUserListVo {

    @ApiModelProperty("书籍信息")
    private Book book;

    @ApiModelProperty("用户列表")
    private List<User> userList;

}
