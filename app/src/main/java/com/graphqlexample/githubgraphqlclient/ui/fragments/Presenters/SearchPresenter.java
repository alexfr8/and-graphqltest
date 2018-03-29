package com.graphqlexample.githubgraphqlclient.ui.fragments.Presenters;

public interface SearchPresenter {

    public void performCategorySearch();
    public void performMarketPlaceListingSearch(int limit, String slug);
    public void comeBack();
    public void noCategories();
    public void noSearchElements();

}
