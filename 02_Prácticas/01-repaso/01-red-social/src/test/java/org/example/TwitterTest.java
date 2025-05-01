package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwitterTest {

    User james, guido;
    Twitter twitter;

    @BeforeEach
    void setUp(){
        twitter = new Twitter();
        james = new User("James");
        guido = new User("Guido");
    }

    @Test
    void testNewUsersAreAddedCorrectly(){
        assertEquals(0, twitter.getUsers().size());
        twitter.newUser("James");
        assertEquals(1, twitter.getUsers().size());
    }

    @Test
    void testCannotAddUserAlreadyAdded(){
        assertEquals(0, twitter.getUsers().size());
        twitter.newUser("James");
        assertEquals(1, twitter.getUsers().size());
        assertNull(twitter.newUser("James"));
    }

    @Test
    void testUserIsDeleted(){
        assertEquals(0, twitter.getUsers().size());
        User james = twitter.newUser("James");
        assertEquals(1, twitter.getUsers().size());
        twitter.deleteUser(james);
        assertEquals(0, twitter.getUsers().size());
    }

}
