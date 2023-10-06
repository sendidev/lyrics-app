package com.example.nav.nbnav;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SearchView;
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
import android.widget.Toast;

import com.example.nav.NavigationitemsActivity.SetingActivity;
import com.example.nav.R;
import com.example.nav.Selectonitemklik;
import com.example.nav.mezmurfragment;
import com.example.nav.mezmurs;
import com.example.nav.randommezmurcolation.mezmursActivity;
import com.example.nav.MezmursAdapter;

import java.util.ArrayList;
import java.util.List;


public class searchFragment extends Fragment implements Selectonitemklik {

    private RecyclerView recyclerView;
    private SearchView searchView;
   private MezmursAdapter re;
    private List<com.example.nav.mezmurs> mezmurs=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_search, container, false);

        recyclerView=view.findViewById(R.id.searchcontainer);
        searchView=view.findViewById(R.id.searchView);
        re =new MezmursAdapter(getContext(), mezmurs, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(re);

        mezmurfragment m=new mezmurfragment();


        intalizedata();


        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {



                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

      filterlist(newText);
 return true;
            }
        });



        return view;
    }




    private void filterlist(String newText) {
    List<mezmurs> filterdlist=new ArrayList<>();


    for (mezmurs mezmurs1: mezmurs){

        if (mezmurs1.getTitle().toLowerCase().contains(newText.toLowerCase())|mezmurs1.getId().toLowerCase().contains(newText.toLowerCase())){
            filterdlist.add(mezmurs1);
        }


        }
if(filterdlist.isEmpty()){

    re.setfilterdlist(filterdlist);

    Toast.makeText(getContext(), "Sorry..No mezmur Found!!", Toast.LENGTH_SHORT).show();
}else {
         re.setfilterdlist(filterdlist);
}








    }


    public void intalizedata(){
        //initalize song id, title
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