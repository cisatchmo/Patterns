package it.cisatchmo.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Channel> channels = new ArrayList<>();

    public void broadcast(String news) {
        for (Channel channel : this.channels) {
            channel.update(news);
        }
    }

    public void addChannel(NewsChannel channel) {
        this.channels.add(channel);
    }
}
