package org.example;

import java.util.ArrayList;

public class Twitter {
    private  ArrayList<User> users;

    public Twitter() {
        users = new ArrayList<>();
    }

    public void deleteUser(User user){
        user.deleteTweets();
        users.remove(user);
    }

    public User newUser(String screenName){
        boolean userExist = users.stream().anyMatch( user -> user.getScreenName().equals(screenName) );
        if(!userExist) {
            User user = new User(screenName);
            users.add(user);
            return user;
        }
        System.out.println("The string '"+ screenName+"' is already in use");
        return null;
    }

    public ArrayList<User> getUsers(){
        return users;
    }
}
