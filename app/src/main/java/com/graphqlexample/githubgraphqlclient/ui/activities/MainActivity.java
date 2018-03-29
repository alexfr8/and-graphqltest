package com.graphqlexample.githubgraphqlclient.ui.activities;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.graphqlexample.githubgraphqlclient.R;
import com.graphqlexample.githubgraphqlclient.data.model.GHCategory;
import com.graphqlexample.githubgraphqlclient.data.networking.service.GithubEndpointManager;
import com.graphqlexample.githubgraphqlclient.ui.BaseActivity;
import com.graphqlexample.githubgraphqlclient.ui.fragments.fragments.SearchFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    List<GHCategory> categoryItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);


        SearchFragment searchFragment = SearchFragment.newInstance(this);
        FragmentTransaction transaction = getFragmentManager().beginTransaction();


        transaction.replace(R.id.fragment_container, searchFragment);
        transaction.addToBackStack(null);

// Commit the transaction
        transaction.commit();
        categoryItemList = new ArrayList<>();

        GithubEndpointManager.getInstance().retrieveCategories();
    }


    public void setSearchList(List<GHCategory> categoryList) {
        this.categoryItemList = categoryList;
    }

    public List<GHCategory> getSearchItemList() {
        return this.categoryItemList;
    }

}
