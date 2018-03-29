package com.graphqlexample.githubgraphqlclient.ui.fragments.Presenters;

import com.apollographql.apollo.exception.ApolloException;
import com.graphqlexample.githubgraphqlclient.R;
import com.graphqlexample.githubgraphqlclient.data.networking.OnRequestResultListener;
import com.graphqlexample.githubgraphqlclient.data.networking.service.GithubEndpointManager;
import com.graphqlexample.githubgraphqlclient.ui.activities.MainActivity;
import com.graphqlexample.githubgraphqlclient.ui.fragments.Views.SearchView;
import com.graphqlexample.graphqlexample.GetAllCategories;
import com.graphqlexample.graphqlexample.GetEdgeXCategory;

import java.util.List;

public class SearchPresenterImp  implements  SearchPresenter{

    private SearchView searchView;
    private MainActivity mainActivity;

    public  SearchPresenterImp(SearchView searchView, MainActivity mainActivity) {
        this.searchView = searchView;
        this.mainActivity = mainActivity;
    }

    @Override
    public void performCategorySearch() {
        searchView.hideCategoriesList();
        searchView.hideElementsList();
        searchView.hideBackButton();
        searchView.showLoadinView();
        GithubEndpointManager.getInstance().retrieveCategories(new OnRequestResultListener() {
            @Override
            public void OnRequestCategoriesComplete(List<GetAllCategories.MarketplaceCategory> result) {
                searchView.showCategoriesResult(result);
                searchView.hideLoadingView();
            }

            @Override
            public void OnRequestCategoriesError(ApolloException error) {
                searchView.showError("ERROR: REQUEST: " + error.getMessage());
            }

            @Override
            public void OnRequestEdgesComplete(GetEdgeXCategory.MarketplaceListings result) {
                    //NOT USED ON THIS
            }

            @Override
            public void OnRequestEdgesError(ApolloException error) {
                    //NOT USED ON THIS REQUEST
            }
        });

    }

    @Override
    public void performMarketPlaceListingSearch(int limit, String slug) {
        searchView.hideCategoriesList();
        searchView.hideElementsList();
        searchView.hideBackButton();
        searchView.showLoadinView();
        GithubEndpointManager.getInstance().retrieveEdgesByCategorySlug(limit, slug, new OnRequestResultListener() {
            @Override
            public void OnRequestCategoriesComplete(List<GetAllCategories.MarketplaceCategory> result) {
                //NOT USED ON THIS REQUEST
            }

            @Override
            public void OnRequestCategoriesError(ApolloException error) {
                // NOT USED ON THIS REQUEST
            }

            @Override
            public void OnRequestEdgesComplete(GetEdgeXCategory.MarketplaceListings result) {
                searchView.showElementsResult(result.edges());
                searchView.hideCategoriesList();
                searchView.hideLoadingView();
                searchView.showElementList();
                searchView.showBackButton();
            }

            @Override
            public void OnRequestEdgesError(ApolloException error) {
                searchView.showError(error.getMessage());
            }
        });
    }

    @Override
    public void comeBack() {
        searchView.setupInit();
        searchView.hideBackButton();
        this.performCategorySearch();
    }

    @Override
    public void noCategories() {
        searchView.showError(mainActivity.getString(R.string.no_categories));
    }

    @Override
    public void noSearchElements() {
        searchView.showError(mainActivity.getString(R.string.no_elements));
    }
}