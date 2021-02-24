package com.test.listenertest;

import android.app.Activity;
import android.util.Log;

public class CallBackListener {

    private static UserListener mainListener;
    private static UserListener secondListener;
    private static UserListener ThreeListener;
    private static UserListener fourListener;

//    private static Activity main;
//    private static Activity second;
//    private static Activity three;
//    private static Activity four;




    public static UserListener getMainListener() {
        if (mainListener == null){
            Log.d("TAG", "getMainListener:  返回为空 ");
            return null;
        }
        return mainListener;
    }

    public static void setMainListener( UserListener mainListener) {
        CallBackListener.mainListener = mainListener;
    }

    public static UserListener getSecondListener() {
        return secondListener;
    }

    public static void setSecondListener(UserListener secondListener) {
        CallBackListener.secondListener = secondListener;
    }

    public static UserListener getThreeListener() {
        return ThreeListener;
    }

    public static void setThreeListener(UserListener threeListener) {
        ThreeListener = threeListener;
    }

    public static UserListener getFourListener() {
        return fourListener;
    }

    public static void setFourListener(UserListener fourListener) {
        CallBackListener.fourListener = fourListener;
    }



    public static void callBackSuccess(Activity activity,String msg){
        if (mainListener != null && activity instanceof SecondeActivity){
            Log.d("TAG", "mainListener  ---   callBackSuccess:    msg::"+msg);
            mainListener.Success("我返回来了---："+msg);
        }

        if (secondListener != null && activity instanceof ThreeActivity){
            Log.d("TAG", "secondListener   ---   callBackSuccess:    msg::"+msg);
            secondListener.Success("我是滴三个页面返回的数据  ---:"+msg);
        }

    }

    public static void callBackError(int code,String msg){
        if (mainListener != null) {
            Log.d("TAG", "callBackError:   code:" + code + "    msg:" + msg);
        }
        if (secondListener != null){
            Log.d("TAG", "callBackError:   code:"+code+"    msg:"+msg);
        }
    }

}
