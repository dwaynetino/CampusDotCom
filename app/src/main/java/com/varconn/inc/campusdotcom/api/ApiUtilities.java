package com.varconn.inc.campusdotcom.api;

import android.content.SharedPreferences;
import android.graphics.drawable.shapes.OvalShape;

import com.varconn.inc.campusdotcom.data.constant.AppConstant;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import static android.content.Context.MODE_PRIVATE;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.BASE_URL;
import static com.varconn.inc.campusdotcom.data.constant.AppConstant.MY_PREFS;

public class ApiUtilities {

    private Retrofit retrofit = null;


    public ApiInterface getApiInterface() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .baseUrl(ApiInterface.myHash.get(BASE_URL))
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiInterface.class);
    }
}
