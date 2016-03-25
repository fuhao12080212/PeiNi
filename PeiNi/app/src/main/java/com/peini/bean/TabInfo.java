package com.peini.bean;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
* Created by zhengxiaoqiang on 15/4/27.
*/
public class TabInfo {

    public static final String POSITION_TAG = "_positon";

    private final Class<? extends Fragment> mClazz;
    private final String mTitle;
    private final Bundle mArgs;
    private int position = -1;

    public TabInfo(String _title, Class<? extends Fragment> _clazz, Bundle _args) {
        mTitle = _title;
        mClazz = _clazz;
        mArgs = _args==null?new Bundle():_args;
    }

    public String getTitle() {
        return mTitle;
    }

    public Bundle getArgs() {
        return mArgs;
    }

    public Class<? extends Fragment> getClazz() {
        return mClazz;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        mArgs.putInt(POSITION_TAG, position);
        this.position = position;
    }
}
