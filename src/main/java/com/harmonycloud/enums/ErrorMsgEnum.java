package com.harmonycloud.enums;


public enum ErrorMsgEnum {

    SERVICE_ERROR("Internal service error"),
    PARAMETER_ERROR("Parameter error"),
    SAVE_ERROR("Save error"),
    FORMAT_ERROR("Unable to parse the proxy port number"),
    AUTHENTICATION_ERROR("Could not set user authentication in security context");
    private String message;

    ErrorMsgEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
