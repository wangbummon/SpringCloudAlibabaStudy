package com.test;

import com.test.entity.Book;
import com.test.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author az
 * @description
 * @date 2022/7/3 0003
 */
@SpringBootTest
public class TestApplication {

    @Test
    public void test1() {
        User user = User.builder()
                .uid(1)
                .age(12)
                .name("张三")
                .sex("男")
                .build();
        Book book = Book.builder()
                .bid(1)
                .title("《西游记》")
                .description("四大名著之一")
                .build();
    }
}
