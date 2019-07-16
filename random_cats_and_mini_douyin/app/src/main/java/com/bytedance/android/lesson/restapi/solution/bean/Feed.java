package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:18
 */
public class Feed {

    // TODO-C2 (1) Implement your Feed Bean here according to the response json
    @SerializedName("student_id") public String student_id;
    @SerializedName("user_name") public String user_name;
    @SerializedName("image_url") public String image_url;
    @SerializedName("video_url") public String video_url;
    @SerializedName("_id") public String _id;
    @SerializedName("image_w") public int image_w;
    @SerializedName("image_h") public int image_h;
    @SerializedName("createdAt") public String createdAt;
    @SerializedName("updatedAt") public String updatedAt;
    @SerializedName("__v") public int __v;

    public String getImage_url(){
        return image_url;
    }
}
