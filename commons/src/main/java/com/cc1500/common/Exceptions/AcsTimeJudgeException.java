package com.cc1500.common.Exceptions;

/**会议冲突异常
 * @Author 明建新
 * @Create 2019/11/1 13:59
 * @Version 1.0
 */
public class AcsTimeJudgeException extends RuntimeException{
    public AcsTimeJudgeException() {
        super();
    }

    public AcsTimeJudgeException(String message) {
        super(message);
    }

    public AcsTimeJudgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AcsTimeJudgeException(Throwable cause) {
        super(cause);
    }

    protected AcsTimeJudgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
