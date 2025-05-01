package org.example;
import java.util.ArrayList;

public class User {
    private String screenName;
    private ArrayList<Tweet> tweets;

    public User(String screenName) {
        this.screenName= screenName;
        this.tweets = new ArrayList<Tweet>();
    }

    public String getScreenName() {
        return screenName;
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public Tweet newTweet(String text){
        if ((!text.isEmpty()) && (text.length() <=280)) {
            Tweet tweet = new Tweet(text);
            this.addTweet(tweet);
            return tweet;
        }
        System.out.println("Tweet text must be less than 280 characters");
        return null;
    }

    public Tweet newRetweet(Tweet tweet){
        Tweet retweet = new Tweet(tweet);
        this.addTweet(retweet);
        return retweet;
    }

    public void deleteTweets(){
        this.tweets.clear();
    }

    private void addTweet(Tweet tweet){
        this.tweets.add(tweet);
    }
}

