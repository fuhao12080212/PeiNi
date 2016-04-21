package com.peini.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.peini.R;
import com.peini.ui.activity.MainTabActivity;
import com.peini.util.CommonValue;
import com.peini.util.SPUtil;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by fuhao on 16/3/18.
 */
public class LoginFragment extends Fragment {

    @InjectView(R.id.login_phone)
    EditText phone;
    @InjectView(R.id.login_password)
    EditText password;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @OnClick(R.id.login)
    public void jumpToMain() {
        if (!phone.getText().toString().equals("") && phone.getText().toString().length() == 11 && password.getText().toString().equals(phone.getText().toString())) {
            Toast.makeText(getActivity(), "登陆成功", Toast.LENGTH_SHORT).show();
            SPUtil.save(CommonValue.SP_login, true);
            startActivity(new Intent(getActivity(), MainTabActivity.class));
        } else {
            Toast.makeText(getActivity(), "用户名或者密码错误", Toast.LENGTH_SHORT).show();
        }

    }
}
