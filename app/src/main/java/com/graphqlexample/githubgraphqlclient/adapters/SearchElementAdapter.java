package com.graphqlexample.githubgraphqlclient.adapters;

/**
 * Created by alejandrofernandezruiz on 29/3/18.
 */


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.graphqlexample.graphqlexample.GetEdgeXCategory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * This class is an adapter for the simple recyclerview included in the search
 * view
 * @param: mList : A list of searched items
 * @param: itemLayout: the layout of the row to show.
 *
 *
 * */
public class SearchElementAdapter extends RecyclerView.Adapter<SearchElementViewHolder>{

    //DATA
    private List<GetEdgeXCategory.Edge> mList = new ArrayList<>();
    //LAYOUT
    private int itemLayout;


    /**
     * Constructor of the SearchCategoryAdapter
     * @param items: A list of category GHCategory
     * @param itemLayout: the row layout
     */
    public SearchElementAdapter(List<GetEdgeXCategory.Edge> items, int itemLayout) {

        this.itemLayout = itemLayout;
        this.mList = items;
    }


    @Override
    public SearchElementViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new SearchElementViewHolder(v);
    }

    @Override public void onBindViewHolder(final SearchElementViewHolder viewHolder, final int position) {

        final Integer pos = position;
        final GetEdgeXCategory.Edge item = mList.get(position);
        viewHolder.bindSearchItem(item);
    }



    @Override
    public int getItemCount() {

        return mList.size();
    }

}
