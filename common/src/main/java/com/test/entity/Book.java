package com.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * <p>
 * 
 * </p>
 *
 * @author az
 * @since 2022-07-02
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName("db_book")
@ApiModel(value = "Book对象", description = "")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "bid", type = IdType.AUTO)
    @ApiModelProperty(value = "主键")
    private Integer bid;

    @ApiModelProperty(value = "书名")
    private String title;

    @ApiModelProperty(value = "描述")
    private String description;


}
