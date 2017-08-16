package com.example.nitishsingh.android84;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nitish Singh on 19-07-2017.
 */

public class ImageAdapter extends BaseAdapter {

    private  Activity context;

    public ImageAdapter(Activity context) {
        this.context=context;
    }
    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null);
        {
            LayoutInflater layoutInflater=context.getLayoutInflater();
            view=layoutInflater.inflate(R.layout.gridview_activity,null);
        }

        ImageView imageView=(ImageView)view.findViewById(R.id.imageView);
        TextView textView=(TextView)view.findViewById(R.id.textView);

        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mThumbIds[i]);
        textView.setText(titles[i]);


        return view;
    }
    private Integer[] mThumbIds= {

            R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icecreamsandwich,R.drawable.jellybean,
            R.drawable.kitkat,R.drawable.lollipop

    };
    private String[]  titles=  {
            "Gingerbread", "Honeycomb", "IceCream Sandwich", "Jellybean", "Kitkat", "Lollipop"
    };
}
