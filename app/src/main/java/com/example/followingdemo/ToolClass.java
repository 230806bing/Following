package com.example.followingdemo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.lang.reflect.Field;

public class ToolClass {
    public static void hide(Activity activity){
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            ViewGroup.LayoutParams params = view.getLayoutParams();
//            int topMargin = getStatusBarHeight(view.getContext());
//            params.height = params.height + topMargin;
//            view.setPadding(view.getPaddingLeft(), view.getPaddingTop() + topMargin, view.getPaddingRight(), view.getPaddingBottom());
//            view.setLayoutParams(params);
//        }
        Window window = activity.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }

    public static int getStatusBarHeight(Context context){
        Class<?> c = null;
        Object obj = null;
        Field field = null;
        int x = 0, statusBarHeight = 0;
        try {
            c = Class.forName("com.android.internal.R$dimen");
            obj = c.newInstance();
            field = c.getField("status_bar_height");
            x = Integer.parseInt(field.get(obj).toString());
            statusBarHeight = context.getResources().getDimensionPixelSize(x);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return statusBarHeight;
    }



    public static String showUserAgreement(){
        String userAgreement;
        userAgreement = "aaa";
        return userAgreement;
    }

    public static String showPrivacyPolicy(){
        String privacyPolicy;
        privacyPolicy = "aaa";
        return privacyPolicy;
    }


}
