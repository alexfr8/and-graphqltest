package com.graphqlexample.githubgraphqlclient.data.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GHMarketPlaceListings {

@SerializedName("edges")
@Expose
private List<GHEdge> edges = null;
@SerializedName("pageInfo")
@Expose
private GHPageInfo pageInfo;
@SerializedName("totalCount")
@Expose
private Integer totalCount;

public List<GHEdge> getEdges() {
return edges;
}

public void setEdges(List<GHEdge> edges) {
this.edges = edges;
}

public GHPageInfo getPageInfo() {
return pageInfo;
}

public void setPageInfo(GHPageInfo pageInfo) {
this.pageInfo = pageInfo;
}

public Integer getTotalCount() {
return totalCount;
}

public void setTotalCount(Integer totalCount) {
this.totalCount = totalCount;
}

}