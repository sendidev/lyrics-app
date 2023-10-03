package com.example.nav;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.example.nav.NavigationitemsActivity.AboutusActivity;
import com.example.nav.NavigationitemsActivity.SetingActivity;
import com.example.nav.nbnav.favFragment;
import com.example.nav.nbnav.homeFragment;
import com.example.nav.nbnav.searchFragment;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

import java.net.URI;
import java.net.URL;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;

    Toolbar toolbar;


    private final static int HOME = 1;
    private final static int FAV = 2;
    private final static int SEARCH = 3;

    private ChipNavigationBar chipNavigationBar;


    private Fragment fragment = null;




    private boolean nightm;

    SharedPreferences sharedPreferences;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chipNavigationBar = findViewById(R.id.chipnav);
        toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        sharedPreferences=  getSharedPreferences("setting", Context.MODE_PRIVATE);
        nightm=sharedPreferences.getBoolean("night",false);
        if(nightm){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        }
        drawerLayout = (DrawerLayout) findViewById(R.id.mydrawer);
        navigationView = (NavigationView) findViewById(R.id.cnav);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);


        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();



        chipNavigationBar.setItemSelected(R.id.homebot, true);
        getSupportFragmentManager().beginTransaction().replace(R.id.fram, new homeFragment()).commit();


        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {

                if (i == R.id.homebot) {

                    fragment = new homeFragment();

                } else {


                    if (i == R.id.fav) {
                        fragment = new favFragment();

                    } else {

                        if (i == R.id.search) {


                            fragment = new searchFragment();


                        }


                    }
                }
                if (fragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fram, fragment).commit();
                }
            }
        });

        navigationView.setNavigationItemSelectedListener(this::onNavigationItemSelected);

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.homenav) {
            chipNavigationBar.setItemSelected(R.id.homebot, true);
            Toast.makeText(getApplicationContext(), "home", Toast.LENGTH_LONG).show();

        } else {
            if (item.getItemId() == R.id.setting) {
                Intent i=new Intent(getApplicationContext(), SetingActivity.class);
                startActivity(i);
            } else {


                if (item.getItemId() == R.id.share) {
                    Intent i=new Intent(getApplicationContext(), test.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(), "share", Toast.LENGTH_LONG).show();


                } else {
                    if (item.getItemId() == R.id.aboutus) {
                        Intent i=new Intent(getApplicationContext(), AboutusActivity.class);
                        startActivity(i);
                        Toast.makeText(getApplicationContext(), "About us", Toast.LENGTH_LONG).show();
                    }


                }



            }



        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }
}