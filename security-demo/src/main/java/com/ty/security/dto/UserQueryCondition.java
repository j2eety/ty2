package com.ty.security.dto;

import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈user的查询参数〉
 *
 * @author Administrator
 * @date 2018/12/22
 * @since 1.0.0
 */
@Data
public class UserQueryCondition {

    private String userName;

    private Integer age;

    private Integer ageTo;

}
