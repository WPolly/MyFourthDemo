package com.tcl.lishanwang.myfourthdemo.observer;

/**
 * Created by lishan on 2016/8/19.
 * 11:06
 */
public interface Watched {
    void addWatcher(Watcher watcher);
    void removeWatcher(Watcher watcher);
    void notifyChanged(String msg);
}
