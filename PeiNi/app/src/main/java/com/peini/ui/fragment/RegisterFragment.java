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

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by fuhao on 16/3/18.
 */
public class RegisterFragment extends Fragment{

    @InjectView(R.id.register_phone)
    EditText phone;
    @InjectView(R.id.register_password)
    EditText password;
    @InjectView(R.id.register_repassword)
    EditText rePassword;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @OnClick(R.id.register)
    public void register() {
        if (!phone.getText().toString().equals("") && !password.getText().toString().equals("") && !rePassword.getText().toString().equals("")) {
            if (password.getText().toString().equals(rePassword.getText().toString())) {
                Toast.makeText(getActivity(), "注册成功，欢迎使用", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), MainTabActivity.class);
                intent.putExtra("phone", phone.getText().toString());
                getActivity().startActivity(intent);
            } else {
                password.setText("");
                rePassword.setText("");
                Toast.makeText(getActivity(), "输入密码不一致，请再次确认密码",Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(getActivity(), "请填写相关信息",Toast.LENGTH_SHORT).show();
        }
    }
}
