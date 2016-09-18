package com.tcl.lishanwang.myfourthdemo.bean;

/**
 * Created by lishan on 2016/9/13.
 * 16:28
 */
public class DeviceItemBean {
    private String deviceName;
    private String deviceAddress;

    public DeviceItemBean(String deviceName, String deviceAddress) {
        this.deviceName = deviceName;
        this.deviceAddress = deviceAddress;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceAddress() {
        return deviceAddress;
    }

    public void setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
    }
}
