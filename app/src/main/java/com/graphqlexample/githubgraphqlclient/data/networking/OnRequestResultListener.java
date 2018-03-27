package com.graphqlexample.githubgraphqlclient.data.networking;

public interface OnRequestResultListener {

    public void OnRequestComplete(Object result) ;
    public void OnRequestError(String error);
}
