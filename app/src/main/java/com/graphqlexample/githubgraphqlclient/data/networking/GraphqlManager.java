package com.graphqlexample.githubgraphqlclient.data.networking;

import com.apollographql.apollo.ApolloClient;



import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by alejandrofernandezruiz on 27/3/18.
 */

public class GraphqlManager {

    private static final String BASE_URL = "https://api.github.com/graphql";
    private static final String TOKEN = "Bearer eb6c504bc7ffab3f7854c1310b227c95f4abc903";

    private static ApolloClient apolloClient;

    public static ApolloClient getApolloClient() {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();


        apolloClient = ApolloClient
                .builder()
                .serverUrl(BASE_URL)
                .okHttpClient(okHttpClient).build();

        return apolloClient;
    }


}
