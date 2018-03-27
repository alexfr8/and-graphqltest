package com.graphqlexample.githubgraphqlclient.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GHNode {

@SerializedName("companyUrl")
@Expose
private String companyUrl;
@SerializedName("configurationResourcePath")
@Expose
private String configurationResourcePath;
@SerializedName("configurationUrl")
@Expose
private String configurationUrl;
@SerializedName("documentationUrl")
@Expose
private String documentationUrl;
@SerializedName("extendedDescription")
@Expose
private String extendedDescription;
@SerializedName("extendedDescriptionHTML")
@Expose
private String extendedDescriptionHTML;
@SerializedName("fullDescription")
@Expose
private String fullDescription;
@SerializedName("fullDescriptionHTML")
@Expose
private String fullDescriptionHTML;
@SerializedName("hasApprovalBeenRequested")
@Expose
private Boolean hasApprovalBeenRequested;
@SerializedName("hasPublishedFreeTrialPlans")
@Expose
private Boolean hasPublishedFreeTrialPlans;
@SerializedName("hasTermsOfService")
@Expose
private Boolean hasTermsOfService;
@SerializedName("howItWorks")
@Expose
private Object howItWorks;
@SerializedName("howItWorksHTML")
@Expose
private String howItWorksHTML;
@SerializedName("id")
@Expose
private String id;
@SerializedName("installationUrl")
@Expose
private String installationUrl;
@SerializedName("installedForViewer")
@Expose
private Boolean installedForViewer;
@SerializedName("isApproved")
@Expose
private Boolean isApproved;
@SerializedName("isDelisted")
@Expose
private Boolean isDelisted;
@SerializedName("isDraft")
@Expose
private Boolean isDraft;
@SerializedName("isPaid")
@Expose
private Boolean isPaid;
@SerializedName("isRejected")
@Expose
private Boolean isRejected;
@SerializedName("logoBackgroundColor")
@Expose
private String logoBackgroundColor;
@SerializedName("name")
@Expose
private String name;
@SerializedName("normalizedShortDescription")
@Expose
private String normalizedShortDescription;
@SerializedName("pricingUrl")
@Expose
private String pricingUrl;
@SerializedName("primaryCategory")
@Expose
private GHCategory primaryCategory;
@SerializedName("privacyPolicyUrl")
@Expose
private String privacyPolicyUrl;
@SerializedName("resourcePath")
@Expose
private String resourcePath;
@SerializedName("secondaryCategory")
@Expose
private GHCategory secondaryCategory;
@SerializedName("shortDescription")
@Expose
private String shortDescription;
@SerializedName("slug")
@Expose
private String slug;
@SerializedName("statusUrl")
@Expose
private String statusUrl;
@SerializedName("supportEmail")
@Expose
private Object supportEmail;
@SerializedName("supportUrl")
@Expose
private String supportUrl;
@SerializedName("termsOfServiceUrl")
@Expose
private String termsOfServiceUrl;
@SerializedName("url")
@Expose
private String url;
@SerializedName("viewerCanAddPlans")
@Expose
private Boolean viewerCanAddPlans;
@SerializedName("viewerCanApprove")
@Expose
private Boolean viewerCanApprove;
@SerializedName("viewerCanDelist")
@Expose
private Boolean viewerCanDelist;
@SerializedName("viewerCanEdit")
@Expose
private Boolean viewerCanEdit;
@SerializedName("viewerCanEditCategories")
@Expose
private Boolean viewerCanEditCategories;
@SerializedName("viewerCanEditPlans")
@Expose
private Boolean viewerCanEditPlans;
@SerializedName("viewerCanRedraft")
@Expose
private Boolean viewerCanRedraft;
@SerializedName("viewerCanReject")
@Expose
private Boolean viewerCanReject;
@SerializedName("viewerCanRequestApproval")
@Expose
private Boolean viewerCanRequestApproval;
@SerializedName("viewerHasPurchased")
@Expose
private Boolean viewerHasPurchased;
@SerializedName("viewerHasPurchasedForAllOrganizations")
@Expose
private Boolean viewerHasPurchasedForAllOrganizations;
@SerializedName("viewerIsListingAdmin")
@Expose
private Boolean viewerIsListingAdmin;

public String getCompanyUrl() {
return companyUrl;
}

public void setCompanyUrl(String companyUrl) {
this.companyUrl = companyUrl;
}

public String getConfigurationResourcePath() {
return configurationResourcePath;
}

public void setConfigurationResourcePath(String configurationResourcePath) {
this.configurationResourcePath = configurationResourcePath;
}

public String getConfigurationUrl() {
return configurationUrl;
}

public void setConfigurationUrl(String configurationUrl) {
this.configurationUrl = configurationUrl;
}

public String getDocumentationUrl() {
return documentationUrl;
}

public void setDocumentationUrl(String documentationUrl) {
this.documentationUrl = documentationUrl;
}

public String getExtendedDescription() {
return extendedDescription;
}

public void setExtendedDescription(String extendedDescription) {
this.extendedDescription = extendedDescription;
}

public String getExtendedDescriptionHTML() {
return extendedDescriptionHTML;
}

public void setExtendedDescriptionHTML(String extendedDescriptionHTML) {
this.extendedDescriptionHTML = extendedDescriptionHTML;
}

public String getFullDescription() {
return fullDescription;
}

public void setFullDescription(String fullDescription) {
this.fullDescription = fullDescription;
}

public String getFullDescriptionHTML() {
return fullDescriptionHTML;
}

public void setFullDescriptionHTML(String fullDescriptionHTML) {
this.fullDescriptionHTML = fullDescriptionHTML;
}

public Boolean getHasApprovalBeenRequested() {
return hasApprovalBeenRequested;
}

public void setHasApprovalBeenRequested(Boolean hasApprovalBeenRequested) {
this.hasApprovalBeenRequested = hasApprovalBeenRequested;
}

public Boolean getHasPublishedFreeTrialPlans() {
return hasPublishedFreeTrialPlans;
}

public void setHasPublishedFreeTrialPlans(Boolean hasPublishedFreeTrialPlans) {
this.hasPublishedFreeTrialPlans = hasPublishedFreeTrialPlans;
}

public Boolean getHasTermsOfService() {
return hasTermsOfService;
}

public void setHasTermsOfService(Boolean hasTermsOfService) {
this.hasTermsOfService = hasTermsOfService;
}

public Object getHowItWorks() {
return howItWorks;
}

public void setHowItWorks(Object howItWorks) {
this.howItWorks = howItWorks;
}

public String getHowItWorksHTML() {
return howItWorksHTML;
}

public void setHowItWorksHTML(String howItWorksHTML) {
this.howItWorksHTML = howItWorksHTML;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getInstallationUrl() {
return installationUrl;
}

public void setInstallationUrl(String installationUrl) {
this.installationUrl = installationUrl;
}

public Boolean getInstalledForViewer() {
return installedForViewer;
}

public void setInstalledForViewer(Boolean installedForViewer) {
this.installedForViewer = installedForViewer;
}

public Boolean getIsApproved() {
return isApproved;
}

public void setIsApproved(Boolean isApproved) {
this.isApproved = isApproved;
}

public Boolean getIsDelisted() {
return isDelisted;
}

public void setIsDelisted(Boolean isDelisted) {
this.isDelisted = isDelisted;
}

public Boolean getIsDraft() {
return isDraft;
}

public void setIsDraft(Boolean isDraft) {
this.isDraft = isDraft;
}

public Boolean getIsPaid() {
return isPaid;
}

public void setIsPaid(Boolean isPaid) {
this.isPaid = isPaid;
}

public Boolean getIsRejected() {
return isRejected;
}

public void setIsRejected(Boolean isRejected) {
this.isRejected = isRejected;
}

public String getLogoBackgroundColor() {
return logoBackgroundColor;
}

public void setLogoBackgroundColor(String logoBackgroundColor) {
this.logoBackgroundColor = logoBackgroundColor;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getNormalizedShortDescription() {
return normalizedShortDescription;
}

public void setNormalizedShortDescription(String normalizedShortDescription) {
this.normalizedShortDescription = normalizedShortDescription;
}

public String getPricingUrl() {
return pricingUrl;
}

public void setPricingUrl(String pricingUrl) {
this.pricingUrl = pricingUrl;
}

public GHCategory getPrimaryCategory() {
return primaryCategory;
}

public void setPrimaryCategory(GHCategory primaryCategory) {
this.primaryCategory = primaryCategory;
}

public String getPrivacyPolicyUrl() {
return privacyPolicyUrl;
}

public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
this.privacyPolicyUrl = privacyPolicyUrl;
}

public String getResourcePath() {
return resourcePath;
}

public void setResourcePath(String resourcePath) {
this.resourcePath = resourcePath;
}

public GHCategory getSecondaryCategory() {
return secondaryCategory;
}

public void setSecondaryCategory(GHCategory secondaryCategory) {
this.secondaryCategory = secondaryCategory;
}

public String getShortDescription() {
return shortDescription;
}

public void setShortDescription(String shortDescription) {
this.shortDescription = shortDescription;
}

public String getSlug() {
return slug;
}

public void setSlug(String slug) {
this.slug = slug;
}

public String getStatusUrl() {
return statusUrl;
}

public void setStatusUrl(String statusUrl) {
this.statusUrl = statusUrl;
}

public Object getSupportEmail() {
return supportEmail;
}

public void setSupportEmail(Object supportEmail) {
this.supportEmail = supportEmail;
}

public String getSupportUrl() {
return supportUrl;
}

public void setSupportUrl(String supportUrl) {
this.supportUrl = supportUrl;
}

public String getTermsOfServiceUrl() {
return termsOfServiceUrl;
}

public void setTermsOfServiceUrl(String termsOfServiceUrl) {
this.termsOfServiceUrl = termsOfServiceUrl;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public Boolean getViewerCanAddPlans() {
return viewerCanAddPlans;
}

public void setViewerCanAddPlans(Boolean viewerCanAddPlans) {
this.viewerCanAddPlans = viewerCanAddPlans;
}

public Boolean getViewerCanApprove() {
return viewerCanApprove;
}

public void setViewerCanApprove(Boolean viewerCanApprove) {
this.viewerCanApprove = viewerCanApprove;
}

public Boolean getViewerCanDelist() {
return viewerCanDelist;
}

public void setViewerCanDelist(Boolean viewerCanDelist) {
this.viewerCanDelist = viewerCanDelist;
}

public Boolean getViewerCanEdit() {
return viewerCanEdit;
}

public void setViewerCanEdit(Boolean viewerCanEdit) {
this.viewerCanEdit = viewerCanEdit;
}

public Boolean getViewerCanEditCategories() {
return viewerCanEditCategories;
}

public void setViewerCanEditCategories(Boolean viewerCanEditCategories) {
this.viewerCanEditCategories = viewerCanEditCategories;
}

public Boolean getViewerCanEditPlans() {
return viewerCanEditPlans;
}

public void setViewerCanEditPlans(Boolean viewerCanEditPlans) {
this.viewerCanEditPlans = viewerCanEditPlans;
}

public Boolean getViewerCanRedraft() {
return viewerCanRedraft;
}

public void setViewerCanRedraft(Boolean viewerCanRedraft) {
this.viewerCanRedraft = viewerCanRedraft;
}

public Boolean getViewerCanReject() {
return viewerCanReject;
}

public void setViewerCanReject(Boolean viewerCanReject) {
this.viewerCanReject = viewerCanReject;
}

public Boolean getViewerCanRequestApproval() {
return viewerCanRequestApproval;
}

public void setViewerCanRequestApproval(Boolean viewerCanRequestApproval) {
this.viewerCanRequestApproval = viewerCanRequestApproval;
}

public Boolean getViewerHasPurchased() {
return viewerHasPurchased;
}

public void setViewerHasPurchased(Boolean viewerHasPurchased) {
this.viewerHasPurchased = viewerHasPurchased;
}

public Boolean getViewerHasPurchasedForAllOrganizations() {
return viewerHasPurchasedForAllOrganizations;
}

public void setViewerHasPurchasedForAllOrganizations(Boolean viewerHasPurchasedForAllOrganizations) {
this.viewerHasPurchasedForAllOrganizations = viewerHasPurchasedForAllOrganizations;
}

public Boolean getViewerIsListingAdmin() {
return viewerIsListingAdmin;
}

public void setViewerIsListingAdmin(Boolean viewerIsListingAdmin) {
this.viewerIsListingAdmin = viewerIsListingAdmin;
}

}