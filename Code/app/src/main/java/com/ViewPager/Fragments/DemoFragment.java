package com.ViewPager.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ViewPager.BaseFragmentHelper.BaseFragmentHelper;
import com.ViewPager.R;

public class DemoFragment  extends BaseFragmentHelper {
    TextView textview_Count;
    View demoFragmentView;
    int countBundle=-1;
    @Override
    public void onAttachFragment(@NonNull Fragment childFragment) {
        super.onAttachFragment(childFragment);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDataFromBundle();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        demoFragmentView=inflater.inflate(R.layout.fragment_demo,container,false);
        intializeViews();
        setDataFromBundle();
        return  demoFragmentView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public String toString() {
        return DemoFragment.class.getSimpleName();
    }

    private void intializeViews(){
        textview_Count=(TextView)demoFragmentView.findViewById(R.id.textview_Count_id);
    }
    private void getDataFromBundle(){
        if(getArguments()!=null){
          Bundle bundle= getArguments();
           countBundle= bundle.getInt(getResources().getString(R.string.COUNT));
        }
    }

    private void setDataFromBundle() {
        textview_Count.setText("Demo Fragment \n"+countBundle);
    }
}
