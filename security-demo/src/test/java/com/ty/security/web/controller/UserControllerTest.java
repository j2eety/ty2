package com.ty.security.web.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
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

    /**
     *
     * 功能描述:
     * 当访问成功时
     * mockMvc:执行模拟发送
     * perform：发送restful请求
     * param 传入参数
     * get：get请求
     * contentType：定义格式
     * andExpect：期望返回
     * status:状态码
     * jsonPath:返回的数据时集合   集合长度为3
     * @author tangyu
     * @date 2018/12/11 19:50
     */
    @Test
    public void whenQuerySuccess() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/user")
                .param("userName","jojo")
                .param("age","18")
                .param("ageTo","20")
                .param("size","15")
                .param("page","3")
                .param("sort","age,desc")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(3));

    }

    @Test
    public void whenGetInfoSuccess() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/user/1")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(3));
    }


}
