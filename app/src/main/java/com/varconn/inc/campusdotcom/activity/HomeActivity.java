package com.varconn.inc.campusdotcom.activity;

import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.varconn.inc.campusdotcom.R;
import com.varconn.inc.campusdotcom.adapters.RecyclerAdapter;
import com.varconn.inc.campusdotcom.api.ApiInterface;
import com.varconn.inc.campusdotcom.data.MyData;
import com.varconn.inc.campusdotcom.models.DataModel;

import java.util.ArrayList;

import static com.varconn.inc.campusdotcom.data.constant.AppConstant.BASE_NAME;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.BASE_URL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.bmetroName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.bmetroURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.chronicleName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.chronicleURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.dailynewsName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.dailynewsURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.heraldName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.heraldURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.hmetroName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.hmetroURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.iharareName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.iharareURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.kwayedzaName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.kwayedzaURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.manicapostName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.manicapostURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.masvingomirrorName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.masvingomirrorURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.myzimbabweName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.myzimbabweURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.newsdayName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.newsdayURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.patriotName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.patriotURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.southerneyeName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.southerneyeURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.sundaymailName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.sundaymailURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.sundaynewsName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.sundaynewsURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.thestandardName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.thestandardURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.zbcnewsName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.zbcnewsURL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.zimeyeName;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.zimeyeURL;

public class HomeActivity extends BaseActivity {

    private static RecyclerAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private static RecyclerView recyclerView;
    private static ArrayList<DataModel> data;
    public static View.OnClickListener myOnClickListener;



    //data to add to recycter view
    public static String[] nameArray = {bmetroName, chronicleName , dailynewsName, hmetroName,
            heraldName, iharareName,kwayedzaName, manicapostName, masvingomirrorName,
            myzimbabweName,newsdayName,patriotName,southerneyeName,sundaymailName,
            sundaynewsName,thestandardName,zbcnewsName,zimeyeName};

    public static String[] versionArray = {bmetroURL, chronicleURL, dailynewsURL, hmetroURL, heraldURL,
            iharareURL, kwayedzaURL, manicapostURL, masvingomirrorURL,myzimbabweURL,
            newsdayURL,patriotURL, southerneyeURL, sundaymailURL, sundaynewsURL, thestandardURL,zbcnewsURL,
            zimeyeURL};

    public static Integer[] drawableArray = {R.drawable.bmetro, R.drawable.chronicle,
            R.drawable.dailynews, R.drawable.hmetro, R.drawable.herald, R.drawable.iharare,
            R.drawable.kwayedza, R.drawable.manicapost, R.drawable.masvingomirror,R.drawable.news,
            R.drawable.newsday,R.drawable.news,R.drawable.southerneye,R.drawable.sundaymail,R.drawable.sundaynews,
            R.drawable.standard,R.drawable.zbcnews,R.drawable.zimeye};

    public static Integer[] id_ = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initToolbar(false);
        initDrawer();

        myOnClickListener = new MyOnClickListener(this);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<DataModel>();
        for (int i = 0; i < nameArray.length; i++) {
            data.add(new DataModel(
                    nameArray[i],
                    versionArray[i],
                    id_[i],
                    drawableArray[i]
            ));
        }

        adapter = new RecyclerAdapter(this,data);
        recyclerView.setAdapter(adapter);



    }
    private class MyOnClickListener implements View.OnClickListener {

        private final Context context;

        private MyOnClickListener(Context context) {
            this.context = context;
        }

        @Override
        public void onClick(View v) {
            int selectedItemPosition = recyclerView.getChildPosition(v);
            RecyclerView.ViewHolder viewHolder
                    = recyclerView.findViewHolderForPosition(selectedItemPosition);
            TextView textViewUrl
                    = (TextView) viewHolder.itemView.findViewById(R.id.textViewVersion);

            TextView textViewName
                    = (TextView) viewHolder.itemView.findViewById(R.id.textViewName);

            String name = (String) textViewName.getText();
            String url = (String) textViewUrl.getText();

            //save string to HashMap
            ApiInterface.myHash.clear();
            ApiInterface.myHash.put(BASE_NAME,name);
            ApiInterface.myHash.put(BASE_URL,url);
            startActivity(new Intent(HomeActivity.this,MainActivity.class));
            //Toast.makeText(context, ""+selectedName, Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}