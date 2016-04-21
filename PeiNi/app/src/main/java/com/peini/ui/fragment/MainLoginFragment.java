package com.peini.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.design.widget.TabLayout;
import android.widget.TextView;

import com.peini.R;
import com.peini.adapter.PagerAdapter;
import com.peini.bean.TabInfo;
import com.peini.ui.activity.MainTabActivity;
import com.peini.util.CommonValue;
import com.peini.util.SPUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by fuhao on 16/3/22.
 */
public class MainLoginFragment extends Fragment{
    public final static int LOGIN = 0;
    public final static int REGISTER = 1;

    @InjectView(R.id.login_btn)
    TextView loginBtn;
    @InjectView(R.id.login_divider)
    View loginDivider;
    @InjectView(R.id.register_btn)
    TextView registerBtn;
    @InjectView(R.id.register_divider)
    View registerDivider;
    @InjectView(R.id.login_viewpager)
    ViewPager viewPager;

    private PagerAdapter adapter;
    private List<TabInfo> tabList;
    private String tabText[] = {"登陆", "注册"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mian_login, container, false);
        ButterKnife.inject(this, view);

        initView();
        return view;
    }

    private void initView() {
        if (SPUtil.getBoolean(CommonValue.SP_login, false)) {
            startActivity(new Intent(getActivity(), MainTabActivity.class));
            return;
        }
        adapter = new PagerAdapter(getActivity(), getChildFragmentManager());
        tabList = new ArrayList<>();
        tabList.add(new TabInfo("登陆", LoginFragment.class, createBundle(LOGIN)));
        tabList.add(new TabInfo("注册", RegisterFragment.class, createBundle(REGISTER)));

        adapter.setTabList(tabList);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);

        viewPager.setCurrentItem(0);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position == 0) {
                    loginDivider.setVisibility(View.VISIBLE);
                    loginBtn.setTextColor(getResources().getColor(R.color.text_black));
                    registerDivider.setVisibility(View.GONE);
                    registerBtn.setTextColor(getResources().getColor(R.color.gray));
                } else {
                    loginDivider.setVisibility(View.GONE);
                    loginBtn.setTextColor(getResources().getColor(R.color.gray));
                    registerDivider.setVisibility(View.VISIBLE);
                    registerBtn.setTextColor(getResources().getColor(R.color.text_black));
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @OnClick(R.id.login_layout)
    public void checkToLogin() {
        viewPager.setCurrentItem(0);
    }

    @OnClick(R.id.register_layout)
    public void checkToRegister() {
        viewPager.setCurrentItem(1);
    }

    private Bundle createBundle(int type){
        Bundle bundle = new Bundle();
        bundle.putInt("type", type);
        return bundle;
    }
}
