package com.example.reign.repotask;

/**
 * Created by Reign on 30-Sep-17.
 */

public class ListItem {
    private String name;
    private String description;
    private String userName;
    private String URL;

    public ListItem(String name, String description, String userName , String URL) {
        this.name = name;
        this.description = description;
        this.userName = userName;
        this.URL = URL;
    }



    public String getName() {return name;}

    public String getDescription() {
        return description;
    }

    public String getUserName() {
        return userName;
    }
    public String getURL() {return URL;}



}
