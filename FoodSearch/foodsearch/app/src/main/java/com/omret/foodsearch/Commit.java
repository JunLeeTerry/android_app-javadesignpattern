package com.omret.foodsearch;

/**
 * Created by terry on 12/20/15.
 */
public class Commit {
    private String content;
    private String user;

    public Commit (String user,String content){
        this.content = content;
        this.user = user;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
