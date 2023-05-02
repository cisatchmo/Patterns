package it.cisatchmo.ObserverPattern;

public class NewsChannel implements Channel{

    private String channelName;

    public NewsChannel(String name){
        this.channelName = name;
    }

    @Override
    public void update(String news) {
        System.out.println("Breaking news: " + news + " livo on " + this.channelName);
    }
}
