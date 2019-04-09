package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by RAN on 2019/4/8.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperate temperature;

    @SerializedName("cond")
    public More more;


    public class Temperate {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
