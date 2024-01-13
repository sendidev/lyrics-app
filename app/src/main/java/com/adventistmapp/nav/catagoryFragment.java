package com.adventistmapp.nav;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.adventistmapp.nav.catagorym.wdase;

import java.util.ArrayList;
import java.util.List;

public class catagoryFragment extends Fragment implements CatonClick {

    private View view;
    private RecyclerView rc;
    private List<mezmurcat> mc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_mcatagory, container, false);


      rc =view.findViewById(R.id.catagorycon);
    GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),2,GridLayoutManager.VERTICAL,false);
    rc.setLayoutManager(gridLayoutManager);
        Adaptercat a=new Adaptercat(getContext(),mc,this);
        rc.setAdapter(a);

        return view;


    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    mc=new ArrayList<>();
  in();

    }

    private void in(){
        mc.add(new mezmurcat(R.drawable.sdalogo,"Wedase"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"unknown"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"unknown"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"unknown"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"unknown"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"unknown"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"unknown"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"unknown"));

    }

    @Override
    public void Setonclick(mezmurcat mzmurcat, View view, int position) {
        Intent i=new Intent(getActivity(), wdase.class);
       i.putExtra("obj", mc.get(position).getTitle());
        Toast.makeText(view.getContext(),"mezmur catagory",Toast.LENGTH_LONG).show();
    }

}
