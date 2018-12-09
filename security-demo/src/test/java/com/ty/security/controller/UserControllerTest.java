package com.ty.security.controller;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * 〈一句话功能简述〉<br>
 * 〈restfull测试案例〉
 *
 * @author Administrator
 * @create 2018/12/8
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    /**
     * 功能描述: 伪造mvc环境
     */
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void  setup(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }



}
