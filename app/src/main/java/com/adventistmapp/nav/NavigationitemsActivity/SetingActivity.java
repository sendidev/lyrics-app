package com.adventistmapp.nav.NavigationitemsActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.adventistmapp.nav.R;

public class SetingActivity extends AppCompatActivity {

  private Switch aSwitch;


    TextView textxhangedfont;

    TextView maintext;

    private SharedPreferences sharedPreferences;
    private boolean nightm;

    SharedPreferences.Editor editor;
    private static final String SHARED_PRNAME = "setting";
    private static final String KEY_FONT_SIZE = "fontsize";
    private static final String Key_mode = "Mode";
    private TextView ch;

    private SeekBar seekBar;
    public static int fontsize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seting);
           aSwitch =findViewById(R.id.mswicher);
        textxhangedfont = findViewById(R.id.changedtext);
        seekBar = findViewById(R.id.seekBar);
        ch = findViewById(R.id.seekchanged);
        //creating sharedprefrences
        sharedPreferences = getSharedPreferences(SHARED_PRNAME, MODE_PRIVATE);

        //creating editor object
        editor = sharedPreferences.edit();

        ChangetextSize();

        changetheme();


    }



    private void ChangetextSize() {
        //retriving datafrom sp
        fontsize=sharedPreferences.getInt(KEY_FONT_SIZE,0);
        if(fontsize!=0){

            ch.setText(String.valueOf(fontsize));
            textxhangedfont.setTextSize(fontsize);
            seekBar.setProgress(fontsize);
        }


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                ch.setText(String.valueOf(i));
                textxhangedfont.setTextSize(i);
                //saving changes
                editor.putInt(KEY_FONT_SIZE, i);
                editor.apply();


            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }



    public void changetheme(){

        nightm=sharedPreferences.getBoolean("night",false);

        if(nightm){
            aSwitch.setChecked(true);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        }


        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nightm){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    editor=sharedPreferences.edit();
                    editor.putBoolean("night",false);

                }else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    editor=sharedPreferences.edit();
                    editor.putBoolean("night",true);
                }
                editor.apply();

                Toast.makeText(SetingActivity.this, "Change Saved", Toast.LENGTH_SHORT).show();
            }
        });

    }



    @Override
    public void onBackPressed() {



        super.onBackPressed();

        fontsize = sharedPreferences.getInt(KEY_FONT_SIZE, 0);

        if (fontsize != 0) {
            ch.setText(String.valueOf(fontsize));
            textxhangedfont.setTextSize(fontsize);
            seekBar.setProgress(fontsize);
        }

    }

}