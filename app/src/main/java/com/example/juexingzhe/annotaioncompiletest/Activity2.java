package com.example.juexingzhe.annotaioncompiletest;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

import com.example.RouteAnnotation;

/**
 * Created by juexingzhe on 2017/6/2.
 */
@RouteAnnotation(name = "RouteName_Activity2")
public class Activity2 extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }
}
