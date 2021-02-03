package com.harinder.infinitevideoscroll;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewPager2 videosViewPager = findViewById(R.id.videosViewPager);

        List<String> videoItems = new ArrayList<>();

        //Loading Urls in the videoItems list
        videoItems.add("https://d3qk4bte9py5ck.cloudfront.net/d2678ff7-2876-4d01-ae69-45c72f6b687c/hls/49-dev.m3u8");
        videoItems.add("https://d3qk4bte9py5ck.cloudfront.net/163719a0-9e6f-4357-a6df-c47fab0e8ff8/hls/50-dev.m3u8");
        videoItems.add("https://d3qk4bte9py5ck.cloudfront.net/898f3e27-15bd-47f3-aaad-ab0b02eff34c/hls/51-dev.m3u8");
        videoItems.add("https://d3qk4bte9py5ck.cloudfront.net/cb683609-2f10-491c-9dd5-c48eded8b681/hls/52-dev.m3u8");
        videoItems.add("https://d3qk4bte9py5ck.cloudfront.net/ad5f07bb-db4c-450c-b22b-060e4acff189/hls/53-dev.m3u8");
        videoItems.add("https://d3qk4bte9py5ck.cloudfront.net/22f07bcf-d12e-40c4-ae17-57dc245b3706/hls/54-dev.m3u8");
        videoItems.add("https://d3qk4bte9py5ck.cloudfront.net/8b6618c5-43b9-4b96-aced-f3d35f036243/hls/55-dev.m3u8");
        videoItems.add("https://d3qk4bte9py5ck.cloudfront.net/ac4fada6-e621-4c27-bfdb-2d6c88fb71ac/hls/56-dev.m3u8");
        videoItems.add("https://d3qk4bte9py5ck.cloudfront.net/52413c8f-ad41-4809-b427-938372ada0c9/hls/57-dev.m3u8");
        videoItems.add("https://d3qk4bte9py5ck.cloudfront.net/a317dacb-e452-4538-a319-81936b8e72ad/hls/58-dev.m3u8");

        videosViewPager.setAdapter(new VideosAdapter(videoItems,this));

    }
}
