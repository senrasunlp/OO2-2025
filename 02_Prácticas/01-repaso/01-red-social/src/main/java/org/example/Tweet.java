package org.example;

public class Tweet {
    private String text;
    private Tweet retweetFrom;

    public Tweet(String text) {
        this.text = text;
        this.retweetFrom = null;
    }

    public Tweet(Tweet retweetFrom) {
        this.retweetFrom = retweetFrom;
        this.text = null;
    }


    public String getContent() {
        return (!this.isRetweet()) ? this.text : this.retweetFrom.getContent();
    }

    private boolean isRetweet() {
        return (this.retweetFrom != null);
    }
}
