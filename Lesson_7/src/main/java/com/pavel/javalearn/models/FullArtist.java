package com.pavel.javalearn.models;

import java.util.List;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

public class FullArtist {
public long id;
public String name;
public List<String> genres = null;
public long tracks;
public long albums;
public String link;
public String description;
@SerializedName("cover")  public Map<String, String> covers;
}