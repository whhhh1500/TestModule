package com.cc1500.common.exception.user;

import com.cc1500.common.exception.BaseException;

/**
 * 验证码失效异常类
 * 
 * @author cc1500
 */
public class CaptchaExpireException extends BaseException {
    private static final long serialVersionUID = 1L;

    public CaptchaExpireException()
    {
        super("user.jcaptcha.expire");
    }
}
