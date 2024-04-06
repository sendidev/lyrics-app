package com.adventistmapp.mapp.nbnav;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

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

import com.adventistmapp.mapp.R;
import com.adventistmapp.mapp.Selectonitemklik;
import com.adventistmapp.mapp.mezmurfragment;
import com.adventistmapp.mapp.mezmurs;
import com.adventistmapp.mapp.randommezmurcolation.mezmursActivity;
import com.adventistmapp.mapp.MezmursAdapter;

import java.util.ArrayList;
import java.util.List;


public class searchFragment extends Fragment implements Selectonitemklik {

    private RecyclerView recyclerView;
    private SearchView searchView;
   private MezmursAdapter re;
    private List<com.adventistmapp.mapp.mezmurs> mezmurs=new ArrayList<>();
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

    Toast.makeText(getContext(), "ይቅርታ፣ መዝሙር ሊገኝ አልተቻለም!!", Toast.LENGTH_SHORT).show();
}else {
         re.setfilterdlist(filterdlist);
}

    }


    public void intalizedata(){
        //initalize song id, title

        mezmurs.add(new mezmurs("1","ለረዳን ለእግዚአብሔር","የቀበና ቤ/ክ መዘምራን", R.string.ለረዳንለእግዚአብሔር,"0"));

        mezmurs.add(new mezmurs("2","ለተጠማ ሁሉ ሚዳረስ","የቀበና ቤ/ክ መዘምራን", R.string.ለተጠማሁሉሚዳረስ,"0"));

        mezmurs.add(new mezmurs("3","ለአገልግሎት የመረጥከኝ", "ዘማሪ ኢያሱ ረጋሳ",R.string.ለአገልግሎትየመረጥከኝ,"0"));

        mezmurs.add(new mezmurs("4","ለእግዚአብሔር ሁሉ ይቻላል", "ዘማሪ ኢያሱ ረጋሳ",R.string.ለእግዚአብሔርሁሉይቻላል,"0"));

        mezmurs.add(new mezmurs("5","ለዚህ መድረሴ","ዘማሪ ኪዳኔ ኪታቦ", R.string.ለዚህመድረሴ,"0"));

        mezmurs.add(new mezmurs("6","ለዛሬ መድረሴ","ዘማሪ ዳታን ደምሴ", R.string.ለዛሬመድረሴ,"0"));

        mezmurs.add(new mezmurs("7","ሊቀ-ካህናችን", "የቀበና ቤ/ክ መዘምራን",R.string.ሊቀካህናችን,"0"));

        mezmurs.add(new mezmurs("8","ላመስግንህ እኔ","የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን", R.string.ላመስግንህእኔ,"0"));

        mezmurs.add(new mezmurs("9","ልመችህ","የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን", R.string.ልመችህ,"0"));

        mezmurs.add(new mezmurs("10","ልትወደስ", "የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን",R.string.ልትወደስ,"0"));

        mezmurs.add(new mezmurs("11","ልናመሰግንህ","የአቦንሳ ቤ/ክ መዘምራን", R.string.ልናመሰግንህ,"0"));

        mezmurs.add(new mezmurs("12","ማንም የለም ጥበበኛ","የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን", R.string.ማንምየለምጥበበኛ,"0"));

        mezmurs.add(new mezmurs("13","ምሳሌውን ከበለስ ተማሩ", "ዘማሪ ኢያሱ ረጋሳ",R.string.ምሳሌውንከበለስተማሩ,"0"));

        mezmurs.add(new mezmurs("14","ሰማይ ግሩም ይበል","ዘማሪ ገነቱ ጋጋዶ", R.string.ሰማይግሩምይበል,"0"));

        mezmurs.add(new mezmurs("15","ስሙ ኃይል አለው","ዘማሪ ፓ/ር ተስፋዬ ሽብሩ", R.string.ስሙኃይልአለው,"0"));

        mezmurs.add(new mezmurs("16","ስሙ የማይንደዉ", "የሐዋሳ መናኸሪያ ቤ/ክ አማኑኤል መዘምራን",R.string.ስሙየማይንደዉ,"0"));

        mezmurs.add(new mezmurs("17","ስራህ እጅግ ግሩም","ዘማሪ ቹቹ አምባዬ", R.string.ስራህእጅግግሩም,"0"));

        mezmurs.add(new mezmurs("18","ቀርቶ አምናን ማለፋችን","ዘማሪ ቹቹ አምባዬ ", R.string.ቀርቶአምናንማለፋችን,"0"));

        mezmurs.add(new mezmurs("19","በማጣት ይሁን በማግኘት", "ዘማሪ ፓ/ር ተስፋዬ ሽብሩ",R.string.በማጣትይሁንበማግኘት,"0"));

        mezmurs.add(new mezmurs("20","በታላቅ ጉባዔ","የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን", R.string.በታላቅጉባዔ,"0"));

        mezmurs.add(new mezmurs("21","በችግር በጭንቅ ሰዓት","የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን", R.string.በችግርበጭንቅሰዓት,"0"));

        mezmurs.add(new mezmurs("22","በአዲስ አመት አዲስ ምስጋና", "ዘማሪ ኢያሱ ረጋሳ",R.string.በአዲስአመትአዲስምስጋና,"0"));

        mezmurs.add(new mezmurs("23","በዚህ ጉባኤ","የአቦንሳ ቤ/ክ መዘምራን", R.string.በዚህጉባኤ,"0"));

        mezmurs.add(new mezmurs("24","በገና መሰንቆ ይዘን","የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን", R.string.በገናመሰንቆይዘን,"0"));

        mezmurs.add(new mezmurs("25","ብዙ ምስጋና አለኝ", "የሀዋሳ ታቦር ቤ/ክ ዉዳሴ መዘምራን",R.string.ብዙምስጋናአለኝ,"0"));

        mezmurs.add(new mezmurs("26","ችግሬን በሱ ላይ ጥዬበት","የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን", R.string.ችግሬንበሱላይጥዬበት,"0"));

        mezmurs.add(new mezmurs("27","ኃይል ያለው","ዘማሪ ተፈራ ወ/ማሪያም", R.string.ኃይልያለው,"0"));

        mezmurs.add(new mezmurs("28","አልችልም ባልኩት ላይ", "የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን",R.string.አልችልምባልኩትላይ,"0"));

        mezmurs.add(new mezmurs("29","አምላካችን ሆይ","የነገሌ አርሲ ቤ/ክ መዘምራን", R.string.አምላካችንሆይ,"0"));

        mezmurs.add(new mezmurs("30","አምላኬ ከጎኔ ቁምልኝ", "ዘማሪ ገነቱ ጋጋዶ",R.string.አምላኬከጐኔቁምልኝ,"0"));

        mezmurs.add(new mezmurs("31","አስጨናቂው ዘመን", "የሻሸመኔ ቤ/ክ መዘምራን",R.string.አስጨናቂውዘመን,"0"));

        mezmurs.add(new mezmurs("32","አቤንኤዘር","ዘማሪ ቹቹ አምባዬ", R.string.አቤንኤዘር,"0"));

        mezmurs.add(new mezmurs("33","አንተ ብቻ","የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን", R.string.አንተብቻ,"0"));

        mezmurs.add(new mezmurs("34","አንተ ግን አስቀድመህ", "ዘማሪ ፓ/ር ተስፋዬ ሽብሩ",R.string.አንተግንአስቀድመህ,"0"));

        mezmurs.add(new mezmurs("35","አንተን አንተን ይላል ልቤ","ዘማሪ ዘውዴ አሳሞ", R.string.አንተንአንተንይላልልቤ,"0"));

        mezmurs.add(new mezmurs("36","አንተን ተማምኜ","የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን", R.string.አንተንተማምኜ,"0"));

        mezmurs.add(new mezmurs("37","አካሄደ ተበላሽቶ", "ዘማሪ ኢያሱ ረጋሳ",R.string.አካሄደተበላሽቶ,"0"));

        mezmurs.add(new mezmurs("38","አዎን ባንተ","የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን", R.string.አዎንባንተ,"0"));

        mezmurs.add(new mezmurs("39","አየሁ ማዳንህን","የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን", R.string.አየሁማዳንህን,"0"));

        mezmurs.add(new mezmurs("40","አይኖቼን ምራ", "ዘማሪ ኢያሱ ረጋሳ",R.string.አይኖቼንምራ,"0"));

        mezmurs.add(new mezmurs("41","አዲስ ዝማሬ","የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን", R.string.አዲስዝማሬ,"0"));

        mezmurs.add(new mezmurs("42","አፋችንን ሞላው","የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን", R.string.አፋችንንሞላው,"0"));

        mezmurs.add(new mezmurs("43","ኢየሱስ ባንተ ነው", "የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን",R.string.ኢየሱስባንተነው,"0"));

        mezmurs.add(new mezmurs("44","እስቲ ድምፄን ላሰማ","የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን", R.string.እስቲድምፄንላሰማ,"0"));

        mezmurs.add(new mezmurs("45","እገረማለሁ","የሐዋሳ ታቦር ቤ/ክ መዘምራን", R.string.እገረማለሁ,"0"));


        mezmurs.add(new mezmurs("46","እናመስግን", "የአበላ ቤ/ክ መዘምራን",R.string.እናመስግን,"0"));

        mezmurs.add(new mezmurs("47","እጃችንን ይዘህ", "ዘማሪ ቹቹ አምባዬ",R.string.እጃችንንይዘህ ,"0"));

        mezmurs.add(new mezmurs("48","እባክህ ልታደስ","የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን", R.string.እባክህልታደስ,"0"));



        mezmurs.add(new mezmurs("49","እግዚአብሔር መልካም","የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን", R.string.እግዚአብሔርመልካም,"0"));

        mezmurs.add(new mezmurs("50","እግዚአብሔር በጭንቅ ቀን ", "የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን",R.string.እግዚአብሔርበጭንቅቀን,"0"));

        mezmurs.add(new mezmurs("51","ኦ መንፈስ ቅዱስ","የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን", R.string.ኦመንፈስቅዱስ,"0"));

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

        mezmurs.add(new mezmurs("62","የጌታ ውለታ", "የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን",R.string.የጌታውለታ,"0"));

        mezmurs.add(new mezmurs("63","የፍቅር ሥጦታ","የሐዋሳ መናኸሪያ ቤ/ክ አማኑኤል መዘምራን", R.string.የፍቅርሥጦታ,"0"));

        mezmurs.add(new mezmurs("64","ያለኝ ንብረት","ዘማሪ ተፈራ ወ/ማሪያም", R.string.ያለኝንብረት,"0"));

        mezmurs.add(new mezmurs("65","ይህ ሁሉ ለእኔ ነው ", "የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን",R.string.ይህሁሉለእኔነው,"0"));

        mezmurs.add(new mezmurs("66","ይህን ታላቅ ሚስጢር","ዘማሪ ተፈራ ወ/ማሪያም", R.string.ይህንታላቅሚስጢር,"0"));

        mezmurs.add(new mezmurs("67","ጌታ አይጥልህም","የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን", R.string.ጌታአይጥልህም,"0"));

        mezmurs.add(new mezmurs("68","ጌታ ይመጣል", "የቀበና ቤ/ክ መዘምራን",R.string.ጌታይመጣል,"0"));

        mezmurs.add(new mezmurs("69","ጌታን ምረጥ","የነጌሌ አርሲ መዘምራን", R.string.ጌታንምረጥ,"0"));

        mezmurs.add(new mezmurs("70","ፀልየው ምን አጡ","ዘማሪ ሰላሙ ታገሰ", R.string.ፀልየውምንአጡ,"0"));

        mezmurs.add(new mezmurs("71","ፀሎቴን ያልከለከለኝ", "የሐዋሳ ታቦር ቤ/ክ ውዳሴ መዘምራን",R.string.ፀሎቴንያልከለከለኝ,"0"));






        mezmurs.add(new mezmurs("72","መስቀልህ", "የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን",R.string.መስቀልህ,"0"));

        mezmurs.add(new mezmurs("73","መድሃኒቴ የሱስ", "ዘማሪ ጴጥሮስ ሐንዲሶ",R.string.መድሃኒቴየሱስ,"0"));


        mezmurs.add(new mezmurs("74","ሰው አይደለህም", "የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን",R.string.ሰውአይደለህም,"0"));


        mezmurs.add(new mezmurs("75","ስሙ ይክበር", "ዘማሪ ጴጥሮስ ሐንዲሶ",R.string.ስሙይክበር,"0"));


        mezmurs.add(new mezmurs("76","በምስጋና", "ዘማሪ ገነቱ ጋጋዶ",R.string.በምስጋና,"0"));


        mezmurs.add(new mezmurs("77","በሰላም ያለነው", "ዘማሪ ጴጥሮስ ሐንዲሶ",R.string.በሰላምያለነው,"0"));

        mezmurs.add(new mezmurs("78","በክብር ላይ ክብር", "ዘማሪ ሞላልኝ ኃይሉ",R.string.በክብርላይክብር,"0"));




        mezmurs.add(new mezmurs("79","አቤቱ ሥራህ", "ዘማሪ ቹቹ አምባዬ",R.string.አቤቱሥራህ,"0"));


        mezmurs.add(new mezmurs("80","እባክህ አበርታኝ", "የሐዋሳ ታቦር ቤ/ክ የኤለሻዳይ መዘምራን",R.string.እባክህአበርታኝ,"0"));


        mezmurs.add(new mezmurs("81","እኔን ላከኝ", "የሀዋሳ ታቦር ቤ/ክ መዘምራን",R.string.እኔንላከኝ,"0"));





    }

    @Override
    public void onItemcliklistener(com.adventistmapp.mapp.mezmurs mzmur, CardView con1, ConstraintLayout c2, TextView id, TextView title, ImageView like, int position) {


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