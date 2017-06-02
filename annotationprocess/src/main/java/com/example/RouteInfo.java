package com.example;

import java.util.HashMap;

/**
 * Created by juexingzhe on 2017/6/2.
 */

public class RouteInfo implements Provider {
    private HashMap<String, String> routeMap;

    public RouteInfo() {
        routeMap = new HashMap<>();
        routeMap.put("MainActivity", "RouteName_MainActivity");
        routeMap.put("Activity2", "RouteName_Activity2");
    }


    @Override
    public String getActivityRouteName(String activityName) {
        if (null != routeMap && !routeMap.isEmpty()) {
            return routeMap.get(activityName);
        }
        return activityName;
    }
}
