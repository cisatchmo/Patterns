package it.cisatchmo.ObserverPattern;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.addChannel(new NewsChannel("Channel One"));
        newsAgency.addChannel(new NewsChannel("Channel 8"));
        newsAgency.addChannel(new NewsChannel("BBC"));
        newsAgency.addChannel(new NewsChannel("Fox news"));
        for (int i=0; i<10; i++) {
            newsAgency.broadcast("Any breaking news...");
            Thread.sleep(1000);
        }
    }
}
