package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    User james, guido;
    Tweet tweet, retweet;

    @BeforeEach
    void setUp() throws Exception {
        james = new User("James");
        guido = new User("Guido");
        tweet = james.newTweet("Hello World");
        retweet = guido.newRetweet(tweet);
    }

    @Test
    void testNewTweetIsAddedCorrectlyToTheUser(){
        assertEquals(1,james.getTweets().size());
        james.newTweet("Hello World 2");
        assertEquals(2,james.getTweets().size());
    }
    @Test
    void testNewTweetWithLengthBiggerThan280(){
        Tweet tweet = guido.newTweet("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque eget libero vitae nunc pharetra sodales. Sed id felis id nunc tincidunt fermentum. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Duis vehicula nunc ut odio accumsan, non gravida odio.");
        assertNull(tweet);
    }
    @Test
    public void testDeleteTweets(){
        assertEquals(1, james.getTweets().size());
        james.deleteTweets();
        assertEquals(0, james.getTweets().size());
    }
}
