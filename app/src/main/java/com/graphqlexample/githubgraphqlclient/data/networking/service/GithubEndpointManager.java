package com.graphqlexample.githubgraphqlclient.data.networking.service;

import android.util.Log;

import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.cache.normalized.CacheControl;
import com.apollographql.apollo.exception.ApolloException;
import com.graphqlexample.githubgraphqlclient.data.networking.GraphqlManager;
import com.graphqlexample.graphqlexample.GetAllCategories;
import com.graphqlexample.graphqlexample.GetEdgeXCategory;

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



  public void retrieveCategories() {
   GraphqlManager.getApolloClient().query(GetAllCategories.builder().build()).cacheControl(CacheControl.CACHE_FIRST)
           .enqueue(new ApolloCall.Callback<GetAllCategories.Data>() {
            @Override
            public void onResponse(@Nonnull Response<GetAllCategories.Data> response) {
             Log.v(TAG, "RESPONSE RETRIEVES CATEGORIES " + response);
            }

            @Override
            public void onFailure(@Nonnull ApolloException e) {
             Log.v(TAG, "RETRIEVES CATEGORIES ERROR: " + e);
            }
           });
   }

   public void retrieveEdgesByCategorySlug(int limit, String catSlug) {
     GraphqlManager.getApolloClient().query(GetEdgeXCategory.builder().build()).cacheControl(CacheControl.NETWORK_ONLY)
             .enqueue(new ApolloCall.Callback<GetEdgeXCategory.Data>() {
              @Override
              public void onResponse(@Nonnull Response<GetEdgeXCategory.Data> response) {
               Log.v(TAG, "RESPONSE RETRIEVEEDGES " + response);
              }

              @Override
              public void onFailure(@Nonnull ApolloException e) {
                 Log.v(TAG, "RETRIEVEEDGES ERROR: " + e);
              }

        });
   }


}//end of class