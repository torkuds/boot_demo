package com.torkuds.boot_demo.base;

import lombok.Data;

@Data
public class IResult<T> {
    private boolean success;
    private String message;
    private T data;

    public IResult() {
        this.success = true;
    }

    public IResult(String message) {
        this.message = message;
        this.success = false;
    }

    public IResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public IResult(T result) {
        this.data = result;
        this.success = true;
    }
}
