package com.peini.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.peini.R;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by fuhao on 16/3/7.
 */
public class WaybillFragment extends Fragment {

    @InjectView(R.id.waybill_confirm_divider)
    TextView confirmDivider;
    @InjectView(R.id.waybill_confirm_text)
    TextView confirmText;
    @InjectView(R.id.waybill_pay_divider)
    TextView payDivider;
    @InjectView(R.id.waybill_pay_text)
    TextView payText;
    @InjectView(R.id.waybill_use_divider)
    TextView useDivider;
    @InjectView(R.id.waybill_use_text)
    TextView useText;
    @InjectView(R.id.waybill_commmet_divider)
    TextView commentDivider;
    @InjectView(R.id.waybill_comment_text)
    TextView commentText;
    @InjectView(R.id.waybill_all_divider)
    TextView allDivider;
    @InjectView(R.id.waybill_all_text)
    TextView allText;
    @InjectView(R.id.waybill_fragment)
    FrameLayout waybillFragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_waybill, container, false);
        ButterKnife.inject(this, view);

        return view;
    }

    @OnClick(R.id.waybill_confirm)
    public void waybillConfirm() {
        goneAllDivider();
        grayAllText();
        confirmDivider.setVisibility(View.VISIBLE);
        confirmText.setTextColor(getResources().getColor(R.color.blue_light));
        waybillFragment.setVisibility(View.INVISIBLE);
    }

    @OnClick(R.id.waybill_pay)
    public void waybillPay() {
        goneAllDivider();
        grayAllText();
        payDivider.setVisibility(View.VISIBLE);
        payText.setTextColor(getResources().getColor(R.color.blue_light));
        waybillFragment.setVisibility(View.INVISIBLE);
    }

    @OnClick(R.id.waybill_use)
    public void waybillUse() {
        goneAllDivider();
        grayAllText();
        useDivider.setVisibility(View.VISIBLE);
        useText.setTextColor(getResources().getColor(R.color.blue_light));
        waybillFragment.setVisibility(View.INVISIBLE);
    }

    @OnClick(R.id.waybill_comment)
    public void waybillComment() {
        goneAllDivider();
        grayAllText();
        commentDivider.setVisibility(View.VISIBLE);
        commentText.setTextColor(getResources().getColor(R.color.blue_light));
        waybillFragment.setVisibility(View.VISIBLE);
    }

    @OnClick(R.id.waybill_all)
    public void waybillAll() {
        goneAllDivider();
        grayAllText();
        allDivider.setVisibility(View.VISIBLE);
        allText.setTextColor(getResources().getColor(R.color.blue_light));
        waybillFragment.setVisibility(View.VISIBLE);

    }

    private void goneAllDivider() {
        confirmDivider.setVisibility(View.GONE);
        payDivider.setVisibility(View.GONE);
        useDivider.setVisibility(View.GONE);
        commentDivider.setVisibility(View.GONE);
        allDivider.setVisibility(View.GONE);
    }

    private void grayAllText() {
        confirmText.setTextColor(getResources().getColor(R.color.gray_light));
        payText.setTextColor(getResources().getColor(R.color.gray_light));
        useText.setTextColor(getResources().getColor(R.color.gray_light));
        commentText.setTextColor(getResources().getColor(R.color.gray_light));
        allText.setTextColor(getResources().getColor(R.color.gray_light));
    }
}
