package com.adventistmapp.nav;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityOptionsCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.adventistmapp.nav.randommezmurcolation.mezmursActivity;

import java.util.ArrayList;
import java.util.List;
import androidx.core.util.Pair;
public class mezmurfragment extends Fragment implements Selectonitemklik {


private View view;
private RecyclerView recyclerView;
private List<mezmurs> mezmurs=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_mezmurs, container, false);

        // Inflate the layout for this fragment
 recyclerView=view.findViewById(R.id.con);

     MezmursAdapter re=new MezmursAdapter(getContext(), mezmurs, this);
     recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
 recyclerView.setAdapter(re);
        intalizedata();


        return view;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }



    public void intalizedata(){

        mezmurs.add(new mezmurs("1","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("2","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("3","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("4","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("5","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("6","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("7","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("8","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("9","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("10","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("11","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("12","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("13","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("14","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("15","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("16","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("17","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("18","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("19","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("20","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("21","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("22","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("23","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("24","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("25","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("26","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("27","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("28","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("29","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("30","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("31","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("32","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("33","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("34","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("35","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("36","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("37","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("38","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("39","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("40","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("41","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("42","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("43","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("44","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("45","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("46","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("47","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("48","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("49","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("50","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("51","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("52","ካህን", R.string.berket,"0"));
        mezmurs.add(new mezmurs("53","ሀብተ ሰማይ ", R.string.berket,"0"));
        mezmurs.add(new mezmurs("54","ካህን", R.string.berket,"0"));


    }

    @Override
    public void onItemcliklistener(com.adventistmapp.nav.mezmurs mzmur, CardView con1, ConstraintLayout c2, TextView id, TextView title, ImageView like, int position) {


        Intent i=new Intent(getActivity(),mezmursActivity.class);

        i.putExtra("objects",mzmur);
        Pair<View,String> p1=Pair.create(con1,"titlecard");
        Pair<View,String> p2=Pair.create(c2,"itemcon");
        Pair<View,String> p3=Pair.create(id,"idt");
        Pair<View,String> p4=Pair.create(title,"titlet");
        Pair<View,String> p5=Pair.create(like,"imt");
        ActivityOptionsCompat activityOptionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(),p1,p2,p3,p4,p5);


        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN){

            startActivity(i,activityOptionsCompat.toBundle());
        }
        else {

            startActivity(i);

        }






    }

}