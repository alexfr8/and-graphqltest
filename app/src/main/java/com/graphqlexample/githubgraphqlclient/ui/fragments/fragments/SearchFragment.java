package com.graphqlexample.githubgraphqlclient.ui.fragments.fragments;


import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.graphqlexample.githubgraphqlclient.R;
import com.graphqlexample.githubgraphqlclient.adapters.SearchCategoryAdapter;
import com.graphqlexample.githubgraphqlclient.adapters.SearchElementAdapter;
import com.graphqlexample.githubgraphqlclient.adapters.SearchElementViewHolder;
import com.graphqlexample.githubgraphqlclient.data.model.GHCategory;
import com.graphqlexample.githubgraphqlclient.ui.BaseFragment;
import com.graphqlexample.githubgraphqlclient.ui.activities.MainActivity;
import com.graphqlexample.githubgraphqlclient.ui.fragments.Presenters.SearchPresenter;
import com.graphqlexample.githubgraphqlclient.ui.fragments.Presenters.SearchPresenterImp;
import com.graphqlexample.githubgraphqlclient.ui.fragments.Views.SearchView;
import com.graphqlexample.graphqlexample.GetAllCategories;
import com.graphqlexample.graphqlexample.GetEdgeXCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import io.github.yuweiguocn.lib.squareloading.SquareLoading;

public class SearchFragment extends BaseFragment implements SearchView,SearchCategoryAdapter.OnItemClickListener {


    public static final String POSITION = "POSITION";
    private static MainActivity activity;
    private RecyclerView recyclerViewCategory, recyclerViewElement;
    private ImageButton backButton;
    private int currentLimit = 10;

    private SquareLoading progressBar;
    SwipeRefreshLayout mSwipeRefreshLayout;
    private SearchPresenter presenter;

    View root;

    public SearchFragment() {}
    public static SearchFragment newInstance(MainActivity mainActivity) {
        Bundle args = new Bundle();
        SearchFragment fragment = new SearchFragment();
        activity = mainActivity;
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
        root = inflater.inflate(R.layout.fra_search, container, false);


        progressBar = root.findViewById(R.id.pb_searching);
        addAnimation(root);


        recyclerViewCategory = root.findViewById(R.id.list_categories);
        recyclerViewElement =root.findViewById(R.id.list_elements);
        LinearLayoutManager layoutManagerCat = new LinearLayoutManager(getActivity());
        LinearLayoutManager layoutManagerEl = new LinearLayoutManager(getActivity());
        recyclerViewCategory.setLayoutManager(layoutManagerCat);
        recyclerViewElement.setLayoutManager(layoutManagerEl);

        backButton =  root.findViewById(R.id.btn_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.comeBack();

            }
        });
        setupInit();
        presenter.performCategorySearch();
        return root;
    }


    private void addAnimation(View root) {

        TextView searchLabel = root.findViewById(R.id.search_label);
        TextView searchText1 = root.findViewById(R.id.search_subtitle1);


        Animation startAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in_animation);


        searchLabel.startAnimation(startAnimation);
        searchText1.startAnimation(startAnimation);

    }




    @Override
    public void onItemClick(GetAllCategories.MarketplaceCategory searchItemSelected, int position) {

        presenter.performMarketPlaceListingSearch(currentLimit, searchItemSelected.slug());
    }



    //SEARCHVIEW IMPLEMENTATION.

    @Override
    public void setupInit() {
        currentLimit = 10;
    }


    @Override
    public void showLoadinView() {

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.VISIBLE);
            }//public void run() {
        });
    }

    @Override
    public void hideLoadingView() {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.GONE);
            }//public void run() {
        });

    }

    @Override
    public void showError(String error) {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(activity,error,Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void showCategoriesResult(List<GetAllCategories.MarketplaceCategory> categories) {
        SearchCategoryAdapter searchAdapter = new SearchCategoryAdapter(categories,R.layout.row_searchitem,this);

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (categories.size() >0) {
                    recyclerViewCategory.setVisibility(View.VISIBLE);
                } else {
                    presenter.noCategories();
                }
                recyclerViewCategory.setAdapter(searchAdapter);
            }//public void run() {
        });

    }

    @Override
    public void showElementsResult(List<GetEdgeXCategory.Edge> elements) {
        SearchElementAdapter searchAdapter = new SearchElementAdapter(elements,R.layout.row_element);

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (elements.size() >0) {
                    recyclerViewElement.setVisibility(View.VISIBLE);
                } else {
                    presenter.noCategories();
                }
                recyclerViewElement.setAdapter(searchAdapter);
            }//public void run() {
        });
    }

    @Override
    public void showCategoriesList() {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                recyclerViewCategory.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public void hideCategoriesList() {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                recyclerViewCategory.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public void hideElementsList() {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
               recyclerViewElement.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public void showElementList() {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                recyclerViewElement.setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public void showBackButton() {

        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                backButton.setClickable(true);
                backButton.setVisibility(View.VISIBLE);
            }
        });

    }

    @Override
    public void hideBackButton() {
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                backButton.setClickable(false);
                backButton.setVisibility(View.INVISIBLE);
            }
        });


    }


}
