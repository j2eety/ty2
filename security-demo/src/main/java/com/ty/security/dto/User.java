package com.ty.security.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户模型〉
 *
 * @author tangyu
 * @create 2018/12/11
 * @since 1.0.0
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -6744165948950136104L;

    private String userName;

    private String passWord;

}
