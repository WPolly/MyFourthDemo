package com.tcl.lishanwang.myfourthdemo.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tcl.lishanwang.myfourthdemo.R;

/**
 * Created by lishan on 2016/9/13.
 * 16:07
 */
public class DeviceViewHolder extends RecyclerView.ViewHolder {

    public TextView mTvDeviceName;
    public TextView mTvDeviceAddress;

    public DeviceViewHolder(View itemView) {
        super(itemView);
        mTvDeviceName = (TextView) itemView.findViewById(R.id.tv_item_device_name);
        mTvDeviceAddress = (TextView) itemView.findViewById(R.id.tv_item_device_address);
    }
}
