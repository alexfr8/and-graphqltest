package com.graphqlexample.githubgraphqlclient.ui.fragments.Presenters;

import com.graphqlexample.githubgraphqlclient.ui.activities.MainActivity;
import com.graphqlexample.githubgraphqlclient.ui.fragments.Views.SearchView;

public class SearchPresenterImp  implements  SearchPresenter{

    private SearchView searchView;
    private MainActivity mainActivity;

    public  SearchPresenterImp(SearchView searchView, MainActivity mainActivity) {
        this.searchView = searchView;
        this.mainActivity = mainActivity;
    }

    @Override
    public void performSearch(String value) {
        searchView.showLoadinView();


    }






}