package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    // TODO-C1 (1) Implement your Cat Bean here according to the response json
    @SerializedName("breeds") public String breeds[];
    @SerializedName("id") public String id;
    @SerializedName("url") public String url;
    @SerializedName("width") public int width;
    @SerializedName("height") public int height;
    public String getUrl(){
      return url;
    }
}
