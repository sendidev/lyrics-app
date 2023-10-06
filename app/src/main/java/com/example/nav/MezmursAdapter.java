package com.example.nav;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nav.Database.FDB;

import java.util.List;

public class MezmursAdapter extends RecyclerView.Adapter<MezmursAdapter.Mezmurholder> {


   private Context context;
  private static List<mezmurs> mymezmurs;

 private Selectonitemklik listener;

 SharedPreferences.Editor editor;
    static FDB fdb;

    public MezmursAdapter(Context context, List<mezmurs> mymezmurs, Selectonitemklik listener) {
        this.context = context;
        this.mymezmurs = mymezmurs;
        this.listener=listener;
    }

   public void setfilterdlist(List<mezmurs> list){

     this.mymezmurs=list;
     notifyDataSetChanged();
   }

    @NonNull
    @Override
    public Mezmurholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
         fdb=new FDB(context);
        SharedPreferences pr=context.getSharedPreferences("Db",Context.MODE_PRIVATE);
        boolean firststart=pr.getBoolean("fstart",true);
        if (firststart){
         Ctofs();
        }
        v= LayoutInflater.from(context).inflate(R.layout.itemmezmur,parent,false);
        Mezmurholder mh=new Mezmurholder(v);
        return mh;
    }


    @Override
    public void onBindViewHolder(@NonNull Mezmurholder holder, int position) {
        mezmurs ms= mymezmurs.get(position);

        readcorsordata(ms,holder);
        holder.id.setText(mymezmurs.get(position).getId());
        holder.title.setText(mymezmurs.get(position).getTitle());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
     //passing data from the recycler view item to on click listener
      TextView id =holder.id;
      TextView title=holder.title;
      ImageView likebut=holder.likebut;
      ConstraintLayout c2=holder.co2;
      CardView c1=holder.con1;
         listener.onItemcliklistener(mymezmurs.get(position),c1,c2,id,title,likebut,position);
            }
        });

        holder.layout.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(),R.anim.recanim4));
    }



    @Override
    public int getItemCount() {
        return mymezmurs.size();
    }


    public static class Mezmurholder extends RecyclerView.ViewHolder{


        TextView title;
        TextView id;
        ImageView likebut;
       ConstraintLayout co2;
       CardView con1;
       LinearLayout layout;
        public Mezmurholder(@NonNull View itemView) {
            super(itemView);
            View view=itemView;
                      id=itemView.findViewById(R.id.idf1);
            title=itemView.findViewById(R.id.titlef2f);
            likebut=itemView.findViewById(R.id.imf3);
            con1=itemView.findViewById(R.id.cf);
            co2=itemView.findViewById(R.id.cf2);
            layout=itemView.findViewById(R.id.itemcontainer);


          likebut.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

                  int position = getAdapterPosition();
                  mezmurs ms= mymezmurs.get(position);
                  if (ms.getFavs().equals("0")) {

                      ms.setFavs("1");
                      fdb.insertIntoTheDatabase(ms.getTitle(),
                              ms.getId(), ms.getFavs(),ms.getSong());
                      likebut.setBackgroundResource(R.drawable.red_favorite_24);
                      Toast.makeText(con1.getContext(), "you liked "+ms.getTitle(), Toast.LENGTH_SHORT).show();
                  } else {
                      ms.setFavs("0");
                      fdb.removefav(ms.getId());
                      likebut.setBackgroundResource(R.drawable.baseline_favorite_border_24);

                      Toast.makeText(con1.getContext(), "you disliked "+ms.getTitle(), Toast.LENGTH_SHORT).show();
                  }


              }
          });


        }

    }
    private void Ctofs() {

fdb.insertEmpty();

        SharedPreferences pr=context.getSharedPreferences("Db",Context.MODE_PRIVATE);
         editor=pr.edit();
         editor.putBoolean("fstart",false);
         editor.apply();
    }
    private void readcorsordata(mezmurs ms, Mezmurholder mezmurholder) {
            Cursor cursor = fdb.readalldata(ms.getId());
            SQLiteDatabase db= fdb.getReadableDatabase();
            try {
                while (cursor.moveToNext()) {
                    String item_fav_status= cursor.getString(cursor.getColumnIndex(FDB.FBS));
                    ms.setFavs(item_fav_status);
//check fav status
                    if (item_fav_status!= null && item_fav_status.equals("1")) {
                        mezmurholder.likebut.setBackgroundResource(R.drawable.red_favorite_24);

                    } else if (item_fav_status!= null && item_fav_status.equals("0")) {
                        mezmurholder.likebut.setBackgroundResource(R.drawable.baseline_favorite_border_24);
                    }
                }
            } finally {
                if (cursor != null && cursor.isClosed())
                    cursor.close();
                db.close();
            }
        }




    }

