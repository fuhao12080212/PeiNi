package com.peini.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.peini.R;
import com.peini.adapter.PagerAdapter;
import com.peini.bean.TabInfo;
import com.peini.ui.fragment.LoginFragment;
import com.peini.ui.fragment.MainLoginFragment;
import com.peini.ui.fragment.RegisterFragment;


import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by fuhao on 16/3/7.
 */
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.inject(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout, new MainLoginFragment()).commitAllowingStateLoss();
    }

}
