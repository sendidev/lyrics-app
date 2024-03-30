package com.adventistmapp.mapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.adventistmapp.mapp.catagorym.wdase;

import java.util.ArrayList;
import java.util.List;

public class catagoryFragment extends Fragment implements CatonClick {

    private View view;
    private RecyclerView rc;
    private List<mezmurcat> mc;

    private int postionm;

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


        mc.add(new mezmurcat(R.drawable.sdalogo,"የሐዋሳ ታቦር ቤ/ክ መዘምራን"));

        mc.add(new mezmurcat(R.drawable.sdalogo,"ዘማሪ ኢያሱ ረጋሳ "));
        mc.add(new mezmurcat(R.drawable.sdalogo,"የቀበና ቤ/ክ መዘምራን"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"ዘማሪ ተፈራ ወ/ማሪያም"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"ዘማሪ ፓ/ር ተስፋዬ ሽብሩ"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"ዘማሪ ቹቹ አምባዬ"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"ዘማሪ ገነቱ ጋጋዶ"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"የሐዋሳ መናኸሪያ ቤ/ክ አማኑኤል መዘምራን"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"የነገሌ አርሲ ቤ/ክ መዘምራን"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"የአበላ ቤ/ክ መዘምራን"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"ዘማሪ ዳታን ደምሴ"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"ዘማሪ ኪዳኔ ኪታቦ"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"የሻሸመኔ ቤ/ክ መዘምራን"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"የሌስፕራንስ ቤ/ክ መዘምራን"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"ዘማሪ ማሞ ጴጥሮስ"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"ዘማሪ ሰላሙ ታገሰ"));
        mc.add(new mezmurcat(R.drawable.sdalogo,"ዘማሪ ጴጥሮስ ሐንዲሶ"));



    }



    @Override
    public void Setonclick(mezmurcat mzmurcat, View view, int position) {
        postionm=position;
        Intent i=new Intent(getActivity(), wdase.class);
       i.putExtra("obj", mc.get(position).getTitle());
        startActivity(i);

    }

}
