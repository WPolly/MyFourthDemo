package com.tcl.lishanwang.myfourthdemo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lishan on 2016/8/19.
 * 11:16
 */
public class Thief implements Watched {

    private List<Watcher> mWatchers = new ArrayList<>();

    @Override
    public void addWatcher(Watcher watcher) {
        mWatchers.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        mWatchers.remove(watcher);
    }

    @Override
    public void notifyChanged(String msg) {
        for (Watcher watcher : mWatchers) {
            watcher.update(msg);
        }
    }
}
