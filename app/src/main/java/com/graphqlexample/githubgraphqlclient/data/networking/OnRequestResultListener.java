package com.graphqlexample.githubgraphqlclient.data.networking;

import com.apollographql.apollo.exception.ApolloException;
import com.graphqlexample.githubgraphqlclient.data.model.GHCategory;
import com.graphqlexample.githubgraphqlclient.data.model.GHEdge;
import com.graphqlexample.githubgraphqlclient.data.model.GHMarketPlaceListings;
import com.graphqlexample.graphqlexample.GetAllCategories;
import com.graphqlexample.graphqlexample.GetEdgeXCategory;

import java.util.List;

public interface OnRequestResultListener {

    //Listener for the response of the categories
    public void OnRequestCategoriesComplete(List<GetAllCategories.MarketplaceCategory> result) ;
    public void OnRequestCategoriesError(ApolloException error);


    //Listener for the response of the edges
    public void OnRequestEdgesComplete(GetEdgeXCategory.MarketplaceListings result) ;
    public void OnRequestEdgesError(ApolloException error);


    //************************************************************************************
    //*****************************NOT EXTEND OR HERITAGE*********************************
    //*******************CREATE NEW LISTENER FOR NEW SCREENS******************************
    //*******************OR INTEGRATE A BUS EVENT FOR A UPDATE PERFORMANCE****************
    //************************************************************************************
}
