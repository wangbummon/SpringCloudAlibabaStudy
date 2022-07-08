package com.test.service;

import com.test.entity.Borrow;
import com.baomidou.mybatisplus.extension.service.IService;
import com.test.vo.BookUserListVo;
import com.test.vo.UserBookListVo;
import com.test.vo.UserBookVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author az
 * @since 2022-07-02
 */
public interface IBorrowService extends IService<Borrow> {

    ///**
    // * 根据用户id查询所有借阅书籍
    // *
    // * @param uid 用户id
    // * @return
    // */
    //List<UserBookListVo> getBorrowListByUid(Integer uid);
    //
    ///**
    // * 根据书籍id查询所有借阅过的用户
    // *
    // * @param bid 书籍id
    // * @return
    // */
    //List<BookUserListVo> getBorrowListByBid(Integer bid);

    /**
     * 根据用户id和书籍id查询借阅详情
     * @param bid 书籍id
     * @param uid 用户id
     * @return
     */
    UserBookVo getBorrowListByBidUid(Integer bid,Integer uid);
}
