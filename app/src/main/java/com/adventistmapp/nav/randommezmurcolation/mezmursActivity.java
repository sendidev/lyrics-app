package com.adventistmapp.nav.randommezmurcolation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.adventistmapp.nav.Database.FDB;
import com.adventistmapp.nav.R;
import com.adventistmapp.nav.mezmurs;
public class mezmursActivity extends AppCompatActivity {

    private TextView id;
    private TextView titel;
    private ImageView likebut;
    private mezmurs item;
    private TextView eachmezmurs;
    Toolbar toolbar;
   public int textsize;
   private int fontsize;
    SharedPreferences sh;

    static FDB fdb;


    //   SharedPreferences sharedPreferences = getSharedPreferences("fontsize", MODE_PRIVATE);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fdb=new FDB(getApplicationContext());
        setContentView(R.layout.activity_mezmurs);
        id=findViewById(R.id.idt);
        titel=findViewById(R.id.titleac);
        likebut=findViewById(R.id.imf3);
        eachmezmurs=findViewById(R.id.mezmurtext);
        item= (mezmurs) getIntent().getSerializableExtra("objects");
        sh=getSharedPreferences("setting", Context.MODE_PRIVATE);
        textsize=sh.getInt("fontsize",0);
        fontsize=sh.getInt("fontfamily",0);

          loadata();
        if (item.getFavs().equals("1")) {
            likebut.setBackgroundResource(R.drawable.red_favorite_24);
        } else {
            likebut.setBackgroundResource(R.drawable.baseline_favorite_border_24);
        }


    }
  private void loadata(){

      id.setText(item.getId());
        titel.setText(item.getTitle());
        eachmezmurs.setText(item.getSong());


      if(textsize!=0){

          eachmezmurs.setTextSize(textsize);


      }


  }


}