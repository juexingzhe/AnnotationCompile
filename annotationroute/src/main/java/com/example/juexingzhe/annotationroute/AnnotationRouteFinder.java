package com.example.juexingzhe.annotationroute;

import android.util.Log;

import com.example.Provider;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by juexingzhe on 2017/6/2.
 */

public class AnnotationRouteFinder implements Provider {

    private static final String TYPE_NAME = "AnnotationRoute$Finder";
    private static final String PATH_NAME = "com.example.juexingzhe.annotaioncompiletest.";

    private static final Map<String, Provider> finderMap = new HashMap<>();

    @Override
    public String getActivityRouteName(String activityName) {

        Provider finder = finderMap.get(activityName);
        try {
            if (null == finder) {
                Class<?> annotationroute = Class.forName(PATH_NAME + TYPE_NAME);
                finder = (Provider) annotationroute.newInstance();
                finderMap.put(activityName, finder);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (null == finder) {
            return "";
        }
        return finder.getActivityRouteName(activityName);
    }
}
