package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:17
 */
public class FeedResponse {

    // TODO-C2 (2) Implement your FeedResponse Bean here according to the response json
    @SerializedName("success") public boolean success;
    @SerializedName("feeds") public List<Feed> mFeeds;

    public List<Feed> getFeed() {
        return mFeeds;
    }


}
