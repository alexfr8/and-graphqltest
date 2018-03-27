package com.graphqlexample.githubgraphqlclient.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GHPageInfo {

@SerializedName("endCursor")
@Expose
private String endCursor;
@SerializedName("hasNextPage")
@Expose
private Boolean hasNextPage;
@SerializedName("hasPreviousPage")
@Expose
private Boolean hasPreviousPage;
@SerializedName("startCursor")
@Expose
private String startCursor;

public String getEndCursor() {
return endCursor;
}

public void setEndCursor(String endCursor) {
this.endCursor = endCursor;
}

public Boolean getHasNextPage() {
return hasNextPage;
}

public void setHasNextPage(Boolean hasNextPage) {
this.hasNextPage = hasNextPage;
}

public Boolean getHasPreviousPage() {
return hasPreviousPage;
}

public void setHasPreviousPage(Boolean hasPreviousPage) {
this.hasPreviousPage = hasPreviousPage;
}

public String getStartCursor() {
return startCursor;
}

public void setStartCursor(String startCursor) {
this.startCursor = startCursor;
}

}


