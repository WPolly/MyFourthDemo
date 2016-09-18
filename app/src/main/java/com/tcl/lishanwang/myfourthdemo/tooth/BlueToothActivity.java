package com.tcl.lishanwang.myfourthdemo.tooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tcl.lishanwang.myfourthdemo.R;
import com.tcl.lishanwang.myfourthdemo.adapter.FoundedDevicesAdapter;
import com.tcl.lishanwang.myfourthdemo.bean.DeviceItemBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class BlueToothActivity extends AppCompatActivity {

    @InjectView(R.id.bt_open_bluetooth)
    Button mBtOpenBluetooth;
    @InjectView(R.id.bt_close_bluetooth)
    Button mBtCloseBluetooth;
    @InjectView(R.id.bt_start_scan)
    Button mBtStartScan;
    @InjectView(R.id.bt_stop_scan)
    Button mBtStopScan;
    @InjectView(R.id.rv_devices)
    RecyclerView mRvDevices;
    private BluetoothAdapter mBluetoothAdapter;
    private FoundedDevicesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue_tooth);
        ButterKnife.inject(this);
        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mAdapter = new FoundedDevicesAdapter();
        mRvDevices.setAdapter(mAdapter);
        mRvDevices.setLayoutManager(manager);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BluetoothDevice.ACTION_FOUND);
        intentFilter.addAction(BluetoothAdapter.ACTION_DISCOVERY_FINISHED);
        registerReceiver(mBlueToothReceiver, intentFilter);
    }

    @OnClick({R.id.bt_open_bluetooth, R.id.bt_close_bluetooth, R.id.bt_start_scan, R.id.bt_stop_scan})
    public void onClick(View view) {
        if (mBluetoothAdapter == null) {
            Toast.makeText(this, "该设备不支持蓝牙", Toast.LENGTH_SHORT).show();
            return;
        }
        switch (view.getId()) {
            case R.id.bt_open_bluetooth:
                mBluetoothAdapter.enable();
                break;
            case R.id.bt_close_bluetooth:
                mBluetoothAdapter.disable();
                break;
            case R.id.bt_start_scan:
                boolean startDiscovery = mBluetoothAdapter.startDiscovery();
                Toast.makeText(this, (startDiscovery ? "开始扫描" : "开启扫描失败"), Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_stop_scan:
                boolean cancelDiscovery = mBluetoothAdapter.cancelDiscovery();
                Toast.makeText(this, (cancelDiscovery ? "停止扫描" : "停止扫描失败"), Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private BroadcastReceiver mBlueToothReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            switch (intent.getAction()) {
                case BluetoothDevice.ACTION_FOUND:
                    BluetoothDevice device = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                    DeviceItemBean deviceItemBean = new DeviceItemBean(device.getName(),device.getAddress());
                    mAdapter.add(0, deviceItemBean);
                    mRvDevices.smoothScrollToPosition(0);
                    break;

                case BluetoothAdapter.ACTION_DISCOVERY_FINISHED:
                    Toast.makeText(getApplicationContext(), "扫描结束", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };

    @Override
    protected void onDestroy() {
        unregisterReceiver(mBlueToothReceiver);
        super.onDestroy();
    }
}
