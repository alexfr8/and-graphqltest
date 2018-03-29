package com.graphqlexample.githubgraphqlclient.data.networking.service;

import android.util.Log;

import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.cache.normalized.CacheControl;
import com.apollographql.apollo.exception.ApolloException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.graphqlexample.githubgraphqlclient.data.model.GHCategory;
import com.graphqlexample.githubgraphqlclient.data.networking.GraphqlManager;
import com.graphqlexample.githubgraphqlclient.data.networking.OnRequestResultListener;
import com.graphqlexample.graphqlexample.GetAllCategories;
import com.graphqlexample.graphqlexample.GetEdgeXCategory;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Nonnull;

public class GithubEndpointManager  {
   private static String TAG = "SINGLETON";
   private static GithubEndpointManager instance;


  public static void initInstance()  {
        if (instance == null) {
          // Create the instance
          instance = new GithubEndpointManager();


        }
  }

  public static GithubEndpointManager getInstance() {
      // Return the instance
      initInstance();

     return instance;
   }



  public void retrieveCategories(OnRequestResultListener listener) {
   GraphqlManager.getApolloClient().query(GetAllCategories.builder().build()).cacheControl(CacheControl.CACHE_FIRST)
           .enqueue(new ApolloCall.Callback<GetAllCategories.Data>() {
            @Override
            public void onResponse(@Nonnull Response<GetAllCategories.Data> response) {
             Log.v(TAG, "RESPONSE RETRIEVES CATEGORIES " + response.data().marketplaceCategories());
             listener.OnRequestCategoriesComplete(response.data().marketplaceCategories());
            }

            @Override
            public void onFailure(@Nonnull ApolloException e) {
             Log.v(TAG, "RETRIEVES CATEGORIES ERROR: " + e);
             listener.OnRequestCategoriesError(e);
            }
           });
   }

   public void retrieveEdgesByCategorySlug(int limit, String catSlug, OnRequestResultListener listener) {
     GraphqlManager.getApolloClient().query(GetEdgeXCategory.builder().build()).cacheControl(CacheControl.NETWORK_ONLY)
             .enqueue(new ApolloCall.Callback<GetEdgeXCategory.Data>() {
              @Override
              public void onResponse(@Nonnull Response<GetEdgeXCategory.Data> response) {
               Log.v(TAG, "RESPONSE RETRIEVEEDGES " + response);
               listener.OnRequestEdgesComplete(response.data().marketplaceListings());
              }

              @Override
              public void onFailure(@Nonnull ApolloException e) {
                 Log.v(TAG, "RETRIEVEEDGES ERROR: " + e);
                 listener.OnRequestEdgesError(e);
              }

        });
   }


}//end of class