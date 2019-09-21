package com.factory.business.common;

/**
 * Description: factory
 * <p>
 * Created by 胡胜 on 2019/9/21 13:57
 */
public class CommException extends RuntimeException {

    private static final long serialVersionUID = 5562716762253421651L;

    private String errorCode;

    private String errorMsg;

    public CommException(String code, String msg){
        this.errorCode = code;
        this.errorMsg = msg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
