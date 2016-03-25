package com.peini.ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.peini.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by fuhao on 15/11/26.
 */
public class TabView extends LinearLayout {

    @InjectView(R.id.tab_text)
    TextView tabText;

    Context context;
    LayoutInflater inflater;
    View view;

    public TabView(Context context) {
        super(context);
        this.context = context;
        inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.view_tab_item, null);
        ButterKnife.inject(this, view);
    }

    public View getView() {
        return view;
    }

    public TextView getTabText() {
        return tabText;
    }
}
