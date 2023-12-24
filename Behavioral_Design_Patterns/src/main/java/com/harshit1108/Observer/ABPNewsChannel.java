package com.harshit1108.Observer;
//Concret Observer
public class ABPNewsChannel implements Channel{

    private String news;

    @Override
    public void update(Object object) {
        this.setNews((String) object);
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
