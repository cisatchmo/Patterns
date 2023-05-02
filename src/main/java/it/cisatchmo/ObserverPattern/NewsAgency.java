package it.cisatchmo.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private List<Channel> channels = new ArrayList<>();

    public void setNews(String news) {
        this.news = news;
        for (Channel channel : this.channels) {
            channel.update(news);
        }
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }
}
