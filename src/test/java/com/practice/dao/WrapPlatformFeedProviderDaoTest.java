package com.practice.dao;

import com.practice.pojo.WrapPlatformFeedProvider;
import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: Jet Ma
 * @Created: 2022-12-09
 */
@SpringBootTest
//@RunWith(SpringRunner.class)
class WrapPlatformFeedProviderDaoTest {
    @Resource
    private WrapPlatformFeedProviderDao dao;

    @Test
    public void findAll() {
        List<WrapPlatformFeedProvider> all = dao.findAll();
        System.out.println(all);
    }
}