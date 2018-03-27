package com.graphqlexample.githubgraphqlclient.ui.fragments.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.widget.TextView;

import com.graphqlexample.githubgraphqlclient.R;
import com.graphqlexample.githubgraphqlclient.adapters.SearchCategoryAdapter;
import com.graphqlexample.githubgraphqlclient.data.model.GHCategory;
import com.graphqlexample.githubgraphqlclient.ui.BaseFragment;
import com.graphqlexample.githubgraphqlclient.ui.activities.MainActivity;
import com.graphqlexample.githubgraphqlclient.ui.fragments.Presenters.SearchPresenter;
import com.graphqlexample.githubgraphqlclient.ui.fragments.Presenters.SearchPresenterImp;
import com.graphqlexample.githubgraphqlclient.ui.fragments.Views.SearchView;

import java.util.ArrayList;
import java.util.List;

import io.github.yuweiguocn.lib.squareloading.SquareLoading;

public class SearchFragment extends BaseFragment implements SearchView,SearchCategoryAdapter.OnItemClickListener {


    public static final String POSITION = "POSITION";
    private static MainActivity activity;
    private RecyclerView recyclerView;

    private SquareLoading progressBar;
    SwipeRefreshLayout mSwipeRefreshLayout;
    private SearchPresenter presenter;

    String query;

    public SearchFragment() {}
    public static SearchFragment newInstance(MainActivity searchActivity) {
        Bundle args = new Bundle();
        SearchFragment fragment = new SearchFragment();
        activity = searchActivity;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new SearchPresenterImp(this,activity);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fra_search, container, false);


        progressBar = root.findViewById(R.id.pb_searching);
        addAnimation(root);
        prepareSearchView();

        recyclerView = root.findViewById(R.id.list_items);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        return root;
    }


    private void addAnimation(View root) {

        TextView searchLabel = root.findViewById(R.id.search_label);
        TextView searchText1 = root.findViewById(R.id.search_subtitle1);


        Animation startAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in_animation);


        searchLabel.startAnimation(startAnimation);
        searchText1.startAnimation(startAnimation);

    }



    private void performSearch() {
        if (query.length() != 0) {
            presenter.performSearch(query);

        } else {
            List<GHCategory> filteredModelList = new ArrayList<GHCategory>();
            updateList(filteredModelList);
        }
    }


/*
    public static InputFilter EMOJI_FILTER = new InputFilter() {

        @Override
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
            for (int index = start; index < end; index++) {

                int type = Character.getType(source.charAt(index));

                if (type == Character.SURROGATE) {
                    return "";
                }
            }
            return null;
        }
    };*/
    private void prepareSearchView() {

      //  textSearchView.setInputType(InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS);
      //  textSearchView.setHint(getResources().getString(R.string.search_hint));
      //  textSearchView.setFilters(new InputFilter[]{EMOJI_FILTER});

    }


    private void updateList(List<GHCategory> itemList) {

       /* SearchCategoryAdapter searchAdapter = new SearchCategoryAdapter(itemList,R.layout.row_searchitem,this);
        if (itemList.size() >0) {
            recyclerView.setVisibility(View.VISIBLE);
            searchAdapter.setClickable(true);
        } else {
            recyclerView.setVisibility(View.VISIBLE);
            SearchItem emptyTrack = new SearchItem();
            emptyTrack.setTrackName(getString(R.string.no_results));
            itemList.add(emptyTrack);
            searchAdapter = new SearchCategoryAdapter(itemList, R.layout.row_searchitem, this);
            searchAdapter.setClickable(false);
        }
        recyclerView.setAdapter(searchAdapter);*/
    }


    @Override
    public void onItemClick(GHCategory searchItemSelected, int position) {
        // this.showDetailActivity(itemSelected);
       // this.presenter.navigateDetails(searchItemSelected, position);
    }



    //SEARCHVIEW IMPLEMENTATION.

    /*

    @Override
    public void receiveSearchResults(List<SearchItem> results) {
        Log.v("SEARCHFRAGMENTTAG", "Results: " + results.size());
        activity.setSearchList(results);
        this.updateList(results);
    }

    @Override
    public void receiveErrorResults(VolleyError error) {
        Toast.makeText(activity,getString(R.string.error_loading),Toast.LENGTH_SHORT).show();
    }
*/
    @Override
    public void showLoadinView() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoadingView() {
        progressBar.setVisibility(View.GONE);
    }
/*
    @Override
    public void goToDetails(SearchItem searchItem, int position) {

        DetailFragment detailFragment = DetailFragment.newInstance(activity);

        Bundle args = new Bundle();
        args.putInt(POSITION, position);
        detailFragment.setArguments(args);
        FragmentTransaction transaction = getFragmentManager().beginTransaction();


        transaction.replace(R.id.fragment_container, detailFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }*/

}
