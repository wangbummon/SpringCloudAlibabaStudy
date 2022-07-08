package com.test.vo;

import com.test.entity.Book;
import com.test.entity.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author az
 * @description 用户与书籍对应关系VO
 * @date 2022/7/2 0002
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserBookVo {

    @ApiModelProperty("用户信息")
    private User user;

    @ApiModelProperty("书籍信息")
    private Book book;

}
