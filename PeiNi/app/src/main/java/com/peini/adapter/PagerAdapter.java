package com.peini.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.peini.bean.TabInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhengxiaoqiang on 15/3/11.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {

    private Context mContext;
    private List<TabInfo> mTabs = new ArrayList<TabInfo>();

    public PagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    public void addTab(String title, Class<? extends Fragment> clazz, Bundle args) {
        TabInfo tabInfo = new TabInfo(title, clazz, args);
        mTabs.add(tabInfo);
        notifyDataSetChanged();
    }

    public void setTabList(List<TabInfo> tabList) {
        mTabs = tabList;
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return mTabs.size();
    }

    @Override
    public Fragment getItem(int position) {
        TabInfo info = mTabs.get(position);
        info.setPosition(position);
        return Fragment.instantiate(mContext, info.getClazz().getName(),
                info.getArgs());
    }

    public String getTag(int position){
        return position+mTabs.get(position).getClass().getSimpleName();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return mTabs.get(position).getTitle();
    }

}
