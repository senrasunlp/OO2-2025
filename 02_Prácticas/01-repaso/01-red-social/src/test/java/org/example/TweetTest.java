package org.example;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TweetTest {

    Tweet tweet,retweet;

    @BeforeEach
    void setUp() throws Exception {
        tweet = new Tweet("Hello World");
        retweet = new Tweet(tweet);
    }

    @Test
    public void testTweetGetContent(){
        assertEquals("Hello World",tweet.getContent());
    }
    @Test
    public void testTweetAndHisRetweetHaveSameGetContent() {
        assertEquals(retweet.getContent(), tweet.getContent());
    }

}
