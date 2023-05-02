package it.cisatchmo.ObserverPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NewsAgency newsAgency = new NewsAgency();
        List<Channel> channels = new ArrayList<>();
        NewsChannel channelOne = new NewsChannel();
        channels.add(channelOne);
        newsAgency.setChannels(channels);
        for (int i=0; i<10; i++) {
            newsAgency.setNews(getString());
            Thread.sleep(1000);
        }
    }

    public static String getString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 25;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }
}
