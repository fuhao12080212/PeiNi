package com.peini.ui.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.peini.R;
import com.peini.adapter.LocationAdapter;
import com.peini.util.CommonValue;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by fuhao on 16/4/13.
 */
public class LocationInfoActivity extends AppCompatActivity {
    @InjectView(R.id.location_list)
    ListView locationList;

    LocationAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        ButterKnife.inject(this);
        adapter = new LocationAdapter(this, CommonValue.locationList);
        int a = adapter.getCount();
        adapter.notifyDataSetChanged();
        locationList.setAdapter(adapter);
    }
}
