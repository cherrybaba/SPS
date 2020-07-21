package com.google.sps.data;

import java.util.ArrayList;

/** Class containing server statistics. */
public final class Data {

  private final ArrayList<String> sites=new ArrayList<>();
  
  public ArrayList<String> getSites() {
    return sites;
  }
  public void addComments(String comment){
    sites.add(comment);
  }
}
