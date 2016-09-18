package com.tcl.lishanwang.myfourthdemo.observer;

/**
 * Created by lishan on 2016/8/19.
 * 11:18
 */
public class WatcherImp implements Watcher {
    @Override
    public void update(String msg) {
        System.out.println(msg);
    }
}
