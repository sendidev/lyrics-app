package com.adventistmapp.nav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class test extends AppCompatActivity {

    TextView textView1, textView2, textView3;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

    }

    private void replace(Fragment fragment){

    }
}