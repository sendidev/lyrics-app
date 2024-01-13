package com.adventistmapp.nav.nbnav;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adventistmapp.nav.R;
import com.adventistmapp.nav.myviewadapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class homeFragment extends Fragment {

    TabLayout tabLayout;
    TabItem tab1, tab2, tab3;
    ViewPager2 viewPager2;
    myviewadapter myviewadapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        viewPager2 = view.findViewById(R.id.view2);
        tabLayout = view.findViewById(R.id.tablay);
        tab1 = view.findViewById(R.id.mezmurs);
        tab2 = view.findViewById(R.id.catagory);
        myviewadapter=new myviewadapter(getActivity());
        viewPager2.setAdapter(myviewadapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
    @Override
    public void onPageSelected(int position) {
        super.onPageSelected(position);

        tabLayout.getTabAt(position).select();
    }
});
        return view;


    }
    }
