package com.harshit1108.Observer;

//Subject
import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private String news;

    private final List<Channel> channelList = new ArrayList<>();

    public void addObserver(Channel channel){
        this.channelList.add(channel);
    }

    public void removeObserver(Channel channel){
        this.channelList.remove(channel);
    }

    public void setNews(String news){
        this.news = news;
        for(Channel ch : this.channelList){
            ch.update(this.news);
        }
    }
}
