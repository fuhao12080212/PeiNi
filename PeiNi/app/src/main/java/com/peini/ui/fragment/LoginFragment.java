package com.peini.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.peini.R;
import com.peini.ui.activity.MainTabActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by fuhao on 16/3/18.
 */
public class LoginFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @OnClick(R.id.login)
    public void jumpToMain() {
        startActivity(new Intent(getActivity(), MainTabActivity.class));
    }
}
