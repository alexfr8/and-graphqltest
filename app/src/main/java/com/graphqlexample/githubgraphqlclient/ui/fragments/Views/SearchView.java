package com.graphqlexample.githubgraphqlclient.ui.fragments.Views;

import com.graphqlexample.graphqlexample.GetAllCategories;
import com.graphqlexample.graphqlexample.GetEdgeXCategory;

import java.util.List;

public interface SearchView {
/*
    void receiveSearchResults(List<SearchItem> results);

    void receiveErrorResults(VolleyError error);*/

    void setupInit();

    void showLoadinView();

    void hideLoadingView();

    void showError(String error);


    void showCategoriesResult(List<GetAllCategories.MarketplaceCategory> categories);

    void showElementsResult(List<GetEdgeXCategory.Edge> elements);
    void showCategoriesList();
    void hideCategoriesList();
    void hideElementsList();
    void showElementList();

    void showBackButton();
    void hideBackButton();

  //  void goToDetails(SearchItem searchItem, int position);
}
