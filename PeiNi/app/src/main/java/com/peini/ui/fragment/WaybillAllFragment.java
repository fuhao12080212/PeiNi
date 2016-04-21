package com.peini.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.peini.R;

import butterknife.ButterKnife;

/**
 * Created by fuhao on 16/4/19.
 */
public class WaybillAllFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_waybill_all, container, false);
        ButterKnife.inject(this, view);
        return view;
    }
}
