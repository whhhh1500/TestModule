package com.cc1500.common.exception.user;

import com.cc1500.common.exception.BaseException;

/**
 * 用户密码不正确或不符合规范异常类
 * 
 * @author cc1500
 */
public class UserPasswordNotMatchException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserPasswordNotMatchException()
    {
        super("user.password.not.match");
    }
}
