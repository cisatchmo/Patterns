package it.cisatchmo.ObserverPattern;

public class NewsChannel implements Channel{
    @Override
    public void update(String news) {
        System.out.println("Breaking news: " + news);
    }
}
