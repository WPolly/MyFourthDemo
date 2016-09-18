package com.tcl.lishanwang.myfourthdemo.observer;

/**
 * Created by lishan on 2016/8/19.
 * 11:36
 */
public class TestWatch {
    public static void main(String[] args) {
        Thief thief = new Thief();

        Watcher watcher1 = new WatcherImp();
        Watcher watcher2 = new WatcherImp();
        Watcher watcher3 = new WatcherImp();

        thief.addWatcher(watcher1);
        thief.addWatcher(watcher2);
        thief.addWatcher(watcher3);

        thief.notifyChanged("我要偷东西了!");
    }
}
