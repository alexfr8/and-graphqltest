package com.graphqlexample.githubgraphqlclient.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GHEdge {

@SerializedName("cursor")
@Expose
private String cursor;
@SerializedName("node")
@Expose
private GHNode node;

public String getCursor() {
return cursor;
}

public void setCursor(String cursor) {
this.cursor = cursor;
}

public GHNode getNode() {
return node;
}

public void setNode(GHNode node) {
this.node = node;
}

}