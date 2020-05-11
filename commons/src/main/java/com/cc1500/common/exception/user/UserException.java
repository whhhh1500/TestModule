package com.cc1500.common.exception.user;

import com.cc1500.common.exception.BaseException;

/**
 * 用户信息异常类
 * 
 * @author cc1500
 */
public class UserException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
