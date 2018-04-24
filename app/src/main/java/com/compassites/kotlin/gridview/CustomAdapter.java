package com.compassites.kotlin.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by shruthi on 28/3/18.
 */

public class CustomAdapter extends BaseAdapter {

    public Integer[] images = {R.drawable.ic_contact, R.drawable.ic_contact, R.drawable.ic_contact,
            R.drawable.ic_contact, R.drawable.ic_contact, R.drawable.ic_contact,
            R.drawable.ic_contact, R.drawable.ic_contact, R.drawable.ic_contact,
            R.drawable.ic_contact, R.drawable.ic_contact, R.drawable.ic_contact,
            R.drawable.ic_contact, R.drawable.ic_contact, R.drawable.ic_contact,
            R.drawable.ic_contact, R.drawable.ic_contact, R.drawable.ic_contact,
            R.drawable.ic_contact, R.drawable.ic_contact, R.drawable.ic_contact};
    private Context context;

    CustomAdapter(Context newContext) {
        context = newContext;
    }

    @Override
    public int getCount() {
        return images.length;
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
        View grid;
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view == null){
            grid = new ImageView(context);
            grid =(View)layoutInflater.inflate(R.layout.activity_image_view,null);
        }else{
            grid = (View)view;
        }
        ImageView image = (ImageView)grid.findViewById(R.id.iv_contacts);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context.getApplicationContext(),"clicked", Toast.LENGTH_SHORT).show();
            }
        });
        image.setImageResource(images[i]);
        return grid;
    }
}
