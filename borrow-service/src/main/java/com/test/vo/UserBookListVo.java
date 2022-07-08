package com.test.vo;

import com.test.entity.Book;
import com.test.entity.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author az
 * @description 用户的信息与他借阅的书籍列表
 * @date 2022/7/2 0002
 */
@Data
@Builder
public class UserBookListVo {

    @ApiModelProperty("用户信息")
    private User user;

    @ApiModelProperty("书籍列表")
    private List<Book> bookList;
}
