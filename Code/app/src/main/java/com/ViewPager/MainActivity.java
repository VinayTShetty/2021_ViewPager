package com.ViewPager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.ViewPager.Adapters.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {
ViewPager2 viewpager_2_mainActivity;
ViewPagerAdapter viewPagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intializeViews();
        instanceCreation();
        setUpAdapter();
    }
    private void intializeViews(){
        viewpager_2_mainActivity =(ViewPager2)findViewById(R.id.Viewpager_2_mainActivity_id);
    }
    private void instanceCreation(){
        viewPagerAdapter=new ViewPagerAdapter(this);
    }
    private void setUpAdapter(){
        viewpager_2_mainActivity.setAdapter(viewPagerAdapter);
    }
}