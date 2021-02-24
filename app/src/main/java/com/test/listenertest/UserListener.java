package com.test.listenertest;

public interface UserListener {

    void Success(String msg);

    void Error(int code,String msg);

}
