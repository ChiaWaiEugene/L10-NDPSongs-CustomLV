package com.myapplicationdev.android.p10_ndpsongs_clv;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Calendar;

public class CustomAdapter extends ArrayAdapter {
    Context context;
    int layout_id;
    ArrayList<Song> SongList;

    public CustomAdapter(Context context, int resource, ArrayList<Song> SongList) {
        super(context, resource, SongList);

        this.context = context;
        this.layout_id = resource;
        this.SongList = SongList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.tvTitle);
        TextView tvSinger = rowView.findViewById(R.id.tvSinger);
        TextView tvYear = rowView.findViewById(R.id.tvYear);
        TextView tvStars = rowView.findViewById(R.id.tvStars);

        Song currItem = SongList.get(position);

        tvTitle.setText(currItem.getTitle());
        tvSinger.setText(currItem.getSingers());
        tvYear.setText(currItem.getYearReleased());
        tvStars.setText(currItem.getStars());


        tvTitle.setTextColor(Color.BLUE);
        tvTitle.setTextSize(20f);
        //tvSinger.setTextColor(Color.TEAL);
        tvYear.setTextColor(Color.GRAY);
        tvStars.setTextColor(Color.RED);
        //if (currItem.getYearReleased() == 2021) {
        //    tvTitle.setTextColor(Color.RED);
        //    tvDate.setTextSize(20.5f);
        //}


        return rowView;
    }


}
