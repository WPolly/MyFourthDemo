package com.tcl.lishanwang.myfourthdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tcl.lishanwang.myfourthdemo.R;
import com.tcl.lishanwang.myfourthdemo.bean.DeviceItemBean;
import com.tcl.lishanwang.myfourthdemo.holder.DeviceViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lishan on 2016/9/13.
 * 16:06
 */
public class FoundedDevicesAdapter extends RecyclerView.Adapter<DeviceViewHolder> {

    private List<DeviceItemBean> mDeviceItemBeen = new ArrayList<>();

    @Override
    public DeviceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_device_founed, parent, false);
        return new DeviceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DeviceViewHolder holder, int position) {
        holder.mTvDeviceName.setText(mDeviceItemBeen.get(position).getDeviceName());
        holder.mTvDeviceAddress.setText(mDeviceItemBeen.get(position).getDeviceAddress());
    }

    @Override
    public int getItemCount() {
        return mDeviceItemBeen.size();
    }

    public void add (int position, DeviceItemBean bean) {
        mDeviceItemBeen.add(position, bean);
        notifyItemInserted(position);
    }
}
