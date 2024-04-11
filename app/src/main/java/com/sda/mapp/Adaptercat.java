package com.sda.mapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class Adaptercat extends RecyclerView.Adapter<Adaptercat.catholder>  {

    Context context;
    List<mezmurcat> mc;

    CatonClick catonClick;

    public Adaptercat(Context context, List<mezmurcat> mc,CatonClick catonClick) {
        this.context = context;
        this.mc = mc;
        this.catonClick=catonClick;
    }

    @NonNull
    @Override
    public catholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        View v;
        v= LayoutInflater.from(context).inflate(R.layout.catagory,parent,false);

        Adaptercat.catholder c=new Adaptercat.catholder(v);

        return c;

    }

    @Override
    public void onBindViewHolder(@NonNull catholder holder, int position) {


        holder.im.setImageResource(mc.get(position).getIm());
        holder.title.setText(mc.get(position).getTitle());

        holder.con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                View view1 = holder.itemView;
                catonClick.Setonclick(mc.get(position),view1,position);


            }
        });
        holder.con.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(),R.anim.catanim));

    }

    @Override
    public int getItemCount() {
        return mc.size();
    }


    public static class catholder extends RecyclerView.ViewHolder{


        TextView title;
       ImageView im;
       LinearLayout con;
        View view;

        public catholder(@NonNull View itemView) {
            super(itemView);
             view=itemView;
            im=itemView.findViewById(R.id.catim);
            title=itemView.findViewById(R.id.title2);

          con=itemView.findViewById(R.id.maincontainer);
        }
    }

}
