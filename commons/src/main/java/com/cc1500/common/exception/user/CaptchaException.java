package com.cc1500.common.exception.user;

import com.cc1500.common.exception.BaseException;

/**
 * 验证码错误异常类
 * 
 * @author cc1500
 */
public class CaptchaException extends BaseException {
    private static final long serialVersionUID = 1L;

    public CaptchaException()
    {
        super("user.jcaptcha.error");
    }
}
