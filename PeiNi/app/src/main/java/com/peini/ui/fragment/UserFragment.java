package com.peini.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.peini.R;
import com.peini.ui.activity.LoginActivity;
import com.peini.ui.activity.MainTabActivity;
import com.peini.util.CommonValue;
import com.peini.util.SPUtil;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by fuhao on 16/3/7.
 */
public class UserFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @OnClick(R.id.logout)
    public void logout() {
        SPUtil.save(CommonValue.SP_login, false);
        startActivity(new Intent(getActivity(), LoginActivity.class));
    }
}
