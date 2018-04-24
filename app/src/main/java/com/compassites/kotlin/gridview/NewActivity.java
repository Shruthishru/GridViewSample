package com.compassites.kotlin.gridview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by shruthi on 28/3/18.
 */

public class NewActivity extends AppCompatActivity {

    public Integer[] images = {R.drawable.ic_contact, R.drawable.ic_contact, R.drawable.ic_contact,
            R.drawable.ic_contact, R.drawable.ic_contact, R.drawable.ic_contact,
            R.drawable.ic_contact, R.drawable.ic_contact, R.drawable.ic_contact,
            R.drawable.ic_contact, R.drawable.ic_contact, R.drawable.ic_contact,
            R.drawable.ic_contact, R.drawable.ic_contact, R.drawable.ic_contact,
            R.drawable.ic_contact, R.drawable.ic_contact, R.drawable.ic_contact,
            R.drawable.ic_contact, R.drawable.ic_contact, R.drawable.ic_contact};
    @Override
    protected void onCreate(@Nullable Bundle instance){
        super.onCreate(instance);
        setContentView(R.layout.activity_image_view);
        Intent i = getIntent();
        int position = i.getExtras().getInt("id");
        CustomAdapter customAdapter = new CustomAdapter(this);
        ImageView imageView = findViewById(R.id.iv_contacts);
        imageView.setImageResource(images[position]);
    }
}
