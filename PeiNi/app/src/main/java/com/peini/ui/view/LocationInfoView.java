package com.peini.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.peini.R;
import com.peini.bean.LocationInfo;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by fuhao on 16/4/13.
 */
public class LocationInfoView extends LinearLayout {

    @InjectView(R.id.location_name)
    TextView nameTv;
    @InjectView(R.id.location_introduction)
    TextView introductionTv;
    @InjectView(R.id.location_arrow)
    ImageView arrow;
    private boolean visible = false;

    public LocationInfoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LocationInfoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public LocationInfoView(Context context) {
        super(context);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.inject(this);
    }

    public void setData(LocationInfo locationInfo) {
        nameTv.setText(locationInfo.getName());
        introductionTv.setText(locationInfo.getIntroduction());
    }

    @OnClick(R.id.location_overview)
    public void showIntro() {
        visible = !visible;
        introductionTv.setVisibility(visible ? View.VISIBLE : View.GONE);
        arrow.setImageDrawable(visible ? getResources().getDrawable(R.drawable.up_arrow) : getResources().getDrawable(R.drawable.down_arrow));
    }
}
