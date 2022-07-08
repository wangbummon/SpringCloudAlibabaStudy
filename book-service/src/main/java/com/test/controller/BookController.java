package com.test.controller;

import com.test.entity.Book;
import com.test.service.IBookService;
import com.test.util.HttpResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author az
 * @since 2022-07-02
 */
@Api(tags = "书籍")
@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final IBookService bookService;

    @ApiOperation("获取书籍相关信息")
    @GetMapping("/{bid}")
    public HttpResult<Book> getBookByBid(@PathVariable Integer bid) {
        return HttpResult.ok(bookService.getById(bid));
    }

}
