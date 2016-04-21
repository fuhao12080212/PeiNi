package com.peini.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.peini.R;
import com.peini.ui.fragment.MainTabFragment;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by fuhao on 16/3/7.
 */
public class MainTabActivity extends AppCompatActivity {
    @InjectView(R.id.title)
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tab);
        ButterKnife.inject(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_main_tab, new MainTabFragment()).commit();
    }

    public void setTitleVisible(int visible) {
        title.setVisibility(visible);
    }
}
