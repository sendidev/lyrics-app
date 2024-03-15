package com.adventistmapp.mapp.catagorym;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.adventistmapp.mapp.CatonClick;
import com.adventistmapp.mapp.MainActivity;
import com.adventistmapp.mapp.MezmursAdapter;
import com.adventistmapp.mapp.R;
import com.adventistmapp.mapp.Selectonitemklik;
import com.adventistmapp.mapp.mezmurcat;
import com.adventistmapp.mapp.mezmurfragment;
import com.adventistmapp.mapp.mezmurs;
import com.adventistmapp.mapp.nbnav.favFragment;
import com.adventistmapp.mapp.nbnav.homeFragment;
import com.adventistmapp.mapp.nbnav.searchFragment;
import com.adventistmapp.mapp.randommezmurcolation.mezmursActivity;

import java.util.ArrayList;
import java.util.List;


public class wdase extends AppCompatActivity implements Selectonitemklik {

 private RecyclerView recat;
 private TextView tv;

    private Fragment fragment = null;
    MezmursAdapter re;
 private List<com.adventistmapp.mapp.mezmurs> mezmurs=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wdase);

        recat=findViewById(R.id.reccat);
        recat.setLayoutManager(new LinearLayoutManager(this));
        re=new MezmursAdapter(this, mezmurs, this);
        recat.setAdapter(re);
        tv=findViewById(R.id.cattext);
        String name =getIntent().getStringExtra("obj");


if(name.equals("የቀበና ቤ/ክ መዘምራን")){
    kebena();
    tv.setText(name);
   Toast.makeText(this, name, Toast.LENGTH_SHORT).show();

}else if (name.equals("ዘማሪ ኢያሱ ረጋሳ ")){
    tv.setText(name);
    eyasu();
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
}else if (name.equals("የሐዋሳ ታቦር ቤ/ክ መዘምራን")){
    tv.setText(name);
    taborhawassa();
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
}else if (name.equals("ዘማሪ ተፈራ ወ/ማሪያም")){
    tv.setText(name);
    tefera();
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
}else if (name.equals("ዘማሪ ፓ/ር ተስፋዬ ሽብሩ")){
    tv.setText(name);
    tesfaye();
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
}
else if (name.equals("ዘማሪ ቹቹ አምባዬ")){
    tv.setText(name);
    chuchu();
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
}
else if (name.equals("ዘማሪ ገነቱ ጋጋዶ")){
    tv.setText(name);
    negatu();
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
}
else if (name.equals("የአቦንሳ ቤ/ክ መዘምራን")){
    tv.setText(name);
    anbosa();
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
}else if (name.equals("የሐዋሳ መናኸሪያ ቤ/ክ አማኑኤል መዘምራን")){
    tv.setText(name);
    mnaraya();
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
}
else if (name.equals("የነገሌ አርሲ ቤ/ክ መዘምራን")){
    tv.setText(name);
    negele();
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
}
else if (name.equals("የአበላ ቤ/ክ መዘምራን")){
    tv.setText(name);
    anbela();
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
}
else if (name.equals("ዘማሪ ዳታን ደምሴ")){
    tv.setText(name);
    data();
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
}
else if (name.equals("ዘማሪ ኪዳኔ ኪታቦ")){
    tv.setText(name);
    kidane();
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
}

else if (name.equals("የሻሸመኔ ቤ/ክ መዘምራን")){
    tv.setText(name);
    shashamne();
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
}


else if (name.equals("የሌስፕራንስ ቤ/ክ መዘምራን")){
    tv.setText(name);
    lesp();
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
}

else if (name.equals("ዘማሪ ማሞ ጴጥሮስ")){
    tv.setText(name);
    mamo();
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
}
else if (name.equals("ዘማሪ ሰላሙ ታገሰ")){
    tv.setText(name);
    selamu();
    Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
}











    }


    private void  kebena(){
        mezmurs.add(new mezmurs("1","ለረዳን ለእግዚአብሔር","የቀበና ቤ/ክ መዘምራን", R.string.ለረዳንለእግዚአብሔር,"0"));
        mezmurs.add(new mezmurs("2","ለተጠማ ሁሉ ሚዳረስ","የቀበና ቤ/ክ መዘምራን", R.string.ለተጠማሁሉሚዳረስ,"0"));
        mezmurs.add(new mezmurs("7","ሊቀ-ካህናችን", "የቀበና ቤ/ክ መዘምራን",R.string.ሊቀካህናችን,"0"));
        mezmurs.add(new mezmurs("68","ጌታ ይመጣል", "የቀበና ቤ/ክ መዘምራን",R.string.ጌታይመጣል,"0"));

    }

    private void taborhawassa(){

        mezmurs.add(new mezmurs("8","ላመስግንህ እኔ","የሐዋሳ ታቦር መዘምራን", R.string.ላመስግንህእኔ,"0"));
        mezmurs.add(new mezmurs("9","ልመችህ","የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን", R.string.ልመችህ,"0"));
        mezmurs.add(new mezmurs("10","ልትወደስ", "የሐዋሳ ታቦር ቤ/ክ መዘምራን",R.string.ልትወደስ,"0"));
        mezmurs.add(new mezmurs("12","ማንም የለም ጥበበኛ","የሐዋሳ ታቦር ቤ/ክ መዝሙር", R.string.ማንምየለምጥበበኛ,"0"));
        mezmurs.add(new mezmurs("17","ስራህ እጅግ ግሩም","የሐዋሳ ታቦር መዘምራን", R.string.ስራህእጅግግሩም,"0"));
        mezmurs.add(new mezmurs("20","በታላቅ ጉባዔ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.በታላቅጉባዔ,"0"));
        mezmurs.add(new mezmurs("21","በችግር በጭንቅ ሰዓት","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.በችግርበጭንቅሰዓት,"0"));
        mezmurs.add(new mezmurs("24","በገና መሰንቆ ይዘን","የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን", R.string.በገናመሰንቆይዘን,"0"));

        mezmurs.add(new mezmurs("25","ብዙ ምስጋና አለኝ", "የሐዋሳ ታቦር ቤ/ክ መዘምራን",R.string.ብዙምስጋናአለኝ,"0"));

        mezmurs.add(new mezmurs("26","ችግሬን በሱ ላይ ጥዬበት","የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን", R.string.ችግሬንበሱላይጥዬበት,"0"));

        mezmurs.add(new mezmurs("28","አልችልም ባልኩት ላይ", "የሐዋሳ ታቦር ቤ/ክ መዘምራን",R.string.አልችልምባልኩትላይ,"0"));

        mezmurs.add(new mezmurs("33","አንተ ብቻ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.አንተብቻ,"0"));

        mezmurs.add(new mezmurs("35","አንተን አንተን ይላል ልቤ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.አንተንአንተንይላልልቤ,"0"));

        mezmurs.add(new mezmurs("36","አንተን ተማምኜ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.አንተንተማምኜ,"0"));

        mezmurs.add(new mezmurs("38","አዎን ባንተ","የሐዋሳ ታቦር መዘምራን", R.string.አዎንባንተ,"0"));

        mezmurs.add(new mezmurs("39","አየሁ ማዳንህን","የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን", R.string.አየሁማዳንህን,"0"));

        mezmurs.add(new mezmurs("40","አዲስ ዝማሬ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.አዲስዝማሬ,"0"));

        mezmurs.add(new mezmurs("41","አዲስ ዝማሬ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.አዲስዝማሬ,"0"));

        mezmurs.add(new mezmurs("42","አፋችንን ሞላው","የሐዋሳ ታቦር ቤ/ክ መዝሙር", R.string.አፋችንንሞላው,"0"));

        mezmurs.add(new mezmurs("43","ኢየሱስ ባንተ ነው", "የሐዋሳ ታቦር ቤ/ክ መዘምራን",R.string.ኢየሱስባንተነው,"0"));

        mezmurs.add(new mezmurs("44","እስቲ ድምፄን ላሰማ","የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን", R.string.እስቲድምፄንላሰማ,"0"));
        mezmurs.add(new mezmurs("45","እገረማለሁ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.እገረማለሁ,"0"));

        mezmurs.add(new mezmurs("48","እገረማለሁ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.እገረማለሁ,"0"));



        mezmurs.add(new mezmurs("49","እግዚአብሔር መልካም","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.እግዚአብሔርመልካም,"0"));

        mezmurs.add(new mezmurs("50","እግዚአብሔር በጭንቅ ቀን ", "የሐዋሳ ታቦር ቤ/ክ መዘምራን",R.string.እግዚአብሔርበጭንቅቀን,"0"));

        mezmurs.add(new mezmurs("51","ኦ መንፈስ ቅዱስ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.ኦመንፈስቅዱስ,"0"));

        mezmurs.add(new mezmurs("61","የማሸነፌ ምስጢር","የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን", R.string.የማሸነፌምስጢር,"0"));

        mezmurs.add(new mezmurs("62","የጌታ ውለታ", "የሐዋሳ ታቦር ቤ/ክ መዘምራን",R.string.የጌታውለታ,"0"));

        mezmurs.add(new mezmurs("65","ይህ ሁሉ ለእኔ ነው ", "የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን",R.string.ይህሁሉለእኔነው,"0"));
        mezmurs.add(new mezmurs("67","ጌታ አይጥልህም","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.ጌታአይጥልህም,"0"));
        mezmurs.add(new mezmurs("71","ፀሎቴን ያልከለከለኝ", "የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን",R.string.ፀሎቴንያልከለከለኝ,"0"));

       mezmurs.add(new mezmurs("72","መስቀልህ", "የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን",R.string.መስቀልህ,"0"));


        mezmurs.add(new mezmurs("74","ሰው አይደለህም", "የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን",R.string.ሰውአይደለህም,"0"));
        mezmurs.add(new mezmurs("81","እባክህ አበርታኝ", "የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን",R.string.እባክህአበርታኝ,"0"));

    }


    private void eyasu(){
        mezmurs.add(new mezmurs("3","ለአገልግሎት የመረጥከኝ", "ዘማሪ ኢያሱ ረጋሳ",R.string.ለአገልግሎትየመረጥከኝ,"0"));
        mezmurs.add(new mezmurs("4","ለእግዚአብሔር ሁሉ ይቻላል", "ዘማሪ ኢያሱ ረጋሳ",R.string.ለእግዚአብሔርሁሉይቻላል,"0"));
        mezmurs.add(new mezmurs("13","ምሳሌውን ከበለስ ተማሩ", "ዘማሪ ኢያሱ ረጋሳ",R.string.ምሳሌውንከበለስተማሩ,"0"));
        mezmurs.add(new mezmurs("22","በአዲስ አመት አዲስ ምስጋና", "ዘማሪ ኢያሱ ረጋሳ",R.string.በአዲስአመትአዲስምስጋና,"0"));
        mezmurs.add(new mezmurs("37","አካሄደ ተበላሽቶ", "ዘማሪ ኢያሱ ረጋሳ",R.string.አካሄደተበላሽቶ,"0"));
        mezmurs.add(new mezmurs("40","አይኖቼን ምራ", "ዘማሪ ኢያሱ ረጋሳ",R.string.አይኖቼንምራ,"0"));
        mezmurs.add(new mezmurs("52","ከተበተንበት","ዘማሪ ኢያሱ ረጋሳ", R.string.ከተበተንበት,"0"));
        mezmurs.add(new mezmurs("54","ወርቃማው መንግስትህ","ዘማሪ ኢያሱ ረጋሳ", R.string.ወርቃማውመንግስትህ,"0"));
        mezmurs.add(new mezmurs("55","ወደ መኖሪያ ቤት","ዘማሪ ኢያሱ ረጋሳ", R.string.ወደመኖሪያቤት,"0"));


    }

    private void kidane(){
        mezmurs.add(new mezmurs("5","ለዚህ መድረሴ","ዘማሪ ኪዳኔ ኪታቦ", R.string.ለዚህመድረሴ,"0"));




    }
    private void anbosa(){
        mezmurs.add(new mezmurs("11","ልናመሰግንህ","የአቦንሳ ቤ/ክ መዘምራን", R.string.ልናመሰግንህ,"0"));
        mezmurs.add(new mezmurs("23","በዚህ ጉባኤ","የአቦንሳ ቤ/ን መዘምራን", R.string.በዚህጉባኤ,"0"));


    }
    private void negatu(){
        mezmurs.add(new mezmurs("14","ሰማይ ግሩም ይበል","ዘማሪ ገነቱ ጋጋዶ", R.string.ሰማይግሩምይበል,"0"));
        mezmurs.add(new mezmurs("30","አምላኬ ከጐኔ ","ዘማሪ ገነቱ ጋጋዶ", R.string.አምላኬከጐኔ,"0"));
        mezmurs.add(new mezmurs("79","አምላኬ ከጐኔ ቁምልኝ", "ዘማሪ ገነቱ ጋጋዶ",R.string.አምላኬከጐኔቁምልኝ,"0"));


    }

    private void tesfaye(){
        mezmurs.add(new mezmurs("15","ስሙ ኃይል አለው","ዘማሪ ፓ/ር ተስፋዬ ሽብሩ", R.string.ስሙኃይልአለው,"0"));
        mezmurs.add(new mezmurs("19","በማጣት ይሁን በማግኘት", "ዘማሪ ፓ/ር ተስፋዬ ሽብሩ",R.string.በማጣትይሁንበማግኘት,"0"));
        mezmurs.add(new mezmurs("34","አንተ ግን አስቀድመህ", "ዘማሪ ፓ/ር ተስፋዬ ሽብሩ",R.string.አንተግንአስቀድመህ,"0"));
        mezmurs.add(new mezmurs("60","የሚያቅተው ፍፁም የለም","ዘማሪ ፓ/ር ተስፋዬ ሽብሩ", R.string.የሚያቅተውፍፁምየለም,"0"));


    }



    private void mnaraya(){
        mezmurs.add(new mezmurs("16","ስሙ የማይንደዉ", "የሐዋሳ መናኸሪያ ቤ/ክ አማኑኤል መዘምራን",R.string.ስሙየማይንደዉ,"0"));
        mezmurs.add(new mezmurs("63","የፍቅር ሥጦታ","የሐዋሳ መናኸሪያ ቤ/ክ አማኑኤል መዘምራን", R.string.የፍቅርሥጦታ,"0"));


    }
    private void chuchu(){
        mezmurs.add(new mezmurs("18","ቀርቶ አምናን ማለፋችን","ዘማሪ ቹቹ አምባዬ ", R.string.ቀርቶአምናንማለፋችን,"0"));
        mezmurs.add(new mezmurs("32","አቤንኤዘር","ዘማሪ ቹቹ አምባዬ", R.string.አቤንኤዘር,"0"));
        mezmurs.add(new mezmurs("47","እጃችንን ይዘህ", "ዘማሪ ቹቹ አምባዬ",R.string.እጃችንንይዘህ ,"0"));
        mezmurs.add(new mezmurs("59","የለም የሚሳነዉ", "ዘማሪ ቹቹ አምባዬ",R.string.የለምየሚሳነዉ,"0"));
        mezmurs.add(new mezmurs("80","አቤቱ ሥራህ", "ዘማሪ ቹቹ አምባዬ",R.string.አቤቱሥራህ,"0"));


    }
    private void data(){
        mezmurs.add(new mezmurs("6","ለዛሬ መድረሴ","ዘማሪ ዳታን ደምሴ", R.string.ለዛሬመድረሴ,"0"));


    }
    private void tefera(){

        mezmurs.add(new mezmurs("27","ኃይል ያለው","ዘማሪ ተፈራ ወ/ማሪያም", R.string.ኃይልያለው,"0"));
        mezmurs.add(new mezmurs("53","ከእንግዲህስ ወዲህ", "ዘማሪ ተፈራ ወ/ማሪያም",R.string.ከእንግዲህስወዲህ,"0"));
        mezmurs.add(new mezmurs("57","የኋለኛው ዝናብ","ዘማሪ ተፈራ ወ/ማሪያም ", R.string.የኋለኛውዝናብ,"0"));
        mezmurs.add(new mezmurs("64","ያለኝ ንብረት","ዘማሪ ተፈራ ወ/ማሪያም", R.string.ያለኝንብረት,"0"));
        mezmurs.add(new mezmurs("66","ይህን ታላቅ ሚስጢር","ዘማሪ ተፈራ ወ/ማሪያም", R.string.ለዚህመድረሴ,"0"));


    }
    private void negele(){
        mezmurs.add(new mezmurs("29","አምላካችን ሆይ","የነገሌ አርሲ ቤ/ክ መዘምራን", R.string.አምላካችንሆይ,"0"));
        mezmurs.add(new mezmurs("69","ጌታን ምረጥ","የነጌሌ አርሲ መዘምራን", R.string.ጌታንምረጥ,"0"));


    }
    private void shashamne(){
        mezmurs.add(new mezmurs("31","አስጨናቂው ዘመን", "የሻሸመኔ ቤ/ክ መዘምራን",R.string.አስጨናቂውዘመን,"0"));


    }

    private void anbela(){

        mezmurs.add(new mezmurs("46","እናመስግን", "የአበላ ቤ/ክ መዘምራን",R.string.እናመስግን,"0"));
        mezmurs.add(new mezmurs("47","እጃችንን ይዘህ", "የአበላ ቤ/ክ መዘምራን",R.string.እናመስግን,"0"));
        mezmurs.add(new mezmurs("82","እኔን ላከኝ", "የአበላ ቤ/ክ መዘምራን",R.string.እኔንላከኝ,"0"));

    }
    private void lesp(){

        mezmurs.add(new mezmurs("56","ዋጋ ያለው ነው", "የሌስፕራንስ ቤ/ክ መዘምራን",R.string.ዋጋያለውነው,"0"));

    }
    private void mamo(){
        mezmurs.add(new mezmurs("58","የለመኑህን የማትነሳ","ዘማሪ ማሞ ጴጥሮስ", R.string.የለመኑህንየማትነሳ,"0"));


    }
    private void selamu(){
        mezmurs.add(new mezmurs("70","ፀልየው ምን አጡ","ዘማሪ ሰላሙ ታገሰ", R.string.ፀልየውምንአጡ,"0"));


    }







    @Override
    public void onItemcliklistener(com.adventistmapp.mapp.mezmurs mzmur, CardView con1, ConstraintLayout c2, TextView id, TextView title, ImageView like, int position) {



        Intent i=new Intent(this, mezmursActivity.class);

        i.putExtra("objects",mzmur);
        Pair<View,String> p1=Pair.create(con1,"titlecard");
        Pair<View,String> p2=Pair.create(c2,"itemcon");
        Pair<View,String> p3=Pair.create(id,"idt");
        Pair<View,String> p4=Pair.create(title,"titlet");
        Pair<View,String> p5=Pair.create(like,"imt");
        ActivityOptionsCompat activityOptionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(this,p1,p2,p3,p4,p5);


        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN){

            startActivity(i,activityOptionsCompat.toBundle());
        }
        else {

            startActivity(i);

        }




    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        mezmurs.clear();
        re.notifyDataSetChanged();
        intalizedata();

    }
    public void setFragment() {
        // Create new fragment and transaction
        Fragment newFragment = new searchFragment();
        FragmentTransaction transaction =this.getSupportFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment, and add the transaction to the back stack
        transaction.replace(R.id.fram,newFragment, newFragment.getTag());
        transaction.addToBackStack(null);
        // Commit the transaction
        transaction.commit();

    }
    public void  intalizedata(){

        mezmurs.add(new mezmurs("1","ለረዳን ለእግዚአብሔር","የቀበና ቤ/ክ መዘምራን", R.string.ለረዳንለእግዚአብሔር,"0"));

        mezmurs.add(new mezmurs("2","ለተጠማ ሁሉ ሚዳረስ","የቀበና ቤ/ክ መዘምራን", R.string.ለተጠማሁሉሚዳረስ,"0"));

        mezmurs.add(new mezmurs("3","ለአገልግሎት የመረጥከኝ", "ዘማሪ ኢያሱ ረጋሳ",R.string.ለአገልግሎትየመረጥከኝ,"0"));

        mezmurs.add(new mezmurs("4","ለእግዚአብሔር ሁሉ ይቻላል", "ዘማሪ ኢያሱ ረጋሳ",R.string.ለእግዚአብሔርሁሉይቻላል,"0"));

        mezmurs.add(new mezmurs("5","ለዚህ መድረሴ","ዘማሪ ኪዳኔ ኪታቦ", R.string.ለዚህመድረሴ,"0"));

        mezmurs.add(new mezmurs("6","ለዛሬ መድረሴ","ዘማሪ ዳታን ደምሴ", R.string.ለዛሬመድረሴ,"0"));

        mezmurs.add(new mezmurs("7","ሊቀ-ካህናችን", "የቀበና ቤ/ክ መዘምራን",R.string.ሊቀካህናችን,"0"));

        mezmurs.add(new mezmurs("8","ላመስግንህ እኔ","የሐዋሳ ታቦር መዘምራን", R.string.ላመስግንህእኔ,"0"));

        mezmurs.add(new mezmurs("9","ልመችህ","የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን", R.string.ልመችህ,"0"));

        mezmurs.add(new mezmurs("10","ልትወደስ", "የሐዋሳ ታቦር ቤ/ክ መዘምራን",R.string.ልትወደስ,"0"));

        mezmurs.add(new mezmurs("11","ልናመሰግንህ","የአቦንሳ ቤ/ክ መዘምራን", R.string.ልናመሰግንህ,"0"));

        mezmurs.add(new mezmurs("12","ማንም የለም ጥበበኛ","የሐዋሳ ታቦር ቤ/ክ መዝሙር", R.string.ማንምየለምጥበበኛ,"0"));

        mezmurs.add(new mezmurs("13","ምሳሌውን ከበለስ ተማሩ", "ዘማሪ ኢያሱ ረጋሳ",R.string.ምሳሌውንከበለስተማሩ,"0"));

        mezmurs.add(new mezmurs("14","ሰማይ ግሩም ይበል","ዘማሪ ገነቱ ጋጋዶ", R.string.ሰማይግሩምይበል,"0"));

        mezmurs.add(new mezmurs("15","ስሙ ኃይል አለው","ዘማሪ ፓ/ር ተስፋዬ ሽብሩ", R.string.ስሙኃይልአለው,"0"));

        mezmurs.add(new mezmurs("16","ስሙ የማይንደዉ", "የሐዋሳ መናኸሪያ ቤ/ክ አማኑኤል መዘምራን",R.string.ስሙየማይንደዉ,"0"));

        mezmurs.add(new mezmurs("17","ስራህ እጅግ ግሩም","የሐዋሳ ታቦር መዘምራን", R.string.ስራህእጅግግሩም,"0"));

        mezmurs.add(new mezmurs("18","ቀርቶ አምናን ማለፋችን","ዘማሪ ቹቹ አምባዬ ", R.string.ቀርቶአምናንማለፋችን,"0"));

        mezmurs.add(new mezmurs("19","በማጣት ይሁን በማግኘት", "ዘማሪ ፓ/ር ተስፋዬ ሽብሩ",R.string.በማጣትይሁንበማግኘት,"0"));

        mezmurs.add(new mezmurs("20","በታላቅ ጉባዔ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.በታላቅጉባዔ,"0"));

        mezmurs.add(new mezmurs("21","በችግር በጭንቅ ሰዓት","የሐዋሳ ታቦር መዘምራን", R.string.በችግርበጭንቅሰዓት,"0"));

        mezmurs.add(new mezmurs("22","በአዲስ አመት አዲስ ምስጋና", "ዘማሪ ኢያሱ ረጋሳ",R.string.በአዲስአመትአዲስምስጋና,"0"));

        mezmurs.add(new mezmurs("23","በዚህ ጉባኤ","የአቦንሳ ቤ/ን መዘምራን", R.string.በዚህጉባኤ,"0"));

        mezmurs.add(new mezmurs("24","በገና መሰንቆ ይዘን","የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን", R.string.በገናመሰንቆይዘን,"0"));

        mezmurs.add(new mezmurs("25","ብዙ ምስጋና አለኝ", "የሐዋሳ ታቦር ቤ/ክ መዘምራን",R.string.ብዙምስጋናአለኝ,"0"));

        mezmurs.add(new mezmurs("26","ችግሬን በሱ ላይ ጥዬበት","የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን", R.string.ችግሬንበሱላይጥዬበት,"0"));

        mezmurs.add(new mezmurs("27","ኃይል ያለው","ዘማሪ ተፈራ ወ/ማሪያም", R.string.ኃይልያለው,"0"));

        mezmurs.add(new mezmurs("28","አልችልም ባልኩት ላይ", "የሐዋሳ ታቦር ቤ/ክ መዘምራን",R.string.አልችልምባልኩትላይ,"0"));

        mezmurs.add(new mezmurs("29","አምላካችን ሆይ","የነገሌ አርሲ ቤ/ክ መዘምራን", R.string.አምላካችንሆይ,"0"));

        mezmurs.add(new mezmurs("30","አምላኬ ከጐኔ ","ዘማሪ ገነቱ ጋጋዶ", R.string.አምላኬከጐኔ,"0"));

        mezmurs.add(new mezmurs("31","አስጨናቂው ዘመን", "የሻሸመኔ ቤ/ክ መዘምራን",R.string.አስጨናቂውዘመን,"0"));

        mezmurs.add(new mezmurs("32","አቤንኤዘር","ዘማሪ ቹቹ አምባዬ", R.string.አቤንኤዘር,"0"));

        mezmurs.add(new mezmurs("33","አንተ ብቻ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.አንተብቻ,"0"));

        mezmurs.add(new mezmurs("34","አንተ ግን አስቀድመህ", "ዘማሪ ፓ/ር ተስፋዬ ሽብሩ",R.string.አንተግንአስቀድመህ,"0"));

        mezmurs.add(new mezmurs("35","አንተን አንተን ይላል ልቤ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.አንተንአንተንይላልልቤ,"0"));

        mezmurs.add(new mezmurs("36","አንተን ተማምኜ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.አንተንተማምኜ,"0"));

        mezmurs.add(new mezmurs("37","አካሄደ ተበላሽቶ", "ዘማሪ ኢያሱ ረጋሳ",R.string.አካሄደተበላሽቶ,"0"));

        mezmurs.add(new mezmurs("38","አዎን ባንተ","የሐዋሳ ታቦር መዘምራን", R.string.አዎንባንተ,"0"));

        mezmurs.add(new mezmurs("39","አየሁ ማዳንህን","የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን", R.string.አየሁማዳንህን,"0"));

        mezmurs.add(new mezmurs("40","አይኖቼን ምራ", "ዘማሪ ኢያሱ ረጋሳ",R.string.አይኖቼንምራ,"0"));

        mezmurs.add(new mezmurs("41","አዲስ ዝማሬ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.አዲስዝማሬ,"0"));

        mezmurs.add(new mezmurs("42","አፋችንን ሞላው","የሐዋሳ ታቦር ቤ/ክ መዝሙር", R.string.አፋችንንሞላው,"0"));

        mezmurs.add(new mezmurs("43","ኢየሱስ ባንተ ነው", "የሐዋሳ ታቦር ቤ/ክ መዘምራን",R.string.ኢየሱስባንተነው,"0"));

        mezmurs.add(new mezmurs("44","እስቲ ድምፄን ላሰማ","የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን", R.string.እስቲድምፄንላሰማ,"0"));

        mezmurs.add(new mezmurs("45","እባክህ ልታደስ","የሐዋሳ ታቦር ቤ/ክ መዝሙር", R.string.እባክህልታደስ,"0"));

        mezmurs.add(new mezmurs("46","እናመስግን", "የአበላ ቤ/ክ መዘምራን",R.string.እናመስግን,"0"));

        mezmurs.add(new mezmurs("47","እጃችንን ይዘህ", "ዘማሪ ቹቹ አምባዬ",R.string.እጃችንንይዘህ ,"0"));

        mezmurs.add(new mezmurs("48","እገረማለሁ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.እገረማለሁ,"0"));

        mezmurs.add(new mezmurs("49","እግዚአብሔር መልካም","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.እግዚአብሔርመልካም,"0"));

        mezmurs.add(new mezmurs("50","እግዚአብሔር በጭንቅ ቀን ", "የሐዋሳ ታቦር ቤ/ክ መዘምራን",R.string.እግዚአብሔርበጭንቅቀን,"0"));

        mezmurs.add(new mezmurs("51","ኦ መንፈስ ቅዱስ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.ኦመንፈስቅዱስ,"0"));

        mezmurs.add(new mezmurs("52","ከተበተንበት","ዘማሪ ኢያሱ ረጋሳ", R.string.ከተበተንበት,"0"));

        mezmurs.add(new mezmurs("53","ከእንግዲህስ ወዲህ", "ዘማሪ ተፈራ ወ/ማሪያም",R.string.ከእንግዲህስወዲህ,"0"));

        mezmurs.add(new mezmurs("54","ወርቃማው መንግስትህ","ዘማሪ ኢያሱ ረጋሳ", R.string.ወርቃማውመንግስትህ,"0"));

        mezmurs.add(new mezmurs("55","ወደ መኖሪያ ቤት","ዘማሪ ኢያሱ ረጋሳ", R.string.ወደመኖሪያቤት,"0"));

        mezmurs.add(new mezmurs("56","ዋጋ ያለው ነው", "የሌስፕራንስ ቤ/ክ መዘምራን",R.string.ዋጋያለውነው,"0"));

        mezmurs.add(new mezmurs("57","የኋለኛው ዝናብ","ዘማሪ ተፈራ ወ/ማሪያም ", R.string.የኋለኛውዝናብ,"0"));

        mezmurs.add(new mezmurs("58","የለመኑህን የማትነሳ","ዘማሪ ማሞ ጴጥሮስ", R.string.የለመኑህንየማትነሳ,"0"));

        mezmurs.add(new mezmurs("59","የለም የሚሳነዉ", "ዘማሪ ቹቹ አምባዬ",R.string.የለምየሚሳነዉ,"0"));

        mezmurs.add(new mezmurs("60","የሚያቅተው ፍፁም የለም","ዘማሪ ፓ/ር ተስፋዬ ሽብሩ", R.string.የሚያቅተውፍፁምየለም,"0"));

        mezmurs.add(new mezmurs("61","የማሸነፌ ምስጢር","የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን", R.string.የማሸነፌምስጢር,"0"));

        mezmurs.add(new mezmurs("62","የጌታ ውለታ", "የሐዋሳ ታቦር ቤ/ክ መዘምራን",R.string.የጌታውለታ,"0"));

        mezmurs.add(new mezmurs("63","የፍቅር ሥጦታ","የሐዋሳ መናኸሪያ ቤ/ክ አማኑኤል መዘምራን", R.string.የፍቅርሥጦታ,"0"));

        mezmurs.add(new mezmurs("64","ያለኝ ንብረት","ዘማሪ ተፈራ ወ/ማሪያም", R.string.ያለኝንብረት,"0"));

        mezmurs.add(new mezmurs("65","ይህ ሁሉ ለእኔ ነው ", "የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን",R.string.ይህሁሉለእኔነው,"0"));

        mezmurs.add(new mezmurs("66","ይህን ታላቅ ሚስጢር","ዘማሪ ተፈራ ወ/ማሪያም", R.string.ይህንታላቅሚስጢር,"0"));

        mezmurs.add(new mezmurs("67","ጌታ አይጥልህም","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.ጌታአይጥልህም,"0"));

        mezmurs.add(new mezmurs("68","ጌታ ይመጣል", "የቀበና ቤ/ክ መዘምራን",R.string.ጌታይመጣል,"0"));

        mezmurs.add(new mezmurs("69","ጌታን ምረጥ","የነጌሌ አርሲ መዘምራን", R.string.ጌታንምረጥ,"0"));

        mezmurs.add(new mezmurs("70","ፀልየው ምን አጡ","ዘማሪ ሰላሙ ታገሰ", R.string.ፀልየውምንአጡ,"0"));

        mezmurs.add(new mezmurs("71","ፀሎቴን ያልከለከለኝ", "የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን",R.string.ፀሎቴንያልከለከለኝ,"0"));




        mezmurs.add(new mezmurs("72","መስቀልህ", "የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን",R.string.መስቀልህ,"0"));

        mezmurs.add(new mezmurs("73","መድሃኒቴ የሱስ", "ዘማሪ ጴጥሮስ ሐንዲሶ",R.string.መድሃኒቴየሱስ,"0"));


        mezmurs.add(new mezmurs("74","ሰው አይደለህም", "የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን",R.string.ሰውአይደለህም,"0"));


        mezmurs.add(new mezmurs("75","ስሙ ይክበር", "ዘማሪ ጴጥሮስ ሐንዲሶ",R.string.ስሙይክበር,"0"));


        mezmurs.add(new mezmurs("76","በምስጋና", "ዘማሪ ገነቱ ጋጋዶ",R.string.በምስጋና,"0"));


        mezmurs.add(new mezmurs("77","በሰላም ያለነው", "ዘማሪ ጴጥሮስ ሐንዲሶ",R.string.በሰላምያለነው,"0"));

        mezmurs.add(new mezmurs("78","በክብር ላይ ክብር", "ዘማሪ ሞላልኝ ኃይሉ",R.string.በክብርላይክብር,"0"));


        mezmurs.add(new mezmurs("79","አምላኬ ከጐኔ ቁምልኝ", "ዘማሪ ገነቱ ጋጋዶ",R.string.አምላኬከጐኔቁምልኝ,"0"));


        mezmurs.add(new mezmurs("80","አቤቱ ሥራህ", "ዘማሪ ቹቹ አምባዬ",R.string.አቤቱሥራህ,"0"));


        mezmurs.add(new mezmurs("81","እባክህ አበርታኝ", "የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን",R.string.እባክህአበርታኝ,"0"));


        mezmurs.add(new mezmurs("82","እኔን ላከኝ", "የአበላ ቤ/ክ መዘምራን",R.string.እኔንላከኝ,"0"));








    }




}