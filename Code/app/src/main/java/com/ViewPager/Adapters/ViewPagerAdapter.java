package com.ViewPager.Adapters;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.ViewPager.Fragments.DemoFragment;
import com.ViewPager.R;

public class ViewPagerAdapter extends FragmentStateAdapter {
    FragmentActivity fragmentActivity;



    public ViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity_loc) {
        super(fragmentActivity_loc);
        this.fragmentActivity=fragmentActivity_loc;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        DemoFragment demoFragment=new DemoFragment();
        Bundle bundle=new Bundle();
        position=position+1;
        bundle.putInt(fragmentActivity.getResources().getString(R.string.COUNT),position);
        demoFragment.setArguments(bundle);
        return demoFragment;
    }

    @Override
    public int getItemCount() {
        return 100;
    }
}
