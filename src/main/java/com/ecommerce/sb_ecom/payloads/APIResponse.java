package com.ecommerce.sb_ecom.payloads;

public class APIResponse {
    private String message;
    private boolean status;

    public APIResponse() {
    }

    public APIResponse(String message, boolean status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}