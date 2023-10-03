package com.example.nav;

import android.content.Context;

import java.io.Serializable;
import java.util.List;

public class mezmurs implements Serializable {

    Context context1;

    List<mezmurs> mymezmurs;
   private String id;
   private String title;

   private String favs;
    private int song;
    public String getFavs() {
        return favs;
    }

    public void setFavs(String favs) {
        this.favs = favs;
    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }

    public mezmurs(String id, String title, int song,String favs) {
        this.id = id;
        this.title = title;
        this.song=song;
        this.favs=favs;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
