package com.graphqlexample.githubgraphqlclient.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GHCategory {

@SerializedName("name")
@Expose
private String name;
@SerializedName("slug")
@Expose
private String slug;
@SerializedName("description")
@Expose
private String description;
@SerializedName("howItWorks")
@Expose
private String howItWorks;
@SerializedName("primaryListingCount")
@Expose
private Integer primaryListingCount;
@SerializedName("resourcePath")
@Expose
private String resourcePath;
@SerializedName("secondaryListingCount")
@Expose
private Integer secondaryListingCount;
@SerializedName("url")
@Expose
private String url;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getSlug() {
return slug;
}

public void setSlug(String slug) {
this.slug = slug;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getHowItWorks() {
return howItWorks;
}

public void setHowItWorks(String howItWorks) {
this.howItWorks = howItWorks;
}

public Integer getPrimaryListingCount() {
return primaryListingCount;
}

public void setPrimaryListingCount(Integer primaryListingCount) {
this.primaryListingCount = primaryListingCount;
}

public String getResourcePath() {
return resourcePath;
}

public void setResourcePath(String resourcePath) {
this.resourcePath = resourcePath;
}

public Integer getSecondaryListingCount() {
return secondaryListingCount;
}

public void setSecondaryListingCount(Integer secondaryListingCount) {
this.secondaryListingCount = secondaryListingCount;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

}
