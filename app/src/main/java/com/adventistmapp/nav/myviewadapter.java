package com.adventistmapp.nav;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class myviewadapter extends FragmentStateAdapter {


    public myviewadapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);


    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:return new mezmurfragment();
            case 1:return new catagoryFragment();
            default:return  null;
        }

    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
