package com.peini.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.peini.R;
import com.peini.adapter.PagerAdapter;
import com.peini.bean.TabInfo;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by fuhao on 16/3/22.
 */
public class MainTabFragment extends Fragment {

    public final static int HOME = 0;
    public final static int WAYBILL = 1;
    public final static int FAVOR = 2;
    public final static int USER = 3;

    @InjectView(R.id.main_viewpager)
    ViewPager viewPager;
    @InjectView(R.id.tabs)
    TabLayout tabLayout;

    private PagerAdapter adapter;
    private List<TabInfo> tabList;
    private String tabText[] = {"登陆", "注册"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_tab, container, false);
        ButterKnife.inject(this, view);

        initView();
        return view;
    }

    private void initView() {
        adapter = new PagerAdapter(getActivity(), getChildFragmentManager());
        tabList = new ArrayList<>();
        tabList.add(new TabInfo("首页", HomeFragment.class, createBundle(HOME)));
        tabList.add(new TabInfo("订单", WaybillFragment.class, createBundle(WAYBILL)));
        tabList.add(new TabInfo("收藏", FavorFragment.class, createBundle(FAVOR)));
        tabList.add(new TabInfo("我的", UserFragment.class, createBundle(USER)));

        adapter.setTabList(tabList);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);
        tabLayout.setupWithViewPager(viewPager);

//        for (int i = 0; i< tabLayout.getTabCount(); i++) {
//            TabView tabView = new TabView(getActivity());
//            tabView.getTabText().setText(tabText[i]);
//            tabLayout.getTabAt(i).setCustomView(tabView.getView());
//            tabLayout.getTabAt(i).setTag(tabView);
//        }
//        ((TabView) tabLayout.getTabAt(0).getTag()).getTabText().setTextColor(getResources().getColor(R.color.primary_green));
        viewPager.setCurrentItem(0);
    }

    private Bundle createBundle(int type){
        Bundle bundle = new Bundle();
        bundle.putInt("type", type);
        return bundle;
    }
}
