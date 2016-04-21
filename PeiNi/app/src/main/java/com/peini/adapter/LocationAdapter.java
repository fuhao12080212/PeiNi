package com.peini.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;

import com.peini.R;
import com.peini.bean.LocationInfo;
import com.peini.ui.view.LocationInfoView;
import com.peini.util.CommonValue;

import java.util.List;

/**
 * Created by fuhao on 16/4/13.
 */
public class LocationAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private Context context;
    private List<LocationInfo> locationList;

    public LocationAdapter(Context context, List<LocationInfo> locationList) {
        this.context = context;
        this.locationList = locationList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LocationInfo locationInfo = locationList.get(position);
        LocationInfoView infoView;
        if (convertView == null) {
            infoView = (LocationInfoView) inflater.inflate(R.layout.view_location_introduction, parent, false);
        } else {
            infoView = (LocationInfoView) convertView;
        }
        infoView.setData(locationInfo);
        return infoView;
    }

    @Override
    public LocationInfo getItem(int position) {
        return CommonValue.locationList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getCount() {
        return CommonValue.locationList.size();
    }
}
