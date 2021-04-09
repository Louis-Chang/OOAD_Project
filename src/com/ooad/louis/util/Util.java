package com.ooad.louis.util;

public class Util {
    public static int leftOrRight(float slope, int x, int y) {
        int ans;
        if (slope*x < y) {
            ans = -1;
        } else if (slope*x > y) {
            ans = 1;
        } else {
            ans = 0;
        }
        return ans;
    }
}
