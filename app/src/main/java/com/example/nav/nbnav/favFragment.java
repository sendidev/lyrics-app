package com.example.nav.nbnav;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nav.Database.FDB;
import com.example.nav.MezmursAdapter;
import com.example.nav.R;
import com.example.nav.Selectonitemklik;
import com.example.nav.mezmurs;
import com.example.nav.randommezmurcolation.mezmursActivity;

import java.util.ArrayList;
import java.util.List;


public class favFragment extends Fragment implements Selectonitemklik {
private RecyclerView recyclerView;
private FDB fdb;
  private MezmursAdapter ma;
    private List<com.example.nav.mezmurs> mezmurs=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     View view=inflater.inflate(R.layout.fragment_fav, container, false);
fdb=new FDB(getContext());
recyclerView=view.findViewById(R.id.favcontaier);
recyclerView.setHasFixedSize(true);
recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        lData();
        return view;
    }

    private void lData() {

        if (mezmurs != null) {
            mezmurs.clear();
        }

        SQLiteDatabase db = fdb.getReadableDatabase();
        //reads liked items from database;
        Cursor cursor = fdb.selectallfavoritelist();
        try {
            while (cursor.moveToNext()) {
                String title = cursor.getString(cursor.getColumnIndex(FDB.ITEM_TITLE));
                String id = cursor.getString(cursor.getColumnIndex (FDB.KEY_ID));
                String favs = cursor.getString(cursor.getColumnIndex (FDB.FBS));
               mezmurs mezmuritem = new mezmurs(id, title,R.string.berket,favs);
               mezmurs.add(mezmuritem);

            }
        } finally {
            if (cursor != null && cursor.isClosed())
                cursor.close();
            db.close();
        }
        ma=new MezmursAdapter(getContext(),mezmurs,this);
        recyclerView.setAdapter(ma);
    }
    @Override
    public void onItemcliklistener(com.example.nav.mezmurs mzmur, CardView con1, ConstraintLayout c2, TextView id, TextView title, ImageView like, int position) {
        Intent i=new Intent(getActivity(), mezmursActivity.class);
        i.putExtra("objects",mzmur);
        Pair<View,String> p1=Pair.create(con1,"titlecard");
        Pair<View,String> p2=Pair.create(c2,"itemcon");
        Pair<View,String> p3=Pair.create(id,"idt");
        Pair<View,String> p4=Pair.create(title,"titlet");
        Pair<View,String> p5=Pair.create(like,"imt");
        //  ActivityOptionsCompat activityOptionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(),p1,p2,p3,p4,p5);
        ActivityOptionsCompat activityOptionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(),p1,p2,p3,p4,p5);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN){

            startActivity(i,activityOptionsCompat.toBundle());
        }
        else {

            startActivity(i);

        }


    }
}
